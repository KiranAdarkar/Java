import java.net.*;
import java.io.*;


class Client
{
    public static void main(String A[]) throws Exception
    {
       System.out.println("Client Application is running...");

       Socket s = new Socket("localhost",2100);

       System.out.println("Client is waiting for the server to accept the request");

    }
}