import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, M, K를 공백을 기준으로 구분해 입력 받기
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();

		// N개의 수를 공백을 기준으로 구분해 입력 받기
		int[] arr = new int[n]; // array 길이 n으로 초기화
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr); // 오름차순 정렬
		int first = arr[n - 1]; // 가장 큰 수
		int second = arr[n - 2]; // 두번째로 큰 수

		// 가장 큰 수가 더해지는 횟수
		int count = (m / (k + 1)) * k;
		count += m % (k + 1);
		
		int result = 0;
		result += count * first; // 가장 큰 수 더하기
		result += (m - count) * second; // 두번째로 큰 수 더하기
		
		System.out.println(result);
		
	}

}
