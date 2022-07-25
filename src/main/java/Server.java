import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        System.out.println("Сервер запущен");
        int port = 10777;
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            while (true) {
                Socket clientSocket = serverSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                System.out.printf("Новое соединение установлено. Порт: %d%n", clientSocket.getPort());

                String answer = in.readLine();
                out.println(String.format("Привет %s, твой порт %d", answer, clientSocket.getPort()));

                out.println("Как проходит обучение?");
                answer = in.readLine();
                System.out.println(answer);

                out.println("А в чем трудность?");
                answer= in.readLine();
                System.out.println(answer);

                out.println("Тяжело в учении - легко в бою))");
                answer = in.readLine();
                System.out.println(answer);

                out.println("Ты губу то не раскатывай) Выучись сначала, собес пройди, а потом уже о зп думай..");
                answer = in.readLine();
                System.out.println(answer);

                out.println("Ладно, пока! Думай о хорошем");
                answer = in.readLine();
                System.out.println(answer);
            }
        }
    }
}
