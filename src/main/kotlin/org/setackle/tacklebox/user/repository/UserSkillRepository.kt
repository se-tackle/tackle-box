package org.setackle.tacklebox.user.repository

import org.setackle.tacklebox.user.model.UserSkill
import org.springframework.data.jpa.repository.JpaRepository

interface UserSkillRepository : JpaRepository<UserSkill, Long> {
}