package com.jiakong.springbootsecurity.repository;

import com.jiakong.springbootsecurity.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 *
 * @author admin
 * @date 2018-08-03-11
 */
public interface UserRepository extends JpaRepository<UserEntity,Long> {

    UserEntity findByUserName(String userName);
}
