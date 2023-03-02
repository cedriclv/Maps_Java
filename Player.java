public class Player {

    private String name;
    private int speed;
    private String country;
    
    public Player(String name, int speed, String country) {
        this.name = name;
        this.speed = speed;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
