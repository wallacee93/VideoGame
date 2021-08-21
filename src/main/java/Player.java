public class Player{

    String name;
    int jerseyNumber;
    int overAllRanking;
    String position;
    PlayerStats stats;
    Team team;

    public Player(String name, int jerseyNumber, int overAllRanking, String position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.overAllRanking = overAllRanking;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player: " +
                "\nName: " + name +
                " \nJersey Number: " + jerseyNumber +
                " \nOver All Ranking: " + overAllRanking +
                " \nPosition: " + position;
    }
}
