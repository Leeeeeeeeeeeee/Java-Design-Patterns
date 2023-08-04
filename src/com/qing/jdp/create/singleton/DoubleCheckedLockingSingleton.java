package com.qing.jdp.create.singleton;

/**
 * 结合了懒汉式和饿汉式的优点，在多线程环境下保证了懒加载和高效获取实例。
 */
public class DoubleCheckedLockingSingleton {
    private volatile static DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {}

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
