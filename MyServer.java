package CN;

import java.io.*;
import java.net.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(6666); // Corrected port to 6666
            System.out.println("Server is running...");
            Socket s = ss.accept(); // Wait for a client connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF(); // Read the message from the client
            System.out.println("Message from client: " + str);
            dis.close();
            s.close();
            ss.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());        }
    }
}
