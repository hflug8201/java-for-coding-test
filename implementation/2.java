import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// N 입력받기
		int h = sc.nextInt();
		int count = 0;

		for(int i = 0; i <= h; i++){ // 시
			for(int j = 0; j < 60; j++){ // 분
				for(int k = 0; k < 60; k++){ // 초
					// 시, 분, 초를 합쳐 문자열로 바꾼 다음 3이 있는지 확인
					String str = "";
					str += i;
					str += j;
					str += k;
					if(str.contains("3")){
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
