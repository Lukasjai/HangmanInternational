package at.ac.fhcampuswien;

import java.util.ArrayList;

public class List {

    public static java.util.List<String> EasyMode = new ArrayList<>();
    public static java.util.List<String> MediumMode = new ArrayList<>();
    public static java.util.List<String> ChallengingMode = new ArrayList<>();

    public static String SelectEasyMode() {
        EasyMode.add("twenty");
        EasyMode.add("orange");
        EasyMode.add("market");
        EasyMode.add("coffee");
        EasyMode.add("nature");
        EasyMode.add("people");
        EasyMode.add("mirror");
        EasyMode.add("family");
        EasyMode.add("office");
        EasyMode.add("silver");
        EasyMode.add("parent");
        EasyMode.add("period");
        return null;
    }

    public static void SelectModeMedium() {
        MediumMode.add("strawberry");
        MediumMode.add("basketball");
        MediumMode.add("perfection");
        MediumMode.add("technology");
        MediumMode.add("watermelon");
        MediumMode.add("government");
        MediumMode.add("friendship");
        MediumMode.add("university");
        MediumMode.add("helicopter");
        MediumMode.add("generation");
        MediumMode.add("apocalypse");
        MediumMode.add("restaurant");
        MediumMode.add("depression");
    }
    public static void SelectChallengingMode(){
        ChallengingMode.add("irregardless");
        ChallengingMode.add("jukebox");
        ChallengingMode.add("xylophone");
        ChallengingMode.add("jiujitsu");
        ChallengingMode.add("buzzwords");
        ChallengingMode.add("characteristic");
        ChallengingMode.add("javafx");
        ChallengingMode.add("abstractedness");
        ChallengingMode.add("awkward");
        ChallengingMode.add("jazzband");
        ChallengingMode.add("worcestershire");
        ChallengingMode.add("wanderlust");

    }

    public static String EasyRandomWords() { //6 Buchstaben
        List.SelectEasyMode();
        Method.getRandom();
        String wort = List.EasyMode.get(Method.r).toUpperCase();
        return wort;
    }
    public static String ChallengingRandomWords(){
        List.SelectChallengingMode();
        Method.getRandom();
        String wort=List.ChallengingMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String MediumRandomWords() { //10 Buchstaben
        List.SelectModeMedium();
        Method.getRandom();
        String wort = List.MediumMode.get(Method.r).toUpperCase();
        return wort;
    }

}