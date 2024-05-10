import javax.swing.*;
import java.awt.*;

public class LoginApp extends JFrame {
    private JPanel loginPanel;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton logoutButton;
    private JLabel welcomeLabel;
    private JLabel nameLabel;
    private JLabel ageLabel;
    private JLabel emailLabel;

    public LoginApp() {
        setTitle("BIENVENIDO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        createLoginInterface();
        createUserInterface();
        createLogoutInterface();

        setVisible(true);
    }

    private void createLoginInterface() {
        loginPanel = new JPanel();
        loginPanel.setLayout(new GridLayout(3, 2, 10, 10));
        loginPanel.add(new JLabel("USUARIO:"));
        usernameField = new JTextField();
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("CONTRASEÑA:"));
        passwordField = new JPasswordField();
        loginPanel.add(passwordField);
        loginButton = new JButton("INICIAR SESION");
        loginButton.addActionListener(e -> showUserInterface());
        loginPanel.add(loginButton);
        add(loginPanel, BorderLayout.CENTER);
    }

    private void createUserInterface() {
        welcomeLabel = new JLabel("Welcome, User!");
        nameLabel = new JLabel("Name: John Doe");
        ageLabel = new JLabel("Age: 30");
        emailLabel = new JLabel("Email: johndoe@example.com");
    }

    private void createLogoutInterface() {
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(e -> showLoginInterface());
    }

    private void showLoginInterface() {
        loginPanel.setVisible(true);
        welcomeLabel.setVisible(false);
        nameLabel.setVisible(false);
        ageLabel.setVisible(false);
        emailLabel.setVisible(false);
        logoutButton.setVisible(false);
    }

    private void showUserInterface() {
        loginPanel.setVisible(false);
        welcomeLabel.setVisible(true);
        nameLabel.setVisible(true);
        ageLabel.setVisible(true);
        emailLabel.setVisible(true);
        logoutButton.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginApp::new);
    }
}