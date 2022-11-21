package com.sparta;


import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        boolean menu = false;
        int menuOption = 0;
        boolean timeMenu = false;
        //FilmClassifications result = new FilmClassifications();

        while (menu == false) {
            System.out.println("Select 1 for greeting and 2 for film classification");
            Scanner menuInput = new Scanner(System.in);
            menuOption = menuInput.nextInt();

            if (menuOption == 1) {
                while (timeMenu == false) {
                    System.out.println("Enter the time");
                    Scanner userInput = new Scanner(System.in);
                    int timeOfDay = userInput.nextInt();
                    if (timeOfDay < 0 || timeOfDay > 24) {
                        System.out.println("Please enter a real time ");
                        timeMenu = false;
                    } else {
                        System.out.println(greeting(timeOfDay));
                        timeMenu = true;
                        menu = true;
                    }
                }
            }
            else if(menuOption == 2)
            {
                System.out.println("Enter the age");
                Scanner ageInput = new Scanner(System.in);
                int age = ageInput.nextInt();

                FilmClassifications film = new FilmClassifications(age);
                System.out.println(film.message);

                //System.out.println(film.);
                menu = true;
            }
            else {
                menu = false;
                System.out.println("Enter valid menu option!");
            }

        }

    }

    public static String greeting(int timeOfDay)
    {
        String greeting;
        if(timeOfDay  >= 5 && timeOfDay <=12){
            greeting = "good morning";
        }
        else if (timeOfDay > 12 && timeOfDay <= 18) {
            greeting = "good afternoon";
        }
        else if (timeOfDay < 0 || timeOfDay > 23)
        {
            greeting = "not a valid timeframe";
        }
        else {
            greeting = "good evening";
        }
        return greeting;
    }


}