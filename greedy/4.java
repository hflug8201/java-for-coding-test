import java.util.*;

// 방법 1
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

// 방법 2 : 최대한 많이 나누기
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, K을 공백을 기준으로 구분해 입력 받기
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;

		while (true){
			// N이 K로 나누었을 때 떨어지는 수가 될 때까지만 1씩 빼기
			int target = (n / k) * k; // n을 k로 나눈 몫(정수) * k == n을 k로 나누었을 때 떨어지는 수
			count += n - target; // n에서 딱 떨어지는 수(target)를 뺀 값만큼 count
			n = target;

			// N이 K보다 작을 때 (더 이상 나눌 수 없을 때) 반복문 탈출
			if(n < k){
				break;
			}

			// K로 나누기
			count++;
			n /= k;
		}

		// 남은 n이 1이 될 때까지 남은 수 count
		count += n - 1;

		System.out.println(count);
	}
}
