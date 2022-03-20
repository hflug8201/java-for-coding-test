import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>(); // int형 stack 선언

        // 삽입(5) - 삽입(2) - 삽입(3) - 삽입(7) - 삭제() - 삽입(1) - 삽입(4) - 삭제()
        s.push(5);
        s.push(2);
        s.push(3);
        s.push(7);
        s.pop();
        s.push(1);
        s.push(4);
        s.pop();
        
        // s.clear(); // stack의 전체 값 제거 (초기화)
        s.size();      // stack의 크기 출력 : 4
        s.empty();     // stack이 비어있는지 check (비어있다면 true)
        s.contains(1) // stack에 1이 있는지 check (있다면 true)
      
        // 스택의 최상단 원소부터 출력
        while (!s.empty()) {
            System.out.println(s.peek()); // stack의 가장 상단의 값 출력
            s.pop(); // 해당 값 제거
        }
    }
}
