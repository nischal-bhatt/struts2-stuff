import com.opensymphony.xwork2.ActionSupport;

public class AnotherAction extends ActionSupport{

	  String nameOfPerson;
	  String gender;
	 public String execute()
	 {
		 System.out.println(nameOfPerson);
		 return "janumala";
	 }

	public String getNameOfPerson() {
		return nameOfPerson;
	}

	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	 
	 
}
