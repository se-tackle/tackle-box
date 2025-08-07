package org.setackle.tacklebox.assessment.model

import jakarta.persistence.*

@Entity
@Table(name = "assessment")
class Assessment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var assessmentItemId: Long,

    @Column(nullable = false)
    var userAssessmentId: Long,

    var selectedOptionIndex: Int? = null,
    var isCorrect: Boolean? = null
)