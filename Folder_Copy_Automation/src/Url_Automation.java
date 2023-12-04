import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Scanner;

public class Url_Automation {

	public static void main(String[] args) {
//All Template Strings for link
		String http = "https://";
		String env = "PROD";
		String URLbody = "onlinebanking.firstdata.com/ecs/";
		String Id_type = "app";

//Get the type of ID input
		Scanner input = new Scanner(System.in);

		System.out.println("Which type of URL you need? \n " + "1. App-Id URL(Proper) \n " + "2. C-Id URL(Backend) \n"
				+ "Enter your option(1 or 2)\r");

		if (input.nextInt() == 2)
			Id_type = "C";

//Get the type of Enviornment input
		Scanner Envinput = new Scanner(System.in);

		System.out.println("For Which Enviornment you need to create the URL? \n " + "1. Qa \n " + "2. Stage \n "
				+ "3. PROD \n" + "Enter your option\r");

		switch (Envinput.nextInt()) {
		case 1:
			env = "Qa";
			break;
		case 2:
			env = "Stage";
			break;
		default:
			break;
		}

//Get the IDs input
		Scanner Idinput = new Scanner(System.in);
		StringBuilder IdsInput = new StringBuilder();
		String line;

		System.out.println("Enter the " + Id_type + "-IDs for the " + env + " Enviornment: ");

		while (!(line = Idinput.nextLine()).isEmpty()) {
			IdsInput.append(line).append("\n");
		}

		String[] IdsArray = IdsInput.toString().split("\n");

		System.out.println("No of " + Id_type + "-IDs Detected: " + IdsArray.length + "\n");

//URL-Manufacturing
		ArrayList<String> UrlsArray = new ArrayList<String>();
		for (int i = 0; i < IdsArray.length; i++) {
			StringBuilder URL_Creation = new StringBuilder();
			URL_Creation.append(http);
			switch (env) {
			case "Qa":
				URL_Creation.append("qa-west-");
				break;
			case "Stage":
				URL_Creation.append("stage-");
				break;
			default:
				URL_Creation.append("");
				break;
			}
			URL_Creation.append(URLbody);

			if (Id_type == "C")
				URL_Creation.append("auth/?cid=");

			URL_Creation.append(IdsArray[i]);
			UrlsArray.add(URL_Creation.toString());
		}
		System.out.println("Here is your " + env + " URLs with " + Id_type + "-IDs\n");
		for (String URLs : UrlsArray) {
			System.out.println(URLs);
		}
//Ask to Open or Quit
		Scanner Confirminput = new Scanner(System.in);
		System.out.println("\nDo you want to open the URLs? \n " + "y \n " + "n");
		if (Confirminput.next().equalsIgnoreCase("y")) {

			for (String url : UrlsArray) {
				try {
					Desktop.getDesktop().browse(new URI(url));
					System.out.println("Opened URL:" + url);
				} catch (IOException | URISyntaxException e) {
					System.out.println("Error opening URL:" + url);
					e.printStackTrace();
				}
			}
		}
		System.out.println("Thank you for using this Tool..");

		input.close();
		Idinput.close();
		Envinput.close();
		Confirminput.close();
	}
}
