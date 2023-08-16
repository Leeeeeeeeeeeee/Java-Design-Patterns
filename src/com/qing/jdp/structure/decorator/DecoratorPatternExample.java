package com.qing.jdp.structure.decorator;

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Simple Coffee: " + simpleCoffee.getDescription() + ", Cost: $" + simpleCoffee.cost());

        Coffee coffeeWithMilk = new MilkDecorator(new SimpleCoffee());
        System.out.println("Coffee with Milk: " + coffeeWithMilk.getDescription() + ", Cost: $" + coffeeWithMilk.cost());

        Coffee coffeeWithMilkAndSugar = new SugarDecorator(new MilkDecorator(new SimpleCoffee()));
        System.out.println("Coffee with Milk and Sugar: " + coffeeWithMilkAndSugar.getDescription() + ", Cost: $" + coffeeWithMilkAndSugar.cost());
    }
}