public class Player{

    String name;
    int jerseyNumber;
    int overAllRanking;
    String position;

    public Player(String name, int jerseyNumber, int overAllRanking, String position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.overAllRanking = overAllRanking;
        this.position = position;
    }

//    Player kimKardashian = new Player("Kim Kardashian", 20, 70, "Shooting Guard");
//    Player daffyDuck = new Player("Daffy Duck", 11, 80, "Small Forward");
//    Player jamesHarden = new Player("James harden", 13, 94, "Point Guard");
//
//    Player spiderMan = new Player("Spider Man", 1, 82,"Shooting Guard");
//    Player bugsBunny = new Player("Bugs Bunny", 0, 77, "Point Guard");
//    Player lebronJames = new Player("Lebron James", 23,96,"Small Forward");


    @Override
    public String toString() {
        return "Player: " +
                "\nName: " + name +
                " \nJersey Number: " + jerseyNumber +
                " \nOver All Ranking: " + overAllRanking +
                " \nPosition: " + position;
    }
}
