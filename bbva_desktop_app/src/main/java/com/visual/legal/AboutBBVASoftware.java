package main.java.com.visual.legal;

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
	private static CorporateInformation1 infoCo;
	
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
				
	private static String calledFrom = "fromThis";
	private static final String FROM_HOME_PAGE = "ClientRedirection";
	private static final String FROM_CORPORATE_PAGE = "CorporateInformation";
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AboutBBVASoftware dialog = new AboutBBVASoftware(calledFrom);
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
	public AboutBBVASoftware(String calledFrom) {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutBBVASoftware.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setTitle("BBVA for Windows");
		setUndecorated(true);
		setType(Type.POPUP);
		setResizable(false);
		setBounds(420, 160, 514, 380);
		getContentPane().setLayout(new BorderLayout());
		Container.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Container, BorderLayout.CENTER);
		Container.setLayout(null);
		
		JPanel MainContainer = new RoundedPanel();
		MainContainer.setSize(getWidth() - 20, getHeight() - 20);
		MainContainer.setLocation((getWidth() / 2) - MainContainer.getWidth() / 2 - 3, 10);
		MainContainer.setBackground(new Color(240, 242, 245));
		((RoundedPanel) MainContainer).setCornerRadius(20);
		MainContainer.setLayout(null);
		Container.add(MainContainer);
		
		JPanel HeaderContainer = new RoundedPanel();
		HeaderContainer.setSize(MainContainer.getWidth(), MainContainer.getHeight() / 3);
		HeaderContainer.setLocation(0, 0);
		HeaderContainer.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) HeaderContainer).setCornerRadius(20);
		HeaderContainer.setLayout(null);
		MainContainer.add(HeaderContainer);
		
		JLabel lblNewLabel_1 = new JLabel("   BBVA Digital for Windows");
		lblNewLabel_1.setIcon(new ImageIcon(AboutBBVASoftware.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		lblNewLabel_1.setBounds(5, 5, 489, 115);
		lblNewLabel_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 202, 214));
		HeaderContainer.add(lblNewLabel_1);
		
		JPanel panel = new RoundedPanel();
		panel.setBounds(77, 141, 180, 45);
		//panel.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		panel.setBackground(new Color(88, 214, 141));
		((RoundedPanel) panel).setCornerRadius(10);
		panel.setLayout(null);
		MainContainer.add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("2025 All rights reserved");
		lblNewLabel_2.setForeground(new Color(20, 90, 50));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(5, 5, 175, 40);
		//lblNewLabel_2.setBackground(new Color(202, 111, 30));
		panel.add(lblNewLabel_2);
		
		JPanel panel2 = new RoundedPanel();
		panel2.setBounds(275, 141, 130, 45);
		//panel2.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		panel2.setBackground(new Color(88, 214, 141));
		((RoundedPanel) panel2).setCornerRadius(10);
		panel2.setOpaque(false);
		panel2.setLayout(null);
		MainContainer.add(panel2);
		
		JLabel newJLabel = new JLabel();
		newJLabel.setBounds(5, 5, 125, 40);
		panel2.add(newJLabel);
		newJLabel.setText("Versión 1.1.001");
		newJLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 15));
		newJLabel.setForeground(new Color(20, 90, 50));
		newJLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblTerminosYCondiciones = new JLabel("Términos y condiciones de usuario");
		lblTerminosYCondiciones.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblTerminosYCondiciones.setForeground(new Color(0, 64, 128));
		lblTerminosYCondiciones.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		lblTerminosYCondiciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblTerminosYCondiciones.setBounds(82, 206, 323, 30);
		MainContainer.add(lblTerminosYCondiciones);
		
		JLabel lblPrivacidadYSeguridad = new JLabel("Privacidad y seguridad");
		lblPrivacidadYSeguridad.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblPrivacidadYSeguridad.setForeground(new Color(0, 64, 128));
		lblPrivacidadYSeguridad.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		lblPrivacidadYSeguridad.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrivacidadYSeguridad.setBounds(82, 240, 323, 30);
		MainContainer.add(lblPrivacidadYSeguridad);
		
		JLabel lblLicenciasYActualizaciones = new JLabel("Licencias y actualizaciones de software");
		lblLicenciasYActualizaciones.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblLicenciasYActualizaciones.setForeground(new Color(0, 64, 128));
		lblLicenciasYActualizaciones.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		lblLicenciasYActualizaciones.setHorizontalAlignment(SwingConstants.LEFT);
		lblLicenciasYActualizaciones.setBounds(82, 273, 323, 30);
		MainContainer.add(lblLicenciasYActualizaciones);
		
		JLabel lblBackToHome = new JLabel("Back to home");
		lblBackToHome.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent e) {
			    if (calledFrom.equals(FROM_HOME_PAGE))
				returnToHomePage();
			    else
				if (calledFrom.equals(FROM_CORPORATE_PAGE))
				    returnToCorporatePage();
			    
			    dispose();
			}
		});
		lblBackToHome.setCursor(new Cursor(Cursor.HAND_CURSOR));
		lblBackToHome.setHorizontalAlignment(SwingConstants.CENTER);
		lblBackToHome.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		lblBackToHome.setIcon(new ImageIcon(AboutBBVASoftware.class.getResource("/main/resources/visual/icons/V3/corporate_declaration/close_window_entered.png")));
		lblBackToHome.setBounds(10, 320, 125, 30);
		MainContainer.add(lblBackToHome);
		
		final int MAX_WIDTH = 514;
		
		/**
		 *  ::: Main Containers :::
		 */
		
		/*header = new RoundedPanel();
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
		footer.add(lblNewLabel_1);*/
	}
	
	private void returnToCorporatePage() {
		//JOptionPane.showMessageDialog(null, "Estamos trabajando en ello...\n\n", "Mensaje del desarrollador", JOptionPane.INFORMATION_MESSAGE);
		dispose();
		infoCo = new CorporateInformation1();
		infoCo.setVisible(true);
	}
	
	private void returnToHomePage() {
		dispose();
		redirection = new ClientRedirection();
		redirection.setVisible(true);
	}
}
