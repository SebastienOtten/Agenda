public abstract class Contact {

		//Attributs de la classe
			private String firstname ;
			private String lastname ;
			public String email;
			private  String Phone;
			 
			
		//Constructeur
			 public Contact() {
			}
			 
		//Getters
			
			public String getfirstname() {
				return firstname;
			}
			public String getlastname() {
				return lastname;
			}
			public String getemail() {
				return email;
			}
			public String getPhone() {
				return Phone;
			}
			
			
		//Setters
			public  void setfirstname(String Firstname) {
				firstname = Firstname;
			}
			public  void setlastname(String Lastname) {
				lastname = Lastname;
			}
			public  void setEmail(String Email) {
				email = Email;
			}
			public  void setPhone(String number){
				char[] array = number.toCharArray();
				for (int i = 0; i < array.length; i++) {
					if (array[i] < 46 || array[i] > 57) {
						System.out.println("Numéro de téléphone invalide");
						System.out.println("Attention, vous n'avez pas de numéro de téléphone pour ce contact");
						this.Phone = null;
						return;
						
					}
			
				this.Phone = number;
			}
				}
			
			
			@Override
			public String toString() {
				return "Nom du contact : "+this.firstname + " " + this.lastname + " *** " + " Mail : "+this.email+ " *** " +" Téléphone : " + this.Phone ;
			}
}
