package org.setackle.tacklebox.user.entity

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "auth_provider")
class AuthProvider(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(name = "user_id", nullable = false)
    val userId: Long? = null,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    var providerType: ProviderType? = null,

    @Column(nullable = false)
    var providerUserId: String? = null,

    @Column(nullable = false)
    var linkedAt: LocalDateTime? = null,
)

enum class ProviderType {
    GOOGLE, GITHUB
}