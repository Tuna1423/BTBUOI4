package com.TranTrongTuan.BTBuoi4.repository;


import com.TranTrongTuan.BTBuoi4.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
