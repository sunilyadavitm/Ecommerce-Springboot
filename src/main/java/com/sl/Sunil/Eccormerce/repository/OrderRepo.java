package com.sl.Sunil.Eccormerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.Sunil.Eccormerce.entity.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {
}
