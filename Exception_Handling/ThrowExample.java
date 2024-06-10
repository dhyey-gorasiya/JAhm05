package Exception_Handling;

public class ThrowExample {
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int num) {
		try {
				if(num %2 == 0) {
						throw new Exception();
				}
				this.number = num;
		}
		catch(Exception e){
			System.out.println("Number can't be Even...!");
		}
	}
}
