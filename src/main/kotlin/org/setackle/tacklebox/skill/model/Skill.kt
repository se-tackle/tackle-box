package org.setackle.tacklebox.skill.model

import jakarta.persistence.*

@Entity
@Table(name = "skill")
class Skill(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var skillCategoryId: Long,

    @Column(nullable = false)
    var name: String,

    var thumbnailUrl: String? = null,
    var description: String? = null
)