package parkingSystem.gui;
import parkingSystem.database.MaintainUser;
import parkingSystem.model.AbstractUser;
import parkingSystem.model.UserFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class signupInterface extends JFrame 
{
	private JTextField nameField, emailField;
    private JPasswordField passwordField;
    private JComboBox<String> roleBox;
    private JButton signUpButton;
    private JLabel messageLabel, loginLabel;

    public signupInterface() 
    {
        setTitle("Sign Up");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 10, 5, 10); // Spacing

        gbc.anchor = GridBagConstraints.WEST; // Align to left

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(new JLabel("Name:"), gbc);
        gbc.gridy = 1;
        nameField = new JTextField(20);
        panel.add(nameField, gbc);

        gbc.gridy = 2;
        panel.add(new JLabel("Email:"), gbc);
        gbc.gridy = 3;
        emailField = new JTextField(20);
        panel.add(emailField, gbc);

        gbc.gridy = 4;
        panel.add(new JLabel("Password:"), gbc);
        gbc.gridy = 5;
        passwordField = new JPasswordField(20);
        panel.add(passwordField, gbc);

        gbc.gridy = 6;
        panel.add(new JLabel("Role:"), gbc);
        gbc.gridy = 7;
        String[] roles = {"Student", "Faculty", "Non-Faculty", "Visitor"};
        roleBox = new JComboBox<>(roles);
        panel.add(roleBox, gbc);

        gbc.gridy = 8;
        signUpButton = new JButton("Sign Up");
        panel.add(signUpButton, gbc);

        messageLabel = new JLabel("", SwingConstants.LEFT);
        messageLabel.setForeground(Color.RED);
        gbc.gridy = 9;
        panel.add(messageLabel, gbc);

        loginLabel = new JLabel("<html><u>Already have an account? Log in here</u></html>");
        loginLabel.setForeground(Color.BLUE);
        loginLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gbc.gridy = 10;
        panel.add(loginLabel, gbc);

        add(panel);

        signUpButton.addActionListener(e -> registerUser());

        loginLabel.addMouseListener(new MouseAdapter() 
        {
            @Override
            public void mouseClicked(MouseEvent e) 
            {
                openLogin();
            }
        });
    }

    private void registerUser() 
    {
        String name = nameField.getText();
        String email = emailField.getText();
        String password = new String(passwordField.getPassword());
        String role = (String) roleBox.getSelectedItem();

        if (name.isEmpty() || email.isEmpty() || password.isEmpty()) 
        {
            messageLabel.setText("Error: All fields must be filled!");
            return;
        }
        
        try 
        {
            MaintainUser maintainUser = new MaintainUser();
            maintainUser.load();

            if (maintainUser.getUserByEmail(email) != null) 
            {
                messageLabel.setText("Error: Email already in use!");
                return;
            }

            if (!isValidPassword(password)) 
            {
                messageLabel.setText("Error: Password must have uppercase, lowercase, number & symbol!");
                return;
            }

            AbstractUser user = UserFactory.createUser(name, email, password, role);

            if (user != null) 
            {
                maintainUser.addUser(user);
                messageLabel.setForeground(Color.BLUE);
                messageLabel.setText("Registration successful! " +
                        (role.equalsIgnoreCase("Visitor") ?
                                "Auto-validated." : "Pending Manager approval."));
            } else 
            {
                messageLabel.setText("Error: Registration failed.");
            }
        } catch (Exception ex)
        {
            ex.printStackTrace();
            messageLabel.setText("Error: Could not save user.");
        }
    }

    private boolean isValidPassword(String password) 
    {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[\\W_]).{8,}$");
    }

    private void openLogin() 
    {
    	loginInterface loginFrame = new loginInterface();
        loginFrame.setVisible(true);
        loginFrame.setLocationRelativeTo(null);
        this.dispose();
    }

    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new signupInterface().setVisible(true));
    }
}
