import java.util.*;

public class Main {

	public static boolean[] visited = new boolean[9]; // 탐색 완료한 노드를 체크하기 위해 visited 배열 선언
	// 그래프 저장할 변수 이중 중첩 ArrayList로 선언. 외부 ArrayList가 모든 노드를 의미, 각 노드에 붙은 내부 ArrayList에는 그 노드와 연결된 노드의 정보를 저장
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

	// BFS 함수 정의
	public static void bfs(int start){
		// 큐를 구현한 LinkedList를 통해 재귀적인 호출 없이 그래프를 탐색
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);

		// 현재 노드 방문 처리
		visited[start] = true;

		// 큐가 빌 때까지 반복
		while(!q.isEmpty()){
			// 큐에서 하나의 원소를 뽑아 출력
			int x = q.poll();
			System.out.print(x + " ");

			// 해당 원소와 연결된, 아직 방문하지 않은 모든 원소들을 큐에 삽입
			for(int i = 0; i < graph.get(x).size(); i++){
				int y = graph.get(x).get(i);
				if(!visited[y]){
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}

	public static void initGraph(){
		// 그래프 초기화
		for(int i = 0; i < 9; i++){
			graph.add(new ArrayList<Integer>());
		}

		// 노드 1에 연결된 노드 정보 저장
		graph.get(1).add(2);
		graph.get(1).add(3);
		graph.get(1).add(8);

		// 노드 2에 연결된 노드 정보 저장
		graph.get(2).add(1);
		graph.get(2).add(7);

		// 노드 3에 연결된 노드 정보 저장
		graph.get(3).add(1);
		graph.get(3).add(4);
		graph.get(3).add(5);

		// 노드 4에 연결된 노드 정보 저장
		graph.get(4).add(3);
		graph.get(4).add(5);

		// 노드 5에 연결된 노드 정보 저장
		graph.get(5).add(3);
		graph.get(5).add(4);

		// 노드 6에 연결된 노드 정보 저장
		graph.get(6).add(7);

		// 노드 7에 연결된 노드 정보 저장
		graph.get(7).add(2);
		graph.get(7).add(6);
		graph.get(7).add(8);

		// 노드 8에 연결된 노드 정보 저장
		graph.get(8).add(1);
		graph.get(8).add(7);
	}

	// 위 함수들을 호출하고 그래프를 탐색하는 main 함수
	public static void main(String[] arg){
		initGraph();
		bfs(1);
	}
}
