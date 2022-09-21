package com.itck.order;

public class App {
    public static void main(String[] args) {

        OrderStatus order = OrderStatus.ORDER_PAY_FINISH;
        System.out.println(order.getKey());
        System.out.println(order.getDesc());


        OrderStatus orderType = OrderStatus.getOrderType(3);
        System.out.println(orderType);
        System.out.println(orderType.getDesc());

    }
}
