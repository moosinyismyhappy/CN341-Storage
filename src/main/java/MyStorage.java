public abstract class MyStorage {
    protected String filename = "";

    public MyStorage(String filename) {
        this.filename = filename;
    }

    public abstract void append(String y) throws Exception;
}
