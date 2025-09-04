package org.setackle.tacklebox.assessment.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "evaluation_session")
class EvaluationSession(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "user_id", nullable = false)
    val userId: Long? = null,   // 비회원 NULL

    @Column(name = "skill_id", nullable = false)
    var skillId: Long? = null,  // 세션 대상 스킬(중분류)

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var status: SessionStatus = SessionStatus.IN_PROGRESS,

    @Column(name = "total_score")
    var totalScore: Int? = null,

    @Column(name = "target_level_id")
    var targetLevelId: Long? = null,

    @Column(name = "achieved_level_id")
    var achievedLevelId: Long? = null,

    @Column(name = "passed", nullable = false)
    var passed: Boolean = false,

    @Column(name = "started_at")
    val startedAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "completed_at")
    var completedAt: LocalDateTime? = null,
)

enum class SessionStatus {
    IN_PROGRESS, COMPLETED
}