package Day03;

public class Ex08_While {
	public static void main(String[] args) {
		
		int a = 1;
		
		//while (조건){반목 실행문}
		// - 반복문에는 반드시 종료조건이 성립하도록 작성해야한다.
		// - 종료조건이 만족하지 않게 되면 , 무한 루프에 빠진다.
		while(a<=100) {
			System.out.println(a+" ");
			a += 1;
		}
	}
}
