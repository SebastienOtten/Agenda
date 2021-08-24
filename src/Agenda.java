import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	static Scanner scan = new Scanner(System.in); 
	static eventfactory factory1 = new eventfactory(); 
	static contactfactory factory = new contactfactory(); 
	static ArrayList<String> emails = new ArrayList<String>();
	public static void main(String[] args) {
	
	System.out.println("                  AGENDA              ");
	System.out.println("                  ******              ");
	System.out.println("D'abord, connecte toi � ton agenda.");
	System.out.println(" ");
	
	Menu(Connexion());
	
}
	
/*m�thodes*/
	
	
//m�thode permettant la connexion de l'utilisateur
private static User Connexion() {
	//d'abord on demande les infos n�cessaires
	System.out.println("Quel est ton pr�nom?");
	String userfirstname=scan.next();
	System.out.println("Quel est ton nom de famille ?");
	String userlastname=scan.next();
	
	
	//ensuite on cr�e une instance de la classe user avec ces infos
	User proprietaire =new User(); 
	proprietaire.setFirstname(userfirstname);
	proprietaire.setLastname(userlastname);
	System.out.println("Bienvenue dans ton agenda personnel, " +proprietaire.getfirstname() +" "+proprietaire.getlastname()+"!");
	return proprietaire;
	
}




//m�thode permettant d'afficher le menu principal
private static void Menu (User user) {
	 
	int choixutilisateur ; 
	System.out.println(" ");
	System.out.println("           MENU principal           ");
	System.out.println("           **************           ");
	System.out.println("Que souhaite tu faire ? ");
	System.out.println("Attention, avant tout �v�nement, pense � cr�er des contacts ");
	System.out.println("Pour faire un choix, tape le num�ro correspondant.");
	System.out.println("1) Cr�er un nouveau contact");
	System.out.println("2) Cr�er un nouvel �v�nement"); 
	System.out.println("3) Afficher la liste de mes contacts");
	System.out.println("4) Afficher la liste de mes �v�nements");
	System.out.println("5) Chercher un �v�nement par date");
	choixutilisateur=scan.nextInt(); 

	switch(choixutilisateur){
	   
    case 1: 
    	createContact(user);
        break;

    case 2:
    	createEvent(user);
        break;

    case 3:
    	listContact(user);
        break;
    
    case 4:
    	listEvent (user);
    	
    case 5:
    	DateEvent(user);
    default:
    	System.out.println("Le num�ro encod� est invalide. Veuillez faire un choix entre 1 et 5.");
        break;
}
	Menu(user);
	}
	





//m�thode permettant la cr�ation d'un contact
private static void createContact (User user) {
		
	//D'abord on r�cup�re ses infos
	int ContactType=0; 
	System.out.println("S�lectionnez le type de contact");
	System.out.println("1) Priv�");
	System.out.println("2) Professionnel");
	ContactType=scan.nextInt(); 
	Contact contact= factory.CreateContact(ContactType);
	
	System.out.println("Quel est le pr�nom de votre contact?"); 
		String Newfirstname=scan.next();

		System.out.println("Quel est le nom de famille de votre contact?"); 
		String Newlastname=scan.next();
		
		System.out.println("Quelle est son adresse mail ?"); 
		String NewEmail=scan.next();
		emails.add(NewEmail);
		  
		
		System.out.println("Quel est son num�ro de t�l�phone?");
		String NewPhone=scan.next(); 

		
	//Ensuite, on lie les infos en cr�ant l'instance de la classe contact
		contact.setfirstname(Newfirstname); 
		contact.setlastname(Newlastname); 
		contact.setEmail(NewEmail);
		contact.setPhone(NewPhone);	
		
		System.out.println("--> Nouveau contact cr�� !");
		System.out.println("Pr�nom : " + contact.getfirstname());
		System.out.println("Nom de famille: " + contact.getlastname());
		System.out.println(" Type : " + contact.getType() );
		System.out.println("Adresse mail : " + contact.getemail());
		System.out.println("Num�ro de t�l�phone : " +contact.getPhone()); 
		System.out.println("");

		user.getContacts().add(contact);
		Menu(user);
	}





//m�thode permettant la cr�ation d'un �v�nement
private static void createEvent (User user) {	
		
	//D'abord on r�cup�re ses infos
		System.out.println("Nous allons d�sormais cr�er un nouvel �v�nement, �tape par �tape");
		int EventType=0; 
		System.out.println("S�lectionnez le type de rendez-vous");
		System.out.println("1) R�union");
		System.out.println("2) Appel t�l�phonique");
		System.out.println("3) Vid�o conf�rence");
		EventType=scan.nextInt(); 
		Event event= factory1.CreateEvent(EventType);
		
		System.out.println("Pour commencer, quel est le nom de cet �v�nement ?");
		String NewName=scan.next();
		
		
		System.out.println("A quelle date aura-t-il lieu? (jj/mm/aaaa)");
		String NewDate=scan.next();

		System.out.println("A quelle heure aura-t-il lieu ? (hh:mm)");
		String NewHour=scan.next();
		
		System.out.println("D�crivez l'�v�nement en un mot");
		String NewDescription=scan.next();

		System.out.println("Quel est le pr�nom du contact li� ? ");
		String Newcontact=scan.next();
		
		System.out.println("Tapez son mail");
		String contactli�s=scan.next();
		if (!emails.contains(contactli�s)) {
				System.out.println("Ce mail n'appartient � aucun contact.");
				contactli�s = null;
				Newcontact = null;
				
			}
		
		
//Ensuite, on lie les infos en cr�ant l'instance de la classe event
		event.setName(NewName); 
		event.setDate(NewDate); 
		event.setHour(NewHour);
		event.setDescription(NewDescription);
		event.setContact(Newcontact);
		event.setContactli�s(contactli�s);
		
		
		System.out.println("--> Nouvel �v�nement cr�� !");
		System.out.println("Nom : " + event.getName());
		System.out.println(" Type : " + event.getType() );
		System.out.println(" Date : " + event.getDate());
		System.out.println(" Heure : " +event.getHour());
		System.out.println(" Description : " +event.getDescription()); 
		System.out.println(" Contact : " + event.getContact() + " mail : " + event.getContactli�s()); 
		System.out.println("");

		user.getEvents().add(event);
		Menu(user);
	}


//m�thode permettant l'affichage des contacts
private static void listContact(User user) {
	System.out.println("Voici la liste de vos contacts");
	System.out.println("******************************");
	ArrayList<Contact> list = user.getContacts();
	for (Contact contact : list) {
		System.out.println(contact.toString());
	}
	Menu(user);
}



//m�thode permettant l'affichage des �v�nements
private static void listEvent(User user) {
	System.out.println("Voici la liste de vos �v�nements");
	System.out.println("******************************");
	ArrayList<Event> list = user.getEvents(); 
	for (Event event : list) {
		System.out.println(event.toString());
	}	
	Menu(user);
}

//M�thode permettant de chercher les �v�nements par date

private static void DateEvent(User user) {
	System.out.println("Quelle date souhaitez-vous inspecter ? (jj/mm/aaaa)");
	String daterecherch�e=scan.next(); 
	ArrayList<Event> list = user.getEvents(); 
	for (Event event : list) {
		if (event.getDate().equals(daterecherch�e)) {
			System.out.println(event.toString());
		}
		else if (!event.getDate().equals(daterecherch�e)){
			
		}
	}	
	Menu(user);

}
}

	



