package com.qing.jdp.create.singleton;

/**
 * 在第一次调用获取实例方法时才创建实例，延迟加载，节省资源。但是在多线程环境下需要考虑线程安全性。
 */
public class LazySingleton {
	
    private static LazySingleton instance;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
    
}
