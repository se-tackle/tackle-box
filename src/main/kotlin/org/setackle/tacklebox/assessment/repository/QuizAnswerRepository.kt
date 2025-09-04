package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.entity.QuizAnswer
import org.setackle.tacklebox.assessment.entity.QuizKey
import org.springframework.data.jpa.repository.JpaRepository

interface QuizAnswerRepository: JpaRepository<QuizAnswer, QuizKey> {
    fun findAllBySessionId(sessionId: Long): List<QuizAnswer>
}