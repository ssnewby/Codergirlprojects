package com.company;
import java.util.Scanner;
public class Temperatures {

    public static void main(String[] args) {
        //initialize variables
        Scanner keyboard = new Scanner(System.in);
        int size;

        System.out.println("What is the average temperature for each day?");
        int temperatures[][] = new int[4][7];
                temperatures[0]=new int[]{68,70,76,70,68,71,75};
                temperatures[1]=new int[]{76,76,87,84,82,75,83};
                temperatures [2]=new int[]{73,72,81,78,76,73,77};
                temperatures [3]=new int[]{64,65,69,68,70,74,72};

                int sumDay []=new int[7];
                int sumTime []=new int[4];

                for(int index=0; index < 4; index++) {
                    for (int j = 0; j < 7; j++) {
                        sumDay[j] = sumDay[j] + temperatures[index][j];
                        sumTime[index] = sumTime[index] + temperatures[index][j];
                    }
                }
                /*
                System.out.println("The average temperature for Sunday is " + sumDay[0]/4);
                System.out.println("The average temperature for Monday is " + sumDay[1]/4);
                System.out.println("The average temperature for Tuesday is " + sumDay[2]/4);
                System.out.println("The average temperature for Wednesday is " + sumDay[3]/4);
                System.out.println("The average temperature for Thursday is " + sumDay[4]/4);
                System.out.println("The average temperature for Friday is " + sumDay[5]/4);
                System.out.println("The average temperature for Saturday is " + sumDay[6]/4);
                */

                String days[] = new String[]{"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
                for (int j = 0; j < 7; j++) {
                    System.out.println (days[j] + ": " + sumDay[j]/4);
                }

                System.out.println("What is the average temperature for each time?");
                /*
                System.out.println("The average for 7:00AM is " + sumTime[0]/7);
                System.out.println("The average for 3:00PM is " + sumTime[1]/7);
                System.out.println("The average for 7:00PM is " + sumTime[2]/7);
                System.out.println("The average for 3:00AM is " + sumTime[3]/7);
                */

                String time[] = new String[]{"7 AM","3 PM","7 PM","3 AM"};
                for (int j = 0; j < 4; j++) {
                    System.out.println (time[j] + ": " + sumTime[j]/7);
                }


                System.out.println("What is the final average temperature overall? ");

                int Sunday = sumDay[0];
                int Monday = sumDay[1];
                int Tuesday = sumDay[2];
                int Wednesday = sumDay[3];
                int Thursday = sumDay[4];
                int Friday = sumDay[5];
                int Saturday = sumDay[6];


                int sumOverall = Sunday + Monday + Tuesday + Wednesday + Thursday + Friday + Saturday;
                System.out.println("Overall: " + sumOverall/28);









    }
}
