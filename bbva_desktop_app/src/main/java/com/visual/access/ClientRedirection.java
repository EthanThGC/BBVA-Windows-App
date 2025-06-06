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

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.java.com.visual.legal.*;
import main.java.com.visual.advertising.BenefitsBBVA;
import main.resources.visual.manager.classes.*;
import main.resources.visual.swingcomponents.*;

public class ClientRedirection extends JFrame {

	private static final long serialVersionUID = -8454025501829308453L;

	private JPanel Frame;
	
	//instance to access and create account
	private LoginApplication login;
	private BenefitsBBVA showBenefits; 
	private AboutBBVASoftware aboutPR;
	private CorporateInformation1 infoCorp;

	//web site
	private final String OFFICIAL_WEB_SITE = "https://www.bbva.mx/personas/centro-de-ayuda/ayuda-urgente.html";
	private Link link;
	
	//Visual resources
	private IconImageManager icon = new IconImageManager();
	private ColorManager background = new ColorManager();
	private ColorManager foreground = new ColorManager();
	
	private JLabel banner_bbva;
	
	private JPanel container;
	
	private JPanel container_central;
	private JPanel content_central;
	
	private JPanel content_buttons_redirection;
	private JPanel content_version_card;
	
	private JPanel footer;
	
	private JLabel lbl_login_application;
	private JLabel lbl_register_account;
	private JLabel lbl_redirection_web_site;
	private JLabel lbl_icon_open_wb_st;
	private JPanel button_login_application;
	private JPanel button_register_account;
	private JPanel button_redirection_website;
	
	private JLabel lbl_version_info;
	private JLabel lbl_privacy_policies, lbl_privacy_illustration; 
	private JLabel lbl_copyright_product;
	
