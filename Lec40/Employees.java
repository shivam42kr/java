package Lec40;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employees {

	String name;
	int salary;
	
	public Employees(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		Employees [] emp = new Employees[n];
		for(int i = 0; i < emp.length; i++) {
			String str = sc.next();
			int s = sc.nextInt();
			emp[i] = new Employees(str, s);
			
		}
		
		Arrays.sort(emp,new Comparator<Employees>() {
		
			@Override
			public int compare(Employees o1, Employees o2) {
				if(o1.salary == o2.salary) {
					return o1.name.compareTo(o2.name);
				}
				else {
					return o2.salary-o1.salary;
				}
			}
		});
		
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].salary>=x) {
				System.out.println(emp[i].name + " " + emp[i].salary);
			}
		}
	}
}
/*
input
79
4
Eve 78
Bob 99
Suzy 86
Alice 86
output
Bob 99
Alice 86
Suzy 86
*/
