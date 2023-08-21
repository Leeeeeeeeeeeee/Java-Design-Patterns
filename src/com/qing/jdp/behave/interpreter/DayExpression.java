package com.qing.jdp.behave.interpreter;

//终结符表达式（Terminal Expression）：实现具体的解释操作。
class DayExpression implements Expression {
    @Override
    public int interpret(Context context) {
        return context.getCurrentDay();
    }
}