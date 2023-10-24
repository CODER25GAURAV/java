package IO;
import java.io.*;
public class LaunchFile3 {
       public static void main(String[] args)  throws IOException
    {
        File dir=new File("MultiThreading");
       // System.out.println(dir.isDirectory());
        dir.mkdir();
        System.out.println("dir is refering to directory MultiThreading : " + dir.isDirectory());
        // File file = new File(dir, "pwskills.txt");//it only checks whether file is available in dir or not 
        // file.createNewFile();
        // System.out.println("file is refering to pwskills.txt :" +file.isFile());

        //     int count =0;

            //String s="IO";
            // File f=new File("IO");

            // String str[]=f.list();

            // for(String name: str)
            // {
            //     count++;
            //     System.out.println(name);
            // }
            // System.out.println("No of files are "+ count);

       
            
            
    }
    


}
