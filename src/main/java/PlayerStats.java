public class PlayerStats {

    double fieldGoalPercentage;
    double assistAverage;
    double reboundAverage;
    double stealAverage;
    double blockAverage;

    PlayerStats(double fieldGoalPercentage, double assistAverage, double reboundAverage,
                double stealAverage, double blockAverage){
        this.fieldGoalPercentage =fieldGoalPercentage;
        this.assistAverage = assistAverage;
        this.reboundAverage = reboundAverage;
        this.stealAverage = stealAverage;
        this.blockAverage = blockAverage;
    }

    @Override
    public String toString() {
        return "PlayerStats: " +
                "\nFieldGoal Percentage: " + fieldGoalPercentage +
                " Assist Average: " + assistAverage +
                " Rebound Average: " + reboundAverage +
                " StealAverage: " + stealAverage +
                " Block Average: " + blockAverage;
    }
}