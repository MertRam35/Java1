package day26_CustomMethodsPractice;

public class FrequencyOfElement {


    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if (each == element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if (each== element){
                count++;
            }
        }
        return count;
    }

    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if (each== element){
                count++;
            }
        }
        return count;
    }





}
