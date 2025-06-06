package main.java.com.visual.access;

/*
 * <strong>MIT License</strong>
 * 
 * <p>Copyright (c) 2025 [BBVA Group].</p>
 * 
 * <p>
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated 
 * documentation files (the “Software”), to use this software and the associated documentation files (the “Software”).
 * of this software and associated documentation files (the “Software”), to use * the Software without restriction, 
 * including without limitation the Software without restriction, including without limitation the rights to use, copy,
 * modify, merge, publish, distribute, sublicense and/or sell copies of the Software, and to permit persons to whom 
 * the Software is furnished to do so, subject to. the following conditions:
 * </p>
 * 
 * <p>
 * The above copyright notice and this permission notice shall be included in all * copies or substantial * portions of 
 * the Software. Copies or substantial portions of the Software.
 * </p>
 * 
 + <p>
 * THE SOFTWARE IS PROVIDED “AS IS” WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR * PURPOSE AND NON-INFRINGEMENT.
 * AND NON-INFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE * LIABLE FOR ANY CLAIM, DAMAGE OR * LIABILITY.
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION IN * CONTRACT, TORT OR OTHERWISE.
 * IN CONTRACT, TORT OR OTHERWISE, ARISING OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OF OR * DEALINGS IN THE 
 * SOFTWARE. OR OTHER DEALINGS IN THE SOFTWARE.
 * </p>
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//for operations with the database
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.java.com.visual.advertising.BenefitsBBVA;
import main.resources.visual.manager.classes.ColorManager;
import main.resources.visual.manager.classes.IconImageManager;
import main.resources.visual.swingcomponents.RoundedJPasswordField;
import main.resources.visual.swingcomponents.RoundedJTextField;
import main.resources.visual.swingcomponents.RoundedPanel;

public class LoginApplication extends JFrame {
	
	private static final long serialVersionUID = 3981617515189931114L;
	
	//attributes for database operation
	private static Connection conn;
	private static PreparedStatement preparedStatement;
	private static Statement stmt;

	/*attributes for GUI*/
	private String placeholder = "not available";
	private static final String ERROR_EMPTY_DATA = "Campo obligatorio";
	
	/*attributes for password control*/
	private boolean isPasswordVisible        = false;
	private static final boolean IS_VISIBLE  = true;
	private static final boolean NOT_VISIBLE = false;
	
	/*attributes for mode login*/
	private static final String NOT_LAUNCH = "not-launched";
	private static final String LAUNCHED = "launch";
	private boolean login_with_username = false;
	private boolean login_with_email    = false;
	
	/*attributes from user*/
	private String userName = "not available";
	private String email    = "not available";
	private String password = "not available";
	
	//objects for visual resources
	//private static CursorTitle title = new CursorTitle();
	private static IconImageManager icon = new IconImageManager();
	private static ColorManager foregroundText        = new ColorManager();
	private static ColorManager backgroundLoginButton = new ColorManager();
	private static ColorManager backgroundFrame       = new ColorManager();
	private static ColorManager backgroundTextBoxes   = new ColorManager();
	
	//declaration to another page
	private static ClientRedirection redirection;
	private static BenefitsBBVA benefits;
	
	private JPanel frame;
	/**/
	private JLabel lbl_close_and_back;
	private JPanel panel_container_logo_section;
	private JPanel panel_content_logo_section;
	private JLabel lbl_bbva_login_icon;
	/**/
	private JPanel panel_container_login_section;
	private JPanel panel_content_login_section;
	private JPanel panel_banner_login_sect;
	private JPanel panel_form_login_sect;
	private JPanel panel_footer_login_sect;
	/**/
	private JLabel lbl_title_banner;
	/**/
	private static JLabel lbl_cursor_dialog;
	private static JLabel lbl_login_mode, lbl_change_login_mode_icon;
	private static JLabel lbl_login_mode_empty, lbl_empty_password;
	private static JLabel lbl_input_password, lbl_forgot_password;
	/**/
	private static JLabel lbl_login_mode_illustration;
    private static JLabel lbl_ico_pass;
	private static JLabel lbl_visibility_password;
	/**/
	private JLabel lbl_suscription;
	private JLabel lbl_to_create_account;
	/**/
	private JPanel button_login_app;
	private JLabel text_login_app;
	/**/
	private static JTextField text_box_credential;
	private static JTextField txt_input_password;	
	private static JPasswordField jps_input_password;
	private JLabel lbl_change_login_mode_arrow;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					LoginApplication frame = new LoginApplication();
					frame.setVisible(true);
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginApplication() {
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				closeLoginPage();
				closeConnection();
			}
			
			public void windowOpened(WindowEvent e) {
				applyLoginMode(LAUNCHED);
				establishConnection();
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginApplication.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Acceder");
		setType(Type.POPUP);
		setResizable(false);
		setLocation(getX() + 240,getY() + 40);
		setSize(900, 670);
		frame = new JPanel();
		frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(frame);
		frame.setLayout(null);

		JTextField txt = new JTextField();
		txt.setBounds(0,0,0,0);
		frame.add(txt);
		
		/*
		 * VISUAL ELEMENTS OF LOGIN WINDOW - SECTION OF LOGO CO.
		 */
		
		panel_container_logo_section = new JPanel();
		panel_container_logo_section.setBounds(0, 0, 385, 631);
		panel_container_logo_section.setBackground(new Color(7, 33, 70));
		panel_container_logo_section.setLayout(null);
		frame.add(panel_container_logo_section);
		
		panel_content_logo_section = new JPanel();
		panel_content_logo_section.setBounds(0,0,385, 620);
		panel_content_logo_section.setBackground(new Color(7, 33, 70));
		panel_content_logo_section.setLayout(null);
		panel_container_logo_section.add(panel_content_logo_section);
		
		lbl_bbva_login_icon = new JLabel();
		lbl_bbva_login_icon.setIcon(icon.BANNER_PRESENTATION_LOGIN_APP);
		lbl_bbva_login_icon.setBounds(0,0,385, 500);
		lbl_bbva_login_icon.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_bbva_login_icon.setVerticalAlignment(SwingConstants.CENTER);
		panel_content_logo_section.add(lbl_bbva_login_icon);
		
		/*
		 * CONTAINERS OF LOGIN SECTION
		 */
		
		panel_container_login_section = new JPanel();
		panel_container_login_section.setBounds(385,0,499,501);
		panel_container_login_section.setBackground(backgroundFrame.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		panel_container_login_section.setLayout(null);
		frame.add(panel_container_login_section);
		
		panel_content_login_section = new JPanel();
		panel_content_login_section.setBounds(0,0,499,495);
		panel_content_login_section.setBackground(backgroundFrame.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		panel_content_login_section.setLayout(null);
		panel_container_login_section.add(panel_content_login_section);
		
		panel_banner_login_sect = new JPanel();
		panel_banner_login_sect.setBounds(0,0,499,81);
		panel_banner_login_sect.setLayout(null);
		panel_banner_login_sect.setBackground(backgroundFrame.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		panel_content_login_section.add(panel_banner_login_sect);
		
		panel_form_login_sect = new JPanel();
		panel_form_login_sect.setForeground(new Color(255, 255, 255));
		panel_form_login_sect.setBounds(0,80,499,410);
		panel_form_login_sect.setBackground(backgroundFrame.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		panel_form_login_sect.setLayout(null);
		panel_content_login_section.add(panel_form_login_sect);
		
		lbl_close_and_back = new JLabel();
		lbl_close_and_back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_close_and_back.setIcon(icon.RETURN_TO_REDIRECTION_PAGE_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_close_and_back.setIcon(icon.RETURN_TO_REDIRECTION_PAGE_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				closeLoginPage();
			}
		});
		lbl_close_and_back.setBounds(25,22,15,40);
		lbl_close_and_back.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lbl_close_and_back.setIcon(icon.RETURN_TO_REDIRECTION_PAGE_EXITED);
		lbl_close_and_back.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_close_and_back.setVerticalAlignment(SwingConstants.CENTER);
		panel_banner_login_sect.add(lbl_close_and_back);
		
		lbl_title_banner = new JLabel();
		lbl_title_banner.setBounds(56,20,421,40);
		lbl_title_banner.setText("Iniciar sesión");
		lbl_title_banner.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 38));
		lbl_title_banner.setForeground(new Color(5,51,101));
		lbl_title_banner.setHorizontalAlignment(SwingConstants.LEFT);
		panel_banner_login_sect.add(lbl_title_banner);
		
		/*
		 * VISUAL ELEMENTS OF LOGIN WINDOW - LOGIN SECTION
		 */
		
		lbl_cursor_dialog = new JLabel();
		lbl_cursor_dialog.setBounds(315, 11, 130, 20);
		lbl_cursor_dialog.setForeground(new Color(0, 0, 0));
		lbl_cursor_dialog.setFont(new Font("Nirmala UI Semilight", Font.PLAIN, 13));
		lbl_cursor_dialog.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_cursor_dialog.setVerticalAlignment(SwingConstants.CENTER);
		panel_form_login_sect.add(lbl_cursor_dialog);
		
		lbl_change_login_mode_icon = new JLabel();
		lbl_change_login_mode_icon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_change_login_mode_arrow.setIcon(icon.CHANGE_LOGIN_MODE_ARROW);
				lbl_cursor_dialog.setVisible(true);
				
				if (loginModeEmail()) {
					lbl_cursor_dialog.setText("Ingresar con tu Correo");
					lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_EMAIL_ENTERED);
				    return;
				}
				
				lbl_cursor_dialog.setText("Ingresar con tu Usuario");
				lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_USER_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {				
				lbl_change_login_mode_arrow.setIcon(icon.LEAVE_PAGE_EXITED);
				lbl_cursor_dialog.setVisible(false);

				if (loginModeEmail()) {
					lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_EMAIL_EXITED);
				    return;
				}
				
				lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_USER_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				applyLoginMode(NOT_LAUNCH);
				
				if (loginModeUser()) 
					lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_USER_ENTERED);
				else 
					lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_EMAIL_ENTERED);
				
				
				if (loginModeUser())
					setLoginMode(login_with_username = true, login_with_email = false);
				
				else if (loginModeEmail())
					setLoginMode(login_with_username = false, login_with_email = true);
			}
		});
		lbl_change_login_mode_icon.setBounds(305, 40, 45, 25);
		lbl_change_login_mode_icon.setIcon(icon.LOGIN_MODE_EMAIL_EXITED);
		lbl_change_login_mode_icon.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_change_login_mode_icon.setVerticalAlignment(SwingConstants.CENTER);
		lbl_change_login_mode_icon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_form_login_sect.add(lbl_change_login_mode_icon);
		
		lbl_change_login_mode_arrow = new JLabel();
		lbl_change_login_mode_arrow.setBounds(341, 38, 15, 30);
		lbl_change_login_mode_arrow.setIcon(icon.LEAVE_PAGE_EXITED);
		lbl_change_login_mode_arrow.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_change_login_mode_arrow.setVerticalAlignment(SwingConstants.CENTER);
		panel_form_login_sect.add(lbl_change_login_mode_arrow);
		
		lbl_login_mode = new JLabel();
		lbl_login_mode.setBounds(32, 29, 170, 40);
		lbl_login_mode.setText("Nombre de usuario");
		lbl_login_mode.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl_login_mode.setForeground(new Color(0,0,0));
		lbl_login_mode.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_login_mode.setVerticalAlignment(SwingConstants.CENTER);
		panel_form_login_sect.add(lbl_login_mode);
		
		lbl_login_mode_illustration = new JLabel();
		lbl_login_mode_illustration.setBounds(212, 33, 35, 35);
		lbl_login_mode_illustration.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login_mode_illustration.setVerticalAlignment(SwingConstants.CENTER);
		lbl_login_mode_illustration.setIcon(icon.LOGIN_USER);
		panel_form_login_sect.add(lbl_login_mode_illustration);
		
		lbl_login_mode_empty = new JLabel();
		lbl_login_mode_empty.setBounds(32, 123, 260, 30);
		lbl_login_mode_empty.setText(ERROR_EMPTY_DATA);
		lbl_login_mode_empty.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lbl_login_mode_empty.setForeground(new Color(231, 76, 60));
		lbl_login_mode_empty.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_login_mode_empty.setVerticalAlignment(SwingConstants.CENTER);
		lbl_login_mode_empty.setVisible(false);
		panel_form_login_sect.add(lbl_login_mode_empty);
		
		text_box_credential = new RoundedJTextField(.5);
		text_box_credential.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) { 
				
				text_box_credential.setEditable(true);
				text_box_credential.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
				text_box_credential.setForeground(new Color(0,0,0));

				if (text_box_credential.getText().equals(getPlaceHolder())) {
					text_box_credential.setText("");
				}else {
					text_box_credential.setText(text_box_credential.getText() + "");
				}
				
				if (lbl_login_mode_empty.isVisible()) lbl_login_mode_empty.setVisible(false);
			}
		});
		text_box_credential.setBounds(32,77,322,45);
		text_box_credential.setText(getPlaceHolder());
		text_box_credential.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		text_box_credential.setForeground(new Color(98, 101, 103));
		text_box_credential.setBackground(backgroundTextBoxes.PRIMARY_COLOR_FONT_TEXT_WHITE);
		text_box_credential.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
		text_box_credential.setEditable(false);
		panel_form_login_sect.add(text_box_credential);
		
		lbl_input_password = new JLabel();
		lbl_input_password.setBounds(32, 178, 170, 40);
		lbl_input_password.setText("Contraseña");
		lbl_input_password.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lbl_input_password.setForeground(new Color(0,0,0));
		lbl_input_password.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_input_password.setVerticalAlignment(SwingConstants.CENTER);
		panel_form_login_sect.add(lbl_input_password);
		
		lbl_ico_pass = new JLabel();
		lbl_ico_pass.setBounds(142, 181, 35, 35);
		lbl_ico_pass.setIcon(icon.BLOCKED_PASSWORD);
		lbl_ico_pass.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_ico_pass.setVerticalAlignment(SwingConstants.CENTER);
		panel_form_login_sect.add(lbl_ico_pass);
		
		jps_input_password = new RoundedJPasswordField(.5);
		jps_input_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				jps_input_password.setEditable(true);
				jps_input_password.setFont(new Font("Yu Gothic UI", Font.PLAIN, 11));

				if (String.valueOf(jps_input_password.getPassword()).length() != 0) {
					jps_input_password.setText(String.valueOf(jps_input_password.getPassword()) + "");
				}
				
				if (lbl_empty_password.isVisible()) {
					lbl_empty_password.setVisible(false);
					lbl_forgot_password.setBounds(32, 270, 165, 30);
				}
			}
		});
		jps_input_password.setEditable(true);
		jps_input_password.setBounds(32,223,322,45);
		jps_input_password.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 8));
		jps_input_password.setForeground(new Color(98, 101, 103));
		jps_input_password.setBackground(backgroundTextBoxes.PRIMARY_COLOR_FONT_TEXT_WHITE);
		jps_input_password.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
		jps_input_password.setVisible(true);
		jps_input_password.setEditable(false);
		panel_form_login_sect.add(jps_input_password);
		
		txt_input_password = new RoundedJTextField(.5);
		txt_input_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				txt_input_password.setEditable(true);
				
				if (txt_input_password.getText().length() != 0) {
					txt_input_password.setText(txt_input_password.getText() + "");
				}
				
				if (lbl_empty_password.isVisible()) {
					lbl_empty_password.setVisible(false);
					lbl_forgot_password.setBounds(32, 270, 165, 30);
				}
			}
		});
		txt_input_password.setBounds(32,223,322,45);
		txt_input_password.setFont(new Font("Yu Gothic UI", Font.PLAIN, 18));
		txt_input_password.setForeground(new Color(0,0,0));
		txt_input_password.setBackground(backgroundTextBoxes.PRIMARY_COLOR_FONT_TEXT_WHITE);
		txt_input_password.setBorder(BorderFactory.createStrokeBorder(new BasicStroke(1f)));
		txt_input_password.setVisible(false);
		txt_input_password.setEditable(false);
		panel_form_login_sect.add(txt_input_password);
		
		lbl_visibility_password = new JLabel();
		lbl_visibility_password.addMouseListener(new MouseAdapter() {
			//If getPasswordVisibility() return true -> Password is visible
			//If getPasswordVisibility() return false -> Password is not visible
			
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				boolean state = getPasswordVisibility();
				
				if (state == IS_VISIBLE) 
					setPasswordVisibility(false);
				else 
					setPasswordVisibility(true);
				
				applyIconVisibilityEvents(state);
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if (getPasswordVisibility() == IS_VISIBLE) 
					lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_HIDDEN_ENTERED);
				else 
					lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_VISIBLE_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				if (getPasswordVisibility() == IS_VISIBLE) 
					lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_HIDDEN_EXITED);
				else 
					lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_VISIBLE_EXITED);
			}
		});
		lbl_visibility_password.setBounds(374, 228, 35, 35);
		lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_VISIBLE_EXITED);
		lbl_visibility_password.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_visibility_password.setVerticalAlignment(SwingConstants.CENTER);
		lbl_visibility_password.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_form_login_sect.add(lbl_visibility_password);
		
		lbl_empty_password = new JLabel();
		lbl_empty_password.setBounds(32, 270, 260, 30);
		lbl_empty_password.setText(ERROR_EMPTY_DATA);
		lbl_empty_password.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lbl_empty_password.setForeground(new Color(231, 76, 60));
		lbl_empty_password.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_empty_password.setVerticalAlignment(SwingConstants.CENTER);
		lbl_empty_password.setVisible(false);
		panel_form_login_sect.add(lbl_empty_password);
		
		lbl_forgot_password = new JLabel();
		lbl_forgot_password.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_forgot_password.setForeground(backgroundLoginButton.FOREGROUND_COLOR_BBVA_DEFAULT_COLOR);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_forgot_password.setForeground(backgroundLoginButton.PRIMARY_COLOR_FONT_TEXT_BLACK);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(null, "Funcionalidad aún en desarrollo...", "Mensaje del desarrollador", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lbl_forgot_password.setBounds(32, 270, 165, 30);
		lbl_forgot_password.setText("Olvidé mi contraseña");
		lbl_forgot_password.setFont(new Font("Microsoft JhengHei UI Light", Font.PLAIN, 17));
		lbl_forgot_password.setForeground(backgroundLoginButton.PRIMARY_COLOR_FONT_TEXT_BLACK);
		lbl_forgot_password.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_forgot_password.setVerticalAlignment(SwingConstants.CENTER);
		lbl_forgot_password.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_form_login_sect.add(lbl_forgot_password);
		
		button_login_app = new RoundedPanel();
		button_login_app.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_login_app.setBackground(new Color(19, 53, 101));
			}
			
			public void mouseExited(MouseEvent e) {
				button_login_app.setBackground(backgroundLoginButton.BACKGROUND_COLOR_BBVA_OFFICIAL);
			}
			
			public void mouseClicked(MouseEvent e) {
				
				/**
				 * <p>Does the user want login with the user-name 
				 *    or email?</p>
				 */
				if (loginModeUser() && !loginModeEmail())
				{
					/*The user wants login with the user-name*/
					setUser(text_box_credential);
					setLoginMode(login_with_username = true, login_with_email = false);
				}
				else
				{
					/*The user wants login with the email address*/
					setEmail(text_box_credential);
					setLoginMode(login_with_username = false, login_with_email = true);
				}
				
				/**
				 * <p>Is the password visible or not?</p>
				 */
				if (getPasswordVisibility() == NOT_VISIBLE)
					setPassword(jps_input_password); // -> is not visible
				
				else if (getPasswordVisibility() == IS_VISIBLE)
					setPassword(txt_input_password); // -> is visible

				//There is any null or empty data?
				if (isLoginModeEmpty() || isPasswordEmpty())
					applyErrorLoginEvents(); // -> error detected, deny access
				else
				{
					if (login()) {
						System.out.print("welcome");
					}else {
						System.out.print("denied");
					}
					
					/*JOptionPane.showMessageDialog(null, "Todo ok, ahora el siguiente proceso\n"
							+ "es establecer conexión con la BD y validar las credenciales\n"
							+ "del usuario y permiterle el acceso o denegarle.\n\n"
							+ "Este último proceso para ingresar a la aplicación aún esta\n"
							+ "en desarrollo...");*/	
				}
							
			}
		});
		button_login_app.setLocation(144, 345);
		button_login_app.setSize(210, 53);
		button_login_app.setBackground(backgroundLoginButton.BACKGROUND_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) button_login_app).setCornerRadius(10);
		button_login_app.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_login_app.setLayout(null);
		panel_form_login_sect.add(button_login_app);
		
		text_login_app = new JLabel();
		text_login_app.setLocation(5, 5);
		text_login_app.setSize(button_login_app.getWidth() - 5, button_login_app.getHeight() - 5);
		text_login_app.setText("Iniciar sesión");
		text_login_app.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 21));
		text_login_app.setForeground(new Color(255,255,255));
		text_login_app.setHorizontalAlignment(SwingConstants.CENTER);
		text_login_app.setVerticalAlignment(SwingConstants.CENTER);
		button_login_app.add(text_login_app);
		
		/*
		 *  VISUAL ELEMENTS OF LOGIN WINDOW - FOOTER SECTION
		 */
		
		panel_footer_login_sect = new JPanel();
		panel_footer_login_sect.setBounds(385, 502, 499, 129);
		frame.add(panel_footer_login_sect);
		panel_footer_login_sect.setBackground(backgroundFrame.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		panel_footer_login_sect.setLayout(null);
		
		lbl_suscription = new JLabel();
		lbl_suscription.setBounds(0, 28, panel_footer_login_sect.getWidth(), 30);
		lbl_suscription.setText("¿Aún no tienes una cuenta en BBVA Digital?");
		lbl_suscription.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		lbl_suscription.setForeground(new Color(0,0,0));
		lbl_suscription.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_suscription.setVerticalAlignment(SwingConstants.CENTER);
		panel_footer_login_sect.add(lbl_suscription);
		
		lbl_to_create_account = new JLabel();
		lbl_to_create_account.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				benefits = new BenefitsBBVA();
				benefits.setVisible(true);
				dispose();
			}
		});
		lbl_to_create_account.setSize(120, 30);
		lbl_to_create_account.setLocation((lbl_suscription.getWidth()/2) - lbl_to_create_account.getWidth() / 2, 59);
		lbl_to_create_account.setText("Regístrate aquí");
		lbl_to_create_account.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		lbl_to_create_account.setForeground(foregroundText.FOREGROUND_COLOR_BBVA_LIGHT_COLOR);
		lbl_to_create_account.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_to_create_account.setVerticalAlignment(SwingConstants.CENTER);
		lbl_to_create_account.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel_footer_login_sect.add(lbl_to_create_account);
	}
	
	/*
	 * =========================
	 * SETTER AND GETTER METHODS
	 * =========================
	 * */
	
	private void setUser(JTextField userName) {
		this.userName = userName.getText();
	}
	
	private void setEmail(JTextField email) {
		this.email = email.getText();
	}
	
	private void setPassword(JTextField password) {
		this.password = password.getText();
	}
	
	private void setPassword(JPasswordField password) {
		this.password = String.valueOf(password.getPassword());
	}
	
	private void setPasswordVisibility(boolean isPasswordVisible) {
		this.isPasswordVisible = isPasswordVisible;
	}
	
	private String getUser() {
		return userName;
	}
	
	private String getEmail() {
		return email;
	}
	
	private String getPassword() {
		return password;
	}
	
	private boolean getPasswordVisibility() {
		return isPasswordVisible;
	}
	
	private void setPlaceHolder(String placeholder) {
		this.placeholder = "   ".concat(placeholder);
	}
	
	private String getPlaceHolder() {
		return placeholder;
	}
	
	/**
	 * @param login_with_username
	 * @param login_with_email
	 */
	private void setLoginMode(boolean login_with_username,
			boolean login_with_email)
	{
		this.login_with_username = login_with_username;
		this.login_with_email = login_with_email;
	}
	
	private boolean loginModeUser() {
		return login_with_username;
	}
	
	private boolean loginModeEmail() {
		return login_with_email;
	}
	
	/*
	 * +===============================+
	 *  CONTROLLER METHODS TO DATABASE
	 * +===============================+
	 * */
	private void establishConnection() {
		
        try {
        	// Load the JDBC driver
        	Class.forName("com.mysql.cj.jdbc.Driver");

        	// establish a connection to the database
        	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bbva", "root", "");
        	
        	if (conn != null)
        		System.out.print("ALL OK!!");
        	
        }catch(SQLException | ClassNotFoundException e) {
        	e.printStackTrace();
        	
        }
	}
	
	private static boolean login() {		
		String username_txt = text_box_credential.getText();
		String password_txt = txt_input_password.getText();			
			
		try {
			
			stmt = conn.createStatement();
			boolean findedUser = stmt.execute("SELECT username FROM user WHERE username = '" + username_txt + "'");
			
			if (findedUser) {
				boolean findedPassword = stmt.execute("SELECT * FROM user WHERE password = '" + password_txt + "'");
				
				if (findedPassword) 
					return true;
			}
			
		} catch (SQLException exeptionsql) {
			JOptionPane.showMessageDialog(null,exeptionsql.getMessage(),
					"Error en la base de datos",JOptionPane.ERROR_MESSAGE);

		} 

		return false;
	}
	
	private static void handleSQLException(SQLException e) {
		// handle the SQL exception
        int errorCode = ((SQLException) e).getErrorCode();
        String sqlState = ((SQLException) e).getSQLState();
        String errorMessage = e.getMessage();

        System.out.println("SQL Error Code: " + errorCode);
        System.out.println("SQL State: " + sqlState);
        System.out.println("Error Message: " + errorMessage);

        e.printStackTrace();
	}
	
	private static void closeConnection() {
		
		try {
			if (preparedStatement != null)
				preparedStatement.close();
			
			if (conn != null)
				conn.close();
			
		}catch(SQLException e) {
			handleSQLException(e);
		}
	}
	
	/*
	 * =========================
	 * CONTROLLER METHODS
	 * =========================
	 * */
	
	private void applyIconVisibilityEvents(boolean visibility_password) {
	
		if (visibility_password != NOT_VISIBLE) 
		{
			/*--hide password--*/
			lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_VISIBLE_ENTERED);
			lbl_ico_pass.setIcon(icon.BLOCKED_PASSWORD);
			
			txt_input_password.setVisible(false);
			jps_input_password.setVisible(true);
			jps_input_password.setText(txt_input_password.getText());
		}
		else 
		{
			/*--show password--*/
			lbl_visibility_password.setIcon(icon.PASSWORD_VISIBILITY_HIDDEN_ENTERED);
			lbl_ico_pass.setIcon(icon.UNLOCKED_PASSWORD);
			
			txt_input_password.setVisible(true);
			jps_input_password.setVisible(false);
			txt_input_password.setText(String.valueOf(jps_input_password.getPassword()));
		}
	}
	
	private void applyLoginMode(String event) {
		
		if (loginModeUser() || event.equals(LAUNCHED))
		{
			lbl_login_mode.setText("Nombre de usuario");
			lbl_login_mode_illustration.setIcon(icon.LOGIN_USER);
			
			setPlaceHolder("Escribe tu usuario");
			text_box_credential.setText(getPlaceHolder());
			
			setLoginMode(login_with_username = false, login_with_email = true);
			return;
		}
		
		lbl_login_mode.setText("Correo electrónico");
		lbl_login_mode_illustration.setIcon(icon.LOGIN_EMAIL);
		
		setPlaceHolder("Escribe tu dirección de email");
		text_box_credential.setText(getPlaceHolder());
		
		setLoginMode(login_with_username = true, login_with_email = false);
	}
	
	private boolean isLoginModeEmpty() {			
		if (loginModeUser() && !loginModeEmail()) 
		{
			return getUser().length() == 0
			    	|| getUser().equals(getPlaceHolder());
		}
		
		return getEmail().length() == 0
				|| getEmail().equals(getPlaceHolder());
	}
	
	private boolean isPasswordEmpty() {
		return getPassword().length() == 0
				|| getPassword() == null;
	}
	
	private void applyErrorLoginEvents() {
		String loginMode = text_box_credential.getText();
		String password  = getPassword();
		
		if ((loginMode.length() == 0 || loginMode.equals(getPlaceHolder()))
				&& (password.length() == 0 || password.equals(null))) 
		{
			lbl_login_mode_empty.setVisible(true);
			lbl_empty_password.setVisible(true);
			lbl_forgot_password.setBounds(32, (lbl_empty_password.getY() + 30) + 3, 165, 30);
		}
		else 
		{
			if (loginMode.length() == 0 || loginMode.equals(getPlaceHolder())) 
			{
				lbl_login_mode_empty.setVisible(true);
			}
			else 
			{
				if (password.length() == 0 || password.equals(null)) 
				{
					lbl_empty_password.setVisible(true);
					lbl_forgot_password.setBounds(32, (lbl_empty_password.getY() + 30) + 3, 165, 30);
				}
			}
		}
    }
	
	private void closeLoginPage() {
		redirection = new ClientRedirection();
		redirection.setVisible(true);
		dispose();
	}
}
