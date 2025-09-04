package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.entity.SkillTag
import org.springframework.data.jpa.repository.JpaRepository

interface SkillTagRepository: JpaRepository<SkillTag, Long> {
    fun findByCode(code: String): SkillTag?
    fun findAllByOrderByCodeAsc(): List<SkillTag>
}