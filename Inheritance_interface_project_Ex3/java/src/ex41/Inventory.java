package ex41;

import java.util.Scanner;
public class Inventory {

 mobile[] bs;

 Scanner scan=new Scanner(System.in);

 public void add()

 {

	 System.out.println("Enter no.of.mobiles:");

	 int n=scan.nextInt();

	 bs=new mobile[n];

	 for(int i=0;i<bs.length;i++)

	 {

		 bs[i]=new mobile();

		 System.out.println("Enter Mobiles+details["+i+"]");

		 bs[i].setmobilename(scan.next());

		 bs[i].setmobileid(scan.nextInt());

		 bs[i].setAvail(scan.next()+scan.nextLine());

		 bs[i].setPrice(scan.nextInt());

	 }

	 System.out.println("Added");

 }

public void show() {

	for(int i=0;i<bs.length;i++)

	{

		System.out.println(bs[i].toString());

	}

	

}

}





