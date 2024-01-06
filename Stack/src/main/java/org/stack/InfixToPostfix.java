package org.stack;

import java.util.Stack;

public class InfixToPostfix {
    int previousPrecedence;
    public String buildPostfixExpression(String infixExpression){
        Stack<Character> stacks = new Stack<>();
        StringBuilder postfixExpressionBuilder = new StringBuilder();
        char[] chars = infixExpression.toCharArray();
        for (char currentCharacter : chars) {
            if (currentCharacter == '*' || currentCharacter == '/' || currentCharacter == '+' || currentCharacter == '-') {
                int currentPrecedence = getPrecedence(currentCharacter);
                if (previousPrecedence != -1 && currentPrecedence < previousPrecedence) {
                    while (!stacks.isEmpty()) {
                        char popCharacter = stacks.pop();
                        postfixExpressionBuilder.append(popCharacter);
                    }
                }
                previousPrecedence = currentPrecedence;
                stacks.push(currentCharacter);
            }
            if ((currentCharacter >= 'A' && currentCharacter <= 'Z')
                    || (currentCharacter >= 'a' && currentCharacter <= 'z')
                    || (currentCharacter >= '0' && currentCharacter<= '9'))  {
                postfixExpressionBuilder.append(currentCharacter);
            }
        }
        while (!stacks.isEmpty()) {
            char popCharacter = stacks.pop();
            postfixExpressionBuilder.append(popCharacter);
        }
        return postfixExpressionBuilder.toString();
    }
    public int getPrecedence(char currentCharacter) {
        if(currentCharacter == '+' || currentCharacter == '-') {
            return 1;
        }
        if(currentCharacter == '*' || currentCharacter == '/') {
            return 2;
        }
        return -1;
    }
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String expression = "a+b*c";
        String postfixExpression = infixToPostfix.buildPostfixExpression(expression);
        System.out.println(postfixExpression);
    }
}

