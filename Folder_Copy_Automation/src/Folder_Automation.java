import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Folder_Automation {
	public static void main(String[] args) {

		// Setting the path for the template folder
		String templateFolder = "E:\\EDU HUB\\IT Career\\Root\\Template_Folder";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Client Names: ");

		// Getting the Client Names for folder creation
		StringBuilder URLInput = new StringBuilder();
		String line;

		while (!(line = input.nextLine()).isEmpty()) {
			URLInput.append(line).append("\n");
		}

		// Storing the client names got from console in array and printing number of values we got
		String[] ClientNamesArray = URLInput.toString().split("\n");
		System.out.println("No of Clients Detected: " + ClientNamesArray.length + "\n");

		try {// Process each client using for loop
			for (String ClientName : ClientNamesArray) {
				// Effective final variable (Current Client name) for inner class
				final String CurrentClientName = ClientName;

				Files.walkFileTree(Paths.get(templateFolder), new SimpleFileVisitor<Path>() {
					@Override
					public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
						// Create the destination directory excluding the original templateFolder
						Path destination = Paths.get(templateFolder + "_" + CurrentClientName,
								dir.getParent().relativize(dir).toString());
						Files.createDirectories(destination);
						return FileVisitResult.CONTINUE;
					}

					@Override
					public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
						// Construct the destination path for the file with the modified file name
						Path destination = Paths.get(templateFolder + "_" + CurrentClientName,
								file.getParent().relativize(file).toString());

						// Modify the file name by prepending the client name
						String modifiedFileName = CurrentClientName + "_" + file.getFileName().toString();
						Path destinationWithModifiedName = destination.resolveSibling(modifiedFileName);

						Files.copy(file, destinationWithModifiedName, StandardCopyOption.REPLACE_EXISTING);
						return FileVisitResult.CONTINUE;
					}
					
				});

				System.out.println("Folder Created '" + templateFolder + "' copied and renamed to '" + templateFolder
						+ "_" + CurrentClientName + "'.");
			}
		} catch (IOException e) {
			e.printStackTrace(); // Handle the exception as needed
		}

	}
}
