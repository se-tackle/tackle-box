package org.setackle.tacklebox.assessment.entity

import jakarta.persistence.*
import java.io.Serializable
import java.time.LocalDateTime

@Entity
@Table(name = "self_answer")
@IdClass(SelfKey::class)
class SelfAnswer(

    @Id
    @Column(name = "session_id")
    val sessionId: Long? = null,

    @Id
    @Column(name = "assessment_id")
    val assessmentId: Long? = null,

    val score: Int? = null,

    @Column(name = "created_at")
    val createdAt: LocalDateTime = LocalDateTime.now()
)

data class SelfKey(
    var sessionId: Long = 0,
    var assessmentId: Long = 0
) : Serializable