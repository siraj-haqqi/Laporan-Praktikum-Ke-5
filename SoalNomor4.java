public class SoalNomor4 {
    public static void main(String[] args) {
        int[] bilangan = new int[5];
        for (int i = 0; i < bilangan.length; i++) {
            bilangan[i] = i + 1;
        }
        
        System.out.print("Isi array: ");
        for (int num : bilangan) {
            System.out.print(num + " ");
        }
    }
}