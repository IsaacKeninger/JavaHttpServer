import java.io.BufferedReader;
import java.io.InputStreamReader; // This helps to create a netowrk socket on a port
import java.net.ServerSocket; // import socket object for getting client info
import java.net.Socket;


public class HTTPServer{
    
    public static void main(String[] args) throws Exception {
        final ServerSocket server = new ServerSocket(8080); // This creates a network socket that accepts connections on port 8080
        System.out.println("Listening on Port 8080...");
        while (true){ // do this forever while the server is up and running
            Socket clientSocket = server.accept(); // blocking method for connecting ot server
            // Read HTTP request from Client socket above
            // make an http response
            // send the http response back to client
            // close

            InputStreamReader isr = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String line = reader.readLine(); // this line showw each of the lines from the clients sockets input stream (information about the client and connection)
            while (!line.isEmpty()){
                System.out.println(line);
                line = reader.readLine();
            }

        }
    }
}
