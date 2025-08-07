package org.setackle.tacklebox.user.repository

import org.setackle.tacklebox.user.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}