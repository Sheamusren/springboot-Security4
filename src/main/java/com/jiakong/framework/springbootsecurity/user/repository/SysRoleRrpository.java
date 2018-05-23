package com.jiakong.framework.springbootsecurity.user.repository;

import com.jiakong.framework.springbootsecurity.user.entity.SysRole;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * SysRoleRrpository
 *
 * @author admin
 * @date 2018-05-23-09
 */
public interface SysRoleRrpository extends JpaRepository<SysRole,Long> {
}
