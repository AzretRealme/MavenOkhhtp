package models;

public class Wind10M {

    private String direction;
    private int speed;

    public Wind10M() {
    }

    public Wind10M(String direction, int speed) {
        this.direction = direction;
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Wind10M{" +
                "direction='" + direction + '\'' +
                ", speed=" + speed +
                '}';
    }
}
