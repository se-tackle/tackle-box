package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.model.SkillLevel
import org.springframework.data.jpa.repository.JpaRepository

interface SkillLevelRepository : JpaRepository<SkillLevel, Long> {
}