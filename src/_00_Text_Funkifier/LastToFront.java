package _00_Text_Funkifier;

public class LastToFront extends SpecialString{

	public LastToFront(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String temp = "";
		for(int i = 0; i < s.length()-1; i ++)
		{
			temp = temp + s.charAt(i);
		}
		temp = s.charAt(s.length()-1) + temp;
		return temp;
		
	}
	
}
