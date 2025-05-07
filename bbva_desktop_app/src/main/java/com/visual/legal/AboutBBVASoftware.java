package main.java.com.visual.legal;

/**
 * @author BBVA Group 
 * Copyright 2025 - All rights reserved
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.java.com.visual.access.ClientRedirection;
import main.resources.visual.manager.classes.ColorManager;
import main.resources.visual.manager.classes.IconImageManager;
import main.resources.visual.swingcomponents.RoundedPanel;

public class AboutBBVASoftware extends JDialog {

	private static final long serialVersionUID = 1L;
	
	/*visual resources*/
	private IconImageManager icon = new IconImageManager();	
	private ColorManager background = new ColorManager();
	private ColorManager foreground = new ColorManager();
	
	/*external windows*/
	private ClientRedirection redirection;
	private static CorporateInformation infoCo;
	
	/*
	  User interface organization's map    ::::     Swing components 
  =================================================================
 
  Container                                ::::     JDialog
 
   1) header                               ::::     JPanel
   
     1.1 company_illustration              ::::     JLabel -> icon
 
   2) center                               ::::     JPanel
 
     2.1 software_presentation             ::::     JLabel
   
     2.2 software_version                  ::::     JLabel
         
   3) footer                               ::::     JPanel
   
     3.1 terms_conditions                  ::::     JLabel
     
       3.1.1 external_resource             ::::     JLabel -> icon
     
     3.2 privacy_policies                  ::::     JLabel
     
       3.2.1 external_resource             ::::     JLabel -> icon
     
     3.3 copyright_rights                  ::::     JLabel
 
  =================================================================
  */

