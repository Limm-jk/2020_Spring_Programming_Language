//package toytoy;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class test3 {
//    public static void main(String[] args) {
//        // �׽�Ʈ�� �����͸� ����ϴ�.
//        ArrayList boardList = new ArrayList();
//        boardList.add(new Board(1, "ȫ�浿", "2016-01-02"));
//        boardList.add(new Board(2, "�ƹ���", "2017-03-05"));
//        boardList.add(new Board(3, "�迵��", "2015-12-15"));
//        boardList.add(new Board(4, "��ö��", "2016-10-05"));
//
//        // �� ��° ���ڷ� Comparator ��ü�� �͸�ü�� ���� �ѱ�ϴ�.
//        Collections.sort(boardList, new Comparator<Board>() {
//            @Override
//            public int compare(Board b1, Board b2) {
//                return b1.getDate().compareTo(b2.getDate());
//            }
//        });
//
//        // ����� ����մϴ�.
////        for(Board board : boardList) {
////            System.out.println(board);
////        }
//    }
//}
//
//// �̹����� ����� ��ü��  Comparable �������̽��� �������� �ʽ��ϴ�.
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
