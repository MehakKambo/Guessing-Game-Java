package CpuGuessGame;
import java.util.*;
public class RandomGame {
	static Random rand = new Random();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the uppers bound: ");
		int ub = sc.nextInt();
		System.out.println("Enter the lower bound: ");
		int lb = sc.nextInt();
		int count = 0;
		while(count != 5) {
			int r = rand.nextInt(ub) + lb;
			System.out.println(r);
			count++;
		}
	}
}
