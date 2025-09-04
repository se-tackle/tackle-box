package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.entity.AssessmentItemStats
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Modifying
import org.springframework.data.jpa.repository.Query
import org.springframework.transaction.annotation.Transactional

interface AssessmentItemStatsRepository: JpaRepository<AssessmentItemStats, Long> {

    @Transactional
    @Modifying
    @Query(
        value = """
        INSERT INTO assessment_item_stats (assessment_id, attempts, correct)
        VALUES (?1, 1, IF(?2, 1, 0))
        ON DUPLICATE KEY UPDATE
          attempts = attempts + 1,
          correct  = correct  + VALUES(correct)
        """,
        nativeQuery = true
    )
    fun upsertAttempt(assessmentId: Long?, isCorrect: Boolean)
}