import java.io.*;

public class FileWord {
    private String[] s = null;
    private File file;

    public FileWord(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String[] getString() {
        String str = " ";
        int i = 0;
        String st = " ";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            for (; (str = br.readLine()) != null; ) {
                st = str;
                i++;
            }
            String[] arr = new String[i];
            arr = st.split(" ");
            return arr;
        } catch (IOException e) {
            System.out.println("Error");
            return s;
        }

        // return s;
    }

    public void writeWord(String[] a) {
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String value : a) {
                bw.write(value+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

