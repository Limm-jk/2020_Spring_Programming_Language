package Recursion01;
import java.util.Scanner;
public class Recursion01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("input : ");
		int Num = sc.nextInt();
		// ���� 3/2�� �������� Ŀ��������.
		System.out.print("S"+Num+" = ("+recA(Num)+"/"+recB(Num)+")L");
	}
	public static int recA(int N) {//����
		if(N ==1) {
			return 3;//�ʱ��� �� S1 = 3
		}
		return 3*recA(N-1);//�ﰢ���� 3�� �þ�Ƿ� 3�� ���Ѵ�
	}
	public static int recB(int N) {//�и�
		if(N == 1) {
			return 1;//�ʱ⿡ S1 = 3�̹Ƿ� 1
		}
		return 2*recB(N-1);//�ﰢ���� ���� �������� �پ��Ƿ� 2�� ������.
	}
}