package day11_SwitchStatements;

public class CydeoBatches {
    public static void main(String[] args) {

        String type = "US Morning";
        if (type == "US Morning") {
            System.out.println(" Class times are 10-5 EST. M, T, Th, F.");
        } else if (type == "US Evening") {
            System.out.println(" Class times are 7-10 EST. M, T, W, Th, S, S.");

        } else if (type == "EU") {
            System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");


        } else System.out.println("Invalid Batch");

    }
}
