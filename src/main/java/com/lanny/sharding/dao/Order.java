package com.lanny.sharding.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lanny Yao
 * @date 5/10/2019 2:44 PM
 */
@Entity
@Table(name = "t_order")
@Data
@NoArgsConstructor
public class Order {

    @Id
    private Long orderId;

    private Long userId;
}
