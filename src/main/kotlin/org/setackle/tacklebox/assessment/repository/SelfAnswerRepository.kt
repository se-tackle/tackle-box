package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.entity.SelfAnswer
import org.setackle.tacklebox.assessment.entity.SelfKey
import org.springframework.data.jpa.repository.JpaRepository

interface SelfAnswerRepository: JpaRepository<SelfAnswer, SelfKey> {
    fun findAllBySessionId(sessionId: Long): List<SelfAnswer>
}