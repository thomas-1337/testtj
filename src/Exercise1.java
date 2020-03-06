import java.io.*;

public class Exercise1 {
    public static void main(String[] args) {
        File file = new File("test.txt");
        File file_target = new File("test_copy.txt");

        System.out.println(file.getAbsoluteFile());

        try {
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);

            FileWriter fw = new FileWriter(file_target);
            PrintWriter pw = new PrintWriter(fw);

            String line;
            while ((line = bfr.readLine()) != null) {
                pw.println(line.toUpperCase());
                pw.flush();
            }

            bfr.close();
            fr.close();

            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
