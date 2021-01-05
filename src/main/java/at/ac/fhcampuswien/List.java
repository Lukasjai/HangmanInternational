package at.ac.fhcampuswien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class List {

    //create Lists for each Game Mode
    public static java.util.List<String> EasyMode = new ArrayList<>();
    public static java.util.List<String> MediumMode = new ArrayList<>();
    public static java.util.List<String> ChallengingMode = new ArrayList<>();
    //create variable
    static int randomNumber;

    // Method to get a random nuber used for the random selected word for easy medium and challenging
    public static int getRandom() {
        randomNumber = (int) (Math.random() * 50);
        return randomNumber;
    }


    // Method which selects easy words from EasyList.txt
    public static void selectEasyMode() throws FileNotFoundException {
        File file2 = new File("src/main/resources/EasyList.txt");
        Scanner s = new Scanner(file2);
        while (s.hasNextLine()) {
            EasyMode.add(s.nextLine());
        }
    }

    // Method which selects medium words from MediumList.txt
    public static void selectModeMedium() throws FileNotFoundException {
        File file3 = new File("src/main/resources/MediumList.txt");
        Scanner s = new Scanner(file3);
        while (s.hasNextLine()) {
            MediumMode.add(s.nextLine());
        }
    }

    // Method which selects challenging words from ChallengingList.txt
    public static void selectChallengingMode() throws FileNotFoundException {
        File file1 = new File("src/main/resources/Challenging List txt file.txt");
        Scanner s = new Scanner(file1);
        while (s.hasNextLine()) {
            ChallengingMode.add(s.nextLine());
        }
    }


    // Random method for easy mode
    public static String easyRandomWords() throws FileNotFoundException { //6 Buchstaben
        List.selectEasyMode();
        getRandom();
        String wort = List.EasyMode.get(randomNumber).toUpperCase();
        return wort;
    }

    // Random method for medium mode
    public static String mediumRandomWords() throws FileNotFoundException { //10 Buchstaben
        List.selectModeMedium();
        getRandom();
        String wort = List.MediumMode.get(randomNumber).toUpperCase();
        return wort;
    }

    // Random method for challenging mode
    public static String challengingRandomWords() throws FileNotFoundException {
        List.selectChallengingMode();
        getRandom();
        String wort = List.ChallengingMode.get(randomNumber).toUpperCase();
        return wort;
    }

}