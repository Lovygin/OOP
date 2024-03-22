package Location;

public class Coordinates {
    protected int x;
    protected int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinates() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public float calcDistance(Coordinates point){
        int dX = point.x - this.x;
        int dY = point.y - this.y;
        return (float)Math.sqrt((dX + dX) + (dY * dY));
    }

}
