package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.entity.AssessmentItem
import org.setackle.tacklebox.assessment.entity.ItemType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface AssessmentItemRepository : JpaRepository<AssessmentItem, Long> {
    fun findTop50BySkillIdAndTypeAndIsActiveTrueOrderByIdAsc(skillId: Long, type: ItemType): List<AssessmentItem>

    fun findBySkillIdAndTypeAndLevelId(skillId: Long, type: ItemType, levelId: Long): List<AssessmentItem>

    fun findAllByIdIn(ids: Collection<Long>): List<AssessmentItem>

    @Query(
        """
        select i from AssessmentItem i
        where i.skillId = :skillId
          and i.type = org.setackle.tacklebox.assessment.entity.ItemType.QUIZ
          and (i.levelId = :levelId or :levelId is null)
          and i.isActive = true
        """
    )
    fun findQuizItems(skillId: Long, levelId: Long?): List<AssessmentItem>

    // JPA 정렬로 RAND() 쓰기 어렵기 때문에 nativeQuery 사용 (MariaDB)
    @Query(
        value = """
        SELECT i.* 
        FROM assessment_item i
        LEFT JOIN assessment_item_stats s ON s.assessment_id = i.id
        WHERE i.skill_id = :skillId
          AND (:levelId IS NULL OR i.level_id = :levelId)
          AND i.type = 'QUIZ'
          AND i.is_active = 1
        ORDER BY (s.attempts IS NULL) DESC, RAND()
        LIMIT :limit
        """,
        nativeQuery = true
    )
    fun pickQuizItems(skillId: Long, levelId: Long?, limit: Int): List<AssessmentItem>
}
