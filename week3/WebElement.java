package week3;

public class WebElement {
	public void settext(String outfit) {
		System.out.println("t-shirt");
	}
	public void click() {
		System.out.println("nextpage");
	}
	
public static void main(String[] args) {
	WebElement element=new WebElement();
	element.click();
	element.settext(" ");
}
}