private final JPanel Container = new JPanel();
	
	// 1)
	private JPanel header;
	
	    // 1.1)
		private static JLabel company_illustration;
			
    // 2)
	private JPanel center;
	
	    // 2.1)
		private JLabel software_presentation;
		
		// 2.2)
	    private JLabel software_version;
		
	// 3)
	private JPanel footer;
	
	        // 3.1)
			private JLabel terms_conditions;
			
			  // 3.1.1)
			  private JLabel external_resource1;
			
			// 3.2)
		    private JLabel privacy_policies;
		    
		      // 3.2.1)
			  private JLabel external_resource2;
			    
		    // 3.3)
			private JLabel copyright_rights;
				
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AboutBBVASoftware dialog = new AboutBBVASoftware();
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			dialog.setVisible(true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * Create the dialog.
	 */
	public AboutBBVASoftware() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutBBVASoftware.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setTitle("BBVA for Windows");
		setUndecorated(true);
		setType(Type.POPUP);
		setResizable(false);
		setBounds(400, 160, 514, 380);
		getContentPane().setLayout(new BorderLayout());
		Container.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Container, BorderLayout.CENTER);
		Container.setLayout(null);
		
		final int MAX_WIDTH = 514;
		
		/**
		 *  ::: Main Containers :::
		 */
		
		header = new RoundedPanel();
		((RoundedPanel) header).setCornerRadius(30);
		header.setBounds(-5, -15, MAX_WIDTH + 6, 105);
		header.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		header.setLayout(null);
		Container.add(header);
		
		center = new JPanel();
		center.setBounds(0, header.getHeight(), MAX_WIDTH, 150);
		center.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		center.setLayout(null);
		Container.add(center);
		
		footer = new JPanel();
		footer.setBounds(0, center.getHeight() + center.getY(), MAX_WIDTH, 130);
		footer.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		footer.setLayout(null);
		Container.add(footer);
		
		/**
		 *  ::: Messages for user :::
		 */
		
		JSeparator jsp = new JSeparator();
		jsp.setSize(400, 1);
		jsp.setLocation((center.getWidth() / 2) - jsp.getWidth() / 2, 1);
		jsp.setBackground(background.PRIMARY_COLOR_FONT_TEXT_BLACK);
		jsp.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		//center.add(jsp);
		
		final Icon CLOSE_DIALOG_EXITED = new ImageIcon("C:\\Users\\ithan\\Downloads\\close_dialog_exited.png");
		final Icon CLOSE_DIALOG_ENTERED = new ImageIcon("C:\\Users\\ithan\\Downloads\\close_dialog_entered.png");

		software_presentation = new JLabel();
		software_presentation.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				software_presentation.setForeground(foreground.FOREGROUND_COLOR_BBVA_DEFAULT_COLOR);
				software_presentation.setIcon(CLOSE_DIALOG_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				software_presentation.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
				software_presentation.setIcon(CLOSE_DIALOG_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				returnToRedirectionWindow();
			}
		});
		software_presentation.setSize(310, center.getHeight() / 3);
		software_presentation.setLocation((center.getWidth() / 2) - software_presentation.getWidth() / 2, 20);
		software_presentation.setIcon(CLOSE_DIALOG_EXITED);
		software_presentation.setText("BBVA ahora en Windows");
		software_presentation.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		software_presentation.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		software_presentation.setHorizontalAlignment(SwingConstants.CENTER);
		software_presentation.setVerticalAlignment(SwingConstants.CENTER);
		software_presentation.setCursor(new Cursor(Cursor.HAND_CURSOR));
		center.add(software_presentation);
		
		software_version = new JLabel();
		software_version.setBounds(0, software_presentation.getHeight() + software_presentation.getY(), center.getWidth(), software_presentation.getHeight());
		software_version.setText("Versión 1.1.001");
		software_version.setFont(new Font("Yu Gothic UI", Font.PLAIN, 15));
		software_version.setForeground(foreground.FOREGROUND_COLOR_BBVA_DEFAULT_COLOR);
		software_version.setHorizontalAlignment(SwingConstants.CENTER);
		software_version.setVerticalAlignment(SwingConstants.CENTER);
		center.add(software_version);
		
		external_resource1 = new JLabel();
		external_resource2 = new JLabel();
	
		terms_conditions = new JLabel();
		terms_conditions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				terms_conditions.setForeground(new Color(41, 128, 185));
				external_resource1.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				terms_conditions.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
				external_resource1.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				openExternalResource();
			}
		});
		terms_conditions.setSize(footer.getWidth() / 3, footer.getHeight() / 4);
		terms_conditions.setLocation(((footer.getWidth() / 2) - terms_conditions.getWidth() / 2) - 10, 0);
		terms_conditions.setText("Términos y condiciones");
		terms_conditions.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		terms_conditions.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		terms_conditions.setHorizontalAlignment(SwingConstants.CENTER);
		terms_conditions.setVerticalAlignment(SwingConstants.CENTER);
		terms_conditions.setCursor(new Cursor(Cursor.HAND_CURSOR));
		footer.add(terms_conditions);
		
		privacy_policies = new JLabel();
		privacy_policies.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				privacy_policies.setForeground(new Color(41, 128, 185));
				external_resource2.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				privacy_policies.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
				external_resource2.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				openExternalResource();
			}
		});
		privacy_policies.setSize(footer.getWidth() / 3, footer.getHeight() / 4);
		privacy_policies.setLocation(((footer.getWidth() / 2) - privacy_policies.getWidth() / 2) - 10, (terms_conditions.getHeight() + terms_conditions.getY()) + 10);
		privacy_policies.setText("Políticas de privacidad");
		privacy_policies.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 15));
		privacy_policies.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		privacy_policies.setHorizontalAlignment(SwingConstants.CENTER);
		privacy_policies.setVerticalAlignment(SwingConstants.CENTER);
		privacy_policies.setCursor(new Cursor(Cursor.HAND_CURSOR));
		footer.add(privacy_policies);
		
		copyright_rights = new JLabel();
		copyright_rights.setBounds(0, 95, footer.getWidth(), footer.getHeight() / 4);
		copyright_rights.setText("Copyright © 2025 Grupo BBVA. Todos los derechos reservados");
		copyright_rights.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 12));
		copyright_rights.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		copyright_rights.setHorizontalAlignment(SwingConstants.CENTER);
		copyright_rights.setVerticalAlignment(SwingConstants.CENTER);
		copyright_rights.setCursor(new Cursor(Cursor.HAND_CURSOR));
		footer.add(copyright_rights);
		
		/**
		 *  ::: Illustrations -> icon
		 */
		
		company_illustration = new JLabel();
		company_illustration.setBounds(0, 0, header.getWidth(), header.getHeight());
		company_illustration.setIcon(icon.BBVA_ILLUSTRATION_26X26);
		company_illustration.setForeground(null);
		company_illustration.setHorizontalAlignment(SwingConstants.CENTER);
		company_illustration.setVerticalAlignment(SwingConstants.CENTER);
		header.add(company_illustration);
		
		external_resource1.setSize(35, 35);
		external_resource1.setLocation((terms_conditions.getWidth() + terms_conditions.getX()) + 10, terms_conditions.getY());
		external_resource1.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_EXITED);
		external_resource1.setForeground(null);
		external_resource1.setHorizontalAlignment(SwingConstants.CENTER);
		external_resource1.setVerticalAlignment(SwingConstants.CENTER);
		footer.add(external_resource1);
		
		external_resource2.setSize(35, 35);
		external_resource2.setLocation((privacy_policies.getWidth() + privacy_policies.getX()) + 10, privacy_policies.getY());
		external_resource2.setIcon(icon.OPEN_EXTERNAL_WINDOW_APP_EXITED);
		external_resource2.setForeground(null);
		external_resource2.setHorizontalAlignment(SwingConstants.CENTER);
		external_resource2.setVerticalAlignment(SwingConstants.CENTER);
		footer.add(external_resource2);
		
		JLabel lblNewLabel = new JLabel("( BETA )");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(388, 7, 60, 20);
		footer.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("( BETA )");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(388, 48, 60, 20);
		footer.add(lblNewLabel_1);
	}
	
	private void openExternalResource() {
		//JOptionPane.showMessageDialog(null, "Estamos trabajando en ello...\n\n", "Mensaje del desarrollador", JOptionPane.INFORMATION_MESSAGE);
		dispose();
		infoCo = new CorporateInformation();
		infoCo.setVisible(true);
	}
	
	private void returnToRedirectionWindow() {
		dispose();
		redirection = new ClientRedirection();
		redirection.setVisible(true);
	}
}
