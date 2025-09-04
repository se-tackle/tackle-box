package org.setackle.tacklebox.skill.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "skill_level")
class SkillLevel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(length = 20)
    var code: String? = null,   // 내부 코드 (예: "L1", "JUNIOR")

    @Column(length = 50, nullable = false)
    var name: String? = null,

    @Column(columnDefinition = "TEXT")
    var description: String? = null,

    @Column(length = 50, nullable = false)
    var framework: String = "internal",  // 프레임워크 명시 (e.g., SFIA, internal 등)

    @Column(name = "min_score", nullable = false)
    var minScore: Int = 0,

    @Column(name = "max_score", nullable = false)
    var maxScore: Int = 100
)