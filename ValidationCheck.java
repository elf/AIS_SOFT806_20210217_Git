public class ValidationCheck
{
	public static boolean Validation(String password)
	{
		if (password.length()>=8) return true;
		else return false;
		
	}
}