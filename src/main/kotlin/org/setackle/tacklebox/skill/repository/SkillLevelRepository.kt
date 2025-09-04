package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.entity.SkillLevel
import org.springframework.data.jpa.repository.JpaRepository

interface SkillLevelRepository: JpaRepository<SkillLevel, Long> {
    fun findAllByFrameworkOrderByMinScoreAsc(framework: String): List<SkillLevel>
}