package classWork1.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Writable<T> {
    void write(T value) throws IOException;
}
