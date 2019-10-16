import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * InformationAboutTheFile
 */
public class InformationAboutTheFile {
    public static void main(String[] args) throws IOException {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name to check: ");
        String fileName = sc.nextLine();
        File newFile = new File(fileName);

        if (!newFile.exists()) {
            System.out.println("File is not present");
            flag = false;
        } else {
            System.out.println(newFile + " is already present");
        }

        if (flag == false) {
            newFile.createNewFile();
            System.out.println(newFile.getName() + " created successfully.");
        }
        System.out.println("Name of the newFile is: " + newFile.getName());

        if (newFile.canRead()) {
            System.out.println(newFile + " is Readable");
        }

        if (newFile.canWrite()) {
            System.out.println(newFile + " is Writable");
        }

        System.out.println("Size of the file in Byte is: " + newFile.length());
        System.out.println("Type of the file is: " + fileName.substring(fileName.indexOf('.'), fileName.length()));
    }
}