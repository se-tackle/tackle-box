package org.setackle.tacklebox.user.repository

import org.setackle.tacklebox.user.model.UserSkillTopicLevel
import org.springframework.data.jpa.repository.JpaRepository

interface UserSkillTopicLevelRepository : JpaRepository<UserSkillTopicLevel, Long> {
}