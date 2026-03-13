package io.flow_orders_backend.repositories;

import io.flow_orders_backend.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
