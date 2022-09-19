import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); //bufferedReader로 입력받기(한줄통째로 입력받음)
		StringTokenizer st = new StringTokenizer(bfr.readLine());//(자를값,"기준")을 넣어줌. 기준이 공백일 경우 생략
		int A = Integer.parseInt(st.nextToken()); // 낮동안 올라가는 미터, stringTokenizer은 string기준이라 형변환필수
		int B = Integer.parseInt(st.nextToken()); // 저녁동안 떨어지는 미터
		int V = Integer.parseInt(st.nextToken()); // 전체 나무 길이
		
		int day = (int) Math.ceil((double)(V-B)/(A-B)); // 올라가는데 걸린일
		System.out.println(day);
	}
}
