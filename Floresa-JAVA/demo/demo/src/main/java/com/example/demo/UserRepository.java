package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository {

    public interface UserRepository extends JpaRepository<User, Long> {}
}
