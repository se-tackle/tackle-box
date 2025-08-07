package org.setackle.tacklebox.skill.model

import jakarta.persistence.*

@Entity
@Table(name = "skill_topic")
class SkillTopic(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var skillId: Long,

    @Column(nullable = false)
    var name: String,

    @Column(columnDefinition = "text")
    var description: String? = null,

    @Column(columnDefinition = "text")
    var selfCheckList: String? = null
)