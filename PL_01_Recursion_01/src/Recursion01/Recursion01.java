package Recursion01;
import java.util.Scanner;
public class Recursion01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int Num = sc.nextInt();
		// 값은 3/2씩 등비수열로 커져나간다.
		System.out.print("S"+Num+" = ("+recA(Num)+"/"+recB(Num)+")L");
	}
	public static int recA(int N) {//분자
		if(N ==1) {
			return 3;//초기일 때 S1 = 3
		}
		return 3*recA(N-1);//삼각형이 3배 늘어나므로 3을 곱한다
	}
	public static int recB(int N) {//분모
		if(N == 1) {
			return 1;//초기에 S1 = 3이므로 1
		}
		return 2*recB(N-1);//삼각형의 변이 절반으로 줄어드므로 2를 나눈다.
	}
}