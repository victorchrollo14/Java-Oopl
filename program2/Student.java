package program2;

import java.util.Scanner;

public class Student {
	String USN, Name, Branch;
	long phoneNum;
	void insertRecord(String usn, String name, String branch, long phone) {
		USN = usn;
		Name = name;
		Branch = branch;
		phoneNum = phone;
	}
	
	void display() {
		System.out.println("Usn:"+USN + "\tName: "+ Name + "\tBranch: " + Branch
				+ "\tphoneNum:" + phoneNum);
	}
	
	public static void main(String[] args) {
		Student s[] = new Student[100];
		System.out.println("enter the number of students");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
			s[i] = new Student();
		
		for (int i = 0; i<n; i++) {
			System.out.printf("Enter the usn, name, branch and phone number of "
					+ "%dst student\n", (i+1));
			String Usn = sc.next();
			String name = sc.next();
			String branch = sc.next();
			long phone = sc.nextLong();
			s[i].insertRecord(Usn, name, branch, phone);
			
		}
		
		for (int i = 0; i<n; i++) {
			s[i].display();
		}
		
	}

}
