package com.sparta;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class Classification_Tests {
    @Test
    @DisplayName("My first test")
    public void firstTest()
    {
        Assertions.assertTrue(5 == 5);
    }

    @Test
    @DisplayName("Given age is less than 12")
    public void givenAgeIsLessThan12()
    {
        //arrange
        int age = 11;
        String expectedGreeting = "U, PG films are available.(12 rated movies will require an adult)";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given age is between 12 and 14")
    public void givenAgeIsBetween12And14()
    {
        //arrange
        int age = 12;
        String expectedGreeting = "U, PG & 12 films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given age is between 15 and 17")
    public void givenAgeIsBetween15And17()
    {
        //arrange
        int age = 16;
        String expectedGreeting = "U, PG, 12 & 15 films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @Test
    @DisplayName("Given age is 18 or more")
    public void givenAgeIs18OrMore()
    {
        //arrange
        int age = 19;
        String expectedGreeting = "All films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 8, 10})
    @DisplayName("Given a age is less than 12")
    public void GivenAgeIsLessThan12(int age)
    {
        String expectedGreeting = "U, PG films are available.(12 rated movies will require an adult)";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Given a age is less than 12")
    public void GivenAgeIsBetween12And14(int age)
    {
        String expectedGreeting = "U, PG & 12 films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Given a age is less than 12")
    public void GivenAgeIsBetween15And17(int age)
    {
        String expectedGreeting = "U, PG, 12 & 15 films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 24, 65})
    @DisplayName("Given a age is less than 12")
    public void GivenAgeIs18OrMore(int age)
    {
        String expectedGreeting = "All films are available.";
        // Act
        String result = FilmClassifications.availableClassifications(age);
        //Assert
        assertEquals(expectedGreeting, result);
    }
}