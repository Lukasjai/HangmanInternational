package at.ac.fhcampuswien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class List {

    public static java.util.List<String> EasyMode = new ArrayList<>();
    public static java.util.List<String> MediumMode = new ArrayList<>();
    public static java.util.List<String> ChallengingMode = new ArrayList<>();

    public static void SelectEasyMode() throws FileNotFoundException {
        File file2=new File("src/main/resources/EasyList.txt");
        Scanner s=new Scanner(file2);
        while (s.hasNextLine()){
            EasyMode.add(s.nextLine());
        }
    }

    public static void SelectModeMedium() throws FileNotFoundException {
        File file3=new File("src/main/resources/MediumList.txt");
        Scanner s=new Scanner(file3);
        while (s.hasNextLine()){
            MediumMode.add(s.nextLine());
        }
    }

    public static void SelectChallengingMode() throws FileNotFoundException {
        File file1=new File("src/main/resources/Challenging List txt file.txt");
        Scanner s=new Scanner(file1);
        while (s.hasNextLine()){
            ChallengingMode.add(s.nextLine());
        }
    }



    public static String EasyRandomWords() throws FileNotFoundException { //6 Buchstaben
        List.SelectEasyMode();
        Method.getRandom();
        String wort = List.EasyMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String ChallengingRandomWords() throws FileNotFoundException {
        List.SelectChallengingMode();
        Method.getRandom();
        String wort = List.ChallengingMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String MediumRandomWords() throws FileNotFoundException { //10 Buchstaben
        List.SelectModeMedium();
        Method.getRandom();
        String wort = List.MediumMode.get(Method.r).toUpperCase();
        return wort;
    }

}