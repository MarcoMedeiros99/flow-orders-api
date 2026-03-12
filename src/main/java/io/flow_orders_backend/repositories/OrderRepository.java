package io.flow_orders_backend.repositories;

import io.flow_orders_backend.entities.Order;
import io.flow_orders_backend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
