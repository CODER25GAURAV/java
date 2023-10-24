package IO;
import java.io.*;

public class launchFW 
{
    public static void main(String[] args) throws IOException
    {

    File dir = new File("PW");
    File file = new File(dir,"pw.txt");
    file.createNewFile();
    //writing fileWriter method with true followed by comma will append the data from next line 
    FileWriter fw = new FileWriter(file, true );
    fw.write("Java");
    fw.write("\n");
    fw.write(65);
    fw.write("\n");
    fw.write(97);
    fw.write("\n");
    char ch[]= { 'j','a','v','a'};
    fw.write(ch);
    fw.write("\n");
    fw.close();
    // fw.flush();// will work in the same way as close
    System.out.println("open pw.text to see to result ");

    }
}
