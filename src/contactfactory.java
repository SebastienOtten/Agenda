public class contactfactory {


	public Contact CreateContact(int type) {
		if (type==1){
			return new Privé(); 
		
		}
		else if(type==2) {
			return new Professionnel(); 
		}
		throw new IllegalArgumentException("Veuillez taper 1 ou 2"); 
	}
}
