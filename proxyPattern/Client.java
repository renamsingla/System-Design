package proxyPattern;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISubject subject= new Proxy("abcdef2345y");
		
		int ans=subject.request();
		System.out.println(ans);
	}

}
