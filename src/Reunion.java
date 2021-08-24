public class Reunion extends Event {
	//attributs
	private String Type;

	//getters
	public String getType() {
		return Type;
	}

	//setters
	public void setType(String type) {
		Type = type;
	}

	public Reunion() {
		super();
		Type = "Reunion";
	}

	@Override
	public String toString() {
		return super.toString()+" Type=" + Type;
	} 

		
	}



