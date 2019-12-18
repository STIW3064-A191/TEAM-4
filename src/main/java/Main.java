import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        do {
            String str = "", str2 = "";
            System.out.println("##### MENU #####"+ "\n1) Check Palindrome"+ "\n2) Extract Vowel and Consonant"+ "\n3) Extract Alphabet"+ "\n4) Exit "); // Menu selection
            Scanner sc = new Scanner(System.in);
            System.out.print("Selection: ");
            str2 = sc.nextLine(); // User input for selecting menu
            switch (str2) {
                case "1": //Check palindrome
                    Scanner sc1 = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    str = sc1.nextLine();
                    Palindrome p  = new Palindrome(str);
                    break;
                case "2": // Extract Vowel and consonant
                    Scanner sc2 = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    str = sc2.nextLine();
                    VowelConsonant v = new VowelConsonant(str);
                    break;
                case "3": // Extract alphabet
                    Scanner sc3 = new Scanner(System.in);
                    System.out.print("Enter a string: ");
                    str = sc3.nextLine();
                    Alphabet a = new Alphabet(str);
                    break;
                case "4": // Exit program
                    System.out.println("Exiting..");
                    System.exit(0);
                    break;
                default: // Invalid user input
                    System.out.println("\nInvalid selection...\n");
                    break;
            }
        } while (true);
    }
}