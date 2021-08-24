public abstract class Event {

//Attributs de la classe
	private String name;
	private String type;
	private String date; 
	private String hour;
	private String description;
	private String contact;
	private String contactliés;

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
public String getContactliés() {
	return contactliés;
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
public void setContactliés(String contactliés) {
	this.contactliés = contactliés;
}
public void setContact(String contact) {
	this.contact = contact;
}
@Override
public String toString() {
	return  " Evènement : "+this.name + " *** " + this.date +" *** "+this.hour+" *** Avec : "+this.contact;
}
}