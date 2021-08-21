public class Characters {

    String name;
    int jerseyNumber;
    int overAllRanking;

    public Characters(String name, int jerseyNumber, int rank){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.overAllRanking = overAllRanking;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public int getOverAllRanking() {
        return overAllRanking;
    }

    public void setOverAllRanking(int overAllRanking) {
        this.overAllRanking = overAllRanking;
    }

    @Override
    public String toString() {
        return "Characters: " +
                " \nname: " + name +
                " \njerseyNumber: " + jerseyNumber +
                " \noverAllRanking: " + overAllRanking;
    }
}
