//package Recursion01;
//
//import java.util.Scanner;
//
//public class Recursion02 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.print("input : ");
//		int Num = sc.nextInt();
//		
//		int [][] arr = new int [Num][Num];
//		
//		arrOne(Num-1,arr);//�糡�� 1�� ä���־� ����� ���̽��� ������ش�.
//		arrComp(Num-2,Num-1,arr);
//		
//		int blank = Blank(Num);
//		
//		printY(Num-1 ,Num-1, blank,arr);
//	}
//	
//	//�������迭 �����Լ�
//	public static void arrOne(int y, int [][] arr) {//�糡�� 1�� �־��ش�.
//		if(y==0) {
//			arr[y][y] = 1;
//			return;
//		}
//		
//		arrOne(y-1,arr);
//		arr[0][y] = 1;
//		arr[y][y] = 1;
//	}
//	public static int arrN(int x, int y, int [][] arr) {
//		//��͸� �̿��� ����������� x,y��ǥ�� 1�� �����س����鼭 �밢��ó�� ���� �޲��ش�
//		//������ �밢���� arrOne�Լ����� x,y�� ���� ��ġ�� 1�� ä����� ������� �����,
//		//�� ���Ĵ� ������ ������� �밢���� ���������� ��������.
//		if(x==1) {
//			arr[x][y] = arr[x-1][y-1] + arr[x][y-1];
//			return arr[x-1][y-1] + arr[x][y-1];
//		}
//		
//		arr[x][y] = arrN(x-1,y-1,arr) + arr[x][y-1];//���� ���� ������ �����ص� ��.
//		return arr[x-1][y-1] + arr[x][y-1];
//	}
//	public static void arrComp(int x, int y, int [][] arr) {
//		//���� ���� �밢������ ������� ä��������.
//		if(x == 0) return;
//		arrN(x,y,arr);
//		arrComp(x-1,y,arr);
//	}
//	
//	//����Լ�
//	public static void printX(int x, int y,int Bnum, int [][] arr) {
//		//X���� ���� ����Ѵ�. x,y�� ������ �������� x�� 0�̵Ǵ� �������� ��ͷ� ȸ���� ����س�����.
//		//printf�� %s���� ���̿� ������ �� �� �ִ� �� ó�� �˾Ҵ�... 
//		if (x == 0) {
//			System.out.printf("%"+Bnum+"s%"+Bnum+"s",arr[x][y]," ");
//			return;
//		}
//		printX(x-1,y,Bnum,arr);
//		System.out.printf("%"+Bnum+"s%"+Bnum+"s",arr[x][y]," ");
//	}
//	public static void printY(int total,int y,int Bnum, int[][] arr) {
//		//���� printX�Լ��� ȣ���Ͽ� ù�ٺ��� ä���ش�.
//		//total�� ��� ����� ���̰� ��Ͱ� �̷���� Y��, ������ ũ�⸦ ��Ÿ���ִ� Bnum���� ������ �����Ǿ� �ִ�.
//		if(y == 0) {
//			startBlank(Bnum, total-y);
//			printX(y,y,Bnum,arr);
//			System.out.println("");
//			return;
//		}
//		printY(total, y-1,Bnum,arr);
//		startBlank(Bnum, total-y);
//		printX(y,y,Bnum,arr);
//		System.out.println("");
//	}
//	
//	public static int Blank(int Num) {
//		if(Num <= 5) return 1;//1�ڸ����� ������
//		else if (Num <= 9) return 2;//2�ڸ������� ����
//		else if (Num <= 13) return 3;//3�ڸ������� ����
//		else if (Num <= 16) return 4;//4�ڸ������� ����
//		else return 5;
//		//20���� 5�ڸ������� �����ϰ� 21���ʹ� 6�ڸ� ������ �����ϸ� �ﰢ���� ��������
//		//�ǽ����� ���� 20������ ����� �ȴٰ� �����Ǿ����Ƿ� �� ���Ĵ� �����ϰ�..
//	}
//	public static void startBlank(int Bnum, int BlankLen) {
//		//��� ����� ���� ���ۺκ� ������ �������.
//		//Bnum�� �ϳ��� ��ũ ũ�⸦ ���ϰ� BlankLen�� ��ũ �� ���̸� ����
//		if(BlankLen == 0) return;
//		System.out.printf("%"+Bnum+"s"," ");
//		startBlank(Bnum, BlankLen-1);
//	}
//}
//
