package com.jiakong.springbootsecurity.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * RoleEntity
 *
 * @author admin
 * @date 2018-08-03-11
 */
@Entity
@Table(name = "system_role")
public class RoleEntity {

    @Id
    private Long id;
    @NotNull
    private String roleName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
