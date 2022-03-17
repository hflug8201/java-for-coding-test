import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N, M을 공백을 기준으로 구분해 입력 받기
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		// 한 줄씩 입력 받아 확인
		for(int i = 0; i < n; i++){
			// 현재 행에서 가장 작은 수 찾기
			int min = 10001; // 각 숫자는 10000이하이므로 10001이라고 최소값 잡아놓음
			for(int j = 0; j < m; j++){
				int x = sc.nextInt(); // 열의 갯수(m)만큼 돌면서 공백으로 구분된 숫자 중 가장 작은 수 찾기
				min = Math.min(min, x);
			}
			// 각 행의 가장 작은 수 중 가장 큰 수 찾기
			result = Math.max(result, min);
		}
    
    System.out.println(result);
	}
}
