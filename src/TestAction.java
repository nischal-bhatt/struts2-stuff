import com.opensymphony.xwork2.Action;

public class TestAction implements Action{

	String randomVar = SUCCESS;
	String message;
	String firstName;
	String dog = "mongrel";

	public String execute() {
		System.out.println("execute() method called");
		message = "generic Message";
		System.out.println("Name: " + firstName);
		return "welcome";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getDog() {
		return dog;
	}

	public void setDog(String dog) {
		this.dog = dog;
	}

}
