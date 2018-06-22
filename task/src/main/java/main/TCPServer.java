package main;

import main.db.DBConnectionProvider;
import main.manager.EvenManager;
import main.manager.OddManager;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

class TCPServer {
    private static EvenManager evenManager = new EvenManager();
    private static OddManager oddManager = new OddManager();

    public static void main(String argv[]) throws Exception {
        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();
        String clientSentence;
        String capitalizedSentence;
        ServerSocket welcomeSocket = new ServerSocket(6889);

        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient =
                    new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            clientSentence = inFromClient.readLine();
            String[] split = clientSentence.split(",");
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);
            for (int i = 0; i < split.length; i++) {
                if (Integer.parseInt(split[i]) % 2 == 0) {
                    evenManager.addEvenNumber(Integer.parseInt(split[i]));
                } else {
                    oddManager.addOddNumber(Integer.parseInt(split[i]));
                }
            }
            clientSentence = "What number do you want to print even or odd";
            System.out.println("Received: " + clientSentence);
            capitalizedSentence = clientSentence.toUpperCase() + '\n';
            outToClient.writeBytes(capitalizedSentence);
            if (clientSentence.equals("even")) {
                evenList.add(evenManager.getEvenNumber());
                outToClient.writeBytes(evenList.toString());
            }else {
                oddList.add(oddManager.getOddNumber());
                outToClient.writeBytes(oddList.toString());
            }
        }
    }
}