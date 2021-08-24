public class Professionnel extends Contact {
	//attributs
		private String Type;

		//Getters
			public String getType() {
				return Type;
			}
			//Setters
			public void setType(String type) {
				Type = type;
			}

			public Professionnel() {
				super();
				Type = "Professionnel";
			}

			@Override
			public String toString() {
				return super.toString()+" Type : " + Type;
			} 

			}
