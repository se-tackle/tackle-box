package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.model.Skill
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
}