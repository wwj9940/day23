package com.itck.enums;

public class APP {
    public static void main(String[] args) {
        Week week = Week.MONDAY;

        switch(week) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("上班");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("休息");
                break;
            default:
                System.out.println("未知数据");
        }
        // 枚举值的索引，索引从零开始，索引值和枚举值的定义顺序相关
        System.out.println(week.ordinal());

        Week [] values = Week.values();
        for (Week we : values) {
            System.out.println(we);
        }
        Week valueOf = Week.valueOf("SUNDAY");
        System.out.println(valueOf);

    }

}
