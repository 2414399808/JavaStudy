package cn.itcast.order.service;

import cn.itcast.feign.clients.UserClient;
import cn.itcast.feign.pojo.User;

import cn.itcast.order.mapper.OrderMapper;
import cn.itcast.order.pojo.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {
    @Autowired
    private RestTemplate restTemplate;


    @Autowired
    private UserClient userClient;

    @Autowired
    private OrderMapper orderMapper;

    public Order queryOrderById(Long orderId) {
        // 1.查询订单
        Order order = orderMapper.findById(orderId);
//        User user = restTemplate.getForObject("http://userservice/user" + order.getUserId(), User.class);
//        order.setUser(user);
        User byId = userClient.findById(order.getUserId());
        order.setUser(byId);
        // 4.返回
        return order;
    }
}
