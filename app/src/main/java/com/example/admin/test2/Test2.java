package com.example.admin.test2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 9/1/2017.
 */

public class Test2 {

    public static void main(String[] args) {

        testPalindrome();
        findOccurrence();
        testArmstrongNum();
    }

    /////////////////////////////////////////////////////////////////////////////PALINDROME
    public static boolean palindrome(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        // check whether the string is palindrome or not
        if (s.equals(reverse)) {
            return true;
        } else {
            return false;
        }
    }

    public static void testPalindrome() {
        Scanner input = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a String: ");
        String n = input.next();

        if (palindrome(n)) {
            System.out.println("Yes, it is Palindrome");
        } else {
            System.out.println("No, there is no Palindrome");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////END OF PALINDROME

    //////////////////////////////////////////////////////////////////////////////////////////INT OCCURRENCE
    private static void findOccurrence() {

        System.out.println("\n\nArray - {2, 3, 4, 5, 5, 6, 7}\n");

        int[] numbers = {2, 3, 4, 5, 5, 6, 7};
        int n = 0;
        int occ = 1;
        int occ2 = 1;
        int temp = 0;
        int temp2 = 0;

        for (int i = 0; i != 7; i++) {
            n++;
            for (int j = n; j != 7; j++) {
                if (numbers[j] == numbers[i]) {
                    temp = numbers[j];
                    occ++;
                    if (numbers[j] != temp) {
                        temp2 = numbers[j];
                        occ2++;
                    }
                    if (occ2 > occ && j >= 5) {
                        occ = occ2;
                        temp = temp2;
                        occ2 = 0;
                        temp2 = 0;
                    }
                }
            }
        }
        System.out.println("The most occurred number: " + Integer.toString(temp) + " (" + Integer.toString(occ) + ")\n\n");
    }
    ////////////////////////////////////////////////////////////////////////////////////////////END OF INTEGER OCCURRENCE

    ///////////////////////////////////////////////////////////////////////////////////////////ARMSTRONG TEST NUMBER
    private static void testArmstrongNum() {

        Scanner input = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter an Integer: ");
        int n = input.nextInt();
        long total = 0;

        int size = Integer.toString(n).length();

        ArrayList<Character> numbers = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            numbers.add(Integer.toString(n).charAt(i));
        }

        for (int x = 0; x < size; x++) {
            total += expo(size, Character.getNumericValue(numbers.get(x)));
        }

        if(total == n){
            System.out.println("\n\nTotal: " + Long.toString(total) + "\nInput: " + Integer.toString(n) + "\nIs An Armstrong Number");
        }
        else{
            System.out.println("\n\nTotal: " + Long.toString(total) + "\nInput: " + Integer.toString(n) + "\nIs Not An Armstrong Number");
        }
    }

    public static int expo(int i, int num) {
        int temp = 0;
        for (int exp = i; exp > 1; exp--) {
            if (exp == i) {
                temp = num * num;
            } else {
                temp = temp * num;
            }
        }
        return temp;
    }
    ///////////////////////////////////////////////////////////////////////////////////////////END OF ARMSTRONG TEST
}

