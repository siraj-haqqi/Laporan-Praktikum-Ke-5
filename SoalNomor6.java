import java.util.Scanner;

public class SoalNomor6 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        Scanner input = new Scanner(System.in);
        
        System.out.print("jumlah rotasi (k): ");
        int k = input.nextInt();
        k = k % data.length; 
        for (int rotasi = 0; rotasi < k; rotasi++) {
            int last = data[data.length - 1];
            for (int i = data.length - 1; i > 0; i--) {
                data[i] = data[i - 1];
            }
            data[0] = last;
        }
        
        System.out.print("Array setelah rotasi: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        input.close();
    }
}