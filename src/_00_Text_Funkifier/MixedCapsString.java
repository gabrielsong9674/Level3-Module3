package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String temp="";
		
		for(int i = 0; i < s.length(); i ++)
		{
			if(i%2 != 0)
			{
				temp = temp +  Character.toUpperCase(s.charAt(i));
			}
			else
			{
				temp = temp + Character.toLowerCase(s.charAt(i));
			}
		}
		return temp;
	}
}
//tHiS Is aLsO A TeStZ