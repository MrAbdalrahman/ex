package lap7;
public class Checking extends Acount {
	public Checking (int id){
		this.id=id;
	}
	int overDraftLimit=1000;

	 public void withdrow(int amount){
			if (balance+1000>amount){
			balance-=amount;
		System.out.println(amount +" withdrawed successfully you balance now is"+balance);
			}
			else
				System.out.println("you acount balance is"+balance);
		}
	 public String toString() {
			return "checking"+super.toString();
}
}