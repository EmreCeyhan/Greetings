package com.sparta;

import java.util.Scanner;

public class FilmClassifications {
    public static String message;
    public FilmClassifications(int age)
    {
        availableClassifications(age);

    }

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

}
