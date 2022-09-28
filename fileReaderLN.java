import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

class fileReaderLN {

    public static void main(String a[]){
        StringBuilder sb = new StringBuilder();
        String lines = "";
        String data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\2008s\\AppData\\Roaming\\.minecraft\\launcher_accounts.json"));
            while (lines != null)
            {
                if (lines == null)
                    break;
                data += lines;
                lines = br.readLine();

            }
            System.out.println(data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("bro couldnt find the file");
        } catch (IOException e) {
            System.err.println("bro im unable to read the file make sure its like a txt file or smth");
        }
    }
}