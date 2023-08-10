package com.qing.jdp.create.prototype;

/**
 * 原型模式（Prototype Pattern）是一种创建型设计模式，其目的是通过克隆（复制）已有对象来创建新的对象，而不是通过使用构造函数创建新对象。
 * 这种模式在需要创建多个相似对象时非常有用，因为它可以提高对象的创建效率并减少重复初始化工作。
 * 在 Java 中，实现原型模式的关键是让对象实现 Cloneable 接口，并重写 clone() 方法。这样，该对象就能够通过克隆方法来生成新的对象副本。
 */
public class PrototypeExample {
    public static void main(String[] args) {
        // 创建一个原型对象
        Sheep originalSheep = new Sheep("Dolly");

        try {
            // 克隆原型对象来创建新对象
            Sheep clonedSheep = originalSheep.clone();
            clonedSheep.setName("Molly");

            System.out.println("Original sheep: " + originalSheep.getName());
            System.out.println("Cloned sheep: " + clonedSheep.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
