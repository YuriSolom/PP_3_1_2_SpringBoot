package com.yurisolom.pp_3_1_2_springboot.repository;

import com.yurisolom.pp_3_1_2_springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
