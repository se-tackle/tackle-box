package org.setackle.tacklebox.assessment.repository

import org.setackle.tacklebox.assessment.model.AssessmentItem
import org.springframework.data.jpa.repository.JpaRepository

interface AssessmentItemRepository : JpaRepository<AssessmentItem, Long> {
}