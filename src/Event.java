public abstract class Event {

//Attributs de la classe
	private String name;
	private String type;
	private String date; 
	private String hour;
	private String description;
	private String contact;
	private String contactli�s;

//	Constructeur
public Event() {
}


//Getters

public String getName() {
	return name;
}
public String getType() {
	return type;
}
public String getDate() {
	return date;
}
public String getHour() {
	return hour;
}
public String getDescription() {
	return description;
}
public String getContact() {
	return contact;
}
public String getContactli�s() {
	return contactli�s;
}



//Setters

public void setName(String name) {
	this.name = name;
}
public void setType(String type) {
	this.type = type;
}
public void setDate(String date) {
	this.date = date;
}
public void setHour(String hour) {
	this.hour = hour;
}
public void setDescription(String description) {
	this.description = description;
}
public void setContactli�s(String contactli�s) {
	this.contactli�s = contactli�s;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return  " Ev�nement : "+this.name + " *** " + this.date +" *** "+this.hour+" *** Avec : "+this.contact;
}
}