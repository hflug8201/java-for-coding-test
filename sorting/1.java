public class Main {

	public static void main(String[] arg){
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		for(int i = 0; i < arr.length; i++){
			int min_index = i; // 가장 작은 원소의 인덱스
			for(int j = i + 1; j < arr.length; j++){
				if(arr[min_index] > arr[j]){
					min_index = j;
				}
			}

			// 스와프 : 두 원소 위치 변경
			int temp = arr[i]; // 임시 저장용 변수
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
    
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
