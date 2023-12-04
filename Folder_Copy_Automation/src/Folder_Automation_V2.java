import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Folder_Automation_V2 {
    public static void main(String[] args) {
        // Example usage
        String templateFolder = "E:\\EDU HUB\\IT Hobby\\Fiserv_Automation\\Root\\Template_Folder";
        String outputParentFolder = "E:\\EDU HUB\\IT Hobby\\Fiserv_Automation\\Copied Folder";

        // Take input from the user for names
        List<String> names = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a name (type 'done' when finished): ");
            String name = scanner.nextLine();
            if (name.toLowerCase().equals("done")) {
                break;
            }
            names.add(name.replace(' ', '_'));
        }

        // Copy the template folder for each name
        for (String name : names) {
            String outputFolder = outputParentFolder + File.separator + name;
            copyTemplate(templateFolder, outputFolder, name);
            System.out.println("Template copied to: " + outputFolder);
        }
    }

    private static void copyTemplate(String templatePath, String outputPath, String name) {
        // Check if the output folder already exists, if not create it
        File outputFolder = new File(outputPath);
        if (!outputFolder.exists()) {
            outputFolder.mkdirs();
        }

        // Iterate through all files and folders in the template directory
        File templateFolder = new File(templatePath);
        for (File item : templateFolder.listFiles()) {
            String itemName = item.getName();
            File itemPath = new File(templateFolder, itemName);

            // Replace 'test' with the provided name in the item name
            String outputItemPath = outputPath + File.separator + itemName.replace("Test", name);

            if (item.isDirectory()) {
                // Recursively copy subdirectories
                copyTemplate(itemPath.getAbsolutePath(), outputItemPath, name);
            } else {
                // Copy files without modifying content
                try {
                    Files.copy(itemPath.toPath(), new File(outputItemPath).toPath(), StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
