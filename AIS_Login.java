public class AIS_Login
{
	public static void main(String[] args)
	{
		boolean check=ValidationCheck.Validation("qwertyui");
		if (check) System.out.print("Login Successfully");
		else System.out.print("Login Failed!");
	}
}