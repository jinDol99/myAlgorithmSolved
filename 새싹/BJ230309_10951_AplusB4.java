import java.util.Scanner;

public class BJ230309_10951_AplusB4 {
    public static void main(String[] args) {
        // ArrayList<Integer> sums = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
		
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a+b);
		
		}

        sc.close();
    }
}