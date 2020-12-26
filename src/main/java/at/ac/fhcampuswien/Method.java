package at.ac.fhcampuswien;

public class Method {
    static int r;

    public static int getRandom() {
        r = (int) (Math.random() * 50);
        return r;
    }


}


