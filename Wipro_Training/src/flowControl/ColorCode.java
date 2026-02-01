package flowControl;

public class ColorCode {
	public String colourCode(char ch) {
		String name = "";
		switch(ch) {
		case 'R': name = "RED";
		case 'B': name = "BLUE";
		case 'G': name = "GREEN";
		case 'Y': name = "YELLOW";
		case 'W': name = "WHITE";
		default: name = "Invalid";
		}
		return name;
	}
}
