package compositePattern;

import java.util.List;

//composite
public class Project implements Todo_List{
	
	String title;
	
	List<Todo_List> Todos; //has-a  relationship
	
	public Project(String title, List<Todo_List> Todos) {
		this.Todos= Todos;
		this.title= title;
	}
	
	@Override
	public String getHTML() {
		// TODO Auto-generated method stub
		
		String html= this.title;
		html= html+"<ul>";
		for(Todo_List item: this.Todos) {
			html=html+"<li>";
			String body=item.getHTML();  
			html+=body;
			html=html+"</li>";
		}
		html= html+"</ul>";
		return html;
	}

}
