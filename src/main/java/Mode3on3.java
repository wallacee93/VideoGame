import java.util.Random;

public class Mode3on3 {
    int teamOneScore;
    int teamTwoScore;
    int TWO_POINTS = 2;
    int THREE_POINTS = 3;
    boolean teamOneMake;
    boolean teamTwoMake;
    boolean hasPossession;
    boolean stoleBall;



    public void startGame() {
        System.out.println("First team to 21 wins");


    }

    public void shootJumper(Player player) {
        System.out.println(player + " shoots the jumper for two");
        Random jumper = new Random();
        teamOneMake = jumper.nextBoolean();

        if (teamOneMake) {
            teamOneScore += TWO_POINTS;
        } else {
            System.out.println(player + " missed the jumper");
        }
        teamTwoMake = jumper.nextBoolean();
        if (teamTwoMake) {
            teamTwoScore += TWO_POINTS;
        } else {
            System.out.println(player + " missed the jumper ");
        }
    }

    public void shootTheThree(Player player) {
        System.out.println(player + " For three!!");
        Random three = new Random();
        teamOneMake = three.nextBoolean();

        if (teamOneMake) {
            teamOneScore += THREE_POINTS;
            System.out.println(player + "Splash!!");
        } else {
            System.out.println(player + " missed the 3 pointer");
        }
        teamTwoMake = three.nextBoolean();
        if(teamTwoMake){
            teamTwoScore+=THREE_POINTS;
            System.out.println("ITS GOOD!!");
        }
        else {
            System.out.println(player + " missed the 3 pointer");
        }

        public void dunk(Player player){
            System.out.println(player + " For the slam!!");
            Random slam = new Random();
            teamOneMake= slam.nextBoolean();
            if(teamOneMake){
                teamOneScore+=TWO_POINTS;
                System.out.println("PUT EM ON A POSTER!!!");
            }
            else{
                System.out.println("Rim choked!");
            }
            teamTwoMake = slam.nextBoolean();
            if(teamTwoMake){
                teamTwoScore+= TWO_POINTS;
                System.out.println("PUT EM ON A POSTER!!!");
            }
            else{
                System.out.println("Rim choked!");
            }
        }


        public void crossOver(Player player) {

        }



        public void pass() {


        }

        public void steal() {
            Random st = new Random();
            stoleBall = st.nextBoolean();
            if(stoleBall){
                hasPossession= false;
                System.out.println("Turnover!");
            }


            public boolean getHasPossession(){
                return hasPossession;
            }
        }

        public void block () {

        }
    }
}

