import com.opencsv.CSVWriter;

import java.io.FileWriter;

/**
 * Write a description of class CSVMyStorage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * <p>
 * https://howtodoinjava.com/java/library/parse-read-write-csv-opencsv/
 */
public class CSVMyStorage extends MyStorage {

    private CSVWriter writer;

    public CSVMyStorage(String filename) throws Exception {
        super(filename);
        writer = new CSVWriter(new FileWriter(filename));
    }

    public void append(String y) throws Exception {

        //Create record
        String[] record = y.split(",");

        //Write the record to file
        writer.writeNext(record);

        //close the writer
        writer.close();

    }
}
