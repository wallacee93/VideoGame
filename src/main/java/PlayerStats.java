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

    public double getFieldGoal() {
        return fieldGoal;
    }

    public void setFieldGoal(double fieldGoal) {
        this.fieldGoal = fieldGoal;
    }

    public double getAssist() {
        return assist;
    }

    public void setAssist(double assist) {
        this.assist = assist;
    }

    public double getRebound() {
        return rebound;
    }

    public void setRebound(double rebound) {
        this.rebound = rebound;
    }

    public double getSteal() {
        return steal;
    }

    public void setSteal(double steal) {
        this.steal = steal;
    }

    public double getBlock() {
        return block;
    }

    public void setBlock(double block) {
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
