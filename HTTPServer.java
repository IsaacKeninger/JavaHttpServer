import java.net.ServerSocket;
import java.net.Socket; // This helps to create a netowrk socket on a port


public class HTTPServer{
    
    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080); // This creates a network socket that accepts connections on port 8080
        System.out.println("Listening on Port 8080...");
        while (true){ // do this forever while the server is up and running
            try (Socket socket = server.accept()){
                String message = "Hi from port 8080!";
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + message;
                socket.getOutputStream()
                    .write(httpResponse.getBytes("UTF-8")); 

            }
            // Read HTTP request from Client socket above
            // make an http response
            // send the http response back to client
            // close
        }
    }
}
