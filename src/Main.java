import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng ban đầu :");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nNhập phần tử cần xóa: ");
        int x = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println("Mảng sau khi xóa: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}