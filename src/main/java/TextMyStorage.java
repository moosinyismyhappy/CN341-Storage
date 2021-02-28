import java.io.FileWriter;

/**
 * Write a description of class TextMyStorage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *
 * https://www.w3schools.com/java/java_files_create.asp
 */
public class TextMyStorage extends MyStorage
{

    private FileWriter myWriter;

    public TextMyStorage(String filename) throws Exception
    {
        super(filename);
        myWriter = new FileWriter(filename);
    }

    public void append(String y) throws Exception
    {

        myWriter.write(y);
        myWriter.close();
        System.out.println("Successfully wrote to the file.");

    }
}
