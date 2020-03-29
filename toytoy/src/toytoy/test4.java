//import java.util.*;
//
//public class test4 {
//	abstract class Student implements Comparable<Student> {
//		public String name;
//
//		public Student(String name) {
//			this.name = name;
//		}
//
//		@Override
//		public int compareTo(Student o) {
//			if (this.getClass() == o.getClass())
//				return this.compare(o);
//			else
//				return this.getClass().toString().compareTo(o.getClass().toString());
//
//		}
//
//		public abstract int compare(Object o);
//
//	};
//
//	public static class input extends Student {
//		public input(String name) {
//			super(null);
//		}
//		String name;
//		String ban;
//		String number;
//		String number2;
//		@Override
//		public int compare(Object o) {
//			// TODO Auto-generated method stub
//			return 0;
//		}
//	}
//
//	public String getName(input o) {
//		return o.name;
//	}
//
//	public String getNumber(input o) {
//		return o.number;
//	}
//
//	public String getNumber2(input o) {
//		return o.number2;
//	}
//
//	public static void main(String[] args) throws Exception {
//
//		Scanner scan = new Scanner(System.in);
//
//		int N = scan.nextInt();
//		int R = scan.nextInt();
//
//		ArrayList<Student> numbers = new ArrayList<>();
//
//		for (int x = 0; x < N; x++) {
//			String ban = scan.next();
//			String name = scan.next();
//			String number = scan.nextLine();
//			String number2 = "";
//
//			if (ban == "A")
//				number2 = scan.nextLine();
//
//			input pa = new input(name, ban, number, number2);
//			numbers.add(pa);
//
//		}
//
//		Collections.sort(numbers);
//
//		Collections.sort(numbers, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				int a = o1.getNumber().compareTo(o2.getNumber());
//				if (a != 0)
//					return a;
//				else {
//					if (o1.ban == "A") {
//						int b = o1.getNumber2().compareTo(o2.getNumber2());
//						if (b != 0)
//							return b;
//					}
//
//					int c = o1.getName().compareTo(o2.getName()); // ÀÌ¸§¼ø
//					return c;
//				}
//			}
//		});
//
//		System.out.print(numbers.get(R - 1));
//	}
//
//}
