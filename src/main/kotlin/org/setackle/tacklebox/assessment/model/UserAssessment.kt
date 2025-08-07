package org.setackle.tacklebox.assessment.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user_assessment")
class UserAssessment(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var userId: Long,

    @Column(nullable = false)
    var skillTopicId: Long,

    @Column(nullable = false)
    var totalQuestions: Int,

    @Column(nullable = false)
    var correctAnswers: Int,

    var score: Int? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    var status: UserAssessmentStatus,

    var assessedAt: LocalDateTime? = null
) {
    enum class UserAssessmentStatus {

    }
}