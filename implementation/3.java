import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		int column = input.charAt(0) - 'a' + 1; // 'a'는 아스키코드로 97. 입력값 - 97 + 1 하면 입력값을 1부터 8까지의 숫자로 나타낼 수 있음
		int row = input.charAt(1) - '0'; // '0'의 아스키코드를 빼서 1부터 8까지의 숫자로 나타냄

		int[][] moveSteps = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {1, -2}, {-1, 2}, {-1, -2}};

		// 8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
		int result = 0;
		for(int i = 0; i < 8; i++){
			// 이동하고자 하는 위치 확인
			int nextColumn = column + moveSteps[i][0];
			int nextRow = row + moveSteps[i][1];

			// 해당 위치로 이동이 가능하다면 카운트 증가
			if(nextColumn >= 1 && nextColumn <= 8 && nextRow >= 1 && nextRow <= 8){
				result++;
			}
	}
		System.out.println(result);
	}
}
