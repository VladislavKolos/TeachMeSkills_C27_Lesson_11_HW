package com.teachmeskills.hw11.task0.functional;

import java.util.Locale;

/**
 * Class with static methods to display numbers in one line, to display the changed document number, to display only one letter from the document number in a certain format in lower case, to display only letters from the document number in a certain format in upper case (using the class StringBuilder), to checking the contents of the sequence, to whether the document number begins with the sequence, to whether the document number ends with the sequence, to find and display the shortest and longest words in the line, to display a new line in which each letter from the initial line is duplicated.
 */
public class Functional {
    private Functional() {
    }

    public static void outputNumbers(String docNumber) {
        String numbers = docNumber.substring(0, 4) + docNumber.substring(9, 13);
        System.out.println("\nResult of the first task: " + numbers);
    }

    public static void outputDocNumber(String docNumber) {
        String docNumber1 = docNumber.substring(18);
        docNumber = docNumber.substring(0, 18).toLowerCase(Locale.ROOT);
        docNumber = docNumber.replace("a", "*");
        docNumber = docNumber.replace("b", "*");
        docNumber = docNumber.replace("c", "*");
        docNumber = docNumber.replace("d", "*");
        docNumber = docNumber.replace("e", "*");
        docNumber = docNumber.replace("f", "*");
        System.out.println("Result of the second task: " + docNumber + docNumber1);
    }

    public static void outputOnlyLetters(String docNumber) {
        String var1 = docNumber.substring(5, 8).toLowerCase(Locale.ROOT);
        String var2 = docNumber.substring(14, 17).toLowerCase(Locale.ROOT);
        String var3 = docNumber.substring(19, 20).toLowerCase(Locale.ROOT);
        String var4 = docNumber.substring(21).toLowerCase(Locale.ROOT);
        System.out.println("Result of the third task: " + var1 + "/" + var2 + "/" + var3 + "/" + var4);
    }

    public static void outputLettersWithSb(String docNumber) {
        StringBuilder sb = new StringBuilder();
        sb.append("Letters:");

        String var1 = docNumber.substring(5, 8).toUpperCase(Locale.ROOT);
        String var2 = docNumber.substring(14, 17).toUpperCase(Locale.ROOT);
        String var3 = docNumber.substring(19, 20).toUpperCase(Locale.ROOT);
        String var4 = docNumber.substring(21).toUpperCase(Locale.ROOT);

        sb.append(var1).append("/");
        sb.append(var2).append("/");
        sb.append(var3).append("/");
        sb.append(var4);

        System.out.println("Result of the fourth task: " + sb);
    }

    public static void outputCheckFirst(String docNumber) {
        docNumber = docNumber.toLowerCase(Locale.ROOT);

        if (docNumber.contains("abc")) {
            System.out.println("Result of the fifth task: The document number contains the sequence abc");
        } else {
            System.out.println("Result of the fifth task: The document number does not contain the sequence abc");
        }
    }

    public static void outputCheckSecond(String docNumber) {
        if (docNumber.startsWith("555")) {
            System.out.println("Result of the sixth task: The document number starts with the sequence 555");
        } else {
            System.out.println("Result of the sixth task: The document number does not start with the sequence 555");
        }
    }

    public static void outputCheckThird(String docNumber) {
        if (docNumber.endsWith("1a2b")) {
            System.out.println("Result of the seventh task: The document number ends with the sequence 1a2b");
        } else {
            System.out.println("Result of the seventh task: The document number does not end with the sequence 1a2b");
        }
    }

    public static void outputMinAndMaxLength(String docNumber1) {
        String[] array = docNumber1.split(" ");

        String min = array[0];
        for (String itemMin : array) {
            if (itemMin.length() <= min.length()) {
                min = itemMin;
            }
        }
        System.out.println("\nResult of the eighth task: the last shortest word in the line is " + min);

        String max = array[0];
        for (String itemMax : array) {
            if (itemMax.length() >= max.length()) {
                max = itemMax;
            }
        }
        System.out.println("Result of the eighth task: the last longest word in the line is " + max);
    }

    public static void outputDuplicated(String docNumber2) {
        StringBuilder result = new StringBuilder();
        for (char ch : docNumber2.toCharArray()) {
            if (((int) ch >= 65 && (int) ch <= 90) || ((int) ch >= 97 && (int) ch <= 122)) {
                result.append(ch).append(ch);
            } else {
                result.append(ch);
            }
        }
        System.out.println("\nResult of the ninth task: " + result);
    }
}

