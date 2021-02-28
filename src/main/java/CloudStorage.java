import com.google.auth.Credentials;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.*;
import com.google.cloud.storage.Storage;
import java.io.FileInputStream;

/**
 * Write a description of class CloudStorage here.
 *
 * @author (your name)
 * @version (a version number or a date)
 *
 * https://www.baeldung.com/java-google-cloud-storage
 */

public class CloudStorage extends MyStorage {

    private Bucket myBucket;

    public CloudStorage(String filename) throws Exception {

        super(filename);

        Credentials credentials = GoogleCredentials
                .fromStream(new FileInputStream("src/main/java/cn341-moosiny-2cafb8d074cd.json"));
        Storage storage = StorageOptions.newBuilder().setCredentials(credentials)
                .setProjectId("cn341-moosiny").build().getService();

        myBucket = storage.create(BucketInfo.of("moosiny-bucket1"));
    }

    public void append(String y) throws Exception {

        String value = y;
        byte[] bytes = value.getBytes("UTF-8");
        Blob blob = myBucket.create("my-first-blob", bytes);


    }
}
