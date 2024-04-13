package src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ioTry {
        public static void main(String[] args) {
            String filePath = "C:\\Users\\小王爱吃橘子\\Desktop\\1.txt"; // 替换为你要读取的文件路径

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

