
package proyecto_integrador_franciscosantos;

import java.util.*;


public class Proyecto_Integrador_FranciscoSantos {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String resp = "s";
        while("s".equals(resp) || "S".equals(resp)){
            System.out.println("1. llenar matriz\n"
                    + "2. Jugar\n"
                    + "3.   \n"
                    + "4.   \n"
                    + "5.   \n"
                    + "6. salir");
            int opc=sc.nextInt();
            switch(opc){
                case 1:
                    String [][] x = new String [19][19];
                    llenar(x);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
            }
        }
    }
    public static String [][] llenar(String x[][]){
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[0][0]="X";
                x[0][1]="X";
                x[1][0]="X";
                x[1][1]="X";
            if (x[i][j]!=x[0][0] || x[i][j]!=x[0][1] || x[i][j]!=x[1][0] || x[i][j]!=x[1][1]) {
                x[i][j]=" ";
            }
            }
        }
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("["+x[i][j]+"]");
            }
            System.out.println();
        }
        
        
        return x;
    }
}
