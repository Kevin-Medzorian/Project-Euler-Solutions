
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * @author Kevin
 */
public class util_Refactor {

    private static final String path = "E:\\Users\\KevinHDD\\OneDrive\\Code\\Euler\\src\\";

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                File file = new File(path + "euler" + i + j + ".java");
                
                if (file.exists()) {
                    Scanner reader = new Scanner(file);

                    String text = "";
                    while (reader.hasNextLine()) {
                        text += reader.nextLine() + "\n";
                    }
                    reader.close();

                    if (text.contains("euler")) {
                        text = text.replace("euler", "euler0");
                    }

                    file.delete();

                    FileWriter f2 = new FileWriter(new File(path + "euler0" + i + j + ".java"), false);
                    f2.write(text);
                    f2.close();
                }
            }
        }
    }

}
