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
//		arrOne(Num-1,arr);//양끝을 1로 채워주어 계산할 베이스를 만들어준다.
//		arrComp(Num-2,Num-1,arr);
//		
//		int blank = Blank(Num);
//		
//		printY(Num-1 ,Num-1, blank,arr);
//	}
//	
//	//이차원배열 구성함수
//	public static void arrOne(int y, int [][] arr) {//양끝에 1을 넣어준다.
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
//		//재귀를 이용해 출발지점부터 x,y좌표를 1씩 감소해나가면서 대각선처럼 값을 메꿔준다
//		//최초의 대각선은 arrOne함수에서 x,y가 같은 위치를 1로 채운것을 기반으로 만들고,
//		//그 이후는 이전에 만들어진 대각선에 종속적으로 만들어나간다.
//		if(x==1) {
//			arr[x][y] = arr[x-1][y-1] + arr[x][y-1];
//			return arr[x-1][y-1] + arr[x][y-1];
//		}
//		
//		arr[x][y] = arrN(x-1,y-1,arr) + arr[x][y-1];//뒤의 값은 이전에 저장해둔 값.
//		return arr[x-1][y-1] + arr[x][y-1];
//	}
//	public static void arrComp(int x, int y, int [][] arr) {
//		//가장 끝의 대각선부터 순서대로 채워나간다.
//		if(x == 0) return;
//		arrN(x,y,arr);
//		arrComp(x-1,y,arr);
//	}
//	
//	//출력함수
//	public static void printX(int x, int y,int Bnum, int [][] arr) {
//		//X축을 먼저 출력한다. x,y가 동일한 지점부터 x가 0이되는 지점까지 재귀로 회귀후 출력해나간다.
//		//printf의 %s구문 사이에 변수가 들어갈 수 있는 지 처음 알았다... 
//		if (x == 0) {
//			System.out.printf("%"+Bnum+"s%"+Bnum+"s",arr[x][y]," ");
//			return;
//		}
//		printX(x-1,y,Bnum,arr);
//		System.out.printf("%"+Bnum+"s%"+Bnum+"s",arr[x][y]," ");
//	}
//	public static void printY(int total,int y,int Bnum, int[][] arr) {
//		//위의 printX함수를 호출하여 첫줄부터 채워준다.
//		//total은 계속 저장될 값이고 재귀가 이루어질 Y값, 공백의 크기를 나타내주는 Bnum등이 변수로 지정되어 있다.
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
//		if(Num <= 5) return 1;//1자리수만 존재함
//		else if (Num <= 9) return 2;//2자리수까지 존재
//		else if (Num <= 13) return 3;//3자리수까지 존재
//		else if (Num <= 16) return 4;//4자리수까지 존재
//		else return 5;
//		//20까지 5자리수까지 존재하고 21부터는 6자리 수까지 존재하며 삼각형이 무너지나
//		//실습설명 간에 20까지만 만들면 된다고 공지되었으므로 이 이후는 동일하게..
//	}
//	public static void startBlank(int Bnum, int BlankLen) {
//		//가운데 출력을 위해 시작부분 공백을 만들어줌.
//		//Bnum은 하나의 블랭크 크기를 말하고 BlankLen은 블랭크 총 길이를 말함
//		if(BlankLen == 0) return;
//		System.out.printf("%"+Bnum+"s"," ");
//		startBlank(Bnum, BlankLen-1);
//	}
//}
//
