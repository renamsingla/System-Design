package templateMethodPattern;

public class Conctrete_User extends Record{

	private String user_name;

	public Conctrete_User(String name) {
		// TODO Auto-generated constructor stub
		this.user_name= name;
	}

	@Override
	public boolean validate() {
		// TODO Auto-generated method stub
		if(user_name.length()>1) {
			return true;
		}
		return false;
	}
	
	public void beforeSave() {
		//before saving we can authenticating , by sending an otp
		//it is optional- since it is hook , we can still leave it empty 
	}
}
