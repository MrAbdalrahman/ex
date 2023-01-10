package lap7;
import java.util.*;
public class Driver {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
ArrayList<Acount> acounts=new ArrayList<>();
int choice,tempId,i;
boolean exists=false;
do{	
System.out.println("please choos an operation");
		System.out.println("1-create a new saving acount");
		System.out.println("2-create a new checking acount");
		System.out.println("3-deposite");
		System.out.println("4-withdraw");
		System.out.println("5-show acount info");
		System.out.println("6-exit");
		choice=scan.nextInt();
		scan.nextLine();
		switch(choice){
		case 1: 
				System.out.println("enter your id");
acounts.add(new Saving(scan.nextInt()));
		scan.nextLine();
		break;
		case 2:				System.out.println("enter your id");
acounts.add(new Checking(scan.nextInt()));
		scan.nextLine();
		break;
		case 3:
			exists=false;
			System.out.println("please enter your id");
			tempId=scan.nextInt();
			for (i=0;i<acounts.size();i++){
				if (tempId==acounts.get(i).getId()){
					exists=true;
					break;
				}
			}
		if (exists){
		System.out.println("eneter the amoutn");
			acounts.get(i).deposit(scan.nextInt());
				scan.nextLine();
		}
		else 
			System.out.println("acount does not exist");
		break;
		case 4:
			exists=false;
			System.out.println("please enter your id");
			tempId=scan.nextInt();
			for (i=0;i<acounts.size();i++){
				if (tempId==acounts.get(i).getId()){
					exists=true;
					break;
				}
			}
		if (exists){
		System.out.println("eneter the amoutn");
			acounts.get(i).withdrow(scan.nextInt());
				scan.nextLine();
		}
		else 
			System.out.println("acount does not exist");
		break;
		case 5:
			exists=false;
			System.out.println("please enter your id");
			tempId=scan.nextInt();
			for (i=0;i<acounts.size();i++){
				if (tempId==acounts.get(i).getId()){
					exists=true;
					break;
				}					

			}
		if (exists){
		System.out.println(acounts.get(i).toString());
		}
		else 
			System.out.println("acount does not exist");
		break;
		}
		}while(choice!=6);
scan.close();		
	}
}