	//private Color BackgroundColorFrame = new Color(7, 33, 70); //0, 66, 132
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					ClientRedirection frame = new ClientRedirection();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ClientRedirection() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ClientRedirection.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setTitle("BBVA Digital App");
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(225, 18, 913, 700);
		Frame = new JPanel();
		Frame.setBackground(background.BACKGROUND_COLOR_BBVA_DEFAULT_COLOR);
		Frame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Frame);
		Frame.setLayout(null);
		
		/**
		 * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		 */
		
		container = new JPanel();
		container.setBounds(0, 0, 897, 661);
		container.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		container.setLayout(null);
		Frame.add(container);
				
		banner_bbva = new JLabel();
		banner_bbva.setSize(897, 170);
		banner_bbva.setLocation(0, 0);
		banner_bbva.setIcon(icon.BBVA_APP_FOR_WINDOWS_BANNER);
		banner_bbva.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(banner_bbva);
		
		container_central = new RoundedPanel();
		container_central.setLocation(230, 209);
		container_central.setSize(440, 280);
		container_central.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) container_central ).setCornerRadius(40);
		container_central.setOpaque(false);
		container_central.setLayout(null);
		container.add(container_central);
		
		content_central = new JPanel(); 
		content_central.setSize(410, 256);
		content_central.setLocation(16, 13);
		content_central.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		content_central.setLayout(null);
		container_central.add(content_central);
		
		content_buttons_redirection = new JPanel(); 
		content_buttons_redirection.setBounds(0,0,410,256);
		content_buttons_redirection.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		content_buttons_redirection.setLayout(null);
		content_central.add(content_buttons_redirection);
		
		content_version_card = new JPanel(); 
		content_version_card.setLocation(230, 490);
		content_version_card.setSize(440, 30);
		content_version_card.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		content_version_card.setLayout(null);
		container.add(content_version_card);
		
		footer = new JPanel();
		footer.setLocation(230, 595);
		footer.setSize(440, 60);
		footer.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		footer.setLayout(null);
		container.add(footer);
		
		/**
		 * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		 */
		
		button_login_application = new RoundedPanel();
		button_login_application.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_login_application.setBackground(new Color(19, 53, 101));
			}
			
			public void mouseExited(MouseEvent e) {
				button_login_application.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
			}
			
			public void mouseClicked(MouseEvent e) {
				login = new LoginApplication();
				login.setVisible(true);
				dispose();
			}
		});
		button_login_application.setBounds(73, 20, 260, 55);
		button_login_application.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) button_login_application).setCornerRadius(10);
		button_login_application.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_login_application.setLayout(null);
		content_buttons_redirection.add(button_login_application);
		
		lbl_login_application = new JLabel();
		lbl_login_application.setBounds(5,5,255,50);
		lbl_login_application.setText("Ingresar a mi cuenta");
		lbl_login_application.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 21));
		lbl_login_application.setForeground(new Color(255,255,255));
		lbl_login_application.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_login_application.setVerticalAlignment(SwingConstants.CENTER);
		button_login_application.add(lbl_login_application);
		
		button_register_account = new RoundedPanel();
		button_register_account.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_register_account.setBackground(new Color(210, 228, 255));
			}
			
			public void mouseExited(MouseEvent e) {
				button_register_account.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
			}
			
			public void mouseClicked(MouseEvent e) {
				showBenefits = new BenefitsBBVA();
				showBenefits.setVisible(true);
				dispose();
			}
		});
		button_register_account.setBounds(73, 96, 260, 55);
		//button_register_account.setBackground(new Color(232, 241, 255));
		button_register_account.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) button_register_account).setCornerRadius(10);
		button_register_account.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_register_account.setLayout(null);
		content_buttons_redirection.add(button_register_account);

		lbl_register_account = new JLabel();
		lbl_register_account.setBounds(5,5,255,50);
		lbl_register_account.setText("Crearme una cuenta");
		lbl_register_account.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		lbl_register_account.setForeground(foreground.FOREGROUND_COLOR_BBVA_DEFAULT_COLOR);
		lbl_register_account.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_register_account.setVerticalAlignment(SwingConstants.CENTER);
		button_register_account.add(lbl_register_account);
		
		button_redirection_website = new RoundedPanel();
		button_redirection_website.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				button_redirection_website.setBackground(new Color(210, 228, 255));
				lbl_icon_open_wb_st.setIcon(icon.OPEN_EXTERNAL_WEB_SITE_ABOUT_BBVA_ENTERED);
			}
			
			public void mouseExited(MouseEvent e) {
				button_redirection_website.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
				lbl_icon_open_wb_st.setIcon(icon.OPEN_EXTERNAL_WEB_SITE_ABOUT_BBVA_EXITED);
			}
		
			public void mouseClicked(MouseEvent e1) {
				try 
				{
					link = new Link(OFFICIAL_WEB_SITE);
					link.openWebSite();
				}
				catch(URISyntaxException e)
				{
					JOptionPane.showMessageDialog(null,
							"Lo sentimos.\nTuvimos problemas al intentar abrir el sitio web.\n\n"+e.getCause()+"\n\n",
							"Error de sistema",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		button_redirection_website.setBounds(73, 173, 260, 55);
		//button_redirection_website.setBackground(new Color(232, 241, 255));
		button_redirection_website.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) button_redirection_website).setCornerRadius(10);
		button_redirection_website.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_redirection_website.setLayout(null);
		content_buttons_redirection.add(button_redirection_website);

		lbl_redirection_web_site = new JLabel();
		lbl_redirection_web_site.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_redirection_web_site.setBounds(5,5,255,50);
		lbl_redirection_web_site.setText("Necesitas ayuda ?");
		lbl_redirection_web_site.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 19));
		lbl_redirection_web_site.setForeground(foreground.FOREGROUND_COLOR_BBVA_DEFAULT_COLOR);
		lbl_redirection_web_site.setVerticalAlignment(SwingConstants.CENTER);
		button_redirection_website.add(lbl_redirection_web_site);
		
		lbl_icon_open_wb_st = new JLabel();
		lbl_icon_open_wb_st.setBounds(225, 10, 20, 45);
		lbl_icon_open_wb_st.setIcon(icon.OPEN_EXTERNAL_WEB_SITE_ABOUT_BBVA_EXITED);
		lbl_icon_open_wb_st.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_icon_open_wb_st.setVerticalAlignment(SwingConstants.CENTER);
		button_redirection_website.add(lbl_icon_open_wb_st);
		
		lbl_version_info = new JLabel();
		lbl_version_info.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_version_info.setForeground(new Color(0, 202, 214));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_version_info.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				informationCardAboutApplication();
			}
		});
		lbl_version_info.setBounds(320, 0, 120, 30);
		lbl_version_info.setText("Versión 1.1.001");
		lbl_version_info.setFont(new Font("Consolas", Font.PLAIN, 13));
		lbl_version_info.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		lbl_version_info.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_version_info.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl_version_info.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_version_card.add(lbl_version_info);
		
		lbl_privacy_illustration = new JLabel();
		lbl_privacy_illustration.setSize(25, 25);
		lbl_privacy_illustration.setLocation(350, 5);
		lbl_privacy_illustration.setIcon(icon.PRIVACY_POLICY_EXITED);
		lbl_privacy_illustration.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_privacy_illustration.setVerticalAlignment(SwingConstants.CENTER);
		footer.add(lbl_privacy_illustration);
		
		lbl_privacy_policies = new JLabel();
		lbl_privacy_policies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lbl_privacy_policies.setForeground(new Color(0, 202, 214));
				lbl_privacy_illustration.setIcon(icon.PRIVACY_POLICY_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lbl_privacy_policies.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				lbl_privacy_illustration.setIcon(icon.PRIVACY_POLICY_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				corporateInformation();
			}
		});
		lbl_privacy_policies.setSize(footer.getWidth(), 30);
		lbl_privacy_policies.setLocation(0, 0);
		lbl_privacy_policies.setText("Políticas de seguridad y privacidad");
		lbl_privacy_policies.setFont(new Font("Nirmala UI", Font.PLAIN, 15));
		lbl_privacy_policies.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		lbl_privacy_policies.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_privacy_policies.setVerticalAlignment(SwingConstants.CENTER);
		lbl_privacy_policies.setCursor(new Cursor(Cursor.HAND_CURSOR));
		footer.add(lbl_privacy_policies);
		
		lbl_copyright_product = new JLabel();
		lbl_copyright_product.setSize(footer.getWidth(), 30);
		lbl_copyright_product.setLocation(0, 30);
		lbl_copyright_product.setText("Copyright © 2025 Grupo BBVA. Todos los derechos reservados");
		lbl_copyright_product.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 14));
		lbl_copyright_product.setForeground(new Color(255,255,255));
		lbl_copyright_product.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_copyright_product.setVerticalAlignment(SwingConstants.CENTER);
		footer.add(lbl_copyright_product);
		
		JPanel panel = new RoundedPanel();
		panel.setBounds(670, 595, 69, 30);
		panel.setBackground(new Color(88, 214, 141));
		((RoundedPanel) panel).setCornerRadius(10);
		panel.setOpaque(false);
		panel.setLayout(null);
		container.add(panel);
		
		JLabel newJLabel = new JLabel();
		newJLabel.setBounds(5, 5, 64, 22);
		newJLabel.setText("BETA");
		newJLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 16));
		newJLabel.setForeground(new Color(25, 111, 61));
		newJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(newJLabel);
	}
	
	/**
	 * ::::::::::::::::::::::::::::::::::::::::::::::::::::::::
	 */
	
	private void informationCardAboutApplication() {
		//JOptionPane.showMessageDialog(null, "Estamos trabajando en ello...\n\n", "Mensaje del desarrollador", JOptionPane.INFORMATION_MESSAGE);
		dispose();
	        aboutPR = new AboutBBVASoftware("ClientRedirection");
		aboutPR.setVisible(true);
	}
	
	private void corporateInformation() {
		//JOptionPane.showMessageDialog(null, "Estamos trabajando en ello...\n\n", "Mensaje del desarrollador", JOptionPane.INFORMATION_MESSAGE);
		dispose();
	        infoCorp = new CorporateInformation1();
		infoCorp.setVisible(true);
	}
}
