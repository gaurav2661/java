package org.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        char[] para = s.toCharArray();
        List<String> characters = new ArrayList<>();
        Stack<Character> characters1 = new Stack<>();
        for(int index = 0; index<para.length; index++) {
            if (para[index] == '(') {
                characters.add("(");
                characters1.push( ')');
            }
            if(para[index] == '[' ) {
                characters.add("[");
                characters1.push( ']');
            }
            if(para[index] == '{') {
                characters.add("{");
                characters1.push( '}');
            }
            if (para[index] == ')') {
                if(characters.contains("(") && characters1.peek() == ')') {
                    characters.remove("(");
                    characters1.pop();
                }
                else {
                    return false;
                }
            }
            if(para[index] == ']' ) {
                if(characters.contains("[") && characters1.peek() == ']') {
                    characters.remove("[");
                    characters1.pop();
                }
                else {
                    return false;
                }
            }
            if(para[index] == '}') {
                if(characters.contains("{") && characters1.peek() == '}') {
                    characters.remove("{");
                    characters1.pop();
                }
                else {
                    return false;
                }

            }
        }
        return characters.size() == 0;
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
//        String test1 = "()";
//        System.out.println(validParentheses.isValid(test1));
        String test2 = "()[]{}";
        System.out.println(validParentheses.isValid(test2));
        String test3 = "]";
        System.out.println(validParentheses.isValid(test3));
        String test4 = "([)]";
        System.out.println(validParentheses.isValid(test4));
        String test5 = "{[]}";
        System.out.println(validParentheses.isValid(test5));
    }
}
