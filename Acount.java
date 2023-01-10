package lap7;
import java.util.Date;
public class Acount {
protected int id;
protected double balance;
protected Date dateCreated;
protected static int count=0;
public Acount(int id) {
	this.id = id;
	count++;
}
public Acount(int id, double balance) {
	this.id = id;
	this.balance = balance;
	this.dateCreated = new Date();
	count++;
}
public Acount() {
	this.id = 0;
	this.balance = 0;
	this.dateCreated =  new Date();
	count++;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Date getDateCreated() {
	return dateCreated;
}
public void withdrow(int amount){
	if (balance>amount){
	balance-=amount;
System.out.println(amount +" withdrawed successfully/t you balance now is"+balance);
	}
	else 
		System.out.println("you acount balance is"+balance);
}
public void deposit(int amount){
	balance+=amount;
	System.out.println("your balance now is "+balance);
}
public boolean equals(Acount A2){
if (this.id==A2.getId())	
return true;
return false;
}
public String toString() {
	return "Acount [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
}
}