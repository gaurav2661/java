package org.stack;

import java.util.Stack;

public class InfixToPostfix {
    int previousPrecedence;
    public String buildPostfixExpression(String infixExpression){
        Stack<Character> stacks = new Stack<>();
        StringBuilder postfixExpressionBuilder = new StringBuilder();
        char[] chars = infixExpression.toCharArray();
        for (char currentCharacter : chars) {
            if (currentCharacter == '*'
                    || currentCharacter == '/'
                    || currentCharacter == '+'
                    || currentCharacter == '-'
                    || currentCharacter == '^') {
                int currentPrecedence = getPrecedence(currentCharacter);
                if (previousPrecedence != -1 && currentPrecedence < previousPrecedence) {
                    popAllCharacters(stacks, postfixExpressionBuilder);
                }
                previousPrecedence = currentPrecedence;
                stacks.push(currentCharacter);
            }
            if(currentCharacter == '(') {
//                postfixExpressionBuilder.append(currentCharacter);
            }
            if(currentCharacter == ')') {
                while(stacks.isEmpty() && stacks.peek() != '('){
                    char popCharacter = stacks.pop();
                    postfixExpressionBuilder.append(popCharacter);
                }
            }
            if ((currentCharacter >= 'A' && currentCharacter <= 'Z')
                    || (currentCharacter >= 'a' && currentCharacter <= 'z')
                    || (currentCharacter >= '0' && currentCharacter<= '9'))  {
                postfixExpressionBuilder.append(currentCharacter);
            }
        }
        popAllCharacters(stacks, postfixExpressionBuilder);
        return postfixExpressionBuilder.toString();
    }

    private static void popAllCharacters(Stack<Character> stacks, StringBuilder postfixExpressionBuilder) {
        while (!stacks.isEmpty()) {
            char popCharacter = stacks.pop();
            postfixExpressionBuilder.append(popCharacter);
        }
    }

    public int getPrecedence(char currentCharacter) {
        if(currentCharacter == '+' || currentCharacter == '-') {
            return 1;
        }
        if(currentCharacter == '*' || currentCharacter == '/') {
            return 2;
        }
        if(currentCharacter == '^') {
            return 3;
        }
        return -1;
    }
    public static void main(String[] args) {
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        String expression = "a+b*(c^d-e)^(f+g*h)-i";
        String postfixExpression = infixToPostfix.buildPostfixExpression(expression);
        System.out.println(postfixExpression);
    }
}

