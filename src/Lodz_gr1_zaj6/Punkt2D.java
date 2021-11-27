package Lodz_gr1_zaj6;


public class Punkt2D {
private int x,y;

    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    
    public double odleglosc(Punkt2D p){
        return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
    }
    public double kwadratodlegl (Punkt2D p){
        return (p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y);
    }
    
    
@Override
public String toString(){
    return "("+x+","+y+")";
}
    
}
