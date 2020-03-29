import java.io.*;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionLinkedList list = new RecursionLinkedList();
		RecursionLinkedList list2 = new RecursionLinkedList();
		FileReader fr;
		try {
			fr = new FileReader("./hw01.txt");
			BufferedReader br = new BufferedReader(fr);
			String inputString = br.readLine();
			for(int i = 0; i < inputString.length(); i++) {
				list.add(inputString.charAt(i));
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(list.toString());
		System.out.println(list.size());
		list.add(3,'b');
		System.out.println(list.toString());
		System.out.println(list.get(3));
		list.remove(3);
		System.out.println(list.toString());
		list2.add('v');
		list2.add('e');
		list2.add('r');
		list2.add('y');
		list.addAll(list2);
		System.out.println(list.toString());
		System.out.println(list.size());
		list.size();
		System.out.println(list.toString());
		list.reverse();
		System.out.println(list.toString());
	}

}
