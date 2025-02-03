// PARTNER NAME:Travis Wheeler
// PARTNER NAME:
// CS111 SECTION #:
// DATE: Feb 2

public class Main
{
	public static void main(String[] args)
	{
		//DECLARATION + INITIALIZATION SECTION
		
		String Surname;
		String Given_Name;
		String USCIS_Num;
		String Category;
		String Card_Num;
		String Country_Of_Birth;
		String Terms_And_Conditions;
		String Date_Of_Birth;
		String Sex;
		String Valid_From;
		String Card_Expires;

		//INPUT SECTION

		Surname = "Joey";
		Given_Name = "Shmoey";
		USCIS_Num = "000-000-000";
		Category = "Z00";
		Card_Num = "SRC1234567890";
		Country_Of_Birth = "Mongolia";
		Terms_And_Conditions = "None";
		Date_Of_Birth = "03 Oct 1984";
		Sex = "M";
		Valid_From = "01/01/90";
		Card_Expires = "01/01/30";
		
		// N/A
		
		//CALCULATION SECTION
		
		//OUTPUT SECTION
		System.out.println("╔══════════════════════════════════════════════════════════════════════");
		System.out.println("║         UNITED STATES OF AMERICA");
		System.out.println("║                                  EMPLOYMENT AUTHORIZATION CARD");
		System.out.println("║                       Surname");
		System.out.println("║                       "+Surname+" ");
		System.out.println("║  .----.    .----.     Given Name");
		System.out.println("║ (   ^  \\  /  ^   )    "+Given_Name+" ");
		System.out.println("║        |  |           USCIS#         Category   Card#");
		System.out.println("║       _/  \\_          "+USCIS_Num+" "+Category+" "+Card_Num+" ");
		System.out.println("║      (_    _)         Country of Birth");
		System.out.println("║   ,    `--`    ,      "+Country_Of_Birth+" ");
		System.out.println("║   \\'-.______.-'/      Terms and Conditions");
		System.out.println("║    \\          /       "+Terms_And_Conditions+" ");
		System.out.println("║     '.--..--.'        Date of Birth   Sex");
		System.out.println("║       `\"\"\"\"\"`         "+Date_Of_Birth+" "+Sex+" ");
		System.out.println("║                       Valid From:     "+Valid_From+" ");
		System.out.println("║                       Card Expires:   "+Card_Expires);
		System.out.println("║ ascii art by: jgs     NOT VALID FOR REENTRY TO U.S.");
		System.out.println("╚══════════════════════════════════════════════════════════════════════");
		//ascii art credit: http://www.oocities.org/spunk1111/bodypart.htm
	}
}