package fr.ippon.kata.romannumeral;

import java.util.TreeMap;
import java.util.NavigableMap;
public class Main {

    private static final NavigableMap<Integer, String> CONVERSIONS = buildConversions();

    public String compute(int arabicNumber) {
        if(arabicNumber <= 0){
            return "";
        }

        Integer highestKnownConversion = CONVERSIONS.floorKey(arabicNumber);
        String highestKnownRepresentation = CONVERSIONS.get(highestKnownConversion);
        return highestKnownRepresentation + compute(arabicNumber - highestKnownConversion);
    }

    private static NavigableMap<Integer, String> buildConversions() {
        NavigableMap<Integer, String> conversions = new TreeMap<>();

        conversions.put(1, "I");
        conversions.put(4, "IV");
        conversions.put(5, "V");
        conversions.put(9, "IX");
        conversions.put(10, "X");

        return conversions;
    }


}
