package beans;

public class Engine {

	private String engname;
	
	public void setEngname(String engname) {
		this.engname = engname;
	}
	public String getEngname() {
		return engname;
	}
	
	public void callEngine()
	{
		System.out.println("engine called");
	}
}
