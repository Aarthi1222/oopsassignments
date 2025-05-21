package week3;

public class radiobutton extends Button {
public void selectradiobutton()
{
	System.out.println(" radio button selected");
}
public static void main(String[] args) {
	radiobutton button=new radiobutton();
	button.click();
	button.selectradiobutton();
	button.settext(" ");
	button.submit();
}
}
