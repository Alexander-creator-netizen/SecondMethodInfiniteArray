import java.util.Scanner;

/**
 * Infinite array filling
 * @data 03.04.2022
 * @author Alex Krentik
 */

public class SecondMethodInfiniteArray {
    public static void main(String[] args) {
        String[] arrayOfWords = new String[4];
        Scanner inputWords = new Scanner(System.in);
        boolean words = false;
        int i = 0;
        while (!words) {
            System.out.println("Enter the word: ");
            String enterWord = inputWords.nextLine();
            String firstLetter = String.valueOf(enterWord.charAt(0));
                switch (firstLetter) {
                    case ("A"):
                    case ("U"):
                    case ("V"):
                        arrayOfWords[i] = enterWord;
                        i++;
                        if (i == arrayOfWords.length)
                            i = 0;
                        break;
                    default:
                        if (enterWord.equalsIgnoreCase("exit"))
                            break;
                        System.out.println("Incorrect word entered.");
                        break;
                }
            words = enterWord.equalsIgnoreCase("exit");
            }
        System.out.println("End of the programm.");
        System.out.println("Array contents: ");
        for (i = 0; i < arrayOfWords.length; i++) {
            System.out.println(arrayOfWords[i]);
        }
    }
}
