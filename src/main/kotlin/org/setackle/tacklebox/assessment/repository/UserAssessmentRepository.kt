package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.model.UserAssessment
import org.springframework.data.jpa.repository.JpaRepository

interface UserAssessmentRepository : JpaRepository<UserAssessment, Long> {
}