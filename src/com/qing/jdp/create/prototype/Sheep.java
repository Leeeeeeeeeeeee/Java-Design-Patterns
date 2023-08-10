package com.qing.jdp.create.prototype;

public class Sheep implements Cloneable{
	private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
