import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player kimKardashian = new Player("Kim Kardashian", 20, 70, "Shooting Guard");
        Player daffyDuck = new Player("Daffy Duck", 11, 80, "Small Forward");
        Player jamesHarden = new Player("James harden", 13, 94, "Point Guard");

        Player spiderMan = new Player("Spider Man", 1, 82,"Shooting Guard");
        Player bugsBunny = new Player("Bugs Bunny", 0, 77, "Point Guard");
        Player lebronJames = new Player("Lebron James", 23,96,"Small Forward");

        Team teamOne = new Team("Kardashian");
        Team teamTwo = new Team("Spidery Sense");
        Mode3on3 mode3on3 = new Mode3on3();

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


        System.out.println("Create Team One :");
        kimKardashian.team.setTeamName("Kardashians");
        kimKardashian.team.addPlayer(kimKardashian);
        kimKardashian.team.addPlayer(daffyDuck);
        kimKardashian.team.addPlayer(jamesHarden);

        System.out.println("Create Team Two");
        spiderMan.team.setTeamName("Spidey Sense");
        spiderMan.team.addPlayer(spiderMan);
        spiderMan.team.addPlayer(bugsBunny);
        spiderMan.team.addPlayer(lebronJames);

        System.out.println("Time to begin the Game");
        kimKardashian.mode3on3.startGame();
        spiderMan.mode3on3.startGame();

        // Game Starts
        kimKardashian.mode3on3.shootJumper(jamesHarden);
        // if make gets 2 point

        spiderMan.mode3on3.shootTheThree(lebronJames);
        // if make gets 3 points

        spiderMan.mode3on3.shootTheThree(spiderMan);

        kimKardashian.mode3on3.shootJumper(kimKardashian);













    }
}

