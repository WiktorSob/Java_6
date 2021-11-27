
package Lodz_gr1_zaj6;

import java.util.ArrayList;
import java.util.Collections;

public class Trojkat {
    private Punkt2D p1,p2,p3;

    public Trojkat(Punkt2D p1, Punkt2D p2, Punkt2D p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public boolean czytrojkat(){
        double d1=p1.odleglosc(p2);
        double d2=p2.odleglosc(p3);
        double d3=p3.odleglosc(p1);
        return (d1+d2>d3 && d2+d3>d1 && d3+d1>d2);
    
        
    }
    //dopisac trzy meotody pole, obwodd i typ trojkata
    public double obwod(){
        double obwod;
        if (czytrojkat()==false) {
    return 0;
        } else {
    return (int)(p1.odleglosc(p2)+p2.odleglosc(p3)+p3.odleglosc(p1));
        }
    }
    
    public double pole(){
        if (czytrojkat()==false) {
            return 0;
        } else{
            double p = 0.5*obwod();
            double s= (int)Math.sqrt(p*(p-p1.odleglosc(p2))*(p-p2.odleglosc(p3))*(p-p3.odleglosc(p1)));
            return s;
  // return 0.25*Math.sqrt((p1.odleglosc(p2)+p2.odleglosc(p3)+p3.odleglosc(p1))*(p1.odleglosc(p2)+p2.odleglosc(p3)-p3.odleglosc(p1))*(p1.odleglosc(p2)-p2.odleglosc(p3)+p3.odleglosc(p1))*(-p1.odleglosc(p2)+p2.odleglosc(p3)+p3.odleglosc(p1)));     
            
        }
}
    public String Jakitrojkat(){
        if (czytrojkat()==true){
        double d1=p1.kwadratodlegl(p2);
        double d2=p2.kwadratodlegl(p3);
        double d3=p3.kwadratodlegl(p1);
        ArrayList list = new ArrayList();
        list.add(d1);
        list.add(d2);
        list.add(d3);
    Collections.sort(list, Collections.reverseOrder());
    double a = (double)list.get(0);
    double b = (double)list.get(1);
    double c = (double)list.get(2);
            if (a==b+c) {
                return "P"  ;
            } else if (a>b+c){        
                return "R";
            } else  {
                return "O";         
            }
        } else
        return "NA";
    }
    
    public Punkt2D getP1() {
        return p1;
    }

    public Punkt2D getP2() {
        return p2;
    }

    public Punkt2D getP3() {
        return p3;
    }

    public void setP1(Punkt2D p1) {
        this.p1 = p1;
    }

    public void setP2(Punkt2D p2) {
        this.p2 = p2;
    }

    public void setP3(Punkt2D p3) {
        this.p3 = p3;
    }

    @Override
    public String toString() {
        return "("+p1+", "+p2+", "+p3+")";
    }
    
    
    
    
}
