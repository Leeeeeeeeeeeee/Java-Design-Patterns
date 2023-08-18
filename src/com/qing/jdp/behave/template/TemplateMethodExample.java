package com.qing.jdp.behave.template;

public class TemplateMethodExample {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        
        System.out.println("Making coffee:");
        coffee.prepareRecipe();
        
        System.out.println("\nMaking tea:");
        tea.prepareRecipe();
    }
}