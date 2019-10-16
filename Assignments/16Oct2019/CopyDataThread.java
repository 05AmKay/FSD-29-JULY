import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * CopyDataThread
 */
class CopyDataThread extends Thread {

    int i;
    int charCount = 0;
    BufferedReader br;
    BufferedWriter bw;

    CopyDataThread(FileReader sf, FileWriter tf) {
        br = new BufferedReader(sf);
        bw = new BufferedWriter(tf);
    }

    public void run() {
        try {
            while ((i = br.read()) != -1) {
                ++charCount;
                bw.write((char) i);

                if (charCount == 10) {
                    System.out.println(" 10 Charcter copied successfully.");
                    charCount = 0;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ie) {
                    // TODO: handle exception
                }

            }

            try {
                br.close();
            } catch (IOException ioe) {
                // TODO: handle exception
            }

            try {
                bw.close();
            } catch (IOException ioe) {
                // TODO: handle exception
            }
        } catch (IOException ioe) {

        }
    }
}