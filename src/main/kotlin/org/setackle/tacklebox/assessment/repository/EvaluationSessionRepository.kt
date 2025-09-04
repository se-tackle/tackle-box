package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.entity.EvaluationSession
import org.springframework.data.jpa.repository.JpaRepository

interface EvaluationSessionRepository: JpaRepository<EvaluationSession, Long> {

}