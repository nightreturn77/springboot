package com.estudando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudando.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
