package IO;
import java.io.*;
public class LaunchPW {
    public static void main(String[] args) throws Exception
    {
        File dir = new File("PW");
        File file = new File(dir , "pw.txt");

        FileWriter fw = new FileWriter(file);
        PrintWriter pw = new PrintWriter(fw);

        pw.write(97);
        pw.write("\n");

        pw.println("Java");
        pw.println(100);//stores as integer
        pw.println('a');//stores as character
        pw.println(99.9);//stores as float
        pw.println(true);//stores as boolean
        pw.close();

    }
}
