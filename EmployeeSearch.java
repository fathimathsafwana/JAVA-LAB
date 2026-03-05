package safwana;
import java.util.Scanner;
class Employee{
	int eno;
	String ename;
	double esalary;
	
	void read(Scanner sc)
	{
		System.out.print("enter employee number:");
		eno=sc.nextInt();
		sc.nextLine();
		
		System.out.print("enter employee name");
		ename=sc.nextLine();
		
		System.out.print("enter employee salary");
		esalary=sc.nextDouble();
	}
	void display()
	{
		System.out.println("employee number:"+eno);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+esalary);
	}
}




public class EmployeeSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of employees:");
		int n=sc.nextInt();
		Employee[]emp=new Employee[n];
		for(int i=0;i<n;i++) {
			emp[i]=new Employee();
			System.out.println("\nenter details of employee:"+(i+1));
			emp[i].read(sc);
		}
		System.out.println("\nenter employee number to search:");
		int searchno=sc.nextInt();
		boolean found=false;
		for (int i=0;i<n;i++) {
			if(emp[i].eno==searchno) {
				System.out.println("\nemployee found.");
				emp[i].display();
				found=true;
				break;
				
			}
		}
		if(!found) {
			System.out.println("employee not found.");
		}
		sc.close();
	}

}
