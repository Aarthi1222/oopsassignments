package week3;

public class LoginTestData extends TestData {
	public void enterusername() {
		System.out.println("Meena");
	}
	public void enterpassword()
	{
		System.out.println("guygvf");
	}
	
public static void main(String[] args) {
	LoginTestData data=new LoginTestData();
	data.entercredentials();
	data.enterpassword();
	data.enterusername();
	data.navigatetohomepage();
}
}
