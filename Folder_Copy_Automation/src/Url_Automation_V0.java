import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Url_Automation_V0 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the URLS: ");

		StringBuilder URLInput = new StringBuilder();
		String line;

		while (!(line = input.nextLine()).isEmpty()) {
			URLInput.append(line).append("\n");
		}

		String[] UrlsArray = URLInput.toString().split("\n");

		System.out.println("No of URLs Detected: " + UrlsArray.length + "\n");

		for (String url : UrlsArray) {
			try {
				Desktop.getDesktop().browse(new URI(url));
				System.out.println("Opened URL:" + url);
			} catch (Exception e) {
				System.out.println("Error opening URL:" + url);
				e.printStackTrace();
			}
		}
		input.close();
	}

//	public static int countkeys(String urlInput, String keyString) {
//		int count = 0;
//		int index = 0;
//		while ((index = urlInput.indexOf(keyString)) != -1) {
//			count++;
//			index += keyString.length();
//		}
//		return count;
//	}
}
