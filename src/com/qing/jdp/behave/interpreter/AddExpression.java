package com.qing.jdp.behave.interpreter;

//非终结符表达式（Non-terminal Expression）：构建复杂的表达式。
class AddExpression implements Expression {
    private Expression left;
    private Expression right;

    public AddExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
