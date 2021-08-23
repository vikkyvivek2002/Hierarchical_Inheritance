class Student2
{
	int rn;
	String name;
	Student2(int rn, String name )
	{
		this.rn = rn;
		this.name = name;
	}
	void Display1()
	{
		System.out.println("rollno = "+ rn);
		System.out.println("name = "+ name);
	}
}

class Marks extends Student2 // child 1
{
	int m1,m2;
	Marks(int rn , String name , int m1, int m2 )
	{
		super(rn,name );
		this.m1 = m1;
		this.m2 = m2;
		
	}
	void Display2()
	{
		System.out.println("marks 1 = "+ m1);
		System.out.println("marks 2 = "+ m2);
	}
}

class Marks2 extends Student2
{
	int m3,m4;
	Marks2(int rn , String name , int m3, int m4 )
	{
		super(rn,name );
		this.m3 = m3;
		this.m4 = m4;
		
	}
	void Display3()
	{
		System.out.println("marks 3 = "+ m3);
		System.out.println("marks 4 = "+ m4);
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Marks obj = new Marks(11,"sai",67, 68);
		obj.Display1();
		obj.Display2();
		Marks2 obj2 = new Marks2(11,"sai",56, 58);
		obj2.Display1();
		obj2.Display3();
	}

}
