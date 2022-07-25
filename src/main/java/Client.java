import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {
    public static void main(String[] args) {
        String host = "netology.homework";
        int port = 10777;
        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            out.println("Денис");
            String question = in.readLine();
            System.out.println(question);

            question = in.readLine();
            System.out.println(question);
            out.println("Сложновато... Но я справлюсь)");

            question = in.readLine();
            System.out.println(question);
            out.println("Очень много информации, которую нужно запомнить. С нуля тяжело дается.");

            question = in.readLine();
            System.out.println(question);
            out.println("Точно-точно! Не зря у программистов такая зарплата)))");

            question = in.readLine();
            System.out.println(question);
            out.println("Ладно, усвоил.");

            question = in.readLine();
            System.out.println(question);
            out.println("Ок, пока!");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

