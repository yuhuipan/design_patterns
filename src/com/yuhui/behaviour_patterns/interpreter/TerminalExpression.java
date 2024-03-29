package com.yuhui.behaviour_patterns.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression extends Expression {

    private String literal = null;

    public TerminalExpression(String str) {
        this.literal = str;
    }

    @Override
    public boolean interpret(String str) {
        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            String test = st.nextToken();
            if (test.equals(literal)) {
                return true;
            }
        }
        return false;
    }
}
