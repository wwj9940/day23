package com.itck.order;

public enum OrderStatus {
    ORDER_NO_PAY(1, "未支付"),
    ORDER_PAY_FINISH(2, "已支付"),
    ORDER_CANCEL(3, "已取消"),
    ORDER_FINISHNO_PAY(4, "已完成");

    private int key;
    private String desc;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    OrderStatus(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }
    // 根据key值获取枚举值
    public static OrderStatus getOrderType(int key){
        for (OrderStatus value : OrderStatus.values()) {
            if(key == value.getKey()) {
                return value;
            }
        }
        //根据自身的业务 查不到可以返回null，或者抛出异常。
        return null;
    }
}
