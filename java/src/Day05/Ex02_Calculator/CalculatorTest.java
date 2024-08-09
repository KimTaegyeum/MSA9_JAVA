package Day05.Ex02_Calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
	
			Scanner sc = new Scanner(System.in);
			System.out.print("a : ");
			int a = sc.nextInt();
			System.out.print("b : ");
			int b = sc.nextInt();
			
			int result1 = calculator.plus(a, b);
			System.out.println("a + b =" + result1);
			
			int result2 = calculator.minus(a, b);
			System.out.println("a - b =" + result2);
			
			System.out.print("x : ");
			double x = sc.nextDouble();
			System.out.print("y : ");
			double y = sc.nextDouble();
			
			double result3 = calculator.multple(x, y);
			System.out.println("x * y = " + result3);
			System.out.printf("x * y =%5.2f \n" , result3);
			
			double result4 = calculator.divide(x, y);
			System.out.println("x / y =" + result4);
			System.out.printf("x / y = %5.2f \n", result4);
			
			double result5 = calculator.remain(x, y);
			System.out.println("x / y =" + result5);
			
			int arr[] = {10,20,30,40,50};
			System.out.println("합계 : " + calculator.sum(arr));
			System.out.println("평균 : " + calculator.avg(arr));
			
			sc.close();
	
	}
}
