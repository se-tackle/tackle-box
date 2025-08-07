package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.model.SkillCategory
import org.springframework.data.jpa.repository.JpaRepository

interface SkillCategoryRepository : JpaRepository<SkillCategory, Long> {
}