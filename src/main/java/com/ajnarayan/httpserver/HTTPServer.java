package com.ajnarayan.httpserver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class HTTPServer {

    private static Logger logger = Logger.getLogger(HTTPServer.class.getName());
    private final static String HTTP_RESPONSE = "HTTP/1.1 200 OK\r\n\r\n";
    private final static String ENCODING = "UTF-8";

    public static void main(String[] args){
        try {
            final ServerSocket socket = new ServerSocket(8080);
            logger.info("Listening on port 8080 ... ");
            while (true){
                try(Socket client = socket.accept()) {
                    String httpResponse = HTTP_RESPONSE + "Welcome to the server!";
                    client.getOutputStream().write(httpResponse.getBytes(ENCODING));
                    logger.info("Client host: " + client.getInetAddress().getHostAddress());
//                    String socketContent = new BufferedReader(new InputStreamReader(client.getInputStream()))
//                            .lines()
//                            .parallel()
//                            .collect(Collectors.joining("\n"));
//                    logger.info("HTTP Header: " + socketContent);
                }
            }
        }catch (IOException e){
            logger.warning(" Exception handling socket connection " + e.getMessage());
        }
    }

}
