package classWork1.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Readable<T> {
    T read() throws IOException;
}
