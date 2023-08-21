package com.qing.jdp.behave.interpreter;

class Context {
    private int currentYear;
    private int currentMonth;
    private int currentDay;

    // Getters and setters for currentYear, currentMonth, currentDay
    
    public int getCurrentYear() {
    	return currentYear;
    }
    public void setCurrentYear(int value) {
    	this.currentYear = value;
    }
    public int getCurrentMonth() {
    	return currentMonth;
    }
    public void setCurrentMonth(int value) {
    	this.currentMonth = value;
    }
    public int getCurrentDay() {
    	return currentDay;
    }
    public void setCurrentDay(int value) {
    	this.currentDay = value;
    }
}