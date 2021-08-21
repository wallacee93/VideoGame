public class Player extends Characters {

    String position;
//    PlayerStats stats;

    public Player(String name, int jerseyNumber, int overAllRanking, String position) {
        super(name, jerseyNumber, overAllRanking);
        this.position = position;
//        this.stats = stats;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

//    public PlayerStats getStats() {
//        return stats;
//    }
//
//    public void setStats(PlayerStats stats) {
//        this.stats = stats;
//    }

    @Override
    public String toString() {
        return "Player: " +
                " \nposition: " + position;
    }
}
