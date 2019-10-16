import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FileProgram
 */
public class FileProgram {
    public static void main(String[] args) throws IOException {
        File sourceFile = new File("source.txt");
        File targetFile = new File("target.txt");

        if (sourceFile.exists()) {
            System.out.println(sourceFile + " is already exist.");
        } else {
            sourceFile.createNewFile();
            System.out.println(sourceFile + " created successfully.");
        }

        if (targetFile.exists()) {
            System.out.println(targetFile + " is already exist.");
        } else {
            targetFile.createNewFile();
            System.out.println(targetFile + " created successfully.");
        }

        FileReader sf = new FileReader(sourceFile);
        FileWriter tf = new FileWriter(targetFile);

        CopyDataThread cdt = new CopyDataThread(sf, tf);
        cdt.start();
    }
}