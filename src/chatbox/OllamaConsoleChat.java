package chatbox;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OllamaConsoleChat {
    public static void main(String[] args) throws Exception {
        HttpClient client = HttpClient.newHttpClient();
        Scanner scanner = new Scanner(System.in);

        // Lưu lịch sử chat (để giữ context hội thoại)
        List<String> messages = new ArrayList<>();

        System.out.println("=== Chat với Ollama (model: llama3) ===");
        while (true) {
            System.out.print("Bạn: ");
            String userInput = scanner.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                System.out.println("Thoát chat!");
                break;
            }

            messages.add("{\"role\": \"user\", \"content\": \"" + userInput + "\"}");

            String jsonRequest = """
                {
                  "model": "tinyllama",
                  "messages": [
                    {"role": "system", "content": "Bạn là một trợ lý AI thân thiện."},
                """ + String.join(",", messages) + "] }";

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("http://localhost:11434/api/chat"))
                    .header("Content-Type", "application/json")
                    .POST(HttpRequest.BodyPublishers.ofString(jsonRequest))
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();

            // Gom tất cả content trong JSON (có thể nhiều chunk)
            Pattern pattern = Pattern.compile("\"content\":\"(.*?)\"");
            Matcher matcher = pattern.matcher(responseBody);

            StringBuilder replyBuilder = new StringBuilder();
            while (matcher.find()) {
                replyBuilder.append(matcher.group(1));
            }

            // In ra 1 dòng gọn
            String reply = replyBuilder.toString();
            System.out.println("Ollama: " + reply);

            // Thêm vào history


            // Thêm vào history để giữ ngữ cảnh
            messages.add("{\"role\": \"assistant\", \"content\": \"" + reply + "\"}");
        }
    }
}

