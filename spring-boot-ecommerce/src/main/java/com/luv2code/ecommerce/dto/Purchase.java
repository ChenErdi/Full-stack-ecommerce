package com.luv2code.ecommerce.dto;


import com.luv2code.ecommerce.entity.Address;
import com.luv2code.ecommerce.entity.Customer;
import com.luv2code.ecommerce.entity.Order;
import com.luv2code.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

    public Order getOrder() {
        return order;
    }

    public Set<OrderItem> getOrderItems() {
        return orderItems;
    }

    public Object getBillingAddress() {
        return billingAddress;
    }

    public Object getShippingAddress() {
        return shippingAddress;
    }

    public Customer getCustomer() {
        return customer;
    }
}
