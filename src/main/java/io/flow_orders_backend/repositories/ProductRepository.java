package io.flow_orders_backend.repositories;

import io.flow_orders_backend.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
