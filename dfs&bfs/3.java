public class Main {

	public static void recursiveFunction(){
		System.out.println("재귀함수 호출"); // 해당 문자열 무한 출력(무한대 재귀 호출)
		recursiveFunction();
	}

	public static void main(String[] args) {
		recursiveFunction();
	}
}
