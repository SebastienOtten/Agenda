public class Appel extends Event{
	
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

public Appel() {
	super();
	Type = "Appel";
}

@Override
public String toString() {
	return super.toString()+" Type=" + Type;
} 

	
}
