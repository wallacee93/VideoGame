public class Main {
    public static void main(String[] args) {

        Player kimKardashian = new Player("Kim Kardashian", 20, 70, "Shooting Guard");
        Player daffyDuck = new Player("Daffy Duck", 11, 80, "Small Forward");
        Player jamesHarden = new Player("James harden", 13, 94, "Point Guard");

        Player spiderMan = new Player("Spider Man", 1, 82,"Shooting Guard");
        Player bugsBunny = new Player("Bugs Bunny", 0, 77, "Point Guard");
        Player lebronJames = new Player("Lebron James", 23,96,"Small Forward");

        Team team = new Team("Squad 1");


        kimKardashian.stats = new PlayerStats(20.2, 3.1, 1.1,2.2,
                                                0.1);
        daffyDuck.stats = new PlayerStats(51.2, 1.3, 8.2, 0.1,
                                            2.3);
        jamesHarden.stats = new PlayerStats(47.1, 10.9, 8.5, 1.3,
                                            0.8);
        spiderMan.stats = new PlayerStats(50.5, 10.3, 7.3, 2.3,
                                            3.2);
        bugsBunny.stats = new PlayerStats(40.8, 8.9, 0.1, 6.3,
                                            0.5);
        lebronJames.stats = new PlayerStats(51.3, 7.8, 7.7, 1.1,
                                                0.6);


    }
}
