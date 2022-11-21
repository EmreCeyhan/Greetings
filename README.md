# Greetings and Film Classifications 
Greetings and Film classifications code using JUnit Jupiter testing
## Made use of
Menu's
'''java
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
'''


JUnit testing 
@Test
@ParameterizedTes
