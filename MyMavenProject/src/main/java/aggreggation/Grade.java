package aggreggation;

public class Grade {

	String sub1;
	String sub2;
	String sub3;
	Student stud;
	Grade(String sub1,String sub2,String sub3,Student stud)
	{
	this.sub1=sub1;
	this.sub2=sub2;
	this.sub3=sub3;
	this.stud=stud;
	}
	public void show()
	{
		System.out.println(stud.name);
		System.out.println(stud.age);
		System.out.println(stud.std);
		System.out.println(sub1);
		System.out.println(sub2);
		System.out.println(sub3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj=new Student("appu",10,5);
Grade obj1=new Grade("English","hindi","malayalam",obj);
obj1.show();
	}
}
