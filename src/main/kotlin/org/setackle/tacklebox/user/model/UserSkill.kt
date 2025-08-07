package org.setackle.tacklebox.user.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user_skill")
class UserSkill(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var userId: Long,

    @Column(nullable = false)
    var skillId: Long,

    var skillLevelId: Long? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    var status: UserSkillStatus,

    var registeredAt: LocalDateTime? = null,
    var lastEvaluatedAt: LocalDateTime? = null,
) {
    enum class UserSkillStatus(val value: String) {

    }
}