import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args){
        method1();
        method2();
        method3();
        method4();
    }
    public static void method1(){
        System.out.println("Welcome to vacation planner!");
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", ");
        System.out.print("Where are you travelling to? ");
        String place = input.nextLine();
        System.out.println("Great! " + place + " sounds great.");
        System.out.println("************");
    }
    public static void method2(){
        System.out.print("How many days are you going to spend? ");
        Scanner input = new Scanner(System.in);
        int days = input.nextInt();
        System.out.print("How much money in USD are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + "are there in 1 USD? ");
        double conversionRate = input.nextDouble();

        System.out.println("If you are travelling for " + days + "days that is the same as " + days * 24 + "hours or " + days * 24 * 60 + " minutes.");
        System.out.println("If you are going to spend $" + money + "USD that means per day you can spend up to $" + ((int)((money/days) * 100)/100.0) );
        System.out.println("Your total budget in " + currency + "is " + money * conversionRate + currency + ",which per day is " + (((int)((money * conversionRate/days) * 100)/100.0)) + currency);
        System.out.println("************");
    }
    public static void method3(){
        System.out.print("What is the difference in hours between you and your destination? ");
        Scanner input = new Scanner(System.in);
        int hoursDifference = input.nextInt();
        System.out.println("That means that when it is midnight at home itwill be " + (0 + hoursDifference) + ":00 in your travel destination \nand when it is noon at home it will be " + ((12 + hoursDifference) % 24) +":00");
        System.out.println("************");
    }
    public static void method4(){
        System.out.print("What is the square area of your destination country in km2? ");
        Scanner input = new Scanner(System.in);
        int squareArea = input.nextInt();
        System.out.println("In miles2 that is " + (squareArea * 0.39));
        System.out.println("************");
    }
}
