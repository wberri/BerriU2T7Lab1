import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word = scan.nextLine();
        int lenWord = word.length();
        int middleIndex = lenWord/2;
        String firstHalfWord = word.substring(0,middleIndex);
        String secondHalfWord = word.substring(middleIndex);
        System.out.println("String length: " + lenWord);
        System.out.println("First half: " + firstHalfWord);
        System.out.println("Second half: " + secondHalfWord);

        System.out.print("Enter second string: ");
        String word2 = scan.nextLine();
        int lenWord2 = word2.length();
        if (lenWord>lenWord2) {
            System.out.println(word + " is longer");
        } else if(lenWord2>lenWord){
            System.out.println(word2 + " is longer");
        } else{
            System.out.println("Both strings have the same length");
        }

        if (word.compareTo(word2)>0){
            System.out.println(word2 + " is first alphabetically");
        } else if (word.compareTo(word2)<0){
            System.out.println(word + " is first alphabetically");
        } else if (word.equals(word2)){
            System.out.println("Both strings have the exact same characters");
        } else{
            System.out.println("error");
        }

        if (word.indexOf(word2)!=-1) {
            System.out.println(word2 + " is found in " + word + " at index " + word.indexOf(word2));
        } else{
            System.out.println(word2 + " is NOT found in " + word);
        }
    }
}