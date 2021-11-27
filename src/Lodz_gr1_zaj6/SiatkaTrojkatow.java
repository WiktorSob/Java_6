
package Lodz_gr1_zaj6;

import java.util.Scanner;

public class SiatkaTrojkatow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę trójkątów do wygenerowania: ");
        int N = sc.nextInt();
        
        Trojkat[] tabTrojkatow = new Trojkat[N];
        Punkt2D[] tabWierzcholkow = new Punkt2D[3];
        
        for (int i = 0; i < tabTrojkatow.length; i++) {
            for (int j = 0; j < tabWierzcholkow.length; j++) {
                int x = (int)(15*Math.random());
                int y = (int)(15*Math.random());
                tabWierzcholkow[j]=new Punkt2D(x,y);
            }
            tabTrojkatow[i]=new Trojkat(tabWierzcholkow[0],tabWierzcholkow[1],tabWierzcholkow[2]);
            
        }
    for (Trojkat t:tabTrojkatow){
        System.out.println(t+" "+t.obwod()+" "+t.pole()+" "+t.Jakitrojkat());
    }
    int Pr =0;
    int Os =0;        
    int Rz =0;
    int NAs =0;
        for (int i = 0; i < tabTrojkatow.length; i++) {
            if (null != tabTrojkatow[i].Jakitrojkat())switch (tabTrojkatow[i].Jakitrojkat()) {
                case "NA":
                    NAs++;
                    break;
                case "R":
                    Rz++;
                    break;
                case "O":
                    Os++;
                    break;
                case "P":
                    Pr++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Ilość niepowodzeń w utworzeniu trójkąta: " + NAs + "(" + ((double)NAs/(double)tabTrojkatow.length*100) + "%)" );
        System.out.println("Ilość trójkątów prostokątnych: " + Pr + "(" + ((double)Pr/(double)tabTrojkatow.length*100) + "%)" );
        System.out.println("Ilość trójkątów ostrokątnych: " + Os + "(" + ((double)Os/(double)tabTrojkatow.length*100) + "%)" );
        System.out.println("Ilość trójkątów rozwartokątnych: " + Rz + "(" + ((double)Rz/(double)tabTrojkatow.length*100) + "%)" );
        System.out.println("Poprawnie wygenerowano: "+ (tabTrojkatow.length-NAs) + " figur z planowanych " + N + "." + "(" + ((double)(tabTrojkatow.length-NAs)/(double)tabTrojkatow.length*100) + "%)" );
        
        
    }
    
}
