/** using server socket to create a server entry point for this application.**/

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
public class HTTPserverCreated
{
  public static void main(String args[]) throws IOException
  {
    ServerSocket server = new ServerSocket(8080); System.out.println("Connecting to port 8080, please wait....");
    while (true)
    {
      try (Socket socket = server.accept())
      {
        String helloWorld = "hello user";
        Date today = new Date();
        String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today + "" +helloWorld; socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
      }
    }
  }
}
