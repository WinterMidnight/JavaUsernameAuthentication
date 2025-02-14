//Create java application for user authentication. The user will enter login details like ID and password. The system must check the authentication and display the appropriate message.

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class UserAuthentication extends JFrame {
    private static final String USER_ID = "Mariyam";
    private static final String PASSWORD = "Shaikh";

    private JTextField userIdField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public UserAuthentication() {
        setTitle("User Authentication");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2));
        getContentPane().setBackground(Color.PINK);

        JLabel userIdLabel = new JLabel("User ID:");
        userIdField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        loginButton = new JButton("Login");
        messageLabel = new JLabel("");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                authenticateUser();
            }
        });


        add(userIdLabel);
        add(userIdField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(messageLabel);
    }

    private void authenticateUser() {
        String userId = userIdField.getText();
        String password = new String(passwordField.getPassword());

        if (USER_ID.equals(userId) && PASSWORD.equals(password)) {
            messageLabel.setText("Login successful! Welcome, " + userId + "!");
            messageLabel.setForeground(Color.BLACK);
        } else {
            messageLabel.setText("Login failed! Invalid User ID or Password.");
            messageLabel.setForeground(Color.RED);
        }
    }

    public static void main(String[] args) {
            UserAuthentication frame = new UserAuthentication();
            frame.setVisible(true);
        };
    }
