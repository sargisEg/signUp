package com.signup.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "USER_ROLES")
public class UserRole {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "USER_ROLE_ID_SEQUENCE"
    )
    @SequenceGenerator(name = "USER_ROLE_ID_SEQUENCE")
    private Long id;

    @ManyToOne
    @JoinColumn(
            name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USER_ROLES_USER_ID_ID")
    )
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "type", nullable = false, length = 50)
    private UserRoleTypes type;

    public UserRole() {
    }

    public UserRole(User user, UserRoleTypes type) {
        this.user = user;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserRoleTypes getUserRoleType() {
        return type;
    }

    public void setUserRoleType(UserRoleTypes type) {
        this.type = type;
    }
}
