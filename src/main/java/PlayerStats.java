public class PlayerStats {

    double fieldGoal;
    double assist;
    double rebound;
    double steal;
    double block;

    public PlayerStats(double fieldGoal, double assist, double rebound, double steal, double block){
        this.fieldGoal = fieldGoal;
        this.assist = assist;
        this.rebound = rebound;
        this.steal = steal;
        this.block = block;
    }



    @Override
    public String toString() {
        return "PlayerStats: " +
                " \nfieldGoal: " + fieldGoal +
                " \nassist: " + assist +
                " \nrebound: " + rebound +
                " \nsteal: " + steal +
                " \nblock: " + block ;
    }

}
