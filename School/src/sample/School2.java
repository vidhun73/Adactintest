package sample;

public class School2 extends School {

	@Override
	void teaching() {
		System.out.println("i am teacher");
		
	}

	@Override
	void nonteaching() {
		System.out.println("i here");
		
	}
	  public static void main(String[] args) {
		School2 obj = new School2();
		obj.nonteaching();
		obj.kids();
		obj.teaching();
		
		
				
	}

}
