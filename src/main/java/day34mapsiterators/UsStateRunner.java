package day34mapsiterators;

public class UsStateRunner {

    public static void main(String[] args) {

        String arizoneAbbr = UsStates.ARIZONA.getAbbreviation();
        System.out.println("arizoneAbbr = " + arizoneAbbr);

        UsStates arizona = UsStates.ARIZONA;
        System.out.println("arizona = " + arizona);

    }
}
