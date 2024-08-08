package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println(checkForPalindrome("Madam"));
//        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));
//        System.out.println(checkForPalindrome("BATUHAN"));
//        System.out.println(checkForPalindrome("I did, did I?"));
//
//        System.out.println(convertDecimalToBinary(5));
//        System.out.println(convertDecimalToBinary(6));
//        System.out.println(convertDecimalToBinary(13));

        WorkintechList<String> list = new WorkintechList<>();
        list.add("Mehmet");
        list.add("Mehmet");
        list.add("Ali");
        list.add("Ali");
        list.add("Ali");
        list.add("Zeynep");
        list.add("Zeynep");
        list.remove("Ali");

        System.out.println(list);



    }

    public static boolean checkForPalindrome(String word) {
        String newWord = word.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");

        String reversed = new StringBuilder(newWord).reverse().toString();
        System.out.println(reversed);
        return newWord.equals(reversed);

    }


    public static String convertDecimalToBinary(int decimalNumber) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binaryNumber = new StringBuilder();

        if (decimalNumber == 0) {
            return "0";
        }

        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            stack.push(remainder);
            decimalNumber = decimalNumber / 2;
        }

        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        return binaryNumber.toString();

    }
}