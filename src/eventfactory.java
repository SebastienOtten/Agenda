public class eventfactory {

		public Event CreateEvent(int type) {
			if (type==1){
				return new Reunion(); 
			
			}
			else if(type==2) {
				return new Appel(); 
			}
			else if(type==3) {
				return new Videoconference(); 
			}
			throw new IllegalArgumentException("Veuillez taper un numéro entre 1 et 3"); 
	}
		}

