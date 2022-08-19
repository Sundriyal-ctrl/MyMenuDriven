package Test3;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *create new file name.txt and write !Hi i am genious, i am confident i love my self
 *
 * @Author anuj sundriyal
 */
class Case2
{
    void getText()
    {
        try {
            File f = new File("Name.txt");
            if(f.createNewFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(f,true);
                String s="Hi I am Genius\n";
                fileOutputStream.write(s.getBytes());
                s="I am Confident\n";
                fileOutputStream.write(s.getBytes());
                s="I Love MySelf\n";

                fileOutputStream.write(s.getBytes());
            }else
            {
                System.out.println("Not Present");
            }
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void readFile()
    {
        try{
            File f  = new File("Name.txt");
            if(f.exists())
            {
                DataInputStream fileInputStream = new DataInputStream(new FileInputStream(f));
                String s;
                while((s=fileInputStream.readLine())!=null)
                {
                    System.out.println(s);
                    System.out.println();
                }
            }
        }catch(Exception e)
        {

        }
    }
}
class PutData
{
    void putting()
    {

        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream("Name.txt"));
            FileOutputStream fileOutputStream = null;
            char a='A';
            fileOutputStream = new FileOutputStream(a+".txt");
            for(int i=0;i<4;i++)
            {

                this.setData(dataInputStream,fileOutputStream);
                fileOutputStream = new FileOutputStream((++a)+".txt");
            }


        }catch(Exception e)
        {

        }
    }
    void setData(DataInputStream data,FileOutputStream f)
    {
        String s;
        try {
            while ((s = data.readLine()) != null) {
              f.write(s.getBytes());
            }
        }catch(Exception e)
        {

        }
    }
}
public class TestClass {
    public static void main(String[] args) {
        Case2 case2 = new Case2();
        case2.getText();
        case2.readFile();
        PutData putData = new PutData();
        putData.putting();
    }
}
