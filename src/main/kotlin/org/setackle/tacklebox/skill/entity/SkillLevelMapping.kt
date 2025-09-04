package org.setackle.tacklebox.skill.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(
    name = "skill_level_mapping",
    uniqueConstraints = [UniqueConstraint(columnNames = ["skill_id", "level_id"])]
)
class SkillLevelMapping(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "skill_id", nullable = false)
    var skillId: Long? = null,

    @Column(name = "level_id", nullable = false)
    var levelId: Long? = null,

    @Column(name = "cutoff_score", nullable = false)
    var cutoffScore: Int = 0,

    @Column(name = "created_at", nullable = false)
    var createdAt: LocalDateTime = LocalDateTime.now(),

    @Column(name = "updated_at", nullable = false)
    var updatedAt: LocalDateTime = LocalDateTime.now()
)