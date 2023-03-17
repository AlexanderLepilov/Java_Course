package Home_Work;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Dz2_2 {

// Создать файл с названием file.txt. Если файл уже есть,
// то создавать не надо. Записать в него Слово "TEXT" 100 раз

    public static void main(String[] args) throws IOException {

        FileOutputStream f = new FileOutputStream("Home_Work/file.txt");

        String text = "TEXT\n";
        for (int i = 0; i < 100; i++) {
            byte[] bytes = text.getBytes(StandardCharsets.UTF_8);

            f.write(bytes);
        }
        f.close();

    }

}
