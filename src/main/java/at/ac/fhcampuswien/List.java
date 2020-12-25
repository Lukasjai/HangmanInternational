package at.ac.fhcampuswien;

import java.util.ArrayList;

public class List {

   public static java.util.List<String> EasyMode= new ArrayList<String>();
   public static java.util.List<String> ChallengingMode= new ArrayList<String>();

    public static void SelectEasyMode() {
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
    }
    public static void SelectModeChallenging(){
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
    public static void blalalla(){
        Method.getRandom();
        List.EasyMode.get(Method.r);
    }
    public static void main(String[] args){
        List.SelectEasyMode();
        System.out.println(List.EasyMode.get(Method.getRandom()));
    }
}
