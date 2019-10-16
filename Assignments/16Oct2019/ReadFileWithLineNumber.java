import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadFileWithLineNumber{
    public static void main(String[] args) throws IOException {
        File newFile = new File("myFile.txt");

        if(!newFile.exists())
            newFile.createNewFile();
        System.out.println("File created succesfully.");

        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        BufferedReader br = new BufferedReader(new FileReader(newFile));
        StringBuilder sb = new StringBuilder("");
        String str = "";
        int linNum=0;
        String myContent = "This String would be written to the specified File ";
        String myContent2 = "My name is";
        String myContent3 = "Manish Kumar Verma";
        bw.write(myContent);
        bw.write("\n");
        bw.write(myContent2);
        bw.write("\n");
        bw.write(myContent3);
        bw.close();
        System.out.println("File has been written succefully. Please open the File to see the content.");
        while((str = br.readLine()) !=null){
           // if(str)
            sb.append("\n " +linNum + ": " + str);
            linNum++;
        }
        br.close();
        System.out.println("Content from file are: " + sb);


    }
}