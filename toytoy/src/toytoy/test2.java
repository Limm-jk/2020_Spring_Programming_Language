//package toytoy;
////package toytoy;
//
////
////
////import java.util.ArrayList;
////import java.util.Arrays;
////import java.util.Comparator;
////import java.util.List;
////import java.util.Scanner;
////
////public class main implements Comparable<Integer> {
////	public static void main(String[] args) {
////		// TODO Auto-generated method stub
////		
////		Scanner sc = new Scanner(System.in);
////		
////		int r = sc.nextInt();
////		int n = sc.nextInt();
////		
////		ArrayList<integer> ls = new ArrayList<>(); 
////		ls.
////	}
////
////	
////}
////class Descending implements Comparator<integer> {
////	 
////    @Override
////    public int compare(Integer o1, Integer o2) {
////        return o2.compareTo(o1);
////    }
//// 
////}
//// 
////// 오름차순
////class Ascending implements Comparator<integer> {
//// 
////    @Override
////    public int compare(Integer o1, Integer o2) {
////        return o1.compareTo(o2);
////    }
//// 
////}
//
//import java.util.*;
//
//public class test2 {
//	static class Participant implements Comparable<Participant> {
//       public String name;
//       public int score;
//       public int tries;
//       public int time;
//
//       public Participant(String name, int score, int tries, int time) {
//           this.name = name;
//           this.score = score;
//           this.tries = tries;
//           this.time = time;
//       }
//       @Override
//       public int compareTo(Participant o1) {
//    	   if(this.score > o1.score) {
//    		   return 1;
//    	   }
//    	   else if(this.score == o1.score) {
//    		   if(this.time < o1.time) {
//    			   return 1;
//    		   }
//    	   }
//    	   return -1;
//       }
////	@Override
////	public int compareTo(Object o) {
////		// TODO Auto-generated method stub
////		return 0;
////	}
//	}   
//   
//   public static void main(String[] args) {
//      
//      Scanner scan=new Scanner(System.in);
//
//      int N=scan.nextInt();
//      //int R=scan.nextInt();
//      System.out.println("fdfsdfs");
//      ArrayList<Participant> numbers = new ArrayList<>();
//      //Participant [] pt = new Participant[15];
//      for(int x=0; x<N; x++) {
//         String name=scan.next();
//         int score=scan.nextInt();
//         int tries=scan.nextInt();
//         int time=scan.nextInt();
//         Participant pa= new Participant(name, score, tries, time);
//         numbers.add(pa);
//      }
//      
//      Collections.sort(numbers);
//      
//      
//      for(int i = 0; i<N; i++) System.out.printf(numbers.get(i).name+numbers.get(i).score+numbers.get(i).tries+numbers.get(i).time+"\n");
//   }
//   
//}
