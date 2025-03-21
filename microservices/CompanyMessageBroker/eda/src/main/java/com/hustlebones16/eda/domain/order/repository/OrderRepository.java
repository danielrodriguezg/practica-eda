package com.hustlebones16.eda.domain.order.repository;

import com.hustlebones16.eda.domain.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
