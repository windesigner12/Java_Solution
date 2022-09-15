public class Point {
    // write your code here
    private int x;
    private int y;

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    public int distance(int x, int y){
        this.x = x;
        this.y = y;
        return (int) Math.sqrt((this.y - this.x)*(this.y - this.x) + (this.y - this.x) * (this.y - this.x));

    }
}
