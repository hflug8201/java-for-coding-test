public class Main {

	public static void main(String[] arg){
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		// 삽입 정렬은 인덱스 1부터 시작
		for(int i = 1; i < arr.length; i++){
			// 인덱스 i부터 1까지 감소하며 반복
			for(int j = i; j > 0; j--){
				// 한 칸씩 왼쪽으로 이동
				if(arr[j] < arr[j - 1]){
					// 스와프
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				} else {
					break; // 자기보다 작은 데이터 만나면 그 위치에서 멈춤
				}
			}
		}
		
		for(int i = 1; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
