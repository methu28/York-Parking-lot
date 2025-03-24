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
public class loginInterface extends JFrame 
{
	  private JTextField emailField;
	    private JPasswordField passwordField;
	    private JButton loginButton;
	    private JLabel messageLabel, signUpLabel;

	    public loginInterface() 
	    {
	        setTitle("Login");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        JPanel panel = new JPanel(new GridBagLayout());
	        GridBagConstraints gbc = new GridBagConstraints();
	        gbc.insets = new Insets(5, 10, 5, 10); // Spacing

	        gbc.anchor = GridBagConstraints.WEST; // Align to left

	        gbc.gridx = 0;
	        gbc.gridy = 0;
	        panel.add(new JLabel("Email:"), gbc);
	        gbc.gridy = 1;
	        emailField = new JTextField(20);
	        panel.add(emailField, gbc);

	        gbc.gridy = 2;
	        panel.add(new JLabel("Password:"), gbc);
	        gbc.gridy = 3;
	        passwordField = new JPasswordField(20);
	        panel.add(passwordField, gbc);

	        gbc.gridy = 4;
	        loginButton = new JButton("Login");
	        panel.add(loginButton, gbc);

	        messageLabel = new JLabel("", SwingConstants.LEFT);
	        messageLabel.setForeground(Color.RED);
	        gbc.gridy = 5;
	        panel.add(messageLabel, gbc);

	        signUpLabel = new JLabel("<html><u>Don't have an account? Sign up here</u></html>");
	        signUpLabel.setForeground(Color.BLUE);
	        signUpLabel.setCursor(new Cursor(Cursor.HAND_CURSOR));
	        gbc.gridy = 6;
	        panel.add(signUpLabel, gbc);

	        add(panel);

	        loginButton.addActionListener(e -> loginUser());

	        signUpLabel.addMouseListener(new MouseAdapter() 
	        {
	            @Override
	            public void mouseClicked(MouseEvent e) 
	            {
	                openSignUp();
	            }
	        });
	    }

	    private void loginUser() 
	    {
	        String email = emailField.getText();
	        String password = new String(passwordField.getPassword());

	        try 
	        {
	            MaintainUser maintainUser = new MaintainUser();
	            maintainUser.load();

	            if (UserFactory.validateLogin(email, password)) 
	            {
	                AbstractUser loggedInUser = maintainUser.getUserByEmail(email);
	                JOptionPane.showMessageDialog(this, "Login successful! Welcome " + loggedInUser.getName() +
	                        " (" + loggedInUser.getRole() + ")");
	                this.dispose();
	            } else 
	            {
	                messageLabel.setText("Error: Invalid email or password.");
	            }
	        } catch (Exception ex) 
	        {
	            ex.printStackTrace();
	            messageLabel.setText("Error: Could not validate login.");
	        }
	    }

	    private void openSignUp() 
	    {
	    	signupInterface signUpFrame = new signupInterface();
	        signUpFrame.setVisible(true);
	        signUpFrame.setLocationRelativeTo(null);
	        this.dispose();
	    }

	    public static void main(String[] args) 
	    {
	        SwingUtilities.invokeLater(() -> new loginInterface().setVisible(true));
	    }
}
