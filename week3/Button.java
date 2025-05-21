package week3;

public class Button extends WebElement{
	public void submit()
	{
		System.out.println("anotherpage");
	}
public static void main(String[] args) {
	Button b=new Button();
	b.click();
	b.submit();
	b.settext(" ");
}
}
