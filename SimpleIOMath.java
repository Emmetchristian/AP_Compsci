import java.util.Scanner;

/**
 * Class SimpleIOMath is simple questions that a user enters that is read back to them including some calculations the computer does.
 * @version 09/15/2021
 * @author 24christian
 *  https://www.youtube.com/watch?v=1BllMsCsBkQ (how to increment variables)
 */

public class SimpleIOMath {


    private String name;
    private int age;
    private int favNumber;

    private int smallestPrime(int num) {
        for (int i = 2; i <= (int) (Math.sqrt(num)) + 1; i++) {
            if (num % i == 0)
                return i;
        }
        return num;
    }

    public void prompUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Question 1: What is your name?");
        name = in.nextLine();
        System.out.println("Question 2: How old are you?");
        age = Integer.parseInt(in.nextLine());
        System.out.println("Question 3: What is your favorite number?");
        favNumber= Integer.parseInt(in.nextLine());

        System.out.println("I'm gonna teach you how to sing it out");
        System.out.println("Come on, come on, come on");
        System.out.println("Let me tell you what it's all about");
        System.out.println("Reading, writing, arithmetic");
        System.out.println("Are the branches of the learning tree");
    }


    public void printInfo()     {
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);  {
            age = age +1;
            System.out.println("At your next birthday, you will turn " + age + ".");
        }
        System.out.println("The first prime factor of " + age + " is: " + smallestPrime(age));
        System.out.println("Your favorite number is: " + favNumber);
        System.out.println("Your favorite number squared is: "+ favNumber * favNumber);

    }


    public static void main(String[] args) {
        System.out.println("* Sit yourself down, take a seat *");
        System.out.println("* All you gotta do is repeat after me *");
        SimpleIOMath obj = new SimpleIOMath();
        obj.prompUser();
        obj.printInfo();
        //obj.myExtra();
        System.out.println("* end of program *");
    }


}
