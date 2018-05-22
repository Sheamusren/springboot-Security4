package com.jiakong.framework.springbootsecurity.user.repository;

import com.jiakong.framework.springbootsecurity.user.entity.SysUser;
import org.springframework.data.repository.Repository;

/**
 * UserRepository
 *
 * @author admin
 * @date 2018-05-22-18
 */
public interface UserRepository extends Repository<SysUser, Long> {
    SysUser findByName(String name);
}
