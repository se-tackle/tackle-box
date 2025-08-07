package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.model.Assessment
import org.springframework.data.jpa.repository.JpaRepository

interface AssessmentRepository : JpaRepository<Assessment, Long> {
}