package program3;


public class MSUclass {
    private String title;
    private String id;

	private String prof;
	

public MSUclass(String title,String id, String prof) {
    this.title = title;
    this.id = id;
    this.prof = prof;
  
}


public String getTitle() {
	return this.title;
}

public String getProf() {
	return this.prof;
}
	
//returns the course ID
public String getID() {
	return this.id;
}


}