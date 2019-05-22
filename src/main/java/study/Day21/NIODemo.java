package study.Day21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIODemo {
    public static void main(String[] args) throws Exception {
        Files.copy(Paths.get("file/stream.txt"),new FileOutputStream("file/streamCopy5.txt"));
        Files.copy(new FileInputStream("file/stream.txt"),Paths.get("file/streamCopy6.txt"));
    }
}
