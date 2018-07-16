import java.util.Scanner;

public class MowingTime
{
    public static void main (String[] args){

        Scanner keyboard = new Scanner(System.in);

        double length, width;
        double lawnArea, totalTime;


        System.out.println("Please enter length of your lawn: ");
        length = keyboard.nextDouble();

        System.out.println("Please enter width of your lawn: ");
        width = keyboard.nextDouble();

        lawnArea = length*width;
        totalTime = AmountofTime(lawnArea);

        System.out.println("The length of your lawn is " + length +" yards and the width of your lawn is " + width + "\n" +
                            "The calculated square yardage for your lawn is " + lawnArea + "." + "\n"
                             + "The total amount of time that will be needed to finish your lawn is " + totalTime + "minutes");


    }

    public static double AmountofTime(double lawnArea){
        double time;
        time = (lawnArea*2)/40;
        return time;
    }
}
