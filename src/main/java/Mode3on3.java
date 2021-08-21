public class Mode3on3 {
    int teamOneScore;
    int teamTwoScore;
    int ONE_POINT = 1;
    int TWO_POINTS = 2;
    int THREE_POINTS = 3;
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
    public void freeThrow(){
    }

    public void dunk(){
    }


    public void crossOver(){

    }
    public void foul(){

    }
    public void timeOut(){ // MAYBE....

    }
    public void pass(){

    }
    public void steal(){

    }
    public void block(){

    }
}
