package week3.Assignments.Assignement3;

public class Automation extends MultipleLanguage implements Language, TestTool {

	@Override
	public void Java() {
		System.out.println("This is Java");
		
	}

	@Override
	public void Selenium() {
		System.out.println("This is Selenium");
		
	}
	
	public static void main(String[] args) {
		Automation ab = new Automation();
		ab.python();
		ab.ruby();
		ab.Selenium();
		ab.Java();
	}
	
	
	

}
