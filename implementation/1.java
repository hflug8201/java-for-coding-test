import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N 입력받기
		int n = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기 : 다음에 쓸 nextLine에 개행(엔터)이 담기지 않도록 개행만 입력시킴
		String[] plans = sc.nextLine().split(" "); // 공백 기준으로 나눠서 배열에 저장
		int x = 1, y = 1;

		// 1차원 배열로 x방향, y방향 나누어 선언 : L, R, U, D에 따른 이동 방향
		int[] dx = {0, 0, -1, 1}; // L, R, U, D
		int[] dy = {-1, 1, 0, 0}; // L, R, U, D
		char[] moveTypes = {'L', 'R', 'U', 'D'};

		// 이동 계획 하나씩 확인
		for(int i = 0; i < plans.length; i++){
			char plan = plans[i].charAt(0);

			int nx = 0, ny = 0;
			// 이동 후 좌표 구하기
			for(int j = 0; j < moveTypes.length; j++){
				if(plan == moveTypes[j]){
					nx = x + dx[j];
					ny = y + dy[j];
				}
			}

			// 공간을 벗어나는 경우 무시
			if(nx < 1 || ny < 1 || nx > n || ny > n){
				continue;
			}

			// 이동 수행
			x = nx;
			y = ny;
		}

		System.out.println(x + " " + y);

	}
}
