package local_variable.demo;

public class LocalCheckMain {
	
	public static void main(String args[]) {
		int df =789;
		DemoInterface demoObj = new DemoInterface() {
			int cd=45;
			@Override
			public void get() {
				// TODO Auto-generated method stub
				System.out.println("INSIDE GET");
				System.out.println(cd);
			}
		};
		demoObj.get();
	}

	
	
	
}
