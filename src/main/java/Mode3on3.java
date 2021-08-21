import java.util.Random;

public class Mode3on3 {
    int teamOneScore;
    int teamTwoScore;
    int ONE_POINT = 1;
    int TWO_POINTS = 2;
    int THREE_POINTS = 3;
    boolean teamOneMake;
    boolean teamTwoMake;


    public void startGame() {
        System.out.println("First team to 21 wins");

    }

    public void shootJumper(Player player) {
        System.out.println(player + " shoots the jumper for two");
        Random jumper = new Random();
        teamOneMake = jumper.nextBoolean();

        if (teamOneMake) {
            teamOneScore += 2;
        } else {
            System.out.println(player + " missed the jumper");
        }
        teamTwoMake = jumper.nextBoolean();
        if (teamTwoMake) {
            teamTwoScore += 2;
        } else {
            System.out.println(player + " missed the jumper ");
        }
    }

    public void shootTheThree(Player player) {
        System.out.println(player + " For three!!");
        Random three = new Random();
        teamOneMake = three.nextBoolean();

        if (teamOneMake) {
            teamOneScore += 3;
            System.out.println(player + "Splash!!");
        } else {
            System.out.println(player + "missed the 3 pointer");
        }
        teamTwoMake = three.nextBoolean();
        if(teamTwoMake){
            teamTwoScore+=3;
            System.out.println("ITS GOOD!!");
        }
        else {
            System.out.println(player + "missed the 3 pointer");
        }

        public void freeThrow () {

        }

        public void dunk () {
        }


        public void crossOver () {

        }

        public void foul () {

        }

        public void timeOut () { // MAYBE....

        }

        public void pass () {

        }

        public void steal () {

        }

        public void block () {

        }
    }
}

