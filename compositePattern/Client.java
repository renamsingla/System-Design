package compositePattern;

import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Todo_List>todoList= new ArrayList<>();
		
		todoList.add(new Todo("play"));
		
		List<Todo_List>todoList2= new ArrayList<>();
		todoList2.add(new Todo("system design"));
		todoList2.add(new Todo("DSA"));
		todoList2.add(new Todo("web development"));
		todoList.add(new Project("study",todoList2));
		
		todoList.add(new Todo("dance"));
		
		
		for(Todo_List todoss: todoList) {
			System.out.println(todoss.getHTML());
		}

	}

}
