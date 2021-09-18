package ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 zain yousaffuentes
 */

import java.util.Scanner;

public class App {

    public static void main (String [] args) {

        String [] strings = collectStrings();
        boolean anagramStatus = isAnagram(strings[0], strings[1]);
        System.out.println(createAnagramMessage(anagramStatus, strings[0], strings[1]));

    };

    // assuming all lowercase
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] frstr1 = new int[26];
        int[] frstr2 = new int[26];

        char [] splitstr1 = str1.toCharArray();
        char [] splitstr2 = str2.toCharArray();

        for (int x = 0; x < splitstr1.length; x++)
            frstr1[splitstr1[x] - 'a']++;

        for (int x = 0; x < splitstr2.length; x++)
            frstr2[splitstr2[x] - 'a']++;

        boolean anagramFlag = true;

        for (int x = 0; x < frstr1.length && anagramFlag; x++)
            if (frstr1[x] != frstr2[x])
                anagramFlag = false;


        return anagramFlag;

    };

    public static String[] collectStrings() {

        String[] strings = new String[2];
        Scanner s = new Scanner(System.in);

        System.out.print("Enter two strings ans I'll you if they are anagrams:\n");

        for (int x = 0; x < strings.length; x++) {
            if (x == 0) {
                System.out.print("Enter the first string: ");
                strings[x] = s.nextLine();
            } else if (x == 1) {
                System.out.print("Enter the second string: ");
                strings[x] = s.nextLine();
            };
        };

        return strings;

    };

    public static String createAnagramMessage(boolean anagramStatus, String str1, String str2) {
        return anagramStatus ? String.format("\"%s\" and \"%s\" are anagrams.", str1, str2) : String.format("\"%s\" and \"%s\" are not anagrams.", str1, str2);
    };



}
