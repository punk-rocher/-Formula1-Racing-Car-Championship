public abstract class Driver {

    String driverName;
    String location;
    String team;

    int FirstPosition;
    int SecondPosition;
    int ThirdPosition;
    int CurrentPoints;
    int ParticipatedRaces;

    public Driver(String driverName, String location, String team, int currentPoints, int firstPosition, int secondPosition, int thirdPosition, int participatedRaces) {

        this.driverName = driverName;
        this.location = location;
        this.team = team;
        this.CurrentPoints = currentPoints;
        this.FirstPosition = firstPosition;
        this.SecondPosition = secondPosition;
        this.ThirdPosition = thirdPosition;
        this.ParticipatedRaces = participatedRaces;

    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getFirstPosition() {
        return FirstPosition;
    }

    public void setFirstPosition(int firstPosition) {
        FirstPosition = firstPosition;
    }

    public int getSecondPosition() {
        return SecondPosition;
    }

    public void setSecondPosition(int secondPosition) {
        SecondPosition = secondPosition;
    }

    public int getThirdPosition() {
        return ThirdPosition;
    }

    public void setThirdPosition(int thirdPosition) {
        ThirdPosition = thirdPosition;
    }

    public int getCurrentPoints() {
        return CurrentPoints;
    }

    public void setCurrentPoints(int currentPoints) {
        CurrentPoints = currentPoints;
    }

    public int getParticipatedRaces() {
        return ParticipatedRaces;
    }

    public void setParticipatedRaces(int participatedRaces) {
        ParticipatedRaces = participatedRaces;
    }
}

