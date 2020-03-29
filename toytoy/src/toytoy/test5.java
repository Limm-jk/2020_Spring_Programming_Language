package toytoy;

import java.util.*;

public class test5 {
	abstract static class Student implements Comparable<Student> {
		public static final String number = null;
		public String name;

		public Student(String name) {
			this.name = name;
		}
		
		
		@Override
		public int compareTo(Student o) {
			if (this.getClass() == o.getClass())
				return this.compare(o);
			else
				return this.getClass().toString().compareTo(o.getClass().toString());

		}

		public abstract int compare(Object o);

	}

	public static class human extends Student {

		String ban;
		String number;

		public human(String name, String ban, String number) {
	         super(name);
	         this.ban=ban;
	         this.number=number;
	      }

		public void printrint() {
			System.out.println(ban+" "+name+number);
		}



		@Override
		public int compare(Object o) {
			human ha = (human)o;
			int a = this.number.compareTo(ha.number);
			if (a != 0)
				return a;
			else {
				int c = this.name.compareTo(ha.name);
				return c;
			}
		}
	}

	public static class Robot extends Student{
      public Robot(String name, String ban, String number, String number2) {
         super(name);
         this.ban=ban;
         this.number=number;
         this.number2 = number2;
      }
      String ban;
      String number;
      String number2;
      

		public void printrint() {
			System.out.println(ban+name+number);
		}

      @Override
      public int compare(Object o) {
    	  Robot ro = (Robot)o;
    	  int a=this.number.compareTo(ro.number);
            if(a!=0) return a;
            else {
                  int b= this.number2.compareTo(ro.number2);
                  if(b!=0) return b;
                  else {
                	  int c= this.name.compareTo(ro.name);
                	  return c;
                  }
            }
      }

	}

      public static void main(String[] args) throws Exception{


         Scanner scan=new Scanner(System.in);

         int N=scan.nextInt();
         int R=scan.nextInt();

         ArrayList<Student> numbers = new ArrayList<>();

         for(int x=0; x<N; x++) {
            String ban=scan.next();
            String name=scan.next();
            String number=scan.nextLine();
            String number2="";
            String la = new String("A");
            if(ban == la) {
            	number2=scan.nextLine();
            	//Student a= new Robot(name, ban, number, number2);
            	numbers.add(new Robot(name, ban, number, number2));
            }
            
            else {
               //Student b = new human(name, ban, number);
               numbers.add(new human(name, ban, number));
            }
         }

         Collections.sort(numbers);

         ((human)numbers.get(1)).printrint();
         
      }
   }