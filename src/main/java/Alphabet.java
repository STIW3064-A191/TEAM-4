public class Alphabet {

    public Alphabet(String str) {
        String input = str; // Get user input
        String FinalResult = "";
        //String Input = "12345yuj!@#$%FGJ[poiu";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) { // Checking for alphabet
                FinalResult = FinalResult + input.charAt(i);
            }
        }
        System.out.println("\nAlphabet Output: " + FinalResult + "\n");
    }
}
