package day26_CustomMethodsPractice;

public class RemoveElements {


// removes the index from the array, returns new array.
    public static int[] removeElements(int[] array, int index){

      if (index < 0 || index >array.length-1){
          System.err.println("Invalid Index:" +index);
          System.exit(0);
      }


        int[] result = new int[array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i ==index){
                continue;
            }
            result[j++]=array[i];
        }
        return result;
    }


    public static double[] removeElements(double[] array, int index){

        if (index < 0 || index >array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }


       double[] result = new double[array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    public static char[] removeElements(char[] array, int index){

        if (index < 0 || index >array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }


        char[] result = new char[array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }


    public static String[] removeElements(String[] array, int index){

        if (index < 0 || index >array.length-1){
            System.err.println("Invalid Index:" +index);
            System.exit(0);
        }


        String[] result = new String[array.length-1];

        int j = 0;
        for (int i=0; i< array.length; i++) {
            if (i == index){
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }
}
