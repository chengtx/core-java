package me.chengtx.java8.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author <a href="mailto:chengtingxian@gmail.com">Tingxian Cheng</a>
 * @version 1/28/2015
 */
public class GenFileList {

    private static final String ROOT = "C:\\DM_NOTES";
    private static final String FILES = "00000filelist.txt";

    public static void main(String[] args) {

        Path root = Paths.get(ROOT);
        Path out = Paths.get(ROOT, FILES);
        try (BufferedWriter writer = Files.newBufferedWriter(out);) {

            Files.walk(root).map(s -> {
                return s.getFileName();
            }).filter(s -> {
                return !s.toString().contains("Thumbs");
            }).sorted().skip(2).forEach(s -> {
                try {
                    writer.write(s.toString());
                    writer.newLine();
                } catch (Exception e) {
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
