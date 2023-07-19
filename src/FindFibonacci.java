import java.util.Scanner;

public class FindFibonacci {
    static int findFibonacci(int N){
        if(N == 0||N == 1) return N;
        return findFibonacci(N-1)+findFibonacci(N-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(findFibonacci(scanner.nextInt()));
    }
}
