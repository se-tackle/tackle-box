package org.setackle.tacklebox.assessment.model

import jakarta.persistence.*

@Entity
@Table(name = "assessment_item")
class AssessmentItem(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var skillTopicId: Long,

    @Column(nullable = false)
    var skillLevelId: Long,

    @Column(nullable = false, columnDefinition = "text")
    var question: String,

    @Column(nullable = false, columnDefinition = "json")
    var options: String,

    @Column(nullable = false)
    var correctOptionIndex: Int
)