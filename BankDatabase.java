// Author Visweswaran
import java.util.Scanner;


class Database
{
	static int memberNo=0;
	int accountNo[] = new int[100];
	String name[] = new String[100];
	double balance[] = new double[100];
}

class Member extends Database
{
	Member(int acc,String Name,double bal) // Every time an object is created new members for the bank will be created
	{
		accountNo[memberNo]=acc;
		name[memberNo]=Name;
		balance[memberNo]=bal;
		memberNo++;		
	}
	void displayDetails()
	{
		System.out.println("Name\t\tAccount NO\tBalance");
		for(int i=0;i<memberNo;i++)
		{
			System.out.println(name[i]+"\t "+accountNo[i]+"\t\t"+balance[i]);
		}
	}
}

class BankDatabase {
public static void main(String[] args) {
	System.out.println("Simple Bank Database in Java");
	Member member1 = new Member(1,"Visweswaran",100000);
	member1.displayDetails();
}
}
