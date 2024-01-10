package org.Palindrome;

public class Palindrome {
    int palindrome = 0;
    public boolean isPalindrome(int x) {

        if(x % 10 != 0) {
            int temp = x % 10;
            palindrome = temp * 10;
            return isPalindrome(x / 10);
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(121));
    }
}
