package com.qing.jdp.behave.iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        StringList stringList = new StringList();
        stringList.add("Hello");
        stringList.add("Iterator");
        stringList.add("Pattern");

        // 使用迭代器遍历集合
        for (String item : stringList) {
            System.out.println(item);
        }
    }
}
