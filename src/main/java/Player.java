public class Player{

    String name;
    int jerseyNumber;
    int overAllRanking;
    String position;
    PlayerStats stats;
    Team team;
    Mode3on3 mode3on3;
    public Player(String name, int jerseyNumber, int overAllRanking, String position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.overAllRanking = overAllRanking;
        this.position = position;
    }

    public PlayerStats getStats() {
        return stats;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return "Player: " +
                "\nName: " + name +
                " Jersey Number: " + jerseyNumber +
                " Over All Ranking: " + overAllRanking +
                " Position: " + position;
    }
}
