//package toytoy;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class test3 {
//    public static void main(String[] args) {
//        // 테스트용 데이터를 만듭니다.
//        ArrayList boardList = new ArrayList();
//        boardList.add(new Board(1, "홍길동", "2016-01-02"));
//        boardList.add(new Board(2, "아무개", "2017-03-05"));
//        boardList.add(new Board(3, "김영희", "2015-12-15"));
//        boardList.add(new Board(4, "김철수", "2016-10-05"));
//
//        // 두 번째 인자로 Comparator 객체를 익명객체로 만들어서 넘깁니다.
//        Collections.sort(boardList, new Comparator<Board>() {
//            @Override
//            public int compare(Board b1, Board b2) {
//                return b1.getDate().compareTo(b2.getDate());
//            }
//        });
//
//        // 결과를 출력합니다.
////        for(Board board : boardList) {
////            System.out.println(board);
////        }
//    }
//}
//
//// 이번에는 저장될 객체가  Comparable 인터페이스를 구현하지 않습니다.
//class Board {
//	private int num;
//	private String name = "";
//	private String date = "";
//	
//	public Board(int num, String name, String date) {
//		this.num = num;
//		this.name = name;
//		this.date = date;
//	}
//	
//	public void setNum(int num) { this.num = num; }
//	public int getNum() { return this.num; }
//	public void setname(String name) { this.name = name; }
//	public String getName() { return this.name; }
//	public void setDate(String date) { this.date = date; }
//	public String getDate() { return this.date; }
//	
//	public String toString() {
//		StringBuilder sb = new StringBuilder();
//		sb.append(this.num).append(" : ");
//		sb.append(this.name).append(" : ");
//		sb.append(this.date);
//		return sb.toString();
//	}
//}
