package classWork1.interfaces;

import java.io.*;

public class FileMessage<T> implements Readable<T>, Writable<T> {

    private FileInputStream in;
    private FileOutputStream out;
    private String path;

    public FileMessage(String path){
        this.path = path;
    }
    @SuppressWarnings("unchecked")
    @Override
    public T read() throws IOException {
        File file = new File(path);
        in = new FileInputStream(file);
        String value = new String(in.readAllBytes());
        in.close();
        return (T) value;
    }

    @Override
    public void write(T value) throws IOException {
        File file = new File(path);
        out = new FileOutputStream(file, true);
        out.write(((String)value).getBytes());
        out.close();

    }
}
