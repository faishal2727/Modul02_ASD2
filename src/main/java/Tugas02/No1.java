//Muh.Faishal Rizal
//20090029
//2D
package Tugas02;
public class No1 {
    public static void main(String[] args) {
        int matriks [][] = new int  [3][3];
        matriks[0][0] = 34;
        matriks[0][1] = 56;
        matriks[0][2] = 41;
        matriks[1][0] = 45;
        matriks[1][1] = 36;
        matriks[1][2] = 37;
        matriks[2][0] = 51;
        matriks[2][1] = 32;
        matriks[2][2] = 46;
        for (int f = 0; f < matriks.length; f++) {
            for (int r = 0; r < matriks[0].length; r++) {
                System.out.print(matriks[f][r]+ "  ");   
            }
            System.out.println();   
        }
        System.out.println("Muh.Faishal Rizal");
    }
}
