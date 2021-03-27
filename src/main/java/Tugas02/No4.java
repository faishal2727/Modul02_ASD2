//Muh.Faishal Rizal
//20090029
//2D
package Tugas02;
public class No4 {
    public static void main(String[] args) {
        int[][] matriks_01 = {
            {2, 1, -5},
            {3, 4, 2}
        };
        int[][] transpose = new int [7][7];
        for (int f = 0; f < matriks_01.length; f++) {
            for (int r = 0; r < matriks_01[0].length; r++) {
                transpose[r][f] = matriks_01[f][r];     
            }  
        }
        for (int f = 0; f < matriks_01[0].length; f++) {
            for (int r = 0; r < matriks_01.length; r++) {
                System.out.print(transpose[f][r]+" ");      
            }
            System.out.println();
        }
        System.out.println("Muh.Faishal Rizal");
    }
}