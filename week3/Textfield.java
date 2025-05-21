package week3;

public class Textfield extends WebElement{
	public void gettext()
	{
		System.out.println("Title");
	}
public static void main(String[] args) {
	Textfield field=new Textfield();
	field.click();
	field.gettext();
	field.settext(" ");
}
}
