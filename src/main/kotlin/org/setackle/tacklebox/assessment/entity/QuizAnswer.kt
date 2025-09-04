package org.setackle.tacklebox.assessment.entity

import jakarta.persistence.*
import java.io.Serializable
import java.time.LocalDateTime

@Entity
@Table(name = "quiz_answer")
@IdClass(QuizKey::class)
class QuizAnswer(

    @Id
    @Column(name = "session_id")
    val sessionId: Long? = null,

    @Id
    @Column(name = "assessment_id")
    val assessmentId: Long? = null,

    @Column(name = "user_answer", columnDefinition = "JSON")
    var userAnswer: String? = null,

    @Column(name = "is_correct")
    var isCorrect: Boolean? = null,

    var points: Int? = null,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)

data class QuizKey(
    var sessionId: Long = 0,
    var assessmentId: Long? = 0
) : Serializable
