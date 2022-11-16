import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Node{
	int index;
	int value;
	
	//생성자
	Node(int index, int value) {
		this.index = index;
		this.value = value;
	}
}

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//출력을 버퍼에 넣고 한번에 출력하기위해 BufferedWriter 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());// 슬라이딩 윈도우 크기
		Deque<Node> mydeque = new LinkedList<>(); 
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) { //덱에 하나씩 확인하며 저장하기 때문에 하나만 받아줌
			int now = Integer.parseInt(st.nextToken()); //새로운 값이 들어올 때마다 정렬 대신 현재 수 보다 큰 값을 덱에서 제거 -> 시간복잡도 줄임
	
			while(!mydeque.isEmpty() && mydeque.getLast().value > now) { //마지막 덱에서 값을 가져와 비교. 덱안의 값이 크면 => !!비어있지않을경우에만 같이 체크해주기!!
				mydeque.removeLast(); //마지막에 있는 덱 제거
			}
			mydeque.addLast(new Node(i, now)); // node객체 생성해서 인덱스와 값을 초기화해추고 덱에 저장
			
			//인덱스 범위 확인 -> 범위에서 벗어난 인덱스는 덱에서 제거
			if((mydeque.getLast().index - L) >= mydeque.getFirst().index) { //인덱스 범위가 슬라이딩 윈도우 범위를 벗어나면
				//mydeque.getLast().index 는 i로 변경가능 -> 젤 마지막에 들어간 값이 방금넣은 값, 즉 인덱스는 i
				mydeque.removeFirst();//앞에 있는 덱 제거
			}
			
//			System.out.println(mydeque.getFirst().value);// 덱에 담긴 첫번째 값을 가져옴 -> 최소값
			bw.write(mydeque.getFirst().value+" ");//담아두기
		}
		bw.flush(); //한번에 출력
		bw.close();
		
	}
}
