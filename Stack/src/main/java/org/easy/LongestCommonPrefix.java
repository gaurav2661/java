package org.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        boolean flag = true;
        StringBuilder stringBuilder = new StringBuilder();
            String word = strs[0];
            char[] chars = word.toCharArray();
            for(int cIndex = 0; cIndex<chars.length; cIndex++) {
                if(flag) {
                    stringBuilder.append(chars[cIndex]);
                }
                for(int sIndex = 1; sIndex<strs.length; sIndex++) {
                    String word1 = strs[sIndex];
                    if(word1.contains(stringBuilder.toString())) {
                        flag = true;
                    }
                    else {
                        flag = false;
                    }
                }
        }
        if(stringBuilder.length() != 0 && strs.length != 1){
            return stringBuilder.substring(0,stringBuilder.length()-1);
        }
        else if(strs.length == 1){
            return stringBuilder.toString();
        }
        else return "";
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] words = {"flower","flower","flower"};
        String prefix = longestCommonPrefix.longestCommonPrefix(words);
        System.out.println(prefix);
    }
}
