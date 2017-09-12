import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
try
{
if(students==null) throws IllegalArgumerntException
}
else
{
Scanner s=new Scanner(System.in);
int n=s.next;
for(i=0;i<n;i++)
{
student[i]=s.next();
}
	}
catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}

	@Override
	public Student getStudent(int index) {
	
	// Add your implementation here
try
{
      if(index<0 || index>students.length()) throws IllegalArgumentException


catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}

return null;
	}

	@Override
	public void setStudent(Student student, int index) 
{
try
{
if((student==null) ||(index<0 || index>student.length) throws IllegalArgumentException;
}
else
{

student[index]=student;
}
}

catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}

}

		// Add your implementation here
	

	@Override
	public void addFirst(Student student) {
try
{
if(student==null) throws IllegalArgumentException
else
{
for(i=0;i<=Student.length();i++)
{
Student[i+1]=Student[i];
}
Student[0]=student;
}

catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}


		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
try
{
if(students==null) throws IllegalArgumerntException

else
Student[Studen.length()]=student;
		// Add your implementation here
	}


catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}
}
	@Override
	public void add(Student student, int index) {
Student[index]=student;
for(i=index;i<=Student.length;i++)
{
Student[i+1]=Student[i];
		// Add your implementation here
	}
}

	@Override
	public void remove(int index) {
try
{
if(index<0 || index>=student.length) throws IllegalArgumentException;
}
else
{
for(int i=index;i<=Student.length;i++)
{
Student[i]=Student[i+1];
}
		// Add your implementation here

	}
catch(IllegalArgumentException e)
{
System.out.println("exception"+e);
}
}



	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
