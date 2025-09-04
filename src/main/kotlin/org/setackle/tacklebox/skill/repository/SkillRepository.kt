package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.entity.Skill
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface SkillRepository: JpaRepository<Skill, Long> {
    fun findAllByCategoryIdOrderByNameAsc(categoryId: Long): List<Skill>

    @Query(
        """
        SELECT s FROM Skill s
        WHERE (:categoryId IS NULL OR s.categoryId = :categoryId)
          AND (:activeOnly = false OR s.isActive = true)
        ORDER BY s.name ASC
        """
    )
    fun search(categoryId: Long?, activeOnly: Boolean = false): List<Skill>
}