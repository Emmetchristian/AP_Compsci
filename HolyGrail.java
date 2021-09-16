import java.util.Scanner;
/**
 * Class HolyGrail is a conversation between the computer and a user.
 * @version 09/15/2021
 * @author 24christian
 * https://www.w3schools.com/java/java_user_input.asp  (how to use import scanner)
 */
public class HolyGrail {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String answer1;
        String answer2;
        String answer3;
        System.out.println("* A chat with the bridge keeper *");
        System.out.println("Who would cross the Bridge of Death must answer me these questions three, ere the other side he see.");
        for (String word : args)
            System.out.println(word);
        System.out.println("Question 1: What is your name? ");
        answer1 = myObj.nextLine();
        System.out.println("Question 2: What is your quest? ");
        answer2 = myObj.nextLine();
        System.out.println("Question 3: What is your favorite color? ");
        answer3 = myObj.nextLine();
        System.out.println("King Arthur says, \"you have to know these things when you're a king, you know.\" ");
        System.out.println("Your name is: " + answer1);
        System.out.println("Your quest is: " + answer2);
        System.out.println("Your favorite color is: " + answer3);
        System.out.println("* end of program *");
    }
}