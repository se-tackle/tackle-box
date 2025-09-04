package org.setackle.tacklebox.skill.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint

@Entity
@Table(
    name = "skill",
    uniqueConstraints = [
        UniqueConstraint(
            columnNames = ["category_id", "name"],
            name = "uq_skill_category_name"
        )
    ]
)
class Skill(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(name = "category_id", nullable = false)
    val categoryId: Long? = null,

    @Column(nullable = false, length = 120)
    val name: String? = null,

    val description: String? = null,

    @Column(name = "is_active")
    val isActive: Boolean? = null
)