package com.qing.jdp.create.singleton;

/**
 * 利用Java的类加载机制和静态内部类的特性，实现了懒加载且线程安全。
 * 为了确保单例的唯一性，还可以使用枚举（Enum）实现单例模式，因为Java中枚举类型的实例是唯一的。
 */
public class StaticInnerSingleton {
	
    private StaticInnerSingleton() {}

    private static class SingletonHolder {
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
