public class SoalNomor8 {
    public static void main(String[] args) {
        int[][] angka = {
            {2, 4, 6},
            {1, 3, 5},
            {7, 9, 11}
        };
        
        System.out.println("Isi Matriks:");
        int total = 0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka[i].length; j++) {
                System.out.print(angka[i][j] + " ");
                total += angka[i][j];
            }
            System.out.println();
        }
        System.out.println("Jumlah semua elemen = " + total);
    }
}