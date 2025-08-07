package org.setackle.tacklebox.user.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user_skill_topic_level")
class UserSkillTopicLevel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var skillLevelId: Long,

    @Column(nullable = false)
    var userSkillId: Long,

    @Column(nullable = false)
    var skillTopicId: Long,

    var achievedAt: LocalDateTime? = null
)