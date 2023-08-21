package com.qing.jdp.behave.interpreter;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.setCurrentYear(2023);
        context.setCurrentMonth(8);
        context.setCurrentDay(21);

        Expression yearExpression = new YearExpression();
        Expression monthExpression = new MonthExpression();
        Expression dayExpression = new DayExpression();
        
        int currentYear = yearExpression.interpret(context);
        int currentMonth = monthExpression.interpret(context);
        int currentDay = dayExpression.interpret(context);

        System.out.println("Current Year: " + currentYear);
        System.out.println("Current Month: " + currentMonth);
        System.out.println("Current Day: " + currentDay);
    }
}