package at.ac.fhcampuswien;

import java.util.ArrayList;

public class List {

    public static java.util.List<String> EasyMode = new ArrayList<>();
    public static java.util.List<String> ChallengingMode = new ArrayList<>();

    public static String SelectEasyMode() {
        EasyMode.add("twenty");
        EasyMode.add("orange");
        EasyMode.add("market");
        EasyMode.add("coffee");
        EasyMode.add("nature");
        EasyMode.add("people");
        EasyMode.add("mirrore");
        EasyMode.add("familye");
        EasyMode.add("office");
        EasyMode.add("silver");
        EasyMode.add("parent");
        EasyMode.add("period");
        return null;
    }

    public static void SelectModeChallenging() {
        ChallengingMode.add("strawberry");
        ChallengingMode.add("basketball");
        ChallengingMode.add("perfection");
        ChallengingMode.add("technology");
        ChallengingMode.add("watermelon");
        ChallengingMode.add("government");
        ChallengingMode.add("friendship");
        ChallengingMode.add("university");
        ChallengingMode.add("helicopter");
        ChallengingMode.add("generation");
        ChallengingMode.add("apocalypse");
        ChallengingMode.add("restaurant");
        ChallengingMode.add("depression");
    }

    public static String EasyRandomWords() { //6 Buchstaben
        List.SelectEasyMode();
        Method.getRandom();
        String wort = List.EasyMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String ChallengingRandomWords() { //10 Buchstaben
        List.SelectModeChallenging();
        Method.getRandom();
        String wort = List.ChallengingMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static void main(String[] args) {
        System.out.println(EasyRandomWords());
        System.out.println(ChallengingRandomWords());

    }
}