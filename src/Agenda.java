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
	System.out.println("D'abord, connecte toi à ton agenda.");
	System.out.println(" ");
	
	Menu(Connexion());
	
}
	
/*méthodes*/
	
	
//méthode permettant la connexion de l'utilisateur
private static User Connexion() {
	//d'abord on demande les infos nécessaires
	System.out.println("Quel est ton prénom?");
	String userfirstname=scan.next();
	System.out.println("Quel est ton nom de famille ?");
	String userlastname=scan.next();
	
	
	//ensuite on crée une instance de la classe user avec ces infos
	User proprietaire =new User(); 
	proprietaire.setFirstname(userfirstname);
	proprietaire.setLastname(userlastname);
	System.out.println("Bienvenue dans ton agenda personnel, " +proprietaire.getfirstname() +" "+proprietaire.getlastname()+"!");
	return proprietaire;
	
}




//méthode permettant d'afficher le menu principal
private static void Menu (User user) {
	 
	int choixutilisateur ; 
	System.out.println(" ");
	System.out.println("           MENU principal           ");
	System.out.println("           **************           ");
	System.out.println("Que souhaite tu faire ? ");
	System.out.println("Attention, avant tout évènement, pense à créer des contacts ");
	System.out.println("Pour faire un choix, tape le numéro correspondant.");
	System.out.println("1) Créer un nouveau contact");
	System.out.println("2) Créer un nouvel évènement"); 
	System.out.println("3) Afficher la liste de mes contacts");
	System.out.println("4) Afficher la liste de mes évènements");
	System.out.println("5) Chercher un évènement par date");
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
    	System.out.println("Le numéro encodé est invalide. Veuillez faire un choix entre 1 et 5.");
        break;
}
	Menu(user);
	}
	





//méthode permettant la création d'un contact
private static void createContact (User user) {
		
	//D'abord on récupère ses infos
	int ContactType=0; 
	System.out.println("Sélectionnez le type de contact");
	System.out.println("1) Privé");
	System.out.println("2) Professionnel");
	ContactType=scan.nextInt(); 
	Contact contact= factory.CreateContact(ContactType);
	
	System.out.println("Quel est le prénom de votre contact?"); 
		String Newfirstname=scan.next();

		System.out.println("Quel est le nom de famille de votre contact?"); 
		String Newlastname=scan.next();
		
		System.out.println("Quelle est son adresse mail ?"); 
		String NewEmail=scan.next();
		emails.add(NewEmail);
		  
		
		System.out.println("Quel est son numéro de téléphone?");
		String NewPhone=scan.next(); 

		
	//Ensuite, on lie les infos en créant l'instance de la classe contact
		contact.setfirstname(Newfirstname); 
		contact.setlastname(Newlastname); 
		contact.setEmail(NewEmail);
		contact.setPhone(NewPhone);	
		
		System.out.println("--> Nouveau contact créé !");
		System.out.println("Prénom : " + contact.getfirstname());
		System.out.println("Nom de famille: " + contact.getlastname());
		System.out.println(" Type : " + contact.getType() );
		System.out.println("Adresse mail : " + contact.getemail());
		System.out.println("Numéro de téléphone : " +contact.getPhone()); 
		System.out.println("");

		user.getContacts().add(contact);
		Menu(user);
	}





//méthode permettant la création d'un évènement
private static void createEvent (User user) {	
		
	//D'abord on récupère ses infos
		System.out.println("Nous allons désormais créer un nouvel évènement, étape par étape");
		int EventType=0; 
		System.out.println("Sélectionnez le type de rendez-vous");
		System.out.println("1) Réunion");
		System.out.println("2) Appel téléphonique");
		System.out.println("3) Vidéo conférence");
		EventType=scan.nextInt(); 
		Event event= factory1.CreateEvent(EventType);
		
		System.out.println("Pour commencer, quel est le nom de cet évènement ?");
		String NewName=scan.next();
		
		
		System.out.println("A quelle date aura-t-il lieu? (jj/mm/aaaa)");
		String NewDate=scan.next();

		System.out.println("A quelle heure aura-t-il lieu ? (hh:mm)");
		String NewHour=scan.next();
		
		System.out.println("Décrivez l'évènement en un mot");
		String NewDescription=scan.next();

		System.out.println("Quel est le prénom du contact lié ? ");
		String Newcontact=scan.next();
		
		System.out.println("Tapez son mail");
		String contactliés=scan.next();
		if (!emails.contains(contactliés)) {
				System.out.println("Ce mail n'appartient à aucun contact.");
				contactliés = null;
				Newcontact = null;
				
			}
		
		
//Ensuite, on lie les infos en créant l'instance de la classe event
		event.setName(NewName); 
		event.setDate(NewDate); 
		event.setHour(NewHour);
		event.setDescription(NewDescription);
		event.setContact(Newcontact);
		event.setContactliés(contactliés);
		
		
		System.out.println("--> Nouvel évènement créé !");
		System.out.println("Nom : " + event.getName());
		System.out.println(" Type : " + event.getType() );
		System.out.println(" Date : " + event.getDate());
		System.out.println(" Heure : " +event.getHour());
		System.out.println(" Description : " +event.getDescription()); 
		System.out.println(" Contact : " + event.getContact() + " mail : " + event.getContactliés()); 
		System.out.println("");

		user.getEvents().add(event);
		Menu(user);
	}


//méthode permettant l'affichage des contacts
private static void listContact(User user) {
	System.out.println("Voici la liste de vos contacts");
	System.out.println("******************************");
	ArrayList<Contact> list = user.getContacts();
	for (Contact contact : list) {
		System.out.println(contact.toString());
	}
	Menu(user);
}



//méthode permettant l'affichage des évènements
private static void listEvent(User user) {
	System.out.println("Voici la liste de vos évènements");
	System.out.println("******************************");
	ArrayList<Event> list = user.getEvents(); 
	for (Event event : list) {
		System.out.println(event.toString());
	}	
	Menu(user);
}

//Méthode permettant de chercher les évènements par date

private static void DateEvent(User user) {
	System.out.println("Quelle date souhaitez-vous inspecter ? (jj/mm/aaaa)");
	String daterecherchée=scan.next(); 
	ArrayList<Event> list = user.getEvents(); 
	for (Event event : list) {
		if (event.getDate().equals(daterecherchée)) {
			System.out.println(event.toString());
		}
		else if (!event.getDate().equals(daterecherchée)){
			
		}
	}	
	Menu(user);

}
}

	



