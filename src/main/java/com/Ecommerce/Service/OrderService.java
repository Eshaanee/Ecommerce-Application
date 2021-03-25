package com.Ecommerce.Service;

import java.util.ArrayList;
import java.util.List;

import com.Ecommerce.Model.Orders;
import com.Ecommerce.web.dto.GetOrdersDto;

public interface OrderService {
	List<Orders> getorders(int userId);
}
