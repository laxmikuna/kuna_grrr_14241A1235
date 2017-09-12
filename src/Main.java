public class Main {

	public static void main(String[] args) {

StudentGroup obj=new StudentGroup();
Scanner s=new Scanner(System.in);
String students[]=new String[n];
int n=s.nextInt();
obj.setStudents(students);
System.out.println("eneter the index");
int index=s.nextInt();
obj.getStudent(index);
System.out.println("enter the string");
String abc=s.next();
System.out.println("enter the index");
int index4=s.nextInt();
obj.setStudent(abc,index4);
System.out.println("enter the string which you want to insert at the beginning of array");
String abc1=s.next();
obj.addFirst(abc1);
System.out.println("enter the string which you want to insert  at the end of array");
String abc2=s.next();
obj.addLast(abc2);
System.out.println("enter the index");
int index1=s.nextInt();
System.out.println("enter the string to be inserted");
String abc3=s.next();
obj.add(abc3,index1);

System.out.println("eneter the index where you want to delete the element");
int index2=s.nextInt();
obj.remove(index2);
		//You may test that your code works find here
		//Please check that your code works and has no
		//compilation problems before to submit
	}

}
