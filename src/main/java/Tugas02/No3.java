//Muh.Faishal Rizal
//20090029
//2D
package Tugas02;
public class No3 {
    public static void main(String[] args) {
        int [][] matriks_01 = {
            {2, 4, 6},
            {1, 3, 5}
        };
        int [][] matriks_02 = {
            {7, 8},
            {3, 5},
            {9, 6}          
        };
        if (matriks_01[0].length == matriks_02.length){
            int[][] jumlah = new int [matriks_01.length][matriks_02[0].length];
            for (int f = 0; f < matriks_01.length; f++) {
                for (int r = 0; r < matriks_02[0].length; r++) {
                    for (int z = 0; z < matriks_01[0].length; z++) {
                        jumlah[f][r] += matriks_01[f][z]*matriks_02[z][r];           
                    } System.out.print(jumlah[f][r]+" ");           
                } System.out.println();
            }
                }
        else{
            System.out.println("kolom matriks_01 harus sama dengan baris matriks_02");
        }
        System.out.println("Muh.Faishal Rizal");
    }
}
