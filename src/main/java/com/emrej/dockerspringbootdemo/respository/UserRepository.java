package com.emrej.dockerspringbootdemo.respository;

import com.emrej.dockerspringbootdemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * User Repository
 *
 * @author emrej on 2020-04-10
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

    List<User> findAll();

}
