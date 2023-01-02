	package com.dao;
	import java.util.Arrays;
	import java.util.Scanner;
	import com.pojo.Employee;

	public class EmployeeOperation1 {
		
		Employee emp[]= new Employee[3];
		Scanner sc= new Scanner(System.in);

		public void insertEmployee(){
			
			System.out.println("Enter the id, name, dept, salary to insert the data: ");
			int id=sc.nextInt();
			String name=sc.next();
			String dept=sc.next();
			int salary=sc.nextInt();
			
			Employee e= new Employee();
			e.setId(id);
			e.setName(name);
			e.setDept(dept);
			e.setSalary(salary);
			
			for(int i=0; i<emp.length; i++)
			{
				if(emp[i]==null)
				{
					emp[i]=e;
					break;
				}
			}
		}
		
		
		public void displayEmployeeData()
		{
			System.out.println("Display the insert data: ");
			System.out.println(Arrays.toString(emp));
		}
		
		public void updateSalaryEmployeeData()
		{
			System.out.println("Enter the employee id, updateSalary to upadate the employee data.");
			int id=sc.nextInt();
			int salary= sc.nextInt();
			
			for(Employee e:emp)
			{
				if(e!=null)
				{
					if(e.getId()==id )
					{
						e.setSalary(salary);
					}
				}
			}
				
		}
		
		public void deleteEmployee()
		{
			Employee e[]= new Employee[emp.length];
			System.out.println("Enter the id to delete employee data: ");
			int id=sc.nextInt();
			
			int  index=0;		
			for(int i=0; i<emp.length; i++)
			{
				if(emp[i]!=null)
				{
					if(emp[i].getId()==id)
					{
						index=i;
					}
				}
			}
			int j=0;
			for(int i=0;i<emp.length;i++)
			{
				if(i==index)
				{
					continue;
				}
				else
				{
					e[j]=emp[i];
					j++;
				}
			}
			for(int i=0;i<e.length;i++)
			{
				emp[i]=e[i];
			}
			
		}  		
		
	}  



