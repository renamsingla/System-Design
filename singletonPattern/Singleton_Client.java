package singletonPattern;

public class Singleton_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s= Singleton.getInstance();
		int ans=s.sum(10, 20);
		System.out.println(ans);
		
		Singleton s2= Singleton.getInstance();
		int ans2=s2.sum(100, 200);
		System.out.println(ans2);
	}

}
