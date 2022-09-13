import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		String A = str[0];
		String B = str[1];
		
		String reverseA = new StringBuilder().append(A).reverse().toString();
		String reverseB = new StringBuilder().append(B).reverse().toString();
		
		if(Integer.parseInt(reverseA)>Integer.parseInt(reverseB)) {
			System.out.println(Integer.parseInt(reverseA));
		}else {
			System.out.println(Integer.parseInt(reverseB));
		}
	}
}
