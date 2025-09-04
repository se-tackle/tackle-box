package org.setackle.tacklebox.user.repository

import org.setackle.tacklebox.user.entity.AuthProvider
import org.springframework.data.jpa.repository.JpaRepository

interface AuthProviderRepository : JpaRepository<AuthProvider, Long> {
}