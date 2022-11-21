package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("My first test")
    public void firstTest()
    {
        Assertions.assertTrue(5 == 5);
    }

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
    @Test
    @DisplayName("Given a time of 6, greeting returns good morning")
    public void givenATime6_Greeting_ReturnsGoodMorning()
    {
        //arrange
        int time = 6;
        String expectedGreeting = "good morning";
        // Act
        String result = Main.greeting(time);
        //Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("good evening", Main.greeting(21));
    }
    @Test
    @DisplayName("Given a time of 14, greeting returns good afternoon")
    public void givenATime14_Greeting_ReturnsGoodAfternoon()
    {
        //arrange
        int time = 14;
        String expectedGreeting = "good afternoon";
        // Act
        String result = Main.greeting(time);
        //Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("good evening", Main.greeting(21));
    }

    @Test
    @DisplayName("Given a time is out of boundaries")
    public void givenATimeOutOfBoundaries()
    {
        //arrange
        int time = 27;
        String expectedGreeting = "not a valid timeframe";
        // Act
        String result = Main.greeting(time);
        //Assert
        assertEquals(expectedGreeting, result);

        //assertEquals("good evening", Main.greeting(21));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 8, 12})
    @DisplayName("Given a time between 5 and 12, greeting returns good morning")
    public void GivenATimeBetween5and12_Greeting_ReturnsGoodMorning(int time)
    {
        String expectedGreeting = "good morning";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {14, 16, 18})
    @DisplayName("Given a time between 12 and 18, greeting returns good afternoon")
    public void GivenATimeBetween12and18_Greeting_ReturnsGoodAfternoon(int time)
    {
        String expectedGreeting = "good afternoon";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {20, 23, 4})
    @DisplayName("Given a time between outside of morning and afternoon, greeting returns good evening")
    public void GivenATimeBetweenOutsideMorningAndAfternoon_Greeting_ReturnsGoodEvening(int time)
    {
        String expectedGreeting = "good evening";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {-5, 27, 40})
    @DisplayName("Given a time out of boundaries")
    public void GivenATimeOutOfBounds(int time)
    {
        String expectedGreeting = "not a valid timeframe";
        String result = Main.greeting(time);
        assertEquals(expectedGreeting, result);
    }
}
