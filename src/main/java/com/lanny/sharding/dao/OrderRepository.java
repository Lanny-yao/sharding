package com.lanny.sharding.dao;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Lanny Yao
 * @date 5/10/2019 2:45 PM
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
