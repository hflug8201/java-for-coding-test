import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); // java에서는 LinkedList 활용해 queue 생성

        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        q.offer(5);
        q.offer(2);
        q.offer(3);
        q.offer(7);
        q.poll(); // queue에 첫번째 값을 반환하고 제거 비어있다면 null
        q.offer(1);
        q.offer(4);
        q.poll();
        q.peek(); // queue의 첫번째 값 참조
        // q.clear(); // queue 초기화
      
        // 먼저 들어온 원소부터 추출
        while (!q.isEmpty()) {
            System.out.println(q.poll());
        }
    }

}
