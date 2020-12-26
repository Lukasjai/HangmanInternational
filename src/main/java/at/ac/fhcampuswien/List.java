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
        EasyMode.add("public");
        EasyMode.add("region");
        EasyMode.add("coffee");
        EasyMode.add("future");
        EasyMode.add("global");
        EasyMode.add("nature");
        EasyMode.add("people");
        EasyMode.add("agency");
        EasyMode.add("mirror");
        EasyMode.add("family");
        EasyMode.add("island");
        EasyMode.add("office");
        EasyMode.add("gender");
        EasyMode.add("wright");
        EasyMode.add("amount");
        EasyMode.add("silver");
        EasyMode.add("reduce");
        EasyMode.add("parent");
        EasyMode.add("number");
        EasyMode.add("junior");
        EasyMode.add("minute");
        EasyMode.add("winter");
        EasyMode.add("period");
        EasyMode.add("length");
        EasyMode.add("record");
        EasyMode.add("detail");
        EasyMode.add("answer");
        EasyMode.add("forest");
        EasyMode.add("direct");
        EasyMode.add("volume");
        EasyMode.add("liquid");
        EasyMode.add("memory");
        EasyMode.add("driver");
        EasyMode.add("market");
        EasyMode.add("reward");
        EasyMode.add("friend");
        EasyMode.add("result");
        EasyMode.add("ground");
        EasyMode.add("second");
        EasyMode.add("yellow");
        EasyMode.add("vision");
        EasyMode.add("museum");
        EasyMode.add("action");
        EasyMode.add("health");
        EasyMode.add("option");
        EasyMode.add("income");
        EasyMode.add("sector");
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
        MediumMode.add("motivation");
        MediumMode.add("management");
        MediumMode.add("vegetables");
        MediumMode.add("expression");
        MediumMode.add("protection");
        MediumMode.add("gymnastics");
        MediumMode.add("instrument");
        MediumMode.add("chromosome");
        MediumMode.add("atmosphere");
        MediumMode.add("tournament");
        MediumMode.add("automobile");
        MediumMode.add("dictionary");
        MediumMode.add("graduation");
        MediumMode.add("evaluation");
        MediumMode.add("comparison");
        MediumMode.add("cigarettes");
        MediumMode.add("creativity");
        MediumMode.add("victorious");
        MediumMode.add("aggression");
        MediumMode.add("dedication");
        MediumMode.add("industrial");
        MediumMode.add("toothbrush");
        MediumMode.add("perception");
        MediumMode.add("laboratory");
        MediumMode.add("resistance");
        MediumMode.add("prediction");
        MediumMode.add("philosophy");
        MediumMode.add("department");
        MediumMode.add("convincing");
        MediumMode.add("engagement");
        MediumMode.add("respectful");
        MediumMode.add("flashlight");
        MediumMode.add("discussion");
        MediumMode.add("disrespect");
        MediumMode.add("challenger");
        MediumMode.add("conclusion");
        MediumMode.add("participle");
    }

    public static void SelectChallengingMode() {
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
        ChallengingMode.add("discrimination");
        ChallengingMode.add("transformation");
        ChallengingMode.add("multiplication");
        ChallengingMode.add("infrastructure");
        ChallengingMode.add("disappointment");
        ChallengingMode.add("administration");
        ChallengingMode.add("interpretation");
        ChallengingMode.add("understandable");
        ChallengingMode.add("accountability");
        ChallengingMode.add("communications");
        ChallengingMode.add("initialisation");
        ChallengingMode.add("acknowledgment");
        ChallengingMode.add("accomplishable");
        ChallengingMode.add("nanotechnology");
        ChallengingMode.add("disorientation");
        ChallengingMode.add("congratulation");
        ChallengingMode.add("implementation");
        ChallengingMode.add("macroeconomics");
        ChallengingMode.add("archaeological");
        ChallengingMode.add("sophistication");
        ChallengingMode.add("interplanetary");
        ChallengingMode.add("anthropologist");
        ChallengingMode.add("miscalculation");
        ChallengingMode.add("deconstruction");
        ChallengingMode.add("malfunctioning");
        ChallengingMode.add("misinformation");
        ChallengingMode.add("underestimated");
        ChallengingMode.add("independence");
        ChallengingMode.add("architecture");
        ChallengingMode.add("expectations");
        ChallengingMode.add("championship");
        ChallengingMode.add("grandparents");
        ChallengingMode.add("intersection");
        ChallengingMode.add("acquaintance");
        ChallengingMode.add("neighborhood");
        ChallengingMode.add("surroundings");
        ChallengingMode.add("colonisation");
        ChallengingMode.add("encyclopedia");

    }

    public static String EasyRandomWords() { //6 Buchstaben
        List.SelectEasyMode();
        Method.getRandom();
        String wort = List.EasyMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String ChallengingRandomWords() {
        List.SelectChallengingMode();
        Method.getRandom();
        String wort = List.ChallengingMode.get(Method.r).toUpperCase();
        return wort;
    }

    public static String MediumRandomWords() { //10 Buchstaben
        List.SelectModeMedium();
        Method.getRandom();
        String wort = List.MediumMode.get(Method.r).toUpperCase();
        return wort;
    }

}