package hu.nive.ujratervezes.zarovizsga.digitscounter;

import java.util.ArrayList;
import java.util.List;


public class DigitsCounter {

    public int getCountOfDigits(String s) {

        if (s == null){
            throw new IllegalArgumentException("Incorrect numbers" + s);
        }
        String numbers = s.replaceAll("[^0-9]", "");
        List<Character> numLi = new ArrayList<>();
        int counter = 0 ;
        for (char c : numbers.toCharArray()){
            if (!numLi.contains(c)){
                numLi.add(c);
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {

        DigitsCounter digitCounter = new DigitsCounter();

        System.out.println(digitCounter.getCountOfDigits("a1asd53435"));
    }

}
