public class Videoconference extends Event{
	//attributs
private String Type;

//Getters
public String getType() {
	return Type;
}

//setters
public void setType(String type) {
	Type = type;
}

public Videoconference() {
	super();
	Type = "Vid�o conf�rence";
}

@Override
public String toString() {
	return super.toString()+" Type=" + Type;
} 

}
