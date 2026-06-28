package chatbot;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("AI ChatBot");

        
        JTextArea chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 16));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        
        JTextField inputField = new JTextField();

        
        JButton sendButton = new JButton("Send");

        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(inputField, BorderLayout.CENTER);
        bottomPanel.add(sendButton, BorderLayout.EAST);

        
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
        sendButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                String message = inputField.getText();

                chatArea.append("You : " + message + "\n");

                message = message.toLowerCase();

                if (message.startsWith("hi") || message.startsWith("hello")) {
                    chatArea.append("Bot : Hello! How can I help you?\n\n");
                
                }
                else if (message.contains("how are you")) {
                    chatArea.append("Bot : I'm doing great! Thanks for asking.\n\n");
                }
                else if (message.contains("java")) {
                    chatArea.append("Bot : Java is an Object-Oriented Programming language.\n\n");
                }
                else if (message.contains("ai")) {
                    chatArea.append("Bot : AI stands for Artificial Intelligence.\n\n");
                }
                else if (message.contains("machine learning")) {
                    chatArea.append("Bot : Machine Learning enables computers to learn from data.\n\n");
                }
                else if (message.contains("oop")) {
                    chatArea.append("Bot : OOP stands for Object-Oriented Programming.\n\n");
                }
                else if (message.contains("thank")) {
                    chatArea.append("Bot : You're welcome!\n\n");
                }
                else if (message.contains("bye")) {
                    chatArea.append("Bot : Goodbye! Have a nice day.\n\n");
                }
                else {
                    chatArea.append("Bot : Sorry, I don't understand your question.\n\n");
                }
                inputField.setText("");

            }

        });
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
