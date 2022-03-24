public class HospitalEmployee {
protected String name;
protected int number;

public HospitalEmployee(String name, int number)
{
	this.name = name;
	this.number=number;
}
public String getname(){
	return name;
}

public void setname(String name) {
	this.name=name;
}
public void setnumber(int number)
{
	this.number=number;
}
public int getnumber() {
	return number;
}

public String toString() {
	return name+" "+number;
}

public void work()
{
	System.out.println(name + " works for the hospital");
}

public static void main(String args[])
{
	HospitalEmployee h= new HospitalEmployee("Vito", 123);
	Doctor d = new Doctor("Michael", 234, "Heart");
	boolean operating;
	Nurse n= new Nurse("Sonny789", 789, 6);
	Surgeon s=new Surgeon("Vincent",645, operating = true);
	System.out.println(h.toString());
	System.out.println(d.toString());
	System.out.println(n.toString());
	System.out.println(s.toString());
	h.work();
	d.work();
	n.work();
	s.work();
}
}

class Doctor extends HospitalEmployee{
	String specialty;
	public Doctor(String name, int number, String specialty) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.specialty = specialty;
	}
	public String toString()
	{
		return name+" "+number+" "+specialty;
	}
	
	public void work()
	{
		System.out.println(name+ " works for the hospital. ");
	}
	
}
class Nurse extends HospitalEmployee{
int numOfPatients;
	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.numOfPatients = numOfPatients;
	}
	public String toString()
	{
		return name+" "+number+" "+numOfPatients;
	}
	
	public void work()
	{
		System.out.println(name+ " works for the hospital. ");
	}
	
}

class Surgeon extends HospitalEmployee{
	boolean operating;
	public Surgeon(String name, int number, boolean operating) {
		super(name, number);
		this.operating=operating;
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
		if(operating == true)
		{
			return (name+" "+number+  "Brain Operating: true");
		}
		else
		{
			return (name+" "+number+ "BrainOperating: false");
		}
	}
	
	public void work()
	{
		System.out.println(name+ " works for the hospital. ");
	}
	
}
