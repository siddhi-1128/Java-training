class employee
{
	int esal;
	String ename,city,eno;
	employee(int esal){
		this.esal=esal;
	}
	void work(){
		System.out.println("Employee working on project A");
	}
	
	
	void addEmployee(String eno,String ename,String city){
		this.eno=eno;
		this.ename=ename;
		this.city=city;
	}
}
class HRmanager extends employee{
	HRmanager(){
		super(20000);
	}
	void work(){
		System.out.println("Let's meet today at 3 PM");
	}
	void getSalary(){
			System.out.println("Employee salary is "+esal);
	}
	void showEmployee(){
		System.out.println("Employee number is "+eno);
		System.out.println("Employee name is "+ename);
		System.out.println("Employee city is "+city);
	}
}
class que_oops{
	public static void main(String[] args) {
		employee e=new employee(30000);
		e.work();
		HRmanager h=new HRmanager();
		h.work();
		h.addEmployee("12012","Siddhi","Ratnagiri");
		h.showEmployee();
		h.getSalary();
	}
}