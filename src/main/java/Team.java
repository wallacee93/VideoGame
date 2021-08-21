import java.util.ArrayList;
import java.util.List;

public class Team {

    String teamName;

    List<Player> players = new ArrayList<Player>();

    public Team(String teamName){
        this.teamName = teamName;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    @Override
    public String toString() {
        return "Team: " +
                "\nTeam Name: " + teamName +
                " Players: " + players;
    }
}
