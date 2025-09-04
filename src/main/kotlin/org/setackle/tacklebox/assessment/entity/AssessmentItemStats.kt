package org.setackle.tacklebox.assessment.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "assessment_item_stats")
class AssessmentItemStats(

    @Id
    @Column(name = "assessment_id")
    var assessmentId: Long? = null,

    @Column(nullable = false)
    var attempts: Int = 0,

    @Column(nullable = false)
    var correct: Int = 0,

    @Column(name = "last_updated", nullable = false)
    var lastUpdated: LocalDateTime = LocalDateTime.now()
)