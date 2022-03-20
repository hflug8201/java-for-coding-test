public class Main {

	// 반복문으로 구현한 팩토리얼
	public static int factorialIterative(int n){
		int result = 1;
		// 1부터 n까지의 수를 차례대로 곱하기
		for(int i = 1; i < n; i++){
			result *= i;
		}
		return result;
	}

	// 재귀적으로 구현한 팩토리얼
	public static int factorialRecursive(int n) {
		// n이 1 이하인 경우 1 반환 : 더 이상 재귀함수 호출하지 않고 종료하도록 종료 조건 명시
		if(n <= 1){
			return 1;
		}
		
		// n! = n * (n - 1)!을 그대로 코드로 작성
		return n * factorialRecursive(n - 1);
	}

	public static void main(String[] arg){
		// 각각의 방식으로 구현한 팩토리얼(n!) 출력(n = 5)
		System.out.println("반복적으로 구현:" + factorialIterative(5)); // 120
		System.out.println("재귀적으로 구현:" + factorialRecursive(5)); // 120
	}
}
