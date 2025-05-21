package week3;

public class javaconnection implements Databaseconnection {
	public void connect()
	{
		System.out.println("connect network");
	}
	public void disconnect()
	{
		System.out.println("disconnect network");
	}
	public void executeupdate()
	{
		System.out.println("update the status");
	}
	public void track()
	{
		System.out.println("track the place");
	}
public static void main(String[] args) {
	javaconnection j=new javaconnection();
	j.connect();
	j.disconnect();
	j.executeupdate();
	j.track();
}
}
