package org.setackle.tacklebox.assessment.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "assessment_item")
class AssessmentItem(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "skill_id", nullable = false)
    val skillId: Long? = null,

    @Column(name = "level_id", nullable = true) // V5에서 추가, NULL 허용(점진 백필 고려)
    var levelId: Long? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    val type: ItemType = ItemType.QUIZ,

    @Column(columnDefinition = "TEXT", nullable = false)
    val question: String? = null,

    @Column(columnDefinition = "JSON")
    val options: String? = null,

    @Column(name = "correct_answer", columnDefinition = "JSON")
    val correctAnswer: String? = null,

    @Column(name = "max_points", nullable = false)
    val maxPoints: Int? = null,

    @Column(nullable = false)
    val version: Int? = null,

    @Column(name = "is_active", nullable = false)
    val isActive: Boolean? = null,

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now()
)

enum class ItemType {
    SELF, QUIZ, PRACTICAL
}