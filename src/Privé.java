public class Priv� extends Contact {
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

	public Priv�() {
		super();
		Type = "Priv�";
	}

	@Override
	public String toString() {
		return super.toString()+" Type : " + Type;
	} 

		
	}
