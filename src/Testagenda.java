import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import junit.framework.TestCase;

class Testagenda extends TestCase {

	@Test
	void testConnexionUtilisateur(){
		User a = new User();
		a.setFirstname("Sébastien");
		a.setLastname("Otten");
		a.setContacts(null);
		a.setEvents(null);
		assertEquals(a.getfirstname(), "Sébastien");
		assertEquals(a.getlastname(), "Otten");
		assertEquals(a.getContacts(), null);
		assertEquals(a.getEvents(), null);
	}
	
	@Test
	 void testCreationContactPrivé() {
		Contact b = new Privé();
		b.setfirstname("Valentin");
		b.setlastname("Marley");
		b.setType("Privé");
		b.setEmail("val@hotmail.com");
		b.setPhone("04778899");
		assertEquals(b.getfirstname(), "Valentin");
		assertEquals(b.getlastname(), "Marley");
		assertEquals(b.getType(), "Privé");
		assertEquals(b.getemail(), "val@hotmail.com");
		assertEquals(b.getPhone(), "04778899");
	}
	
	@Test
	 void testCreationContactPro() {
		Contact c = new Professionnel();
		c.setfirstname("Valentin");
		c.setlastname("Marley");
		c.setType("Professionnel");
		c.setEmail("val@hotmail.com");
		c.setPhone("04778899");
		assertEquals(c.getfirstname(), "Valentin");
		assertEquals(c.getlastname(), "Marley");
		assertEquals(c.getType(), "Professionnel");
		assertEquals(c.getemail(), "val@hotmail.com");
		assertEquals(c.getPhone(), "04778899");
	}
	
	@Test
	void testCreationEventReunion() {
		Event d = new Reunion();
		d.setName("Examen");
		d.setType("Réunion");
		d.setDate("20/09/2021");
		d.setHour("20:00");
		d.setDescription("POO");
		d.setContact("Max");
		d.setContactliés("max@max.com");
		assertEquals(d.getName(), "Examen");
		assertEquals(d.getType(), "Réunion");
		assertEquals(d.getDate(), "20/09/2021");
		assertEquals(d.getHour(), "20:00");
		assertEquals(d.getDescription(), "POO");
		assertEquals(d.getContact(), "Max");
		assertEquals(d.getContactliés(), "max@max.com");
		
	}
	@Test
	void testCreationEventAppel() {
		Event e = new Appel();
		e.setName("Examen");
		e.setType("Appel");
		e.setDate("20/09/2021");
		e.setHour("20:00");
		e.setDescription("POO");
		e.setContact("Max");
		e.setContactliés("max@max.com");
		assertEquals(e.getName(), "Examen");
		assertEquals(e.getType(), "Appel");
		assertEquals(e.getDate(), "20/09/2021");
		assertEquals(e.getHour(), "20:00");
		assertEquals(e.getDescription(), "POO");
		assertEquals(e.getContact(), "Max");
		assertEquals(e.getContactliés(), "max@max.com");
	
	}
	@Test
	void testCreationEventVideoconference() {
		Event f = new Videoconference();
		f.setName("Examen");
		f.setType("Videoconference");
		f.setDate("20/09/2021");
		f.setHour("20:00");
		f.setDescription("POO");
		f.setContact("Max");
		f.setContactliés("max@max.com");
		assertEquals(f.getName(), "Examen");
		assertEquals(f.getType(), "Videoconference");
		assertEquals(f.getDate(), "20/09/2021");
		assertEquals(f.getHour(), "20:00");
		assertEquals(f.getDescription(), "POO");
		assertEquals(f.getContact(), "Max");
		assertEquals(f.getContactliés(), "max@max.com");
	
	}
	@Test
	void testListeEmails() {
		ArrayList<String> emails = new ArrayList<String>();
		emails.add("max@max.com");
		emails.add("seb@otten.be");
		assertTrue(emails.contains("max@max.com"));
		assertTrue(emails.contains("seb@otten.be"));
		assertFalse(emails.contains("fauxemail"));
	}
	
}


