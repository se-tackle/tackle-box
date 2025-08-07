package org.setackle.tacklebox.skill.repository

import org.setackle.tacklebox.skill.model.SkillTopic
import org.springframework.data.jpa.repository.JpaRepository

interface SkillTopicRepository : JpaRepository<SkillTopic, Long> {
}