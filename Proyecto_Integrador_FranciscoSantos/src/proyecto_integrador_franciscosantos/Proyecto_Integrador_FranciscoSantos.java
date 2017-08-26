package proyecto_integrador_franciscosantos;

import java.util.*;

public class Proyecto_Integrador_FranciscoSantos {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String gana = " ";
        int x,x1;
        int y,y1;
        String resp = "s";
        while ("s".equals(resp) || "S".equals(resp)) {
            System.out.print("Ingrese el nombre de jugador 1:\n ");
            String j1 = sc.next();
            System.out.print("Ingrese el nombre de jugador 2:\n ");
            String j2 = sc.next();
            Object[][] mat = llenar();
            int cont = 0;
            while (" ".equals(gana)) {
                if (cont == 0) {
                    System.out.println("Turno de: " + j1);
                    Imprimir(mat);
                    System.out.print("Ingrese Valor de X:\n ");
                    x = sc.nextInt();
                    System.out.print("Ingrese Valor de Y:\n ");
                    y = sc.nextInt();
                    //cont = 1;
                    while ((mat[x][y] instanceof Rebelde)){
                        System.out.println("/////La pieza que selecciono no es suya://///");
                        System.out.print("Ingrese Valor de X:\n ");
                        x = sc.nextInt();
                        System.out.print("Ingrese Valor de Y:\n ");
                        y = sc.nextInt();
                    }
                    if (mat[x][y] instanceof Rebelde) {
                        System.out.println("A que posicion desea mover el rebelde: ");
                        
                    }
                    

                } else if (cont == 1) {
                    System.out.println("Turno de: " + j2);
                    Imprimir(mat);
                    System.out.print("Ingrese Valor de X:\n ");
                    x = sc.nextInt();
                    System.out.print("Ingrese Valor de Y:\n ");
                    y = sc.nextInt();
                    cont = 0;
                    while (mat[x][y] != new Duque() || mat[x][y] != new Duque(false) || mat[x][y] != new Duque(true) || mat[x][y] != new Rey(true) || mat[x][y] != new Rey(false)) {
                        System.out.println("/////La pieza que selecciono no es suya://///");
                        System.out.print("Ingrese Valor de X:\n ");
                        x = sc.nextInt();
                        System.out.print("Ingrese Valor de Y:\n ");
                        y = sc.nextInt();
                    }
                }
            }
        }
    }

    public static Object[][] llenar() {
        Object x[][] = new Object[19][19];
        x[0][0] = "X";
        x[0][1] = "X";
        x[0][2] = new Rebelde(false);
        x[0][3] = " ";
        x[0][4] = " ";
        x[0][5] = new Rebelde(false);
        x[0][6] = " ";
        x[0][7] = " ";
        x[0][8] = " ";
        x[0][9] = " ";
        x[0][10] = " ";
        x[0][11] = " ";
        x[0][12] = " ";
        x[0][13] = new Rebelde(false);
        x[0][14] = " ";
        x[0][15] = " ";
        x[0][16] = new Rebelde(false);
        x[0][17] = "X";
        x[0][18] = "X";
        //listo
        x[1][0] = "X";
        x[1][1] = "X";
        x[1][2] = " ";
        x[1][3] = " ";
        x[1][4] = " ";
        x[1][5] = " ";
        x[1][6] = " ";
        x[1][7] = " ";
        x[1][8] = " ";
        x[1][9] = " ";
        x[1][10] = " ";
        x[1][11] = " ";
        x[1][12] = " ";
        x[1][13] = " ";
        x[1][14] = " ";
        x[1][15] = " ";
        x[1][16] = " ";
        x[1][17] = "X";
        x[1][18] = "X";
        //listo
        x[2][0] = new Rebelde(false);
        x[2][1] = " ";
        x[2][2] = " ";
        x[2][3] = " ";
        x[2][4] = " ";
        x[2][5] = new Rebelde(false);
        x[2][6] = " ";
        x[2][7] = " ";
        x[2][8] = " ";
        x[2][9] = " ";
        x[2][10] = " ";
        x[2][11] = " ";
        x[2][12] = " ";
        x[2][13] = new Rebelde(false);
        x[2][14] = " ";
        x[2][15] = " ";
        x[2][16] = " ";
        x[2][17] = " ";
        x[2][18] = new Rebelde(false);
        //listo
        x[3][0] = " ";
        x[3][1] = " ";
        x[3][2] = " ";
        x[3][3] = " ";
        x[3][4] = " ";
        x[3][5] = " ";
        x[3][6] = " ";
        x[3][7] = new Rebelde(false);
        x[3][8] = " ";
        x[3][9] = new Rebelde(false);
        x[3][10] = " ";
        x[3][11] = new Rebelde(false);
        x[3][12] = " ";
        x[3][13] = " ";
        x[3][14] = " ";
        x[3][15] = " ";
        x[3][16] = " ";
        x[3][17] = " ";
        x[3][18] = " ";
        //listo
        x[4][0] = " ";
        x[4][1] = " ";
        x[4][2] = " ";
        x[4][3] = " ";
        x[4][4] = " ";
        x[4][5] = " ";
        x[4][6] = new Rebelde(false);
        x[4][7] = " ";
        x[4][8] = new Duque(false);
        x[4][9] = " ";
        x[4][10] = new Duque(false);
        x[4][11] = " ";
        x[4][12] = new Rebelde(false);
        x[4][13] = " ";
        x[4][14] = " ";
        x[4][15] = " ";
        x[4][16] = " ";
        x[4][17] = " ";
        x[4][18] = " ";
        //
        x[5][0] = new Rebelde(false);
        x[5][1] = " ";
        x[5][2] = new Rebelde(false);
        x[5][3] = " ";
        x[5][4] = " ";
        x[5][5] = new Rebelde(false);
        x[5][6] = " ";
        x[5][7] = " ";
        x[5][8] = " ";
        x[5][9] = " ";
        x[5][10] = " ";
        x[5][11] = " ";
        x[5][12] = " ";
        x[5][13] = new Rebelde(false);
        x[5][14] = " ";
        x[5][15] = " ";
        x[5][16] = new Rebelde(false);
        x[5][17] = " ";
        x[5][18] = new Rebelde(false);
        //
        x[6][0] = " ";
        x[6][1] = " ";
        x[6][2] = " ";
        x[6][3] = " ";
        x[6][4] = new Rebelde(false);
        x[6][5] = " ";
        x[6][6] = " ";
        x[6][7] = " ";
        x[6][8] = " ";
        x[6][9] = new Duque(false);
        x[6][10] = " ";
        x[6][11] = " ";
        x[6][12] = " ";
        x[6][13] = " ";
        x[6][14] = new Rebelde(false);
        x[6][15] = " ";
        x[6][16] = " ";
        x[6][17] = " ";
        x[6][18] = " ";
        //
        x[7][0] = " ";
        x[7][1] = " ";
        x[7][2] = " ";
        x[7][3] = new Rebelde(false);
        x[7][4] = " ";
        x[7][5] = " ";
        x[7][6] = " ";
        x[7][7] = " ";
        x[7][8] = new Duque(false);
        x[7][9] = " ";
        x[7][10] = new Duque(false);
        x[7][11] = " ";
        x[7][12] = " ";
        x[7][13] = " ";
        x[7][14] = " ";
        x[7][15] = new Rebelde(false);
        x[7][16] = " ";
        x[7][17] = " ";
        x[7][18] = " ";
        //
        x[8][0] = " ";
        x[8][1] = " ";
        x[8][2] = " ";
        x[8][3] = " ";
        x[8][4] = new Duque(false);
        x[8][5] = " ";
        x[8][6] = " ";
        x[8][7] = new Duque(false);
        x[8][8] = " ";
        x[8][9] = new Duque(false);
        x[8][10] = " ";
        x[8][11] = new Duque(false);
        x[8][12] = " ";
        x[8][13] = " ";
        x[8][14] = new Duque(false);
        x[8][15] = " ";
        x[8][16] = " ";
        x[8][17] = " ";
        x[8][18] = " ";
        //
        x[9][0] = " ";
        x[9][1] = " ";
        x[9][2] = " ";
        x[9][3] = new Rebelde(false);
        x[9][4] = " ";
        x[9][5] = " ";
        x[9][6] = new Duque(false);
        x[9][7] = " ";
        x[9][8] = new Duque(false);
        x[9][9] = new Rey(true);
        x[9][10] = new Duque(false);
        x[9][11] = " ";
        x[9][12] = new Duque(false);
        x[9][13] = " ";
        x[9][14] = " ";
        x[9][15] = new Rebelde(false);
        x[9][16] = " ";
        x[9][17] = " ";
        x[9][18] = " ";
        //
        x[10][0] = " ";
        x[10][1] = " ";
        x[10][2] = " ";
        x[10][3] = " ";
        x[10][4] = new Duque(false);
        x[10][5] = " ";
        x[10][6] = " ";
        x[10][7] = new Duque(false);
        x[10][8] = " ";
        x[10][9] = new Duque(false);
        x[10][10] = " ";
        x[10][11] = new Duque(false);
        x[10][12] = " ";
        x[10][13] = " ";
        x[10][14] = new Duque(false);
        x[10][15] = " ";
        x[10][16] = " ";
        x[10][17] = " ";
        x[10][18] = " ";
        //
        x[11][0] = " ";
        x[11][1] = " ";
        x[11][2] = " ";
        x[11][3] = new Rebelde(false);
        x[11][4] = " ";
        x[11][5] = " ";
        x[11][6] = " ";
        x[11][7] = " ";
        x[11][8] = new Duque(false);
        x[11][9] = " ";
        x[11][10] = new Duque(false);
        x[11][11] = " ";
        x[11][12] = " ";
        x[11][13] = " ";
        x[11][14] = " ";
        x[11][15] = new Rebelde(false);
        x[11][16] = " ";
        x[11][17] = " ";
        x[11][18] = " ";
        //
        x[12][0] = " ";
        x[12][1] = " ";
        x[12][2] = " ";
        x[12][3] = " ";
        x[12][4] = new Rebelde(false);
        x[12][5] = " ";
        x[12][6] = " ";
        x[12][7] = " ";
        x[12][8] = " ";
        x[12][9] = new Duque(false);
        x[12][10] = " ";
        x[12][11] = " ";
        x[12][12] = " ";
        x[12][13] = " ";
        x[12][14] = new Rebelde(false);
        x[12][15] = " ";
        x[12][16] = " ";
        x[12][17] = " ";
        x[12][18] = " ";
        //
        x[13][0] = new Rebelde(false);
        x[13][1] = " ";
        x[13][2] = new Rebelde(false);
        x[13][3] = " ";
        x[13][4] = " ";
        x[13][5] = new Rebelde(false);
        x[13][6] = " ";
        x[13][7] = " ";
        x[13][8] = " ";
        x[13][9] = " ";
        x[13][10] = " ";
        x[13][11] = " ";
        x[13][12] = " ";
        x[13][13] = new Rebelde(false);
        x[13][14] = " ";
        x[13][15] = " ";
        x[13][16] = new Rebelde(false);
        x[13][17] = " ";
        x[13][18] = new Rebelde(false);
        //
        x[14][0] = " ";
        x[14][1] = " ";
        x[14][2] = " ";
        x[14][3] = " ";
        x[14][4] = " ";
        x[14][5] = " ";
        x[14][6] = new Rebelde(false);
        x[14][7] = " ";
        x[14][8] = new Duque(false);
        x[14][9] = " ";
        x[14][10] = new Duque(false);
        x[14][11] = " ";
        x[14][12] = new Rebelde(false);
        x[14][13] = " ";
        x[14][14] = " ";
        x[14][15] = " ";
        x[14][16] = " ";
        x[14][17] = " ";
        x[14][18] = " ";
        //listo
        x[15][0] = " ";
        x[15][1] = " ";
        x[15][2] = " ";
        x[15][3] = " ";
        x[15][4] = " ";
        x[15][5] = " ";
        x[15][6] = " ";
        x[15][7] = new Rebelde(false);
        x[15][8] = " ";
        x[15][9] = new Rebelde(false);
        x[15][10] = " ";
        x[15][11] = new Rebelde(false);
        x[15][12] = " ";
        x[15][13] = " ";
        x[15][14] = " ";
        x[15][15] = " ";
        x[15][16] = " ";
        x[15][17] = " ";
        x[15][18] = " ";
        //listo
        x[16][0] = new Rebelde(false);
        x[16][1] = " ";
        x[16][2] = " ";
        x[16][3] = " ";
        x[16][4] = " ";
        x[16][5] = new Rebelde(false);
        x[16][6] = " ";
        x[16][7] = " ";
        x[16][8] = " ";
        x[16][9] = " ";
        x[16][10] = " ";
        x[16][11] = " ";
        x[16][12] = " ";
        x[16][13] = new Rebelde(false);
        x[16][14] = " ";
        x[16][15] = " ";
        x[16][16] = " ";
        x[16][17] = " ";
        x[16][18] = new Rebelde(false);
        //listo
        x[17][0] = "X";
        x[17][1] = "X";
        x[17][2] = " ";
        x[17][3] = " ";
        x[17][4] = " ";
        x[17][5] = " ";
        x[17][6] = " ";
        x[17][7] = " ";
        x[17][8] = " ";
        x[17][9] = " ";
        x[17][10] = " ";
        x[17][11] = " ";
        x[17][12] = " ";
        x[17][13] = " ";
        x[17][14] = " ";
        x[17][15] = " ";
        x[17][16] = " ";
        x[17][17] = "X";
        x[17][18] = "X";
        //
        x[18][0] = "X";
        x[18][1] = "X";
        x[18][2] = new Rebelde(false);
        x[18][3] = " ";
        x[18][4] = " ";
        x[18][5] = new Rebelde(false);
        x[18][6] = " ";
        x[18][7] = " ";
        x[18][8] = " ";
        x[18][9] = " ";
        x[18][10] = " ";
        x[18][11] = " ";
        x[18][12] = " ";
        x[18][13] = new Rebelde(false);
        x[18][14] = " ";
        x[18][15] = " ";
        x[18][16] = new Rebelde(false);
        x[18][17] = "X";
        x[18][18] = "X";

        return x;
    }

    public static void Imprimir(Object x[][]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.print("[" + x[i][j] + "]");
            }
            System.out.println();
        }
    }
}
