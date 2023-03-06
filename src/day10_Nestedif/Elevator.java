package day10_Nestedif;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 6;
        String companies="";
        if (floorNumber == 1 || floorNumber==2 || floorNumber == 3){
            if (floorNumber==1){
                companies=" Lobby, Verizon, Starbucks";
            }else if (floorNumber==2)
            {companies="Cybertek, NASA, Intelsat";}
            else companies="Lyft, Bofa, Stake House";
            System.out.println("Floor "+ floorNumber+" selected. Companies: "+companies);
        }else System.err.println("Error"+floorNumber);







    }
}
