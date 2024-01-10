package org.easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        char[] firstWordChars = strs[0].toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        for(int index = 0; index<firstWordChars.length; index++) {
            for(int wordIndex = 1; wordIndex<strs.length; wordIndex++) {
                char[] currentWordChars = strs[wordIndex].toCharArray();
                if(index <= currentWordChars.length-1) {
                    if(firstWordChars[index] == currentWordChars[index]){
                        flag = true;
                    }
                    else {
                        flag = false;
                        break;
                    }
                }
                else {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                stringBuilder.append(firstWordChars[index]);
            }
            if(!flag) {
                break;
            }
        }
        if(stringBuilder.length() != 0){
            return stringBuilder.toString();
        }
        if(strs.length == 1){
            return strs[0];
        }
        else return "";
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] words = {"c","acc","ccc"};
        String prefix = longestCommonPrefix.longestCommonPrefix(words);
        System.out.println(prefix);
        String[] words1 = {"flower","flower","flowe"};
        String prefix1 = longestCommonPrefix.longestCommonPrefix(words1);
        System.out.println(prefix1);
        String[] word2 = {"c"};
        String prefix2 = longestCommonPrefix.longestCommonPrefix(word2);
        System.out.println(prefix2);
        String[] word3 = {"flower","flow","flight"};
        String prefix3 = longestCommonPrefix.longestCommonPrefix(word3);
        System.out.println(prefix3);
        String[] word4 = {"cir","car"};
        String prefix4 = longestCommonPrefix.longestCommonPrefix(word4);
        System.out.println(prefix4);
    }
}
