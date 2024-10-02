import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        String party;

        System.out.println("Enter your political party affiliation with D, R, I, or another not named.");
        party = scan.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You are a democratic Donkey.");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("You are a republican Elephant.");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You are an Independent person.");
        } else {
            System.out.println("You are a different party not listed.");
        }
    }
}