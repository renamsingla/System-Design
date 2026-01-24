package templateMethodPattern;

public abstract class Record {
	
	public void save() { 
		boolean ans=this.validate(); //abstract operation
		if(ans) {
			this.beforeSave(); //hook
		}else {
			System.out.println("not able to validate the data");
			//throw error
			return;
		}
		System.out.println("saved to databse");
		//saves to database
	}
	
	public abstract boolean validate();
	public void beforeSave() {
		//we are keeping it empty
	}
}
