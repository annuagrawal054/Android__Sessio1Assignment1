import java.util.Scanner;


public class SumOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,res;
		float b = 3,sum =0;
		System.out.println("Enter value of two number\n");
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextFloat();
		sum = a + b;
		res = (int)sum;
		System.out.println(res);

	}

}
