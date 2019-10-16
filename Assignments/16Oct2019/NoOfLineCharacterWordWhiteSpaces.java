import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class NoOfLineCharacterWordWhiteSpaces {
    public static void main(String[] args) throws IOException {
        File newFile = new File("infantFile.txt");

        if (!newFile.exists())
            newFile.createNewFile();
        System.out.println("File created succesfully.");

        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        BufferedReader br = new BufferedReader(new FileReader(newFile));
        StringBuilder sb = new StringBuilder("");
        String str = "";
        int linNum = 0;
        int numLine = 0;
        int length = 0;
        int paragraphCount = 1;
        int wordCount = 0;
        int whiteSpace = 0;
        int characterCount = 0;
        String wordsList[];
        String myContent = "This String would be written to the specified File";
        String myContent2 = "My name is";
        String myContent3 = "Manish Kumar Verma";
        bw.write(myContent);
        bw.write("\n");
        bw.write(myContent2);
        bw.write("\n");
        bw.write(myContent3);
        bw.close();
        System.out.println("File has been written succefully. Please open the File to see the content.");
        while ((str = br.readLine()) != null) {
            ++numLine;
            // length += str.length();
            if (str.equals("")) {
                paragraphCount++;
            }

            if (!str.equals("")) {
                characterCount += str.length();

                wordsList = str.split(" ");
                wordCount += wordsList.length;
                whiteSpace += wordsList.length - 1;
            }
            sb.append("\n " + linNum + ": " + str);
            linNum++;
        }
        br.close();
        System.out.println("Content from file are: " + sb);
        System.out.println("Number of lines in newfile are: " + numLine);
        System.out.println("Number of words in newfile are: " + wordCount);
        System.out.println("Number of character in newfile are: " + characterCount);
        System.out.println("Number of white spaces in newfile are: " + whiteSpace);
    }
}