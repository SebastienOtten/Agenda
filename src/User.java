import java.util.ArrayList;

public class User {

		//Attributs de la classe
			private String userfirstname ; 
			private String userlastname ;
			ArrayList<Event> events = new ArrayList<Event>();
			ArrayList<Contact> contacts = new ArrayList<Contact>(); 
			
		//constructeur
			public User() {
			}
	
		//	Getters
			public String getfirstname() {
				return userfirstname;
			}
			public String getlastname() {
				return userlastname;
			}
	
			public ArrayList<Contact> getContacts() {
				return contacts;
			}
			public ArrayList<Event> getEvents() {
				return events;
			}
			
		//Setters
			public void setFirstname(String firstname) {
				this.userfirstname = firstname;
			}
			public void setLastname(String lastname) {
				this.userlastname = lastname;
			}
			public void setContacts(ArrayList<Contact> contacts) {
				this.contacts = contacts;
			}
			public void setEvents(ArrayList<Event> events) {
				this.events = events;
			}
}
