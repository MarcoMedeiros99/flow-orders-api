package io.flow_orders_backend.repositories;

import io.flow_orders_backend.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
