public class Mode3on3 {
    int teamOneScore;
    int teamTwoScore;
    int onePoint;
    int twoPoints;
    int threePoints;
    boolean teamOneMake;
    boolean teamTwoMake;


    public void startGame(){

    }
    public void shootJumper(Player player){
        System.out.println(player + " shoots the jumper for two");
        if(teamOneMake){
            teamOneScore+=2;
        }
        else{
            System.out.println(player + " missed the jumper");
        }
        if(teamTwoMake){
            teamTwoScore+=2;
        }
        else{
            System.out.println(player + " missed the jumper ");
        }
    }

    public void shootTheThree(Player player){
        System.out.println(player + " For three!!");

    }
}
