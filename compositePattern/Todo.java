package compositePattern;
//leaf
public class Todo  implements Todo_List {
	
	String text;
	
	public Todo(String text) {
		this.text=text;
	}
	@Override
	//it should not return the <li> tag but just the text in it
	public String getHTML() {
		// TODO Auto-generated method stub
		return this.text;
	}

}
