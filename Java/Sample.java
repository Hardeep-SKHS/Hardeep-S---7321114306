import java.util.*;
	public class Sample{
		public static void main(String args[]){
			int employeeId;
			String employeeName;
			float employeeSalary;
		Scanner sss = new Scanner(System.in);
			System.out.println("Enter employee Id: ");
				employeeId = sss.nextInt();
			System.out.println("Enter employee Name: ");
				employeeName = sss.next();
			System.out.println("Enter employee Salary: ");
				employeeSalary = sss.nextFloat();

		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+employeeSalary);
	}
}