package com.qing.jdp.create.singleton;

/**
 * 在类加载时就创建实例，并且对外提供静态的获取实例的方法。优点是线程安全，但可能会提前加载实例，浪费资源。
 */
public class EagerSingleton {
	
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance() {
        return instance;
    }
    
}
