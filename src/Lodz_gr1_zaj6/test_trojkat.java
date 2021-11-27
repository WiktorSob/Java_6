package Lodz_gr1_zaj6;
public class test_trojkat {

    public static void main(String[] args) {
        Punkt2D p11 = new Punkt2D(0, 0);
        Punkt2D p12 = new Punkt2D(0, 3);
        Punkt2D p13 = new Punkt2D(4, 0);

        Punkt2D p21 = new Punkt2D(0, 0);
        Punkt2D p22 = new Punkt2D(4, 0);
        Punkt2D p23 = new Punkt2D(2, 5);
        Trojkat t1 = new Trojkat(p11,p12,p13);        
        Trojkat t2 = new Trojkat(p21,p22,p23);
        System.out.println(t1+" "+ t1.czytrojkat()+ " "+ t1.pole()+ " "+t1.Jakitrojkat());
        System.out.println(t2+" "+ t2.czytrojkat()+ " "+ t2.pole()+ " "+t2.Jakitrojkat());
    }
    
    
}
