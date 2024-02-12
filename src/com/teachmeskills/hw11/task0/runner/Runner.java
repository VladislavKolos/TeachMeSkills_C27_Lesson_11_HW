package com.teachmeskills.hw11.task0.runner;

import com.teachmeskills.hw11.task0.functional.Functional;

/**
 * Class with method main to run the program
 * create a string that has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any number and y is a letter of the Latin alphabet
 * methods are called in this class.
 */
public class Runner {
    public static void main(String[] args) {
        String docNumber = "1234-ABc-0988-deF-1p3G";
        Functional.outputNumbers(docNumber);
        Functional.outputDocNumber(docNumber);
        Functional.outputOnlyLetters(docNumber);
        Functional.outputLettersWithSb(docNumber);
        Functional.outputCheckFirst(docNumber);
        Functional.outputCheckSecond(docNumber);
        Functional.outputCheckThird(docNumber);

        String docNumber1 = "I am Vladislav and I am studying a Java developer course";
        Functional.outputMinAndMaxLength(docNumber1);

        String docNumber2 = "I1 am2 Vladislav3 and4 I5 am6 studying7 a8 Java9 developer10 course11";
        Functional.outputDuplicated(docNumber2);
    }
}
