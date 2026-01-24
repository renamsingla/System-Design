package templateMethodPattern;

public class User_System {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conctrete_User user1= new  Conctrete_User("abc");
		user1.save();
		
		Conctrete_User user2= new  Conctrete_User("");
		user2.save();
	}

}
