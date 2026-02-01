package controlflow;

public class CheckCharacter {
	public String CheckChar(char s)
	{
		if(s>='A'&& s<='Z' || s>='a' && s<='z')
		{
			return s+" is Alphabet";
		}
		else if(s>='0' && s<='9')
		{
			return s+" is Digit";
			
		}
		else
		{
			return s+" is Special Character";
		}
	}

}
