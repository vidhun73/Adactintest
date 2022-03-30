package sample;

public class Kinderscholl implements Schl{

	@Override
	public void eng() {
		System.out.println("eng");
		
	}

	@Override
	public void mba() {
		System.out.println("mba");
		
	}

	@Override
	public void maths() {
		System.out.println("maths");
		
	}

	@Override
	public void ten() {
		System.out.println("10");
		
	}

	@Override
	public void five() {
		System.out.println("eng");
		
	}

	@Override
	public void three() {
		System.out.println("eng");
		
	}
	public void methodA() {
		System.out.println("im here");
	}
	
	
	public static void main(String[] args) {
		Kinderscholl obj = new Kinderscholl();
		obj.methodA();
		obj.eng();
		obj.mba();
		obj.maths();
		obj.ten();
		obj.five();
		obj.three();
	}
}


