package com.example.admin.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        testPalindrome();

    }


    public static boolean palindrome(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i > 0; i--) {
            reverse += s.charAt(i);
        }

        // check whether the string is palindrome or not
        if (s.equals(reverse))
            return true;

        else
            return false;
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
}


