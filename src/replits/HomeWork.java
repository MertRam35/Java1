package replits;

public class HomeWork {

    public static void main(String[] args) {

        double myScore1 = 6;
        double myScore2 = 9;
        double myScore3 = 6;
        double myAverageScore = (myScore1 + myScore2 + myScore3) / 3;

        double finalScore1 = 8;
        double finalScore2 = 9;


    if (myAverageScore > finalScore1 && myAverageScore>finalScore2){
        System.out.println("Congratulations you earned First place with a score of: "+myAverageScore);
    } else if (myAverageScore < finalScore1 && myAverageScore < finalScore2) {
        System.out.println("Congratulations you earned Third place with a score of: "+myAverageScore);
    }else {
        System.out.println("Congratulations you earned Second place with a score of: "+myAverageScore);
    }
    }


}
