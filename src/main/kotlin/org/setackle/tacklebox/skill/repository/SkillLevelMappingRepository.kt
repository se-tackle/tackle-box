package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.entity.SkillLevelMapping
import org.springframework.data.jpa.repository.JpaRepository

interface SkillLevelMappingRepository: JpaRepository<SkillLevelMapping, Long> {
    fun findBySkillIdAndLevelId(skillId: Long, levelId: Long): SkillLevelMapping?
    fun findAllBySkillId(skillId: Long): List<SkillLevelMapping>
}