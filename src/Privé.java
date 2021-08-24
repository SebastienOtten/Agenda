public class Privé extends Contact {
	//Attributs
private String Type;

	//Getters
	public String getType() {
		return Type;
	}

	//setters
	public void setType(String type) {
		Type = type;
	}

	public Privé() {
		super();
		Type = "Privé";
	}

	@Override
	public String toString() {
		return super.toString()+" Type : " + Type;
	} 

		
	}
