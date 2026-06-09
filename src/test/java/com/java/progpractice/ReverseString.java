package com.java.progpractice;

class ReverseString {
    public static void main(String[] args) {
        String s = "Automation";
        String rev = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            rev = s.charAt(i) + rev;
        }
        System.out.println("Reverse String :" + rev);
    }
}
