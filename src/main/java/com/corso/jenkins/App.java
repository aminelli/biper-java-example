package com.corso.jenkins;

public class App {
    
    public String play(int number) {

        if (number == 0) {
            throw new IllegalArgumentException("Indicare un nr diverso da 0");
        }
        
        if (number % 3 == 0) {
            return "Nr divisibile per 3";
        }

        if (number % 5 == 0) {
            return "Nr divisibile per 5";
        }
            
        return String.valueOf(number);
    }


}