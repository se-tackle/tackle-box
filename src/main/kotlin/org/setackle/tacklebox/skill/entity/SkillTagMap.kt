package org.setackle.tacklebox.skill.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.Table
import java.io.Serializable

@Entity
@Table(name = "skill_tag_map")
@IdClass(SkillTagMapId::class)
class SkillTagMap(

    @Id
    @Column(name="skill_id")
    val skillId: Long? = null,

    @Id
    @Column(name="tag_id")
    val tagId: Long? = null
)

data class SkillTagMapId(
    var skillId: Long = 0,
    var tagId: Long = 0
): Serializable
