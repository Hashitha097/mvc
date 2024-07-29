/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.Model.OrderModel;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.util.ArrayList;

/**
 *
 * @author Heshan
 */
public class OrderController {
    
     private OrderModel orderModel;

    public OrderController() throws Exception {
        orderModel = new OrderModel();
    }

    
    
     public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception{
         return orderModel.placeOrder(orderDto, orderDetailDtos);
    }
    
}
