import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class ReplaceAWordInFile {
    public static void main(String[] args) throws IOException {
  
        Scanner sc =  new Scanner(System.in);
        int linNum = 0;
        StringBuilder sb = new StringBuilder("");
        String str = "";
        String myContent = "This String would be written to the specified File";
        String myContent2 = "My name is";
        String myContent3 = "Manish Kumar Verma";

        File newFile = new File("new.txt");

        if (!newFile.exists())
            newFile.createNewFile();
        System.out.println("File created succesfully.");

        BufferedWriter bw = new BufferedWriter(new FileWriter(newFile));
        BufferedReader br = new BufferedReader(new FileReader(newFile));
        
        bw.write(myContent);
        bw.write("\n");
        bw.write(myContent2);
        bw.write("\n");
        bw.write(myContent3);
        bw.close();
        System.out.println("File has been written succefully. Please open the File to see the content.");
       
        System.out.println("Enter the word to be replace: ");
        String replaceTo = sc.nextLine();

        System.out.println("Enter the word by which you want to replace: ");
        String replaceBy = sc.nextLine();

        while ((str = br.readLine()) != null) {
            sb.append("\n " + linNum + " : "  + str);
            linNum++;
        }
        br.close();
        System.out.println("Content from file are: " + sb);


        StringBuilder sb1 = new StringBuilder("");
        BufferedReader br2 = new BufferedReader(new FileReader(newFile));
        linNum = 0; 
        while ((str = br2.readLine()) != null) {
            sb1.append("\n " + linNum + " : " +  str.replaceAll(replaceTo, replaceBy));
            linNum++;
        }
        br2.close();
        System.out.println();
        System.out.println("Content from file after replacement are: " + sb1);
    
    }
}