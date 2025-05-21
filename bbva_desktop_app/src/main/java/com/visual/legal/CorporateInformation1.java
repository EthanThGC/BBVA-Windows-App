package main.java.com.visual.legal;

/**
 *
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
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.java.com.visual.access.ClientRedirection;
import main.resources.visual.manager.classes.ColorManager;
import main.resources.visual.manager.classes.IconImageManager;
import main.resources.visual.swingcomponents.RoundedPanel;
import javax.swing.JSeparator;

public class CorporateInformation1 extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel FrameContainer = new JPanel();
	
	/**
	 * @see for redirection to another windows
	 */
	private static ClientRedirection ToHome;
		
	/**
	 * @see for visual resources
	 */
	private static IconImageManager icon = new IconImageManager();
	private static ColorManager foreground = new ColorManager();
	private static ColorManager background = new ColorManager();
	
	private static final String LAYER = "Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba"
			+ " Texto de prueba Texto de prueba Texto de prueba Texto de prueba";
	
	/*
	 *  +::::::::::::::::::::::::::::::::::::+
	 *         GUI ORGANIZATION MAP  
	 *  +::::::::::::::::::::::::::::::::::::+
	 *  
	 *  MainFrame (JFrame)
	 *  |
	 *  └── MainContainer (RoundedPanel)       
	 *      |
	 *      ├── MenuLateralContainer (JPanel)
	 *      |   |
	 *      │   ├── MenuLateralContent (RoundedPanel)
	 *      |   |   |
	 *      │   │   ├── BBVAIllustration (JLabel [Icon])
	 *      |   |   |
	 *      │   │   ├── MenuItemPrivacyPolicie (JLabel)
	 *      │   │   ├── MenuItemUseTerms (JLabel)
	 *      │   │   ├── MenuItemDataManagement (JLabel)
	 *      │   │   ├── MenuItemHelpCenter (JLabel)
	 *      │   │   ├── MenuItemAbout (JLabel)
	 *      │   │   ├── MenuItemUpdateHistory (JLabel)
	 *      │   │   └── MenuItemSoftwareLicenses (JLabel)
	 *      │   │
	 *      │   └── ArticleContainer (JPanel)
	 *      |       |
	 *      │       ├── Header (JPanel)
	 *      |       |   |
	 *      │       │   └── Title (JLabel)
	 *      |       |
	 *      │       └── ArticleContent (JPanel)
	 *      |           |
	 *      │           └── Article (JTextArea)
	 *      │
	 *      ├── DirectionLateralContainer (JPanel)
	 *      |   | 
	 *      │   └── DirectionArrowContent (JPanel)
	 *      |       |
	 *      |       ├── disposeDialog2 (JLabel [Icon])
	 *      │       ├── ArrowUp (JLabel [Icon])
	 *      │       └── ArrowDown (JLabel [Icon])
	 *      │
	 *      └── Footer (JPanel)
	 *          |
	 *          └── CloseFrameContainer (JPanel)
	 *              |
	 *              └── DisposeDialog (JLabel [Close Icon])
	 *  
	 *  ----------------------------------------------------------------------------------------------------------------------
	 *  NOTE:
	 *   => RoundedPanel is a custom class that extends JPanel with rounded borders.
	 *   => The menu items have been renamed for better semantic clarity.
	 *   => Consider documenting the LayoutManagers used in each container if it is relevant for maintenance.
	 *   
	 */

	/**
	 * +::::::::::::::::::::::::::::::::::::+
	 *         VARIABLE DECLARATIONS 
	 * +::::::::::::::::::::::::::::::::::::+
	 */
	
	// Main GUI Containers
	private static RoundedPanel mainContainer;           // The main container with rounded corners

	// Side Menu
	private static JPanel menuLateralContainer;          // Side menu container
	private static RoundedPanel menuLateralContent;      // Container for the side menu items

	// Variables for the side menu items
	private static JLabel bbvaIllustration;              // Logo or image in the side menu
	private static JLabel lbl_action_lateral_menu;
	private static JLabel MenuItemPrivacyPolicie;
	private static JLabel MenuItemUseTerms;
	private static JLabel MenuItemDataManagement;
	private static JLabel MenuItemHelpCenter;
	private static JLabel MenuItemAbout;
	private static JSeparator separator;
	private static JLabel MenuItemUpdateHistory;
	private static JLabel MenuItemSoftwareLicenses;

	// Article container (main content)
	private static JPanel articleContainer;              // Container holding the article
	private static JPanel header;                        // Article header
	private static JLabel titleArticle;                  // Article title
	private static JPanel articleContent;                // Article content container
	private static JTextArea article;                    // Text area for displaying the article

	// Directional arrow container (for example, for lateral scrolling)
	private JPanel directionLateralContainer;     // Container for directional arrows
	private JPanel directionArrowContent;         // Container for the up and down arrows

	// Direction arrows
	private JLabel disposeDialog2;
	private JLabel arrowUp;                       // Up arrow
	private JLabel arrowDown;                     // Down arrow

	// Footer
	private JPanel footerContainer;                        // Footer container
	private JPanel footerContent;
	private JLabel disposeDialog;                 // Close icon or label to close the frame

	// ==========================================================================
	// Global State Variables For Window
	// ==========================================================================
	private int frameWidth = 870;                 // Width of the main window
	private int frameHeight = 640;                // Height of the main window
	private int frameLocationX = 250;             // Position coordinate X of the main window
	private int frameLocationY = 50;              // Position coordinate Y of the main window
	private String titleWindow = "BBVA for Windows";
	private static boolean isMenuRetractable = false;
	
	// ==========================================================================
	// Others
	// ==========================================================================
	private static final String SPACE_IN_MENU_ITEM =  "    ";

	/**
	 * @see Launch the application.
	 */
	public static void main(String[] args) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	                    break;
	                }
	            }

	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(CorporateInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(CorporateInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(CorporateInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(CorporateInformation1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

	        }

	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new CorporateInformation1().setVisible(true);
	            }
	        });
	}

	/**
	 * @see Create the dialog.
	 */
	public CorporateInformation1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ithan\\eclipse-workspace\\bbva-desktop-app\\bbva_app_runnable\\bin\\main\\resources\\visual\\icons\\V2\\bbva_logo\\favicon.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setTitle(titleWindow);
		setType(Type.POPUP);
		setUndecorated(true);
		setResizable(false);
		setBounds(frameLocationX, frameLocationY, frameWidth, frameHeight);
		getContentPane().setLayout(new BorderLayout());
		FrameContainer.setBackground(new Color(240, 242, 245));
		FrameContainer.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(FrameContainer, BorderLayout.CENTER);
		FrameContainer.setLayout(null);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Containers For Menu Lateral
		 * +::::::::::::::::::::::::::::::::::::::::::::+
		 */
		
		mainContainer = new RoundedPanel();
		mainContainer.setLocation(15, 15);
		mainContainer.setSize(getWidth() - 70, getHeight() - 70);
		mainContainer.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		((RoundedPanel) mainContainer).setCornerRadius(15);
		mainContainer.setLayout(null);
		FrameContainer.add(mainContainer);
		
		menuLateralContainer = new JPanel();
		menuLateralContainer.setLocation(10, 10);
		menuLateralContainer.setSize(mainContainer.getWidth() / 3, mainContainer.getHeight() - 20);
		menuLateralContainer.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		menuLateralContainer.setLayout(null);
		mainContainer.add(menuLateralContainer);
		
		menuLateralContent = new RoundedPanel();
		menuLateralContent.setLocation(0, 0);
		menuLateralContent.setSize(menuLateralContainer.getWidth(), menuLateralContainer.getHeight());
		menuLateralContent.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) menuLateralContent).setCornerRadius(15);
		menuLateralContent.setLayout(null);
		menuLateralContainer.add(menuLateralContent);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Containers For Articles
		 * +::::::::::::::::::::::::::::::::::::::::::::+
		 */
		
		articleContainer = new JPanel();
		articleContainer.setLocation(menuLateralContainer.getWidth() + 10, 10);
		articleContainer.setSize((mainContainer.getWidth() - menuLateralContainer.getWidth()) - 15, mainContainer.getHeight() - 5);
		articleContainer.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		articleContainer.setLayout(null);
		mainContainer.add(articleContainer);
		
		header = new JPanel();
		header.setLocation(0, 0);
		header.setSize(articleContainer.getWidth(), 60);
		header.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		header.setLayout(null);
		articleContainer.add(header);
		
		articleContent = new JPanel();
		articleContent.setLocation(10, header.getHeight() + 10);
		articleContent.setSize(articleContainer.getWidth() - 20, (menuLateralContent.getHeight() - header.getHeight()) - 10);
		articleContent.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		articleContent.setLayout(null);
		articleContainer.add(articleContent);
		
		/**
		 * +:::::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Containers For Direction Arrows
		 * +:::::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		
		directionLateralContainer = new JPanel();
		directionLateralContainer.setLocation(mainContainer.getWidth() + mainContainer.getX(), articleContainer.getY());
		directionLateralContainer.setSize((getWidth() - mainContainer.getWidth()) - 20, articleContainer.getHeight());
		directionLateralContainer.setBackground(background.BACKGROUND_WHITE_LIGHT);
		directionLateralContainer.setLayout(null);
		FrameContainer.add(directionLateralContainer);
		
		directionArrowContent = new JPanel();
		directionArrowContent.setSize(directionLateralContainer.getWidth(), 200);
		directionArrowContent.setLocation(0, (directionLateralContainer.getHeight() / 2) - directionArrowContent.getHeight() / 2);
		directionArrowContent.setBackground(background.BACKGROUND_WHITE_LIGHT);
		directionArrowContent.setLayout(null);
		directionLateralContainer.add(directionArrowContent);
		
		/**
		 * +:::::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Containers For Footer Section
		 * +:::::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		footerContainer = new JPanel();
		footerContainer.setLocation(0,  mainContainer.getHeight() + mainContainer.getY());
		footerContainer.setSize(getWidth(), getHeight() - (mainContainer.getHeight() + mainContainer.getY()));
		footerContainer.setBackground(background.BACKGROUND_WHITE_LIGHT);
		footerContainer.setLayout(null);
		FrameContainer.add(footerContainer);
		
		footerContent = new JPanel();
		footerContent.setLocation(20, 10);
		footerContent.setSize(footerContainer.getWidth() - 40, footerContainer.getHeight() - 20);
		footerContent.setBackground(background.BACKGROUND_WHITE_LIGHT);
		footerContent.setLayout(null);
		footerContainer.add(footerContent);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Elements For Menu Lateral 
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		bbvaIllustration = new JLabel();
		bbvaIllustration.setLocation(0, 5);
		bbvaIllustration.setSize(menuLateralContent.getWidth(), 100);
		bbvaIllustration.setText(null);
		bbvaIllustration.setForeground(null);
		bbvaIllustration.setIcon(icon.BBVA_ILLUSTRATION_26X26);
		bbvaIllustration.setHorizontalAlignment(SwingConstants.CENTER);
		bbvaIllustration.setVerticalAlignment(SwingConstants.CENTER);
		menuLateralContent.add(bbvaIllustration);
		
		lbl_action_lateral_menu = new JLabel();
		lbl_action_lateral_menu.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
			lbl_action_lateral_menu.setIcon(icon.BURGER_LATERAL_MENU_ENTERED);
		    }
		    
		    @Override
		    public void mouseExited(MouseEvent e) {
			lbl_action_lateral_menu.setIcon(icon.BURGER_LATERAL_MENU_EXITED);
		    }
		    
		    @Override
		    public void mouseClicked(MouseEvent e) {
			applySlideMenu();
		    }
		});
		lbl_action_lateral_menu.setBounds(15, 15, 20, 20);
		lbl_action_lateral_menu.setIcon(icon.BURGER_LATERAL_MENU_EXITED);
		lbl_action_lateral_menu.setText(null);
		lbl_action_lateral_menu.setForeground(null);
		lbl_action_lateral_menu.setVerticalAlignment(SwingConstants.CENTER);
		lbl_action_lateral_menu.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_action_lateral_menu.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(lbl_action_lateral_menu);
		
		MenuItemPrivacyPolicie = new JLabel();
		MenuItemPrivacyPolicie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemPrivacyPolicie.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
				
				if (isMenuRetractable)
				    MenuItemPrivacyPolicie.setIcon(icon.PRIVACY_SLIDE_LATERAL_MENU_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemPrivacyPolicie.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				
				if (isMenuRetractable)
				    MenuItemPrivacyPolicie.setIcon(icon.PRIVACY_SLIDE_LATERAL_MENU_EXITED);
			}
		});
		MenuItemPrivacyPolicie.setLocation(5, 150);
		MenuItemPrivacyPolicie.setSize(menuLateralContent.getWidth(), 30);
		MenuItemPrivacyPolicie.setText(SPACE_IN_MENU_ITEM + "Políticas de privacidad");
		MenuItemPrivacyPolicie.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		MenuItemPrivacyPolicie.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemPrivacyPolicie.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemPrivacyPolicie.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemPrivacyPolicie.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemPrivacyPolicie);
		
		MenuItemUseTerms = new JLabel();
		MenuItemUseTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemUseTerms.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
				
				if (isMenuRetractable)
				    MenuItemUseTerms.setIcon(icon.USER_TERMS_SLIDE_LATERAL_MENU_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemUseTerms.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				
				if (isMenuRetractable)
				    MenuItemUseTerms.setIcon(icon.USER_TERMS_SLIDE_LATERAL_MENU_EXITED);
			}
		});
		MenuItemUseTerms.setLocation(5, 190);
		MenuItemUseTerms.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemUseTerms.setText(SPACE_IN_MENU_ITEM + "Términos de uso");
		MenuItemUseTerms.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		MenuItemUseTerms.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemUseTerms.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemUseTerms.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemUseTerms.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemUseTerms);
		
		MenuItemDataManagement = new JLabel();
		MenuItemDataManagement.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemDataManagement.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
				
				if (isMenuRetractable)
				    MenuItemDataManagement.setIcon(icon.DATE_SLIDE_LATERAL_MENU_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemDataManagement.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				
				if (isMenuRetractable)
				    MenuItemDataManagement.setIcon(icon.DATE_SLIDE_LATERAL_MENU_EXITED);
			}
		});
		MenuItemDataManagement.setLocation(5, 230);
		MenuItemDataManagement.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemDataManagement.setText(SPACE_IN_MENU_ITEM + "Como usamos tus datos?");
		MenuItemDataManagement.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		MenuItemDataManagement.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemDataManagement.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemDataManagement.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemDataManagement.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemDataManagement);
		
		MenuItemHelpCenter = new JLabel();
		MenuItemHelpCenter.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemHelpCenter.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
				
				if (isMenuRetractable)
				    MenuItemHelpCenter.setIcon(icon.QUESTIONS_SLIDE_LATERAL_MENU_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemHelpCenter.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				
				if (isMenuRetractable)
				    MenuItemHelpCenter.setIcon(icon.QUESTIONS_SLIDE_LATERAL_MENU_EXITED);
			}
		});
		MenuItemHelpCenter.setLocation(5, 270);
		MenuItemHelpCenter.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemHelpCenter.setText(SPACE_IN_MENU_ITEM + "Centro de ayuda");
		MenuItemHelpCenter.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		MenuItemHelpCenter.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemHelpCenter.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemHelpCenter.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemHelpCenter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemHelpCenter);
		
		MenuItemAbout = new JLabel();
		MenuItemAbout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemAbout.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
				
				if (isMenuRetractable)
				    MenuItemAbout.setIcon(icon.ABOUT_SLIDE_LATERAL_MENU_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemAbout.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
				
				if (isMenuRetractable)
				    MenuItemAbout.setIcon(icon.ABOUT_SLIDE_LATERAL_MENU_EXITED);
			}
		});
		MenuItemAbout.setLocation(5, 310);
		MenuItemAbout.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemAbout.setText(SPACE_IN_MENU_ITEM + "Acerca de BBVA Digital");
		MenuItemAbout.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		MenuItemAbout.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemAbout.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemAbout.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemAbout.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemAbout);
		
		MenuItemSoftwareLicenses = new JLabel();
		MenuItemSoftwareLicenses.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
			MenuItemSoftwareLicenses.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			
			if (isMenuRetractable)
			    MenuItemSoftwareLicenses.setIcon(icon.SOFTWARE_LICENCES_ENTERED);
		    }
			
		    public void mouseExited(MouseEvent e) {
			MenuItemSoftwareLicenses.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		        
			if (isMenuRetractable)
			    MenuItemSoftwareLicenses.setIcon(icon.SOFTWARE_LICENCES_EXITED);
		    }
		});
		MenuItemSoftwareLicenses.setLocation(5, 442);
		MenuItemSoftwareLicenses.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemSoftwareLicenses.setText(SPACE_IN_MENU_ITEM + "Licencias de software");
		MenuItemSoftwareLicenses.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		MenuItemSoftwareLicenses.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemSoftwareLicenses.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemSoftwareLicenses.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemSoftwareLicenses);
		
		MenuItemUpdateHistory = new JLabel();
		MenuItemUpdateHistory.addMouseListener(new MouseAdapter() {
		    @Override
		    public void mouseEntered(MouseEvent e) {
			MenuItemUpdateHistory.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			
			if (isMenuRetractable)
			    MenuItemUpdateHistory.setIcon(icon.SOFTWARE_UPDATES_ENTERED);
		    }
			
		    public void mouseExited(MouseEvent e) {
			MenuItemUpdateHistory.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			
			if (isMenuRetractable)
			    MenuItemUpdateHistory.setIcon(icon.SOFTWARE_UPDATES_EXITED);
		    }
		});
		MenuItemUpdateHistory.setLocation(5, 487);
		MenuItemUpdateHistory.setSize(menuLateralContent.getWidth() - 5, 30);
		MenuItemUpdateHistory.setText(SPACE_IN_MENU_ITEM + "Historial de actualizaciones");
		MenuItemUpdateHistory.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		MenuItemUpdateHistory.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemUpdateHistory.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemUpdateHistory.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemUpdateHistory.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemUpdateHistory);
		
		separator = new JSeparator();
		separator.setLocation(23, 400);
		separator.setSize(menuLateralContent.getWidth() - 46, 2);
		separator.setBackground(Color.white);
		menuLateralContent.add(separator);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Elements For Articles Content
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		
		titleArticle = new JLabel();
		titleArticle.setLocation(0, 0);
		titleArticle.setSize(header.getWidth(), header.getHeight());
		titleArticle.setIcon(icon.PRIVACY_POLICY_EXITED);
		titleArticle.setText("En desarrollo, NO OFICIAL");
		titleArticle.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 23));
		titleArticle.setForeground(new Color(0, 0, 0));
		titleArticle.setHorizontalAlignment(SwingConstants.CENTER);
		titleArticle.setVerticalAlignment(SwingConstants.CENTER);
		header.add(titleArticle);
		
		article = new JTextArea();
		article.setColumns(3);
		article.setWrapStyleWord(true);
		article.setRows(2);
		article.setLineWrap(true);
		article.setLocation(10, 10);
		article.setSize(articleContent.getWidth() - 20, articleContent.getHeight() - 20);
		article.setEditable(false);
		article.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		article.setBackground(background.PRIMARY_COLOR_FONT_TEXT_WHITE);
		article.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		article.setText(LAYER);
		articleContent.add(article);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Elements For Arrow Direction
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		disposeDialog2 = new JLabel();
		disposeDialog2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				disposeDialog2.setIcon(icon.CLOSE_CORPORATION_DECLARATION_DIALOG_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				disposeDialog2.setIcon(icon.CLOSE_CORPORATION_DECLARATION_DIALOG_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				closeDialog();
			}
		});
		disposeDialog2.setLocation(0, mainContainer.getY() - 5);
		disposeDialog2.setSize(directionLateralContainer.getWidth(), 40);
		disposeDialog2.setIcon(icon.CLOSE_CORPORATION_DECLARATION_DIALOG_EXITED);
		disposeDialog2.setText(null);
		disposeDialog2.setForeground(null);
		disposeDialog2.setHorizontalAlignment(SwingConstants.CENTER);
		disposeDialog2.setVerticalAlignment(SwingConstants.CENTER);
		disposeDialog2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		directionLateralContainer.add(disposeDialog2);
		
		arrowUp = new JLabel();
		arrowUp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			    arrowUp.setIcon(icon.UP_DIRECTION_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			    arrowUp.setIcon(icon.UP_DIRECTION_EXITED);
			}
		});
		arrowUp.setLocation(0, 58);
		arrowUp.setSize(directionArrowContent.getWidth(), 30);
		arrowUp.setIcon(icon.UP_DIRECTION_EXITED);
		arrowUp.setText(null);
		arrowUp.setForeground(null);
		arrowUp.setHorizontalAlignment(SwingConstants.CENTER);
		arrowUp.setVerticalAlignment(SwingConstants.CENTER);
		arrowUp.setCursor(new Cursor(Cursor.HAND_CURSOR));
		directionArrowContent.add(arrowUp);
		
		arrowDown = new JLabel();
		arrowDown.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		            arrowDown.setIcon(icon.DOWN_DIRECTION_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			    arrowDown.setIcon(icon.DOWN_DIRECTION_EXITED);
			}
		});
		arrowDown.setLocation(0, 118);
		arrowDown.setSize(directionArrowContent.getWidth(), 30);
		arrowDown.setIcon(icon.DOWN_DIRECTION_EXITED);
		arrowDown.setText(null);
		arrowDown.setForeground(null);
		arrowDown.setHorizontalAlignment(SwingConstants.CENTER);
		arrowDown.setVerticalAlignment(SwingConstants.CENTER);
		arrowDown.setCursor(new Cursor(Cursor.HAND_CURSOR));
		directionArrowContent.add(arrowDown);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Elements For Footer Content
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		disposeDialog = new JLabel();
		disposeDialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
		            disposeDialog.setIcon(icon.DISPOSE_CORPORATION_DECLARATION_DIALOG_ENTERED);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			    disposeDialog.setIcon(icon.DISPOSE_CORPORATION_DECLARATION_DIALOG_EXITED);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
		            closeDialog();
			}
		});
		disposeDialog.setSize(menuLateralContent.getWidth() + 5, 40);
		disposeDialog.setLocation(menuLateralContent.getX(), footerContent.getHeight() / 2 - (disposeDialog.getHeight() / 2));
		disposeDialog.setIcon(icon.DISPOSE_CORPORATION_DECLARATION_DIALOG_EXITED);
		disposeDialog.setText("Volver a inicio");
		disposeDialog.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		disposeDialog.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_BLACK);
		disposeDialog.setHorizontalAlignment(SwingConstants.CENTER);
		disposeDialog.setVerticalAlignment(SwingConstants.CENTER);
		disposeDialog.setCursor(new Cursor(Cursor.HAND_CURSOR));
		footerContent.add(disposeDialog);		
	}
	
	private void closeDialog() {
		dispose();
		ToHome = new ClientRedirection();
		ToHome.setVisible(true);
	}
	
	private static void applySlideMenu() {
	    if (!isMenuRetractable) {
		retractMenu();
		return;
	    }
	    
	    expandMenu();
	}
	
	private static void retractMenu() {	    
	    // reload parameters
	    reloadComponents();
	    
	    // modify size of separator
	    separator.setLocation(20, 400);
	    separator.setSize(menuLateralContent.getWidth() / 2, 2);
	    
	    //--------------------------------------------------------------//
	    //                   FOR EACH OF MENU'S ITEM:   
	    //
	    // - reload width parameters
	    // - set text to empty
	    // - set Horizontal Alignment to center
	    // - set illustrative icon
	    //------------------------------------------------------------- //
	    
	    bbvaIllustration.setSize(menuLateralContent.getWidth(), 100);
	    bbvaIllustration.setIcon(null);
	    
	    MenuItemPrivacyPolicie.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemPrivacyPolicie.setText("");
	    MenuItemPrivacyPolicie.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemPrivacyPolicie.setIcon(icon.PRIVACY_SLIDE_LATERAL_MENU_EXITED);
	    
	    MenuItemUseTerms.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemUseTerms.setText("");
	    MenuItemUseTerms.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemUseTerms.setIcon(icon.USER_TERMS_SLIDE_LATERAL_MENU_EXITED);
	    
	    MenuItemDataManagement.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemDataManagement.setText("");
	    MenuItemDataManagement.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemDataManagement.setIcon(icon.DATE_SLIDE_LATERAL_MENU_EXITED);
	       
	    MenuItemHelpCenter.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemHelpCenter.setText("");	    
	    MenuItemHelpCenter.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemHelpCenter.setIcon(icon.QUESTIONS_SLIDE_LATERAL_MENU_EXITED);
	    
	    MenuItemAbout.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemAbout.setText("");	    
	    MenuItemAbout.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemAbout.setIcon(icon.ABOUT_SLIDE_LATERAL_MENU_EXITED);
	   
	    MenuItemSoftwareLicenses.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemSoftwareLicenses.setText("");	    
	    MenuItemSoftwareLicenses.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemSoftwareLicenses.setIcon(icon.SOFTWARE_LICENCES_EXITED);
	    
	    MenuItemUpdateHistory.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemUpdateHistory.setText("");	    
	    MenuItemUpdateHistory.setHorizontalAlignment(SwingConstants.CENTER);
	    MenuItemUpdateHistory.setIcon(icon.SOFTWARE_UPDATES_EXITED);
	    
	     // set control attribute
	    isMenuRetractable = true;
	}
	
	private static void expandMenu() {	
	    // reload parameters
	    reloadComponents();
	    
	    // modify size of separator
	    separator.setLocation(23, 400);
	    separator.setSize(menuLateralContent.getWidth() - 46, 2);
	    
	    //--------------------------------------------------------------//
	    //                   FOR EACH OF MENU'S ITEM:   
	    //
	    // - reload width parameters
	    // - set text content
	    // - set Horizontal Alignment to left
	    // - set icon to null
	    //------------------------------------------------------------- //
	   
	    bbvaIllustration.setSize(menuLateralContent.getWidth(), 100);
	    bbvaIllustration.setIcon(icon.BBVA_ILLUSTRATION_26X26);
	    
	    MenuItemPrivacyPolicie.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemPrivacyPolicie.setText(SPACE_IN_MENU_ITEM + "Políticas de privacidad");
	    MenuItemPrivacyPolicie.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemPrivacyPolicie.setIcon(null);
	    
	    MenuItemUseTerms.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemUseTerms.setText(SPACE_IN_MENU_ITEM + "Términos de uso");
	    MenuItemUseTerms.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemUseTerms.setIcon(null);
	    
	    MenuItemDataManagement.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemDataManagement.setText(SPACE_IN_MENU_ITEM + "Como usamos tus datos?");
	    MenuItemDataManagement.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemDataManagement.setIcon(null);
	       
	    MenuItemHelpCenter.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemHelpCenter.setText(SPACE_IN_MENU_ITEM + "Centro de ayuda");	    
	    MenuItemHelpCenter.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemHelpCenter.setIcon(null);
	    
	    MenuItemAbout.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemAbout.setText(SPACE_IN_MENU_ITEM + "Acerca de BBVA Digital");	    
	    MenuItemAbout.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemAbout.setIcon(null);
	    
	    MenuItemSoftwareLicenses.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemSoftwareLicenses.setText(SPACE_IN_MENU_ITEM + "Licencias de software");	    
	    MenuItemSoftwareLicenses.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemSoftwareLicenses.setIcon(null);
	    
	    MenuItemUpdateHistory.setSize(menuLateralContent.getWidth(), 30);
	    MenuItemUpdateHistory.setText(SPACE_IN_MENU_ITEM + "Historial de actualizaciones");	    
	    MenuItemUpdateHistory.setHorizontalAlignment(SwingConstants.LEFT);
	    MenuItemUpdateHistory.setIcon(null);
	   
	 
	    // set control attribute
	    isMenuRetractable = false;
	}
	
	private static void reloadComponents() {
	    // set size (width) to lateral menu
	    
	    if (!isMenuRetractable)
		menuLateralContainer.setSize(mainContainer.getWidth() / 11, mainContainer.getHeight() - 20);
	    else
		menuLateralContainer.setSize(mainContainer.getWidth() / 3, mainContainer.getHeight() - 20);
	    menuLateralContent.setSize(menuLateralContainer.getWidth(), menuLateralContainer.getHeight());
	    
	    // set location and size of article's content
	    articleContainer.setLocation(menuLateralContainer.getWidth() + 10, 10);	       
	    articleContainer.setSize((mainContainer.getWidth() - menuLateralContainer.getWidth()) - 15, mainContainer.getHeight() - 5);
	    articleContent.setSize(articleContainer.getWidth() - 20, (menuLateralContent.getHeight() - header.getHeight()) - 10);
	    header.setSize(articleContainer.getWidth(), 60);
	    titleArticle.setSize(header.getWidth(), header.getHeight());
	    article.setSize(articleContent.getWidth() - 20, articleContent.getHeight() - 20);
	    
	}
}
