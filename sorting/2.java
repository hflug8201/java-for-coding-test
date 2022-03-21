public class Main {

    public static void main(String[] args) {        
        int[] arr = {3, 5};

        // 스와프(Swap) : 0 인덱스와 1 인덱스의 원소 교체
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;

        System.out.println(arr[0] + " " + arr[1]);
    }
}
