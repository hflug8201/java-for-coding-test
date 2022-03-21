public class Main {

	public static void quickSort(int[] arr, int start, int end){
		// 원소가 1개인 경우 종료
		if(start >= end){
			return;
		}
		int pivot = start; // 피벗은 첫번째 원소
		int left = start + 1;
		int right = end;

		while(left <= right){
			// 피벗보다 큰 데이터를 찾을 때까지 반복
			while(left <= end && arr[left] <= arr[pivot]){
				left++;
			}

			// 피벗보다 작은 데이터를 찾을 때까지 반복
			while(right > start && arr[right] >= arr[pivot]){
				right--;
			}

			// left, right 값이 엇갈리지 않았다면 작은 데이터와 큰 데이터 교체
			if(left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}

			// left, right 값이 엇갈렸다면 둘 중 작은 데이터와 피벗을 교체
			if(left > right){
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}
		}

		// 분할 이후 왼쪽 부분과 오른쪽 부분에서 각각 정렬 수행 : 재귀함수 사용
		quickSort(arr, start, right - 1); // 왼쪽 부분
		quickSort(arr, start + 1, end); // 오른쪽 부분
	}

	public static void main(String[] arg){
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

		quickSort(arr, 0, arr.length - 1);
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}
