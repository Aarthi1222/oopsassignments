package week3;

public class checkboxbuutton extends Button {
	public void clickcheckbutton()
	{
		System.out.println("button is navigate to next page");
	}
	public static void main(String[] args) {
		checkboxbuutton check=new checkboxbuutton();
		check.click();
		check.clickcheckbutton();
		check.submit();
		
	}
}
