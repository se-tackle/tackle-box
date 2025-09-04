package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.entity.SkillTagMap
import org.setackle.tacklebox.skill.entity.SkillTagMapId
import org.springframework.data.jpa.repository.JpaRepository

interface SkillTagMapRepository: JpaRepository<SkillTagMap, SkillTagMapId> {
    fun findAllBySkillId(skillId: Long): List<SkillTagMap>
}