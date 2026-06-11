package com.java.progpractice;

class ReverseString {
    public static void main(String[] args) {
        String origin = "Automation";
        String reverse = "";
        for (int i = 0; i <= origin.length() - 1; i++) {
            reverse = origin.charAt(i) + reverse;
        }
        System.out.println("Reverse:" + reverse);
    }
}
