package org.setackle.tacklebox.user.model

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "user")
class User(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false, length = 50)
    var nickname: String,

    @Column(nullable = false)
    var email: String,

    @Column(nullable = false)
    var passwordHash: String,

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    var status: UserStatus,

    var registeredAt: LocalDateTime? = null,
    var unregisteredAt: LocalDateTime? = null,
    var lastLoginAt: LocalDateTime? = null,
    var updatedAt: LocalDateTime? = null
) {
    enum class UserStatus(val value: String) {
        REGISTERED("등록"),
        UNREGISTERED("탈퇴"),
    }
}