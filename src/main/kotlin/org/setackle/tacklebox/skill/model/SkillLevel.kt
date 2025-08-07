package org.setackle.tacklebox.skill.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "skill_level")
class SkillLevel(

    @Id
    var id: Long? = null,

    @Column(nullable = false)
    var level: Int,

    @Column(nullable = false, length = 50)
    var name: String,

    @Column(columnDefinition = "text")
    var description: String? = null
)