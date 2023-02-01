import java.util.Scanner;

public class BJ230201_2738_MatrixSum {
    public static int[][] setValues(int row, int col) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrx = sc.nextInt();
        int arry = sc.nextInt();

        int[][] arr1 = new int[arrx][arry];
        int[][] arr2 = new int[arrx][arry];

        arr1 = setValues(arrx, arry);
        arr2 = setValues(arrx, arry);

        // for (int i = 0; i < arrx; i++){
        //     for (int j = 0; j < arry; j++){
        //         arr1[i][j] = sc.nextInt();
        //         System.out.println("arr1: " + i + ", " + j);
        //     }
        // }

        // for (int i = 0; i < arrx; i++){
        //     for (int j = 0; j < arry; j++){
        //         arr2[i][j] = sc.nextInt();
        //         System.out.println("arr2: " + i + ", " + j);
        //     }
        // }

        for (int i = 0; i < arrx; i++){
            for (int j = 0; j < arry; j++){
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
