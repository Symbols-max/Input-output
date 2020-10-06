import java.io.*;

public class Main {
    public static void main(String []args) throws IOException {
        int count=0;
File a1=new File("C:/Users/Макс/Desktop/Test/a.txt");
        File a2=new File("C:/Users/Макс/Desktop/Test/b.txt");
FileWord b1=new FileWord(a1);
        FileWord b2=new FileWord(a2);
        for (String m:b1.getString()) {
            for (String m2:b2.getString()
                 ) {
                if(m.equals(m2)){
                    count++;
                }
            }
        }
        String[] arr=new String[count];
        int l=0;
        for (String m:b1.getString()) {
            for (String m2:b2.getString()
            ) {
                if(m.equals(m2)){
                    arr[l]=m;
                    l++;
                }
            }
        }
        for (String ar:arr
             ) {
            System.out.println(ar);
        }
        File a3=new File("C:/Users/Макс/Desktop/Test/c.txt");
        FileWord b3=new FileWord(a3);
        b3.writeWord(arr);




    }
}
