package proxyPattern;

public class Proxy implements ISubject{
	
	//to keep track whether we have instantiated the Subject, we have reference variable
	private Subject subject=null;
	private String s=null;
	
	//constructor
	public Proxy(String str) {
		this.s= str;
	}
	@Override
	public int request() {
		// TODO Auto-generated method stub
		if(this.subject==null) {
			this.subject= new Subject(this.s);
		}
		return subject.request();
	}

}
