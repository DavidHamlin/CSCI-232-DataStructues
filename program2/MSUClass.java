package program2;




public class MSUClass {
    private String title;
    private String id;
    private int seats;
    private int sections;
	private String classType;
	

public MSUClass(String title,String id, int seats, String classType) {
    this.title = title;
    this.id = id;
    this.seats = seats;
    this.sections = 1;
    this.classType = classType;
    
}

//adds seats
public void addSeats(int new_seats) { 
    this.seats += new_seats;
}

//adds or removes number of sections
public void setSections(int sections) {
this.sections += sections;
}

//returns amount of sections
public int getSections() {
    return this.sections;
}

//returns amount of seats
public int getSeats() {
    return this.seats;
}

//returns if the class is a lecture or not
public boolean isLecture() {

	if (this.getLecture().equals("Lecture") || this.getLecture().equals("Seminar")) {
		return true;
	}
	else {
	return false;
	}
}

//returns the course ID
public String getID() {
	return this.id;
}

//returns if the class is a lecture or not
public String getLecture() {
	return this.classType;
}
//tostring uses String.format to make the table formatted
public String toString() {
    String str = String.format("%-11s %-9d  %-15d %-36s" ,this.id, this.sections, this.seats, this.title);
    return str;
}

}