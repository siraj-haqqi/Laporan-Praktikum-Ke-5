public class SoalNomor5 {
    public static void main(String[] args) {
        String[] hewan = {"Monyet", "Gajah", "Jerapah", "Zebra", "Orangutan"};
        
        System.out.println("Daftar Hewan:");
        for (int i = 0; i < hewan.length; i++) {
            System.out.println((i + 1) + ". " + hewan[i]);
        }
    }
}