# Greetings and Film Classifications 
Greetings and Film classifications code using JUnit Jupiter testing
## Made use of
### Menu's
```java
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
```
### JUnit testing 
```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
```
### @Test
```java
 @Test
    @DisplayName("Given a time of 21, greeting returns good evening")
    public void givenATime21_Greeting_ReturnsGoodEvening()
    {
        //arrange
        int time = 21;
        String expectedGreeting = "good evening";
        // Act
        String result = Main.greeting(time);
        //Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("good evening", Main.greeting(21));
    }

```
### @ParameterizedTest
```java
    @ParameterizedTest
    @ValueSource(ints = {-5, 27, 40})
    @DisplayName("Given a time out of boundaries")
    public void GivenATimeOutOfBounds(int time)
    {
        String expectedGreeting = "not a valid timeframe";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }
```
## Edited availableClassifications to match https://www.bbfc.co.uk/ criteria
```java
    public static String availableClassifications(int ageOfViewer)
    {
        String result;
        if (ageOfViewer < 12)
        {
            result = "U, PG films are available.(12 rated movies will require an adult)";
            message = "U, PG films are available.(12 rated movies will require an adult)";
        }
        else if (ageOfViewer >= 12 && ageOfViewer <= 14)
        {
            result = "U, PG & 12 films are available.";
            message = "U, PG & 12 films are available.";
        }
        else if (ageOfViewer >= 15 && ageOfViewer < 18)
        {
            result = "U, PG, 12 & 15 films are available.";
            message = "U, PG, 12 & 15 films are available.";
        }
        else
        {
            result = "All films are available.";
            message = "All films are available.";
        }
        return result;
    }
```

