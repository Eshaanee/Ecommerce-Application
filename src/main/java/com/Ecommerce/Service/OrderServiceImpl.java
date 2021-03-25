package com.Ecommerce.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ecommerce.Model.Orders;
import com.Ecommerce.Repository.OrderRepository;
import com.Ecommerce.Repository.UserRepository;
import com.Ecommerce.web.dto.GetOrdersDto;


@Service
public class OrderServiceImpl implements OrderService {

	private OrderRepository orderrepositiory;
	
	@Autowired
    public OrderServiceImpl(OrderRepository orderrepositiory) {  //we didnt make userserviceImpl obj
        this.orderrepositiory=orderrepositiory;
    }
    

	@Override
	public List<Orders> getorders(int userId) {
		
		return orderrepositiory.findByuserId(userId);
	}
}
