package tasks;

public class Enode {
 
	int emp_id;
	String name;
	String gender;
	double salary;
	Enode next;
	
	Enode(int emp_id, String name, String gender, double salary) {
	
		this.emp_id = emp_id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
		next = null;
	}

	
	
}
