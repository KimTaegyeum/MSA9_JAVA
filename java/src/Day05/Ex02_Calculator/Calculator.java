package Day05.Ex02_Calculator;

/**
 * 	계산기
 *  - 피연산자를 2개로 하는 계산기
 *  - 기능
 *  	1. 덧셈 : 정수 2개를 덧셈
 *  	2. 뺄셈 : 정수 인자 1 - 인자2 연산을 하는 뺄셈
 *  	3. 곱셈 : 실수를 2개를 곱셉
 *  	4. 나눗셈 : 실수 인자1 / 인자2 연산을 하는 나눗셈
 *  	5. 나머지 : 실숭 인자1 % 인자2 연산을 하는 나머지 연산
 *  	6. 합계 : 배열로 매개변수를 전달받아, 모든 요소의 합을 구함
 *  	7. 평균 : 배열로 매개변수를 전달받아, 모든 요소의 평균을 구함
 *
 */
public class Calculator {
	public int plus(int a , int b) {
		int result = a + b;
		return result;
		
	}
		
	public int minus(int a , int b) {
		int result = a - b;
		return result;
		
	}
	
	public double multple(double a , double b) {
		double result = a * b;
		return result;
		
	}
	
	public double divide(double a , double b) {
		double result = a / b;
		return result;
		
	}
	public double remain(double a , double b) {
		double result = a % b;
		return result;
		
	}
	
	public int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum +=arr[i];
		}
		return sum;
	}
	public double avg(int[] arr) {
		int sum = sum(arr);
		double avg = 0.0;
		avg = (double)sum / arr.length;
		return avg;
	}
		
}
	

  
