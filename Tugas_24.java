import java.util.Scanner;

public class Tugas_24 {

    // fungsi rekursif
    static int jumlahRekursif(int[] data, int n) {
        if (n == 0) {
            return 0;
        } else {
            return data[n - 1] + jumlahRekursif(data, n - 1);
        }
    }

    // fungsi iteratif
    static int jumlahIteratif(int[] data) {
        int total = 0;
        for (int i = 0; i < data.length; i++) {
            total += data[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] data = new int[n];

        for (int i = n; i >= 1; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }

        System.out.println("Total dari 4 angka yang dimasukkan adalah (Rekursif): " + jumlahRekursif(data, n));
        System.out.println("Total dari 4 angka yang dimasukkan adalah (Iteratif): " + jumlahIteratif(data));

        sc.close();
    }
}
