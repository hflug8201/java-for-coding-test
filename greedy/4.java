import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, K을 공백을 기준으로 구분해 입력 받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		while (n != 1){
			if(n % k == 0){
				n /= k;
				count++;
			} else{
				n--;
				count++;
			}
		}

		System.out.println(count);
	}
}
