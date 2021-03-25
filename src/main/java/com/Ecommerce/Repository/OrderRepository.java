package com.Ecommerce.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Ecommerce.Model.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer>{


	
	List<Orders> findByorderId(int orderId);
	
	List<Orders> findAll();
	    
	List<Orders> findByuserId(int userId);

}
