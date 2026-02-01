package controlflow;

public class CheckUpperOrLowerAndConvert {
	public String checkUpperLower (char c)
	{
		if(Character.isUpperCase(c))
		{
			return "The Alphabet is"+" "+Character.toLowerCase(c)+"";
		}
		else if(Character.isLowerCase(c))
		{
			return "The Alphabet is"+" "+Character.toUpperCase(c)+"";
		}
		else
		{
			return "No Alphabet present";
		}
	}

}
