package io.flow_orders_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.flow_orders_backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
