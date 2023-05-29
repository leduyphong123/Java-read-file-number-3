import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            File file= new File("result.txt");
            if (!file.exists()){
                System.out.println("file ton tai");
            }
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);
//            FileWriter fw = new FileWriter("result.txt",true);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}