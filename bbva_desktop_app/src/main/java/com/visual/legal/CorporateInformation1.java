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

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.resources.visual.manager.classes.*;
import main.resources.visual.swingcomponents.RoundedPanel;

import main.java.com.visual.access.ClientRedirection;

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
	private RoundedPanel mainContainer;           // The main container with rounded corners

	// Side Menu
	private JPanel menuLateralContainer;          // Side menu container
	private RoundedPanel menuLateralContent;      // Container for the side menu items

	// Variables for the side menu items
	private JLabel bbvaIllustration;              // Logo or image in the side menu
	private JLabel MenuItemPrivacyPolicie;
	private JLabel MenuItemUseTerms;
	private JLabel MenuItemDataManagement;
	private JLabel MenuItemHelpCenter;
	private JLabel MenuItemAbout;
	private JLabel MenuItemUpdateHistory;
	private JLabel MenuItemSoftwareLicenses;

	// Article container (main content)
	private JPanel articleContainer;              // Container holding the article
	private JPanel header;                        // Article header
	private JLabel titleArticle;                  // Article title
	private JPanel articleContent;                // Article content container
	private JTextArea article;                    // Text area for displaying the article

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
	private boolean isMenuVisible = true;         // State of the side menu visibility
	private JLabel currentMenuItem;               // Currently selected menu item

	/**
	 * @see Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CorporateInformation1 dialog = new CorporateInformation1();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
		
		MenuItemPrivacyPolicie = new JLabel();
		MenuItemPrivacyPolicie.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemPrivacyPolicie.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemPrivacyPolicie.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemPrivacyPolicie.setLocation(20, 150);
		MenuItemPrivacyPolicie.setSize(200, 30);
		MenuItemPrivacyPolicie.setText("Políticas de privacidad");
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
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemUseTerms.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemUseTerms.setLocation(20, 190);
		MenuItemUseTerms.setSize(200, 30);
		MenuItemUseTerms.setText("Términos de uso");
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
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemDataManagement.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemDataManagement.setLocation(20, 230);
		MenuItemDataManagement.setSize(200, 30);
		MenuItemDataManagement.setText("Como usamos tus datos?");
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
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemHelpCenter.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemHelpCenter.setLocation(20, 270);
		MenuItemHelpCenter.setSize(200, 30);
		MenuItemHelpCenter.setText("Centro de ayuda");
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
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemAbout.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemAbout.setLocation(20, 310);
		MenuItemAbout.setSize(200, 30);
		MenuItemAbout.setText("Acerca de BBVA Digital");
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
				MenuItemSoftwareLicenses.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\licenceSoftwareEntered.png"));
				MenuItemSoftwareLicenses.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemSoftwareLicenses.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\licenceSoftwareExited.png"));
				MenuItemSoftwareLicenses.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemSoftwareLicenses.setLocation(20, 442);
		MenuItemSoftwareLicenses.setSize(200, 30);
		MenuItemSoftwareLicenses.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\licenceSoftwareExited.png"));
		MenuItemSoftwareLicenses.setText("Licencias de software");
		MenuItemSoftwareLicenses.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		MenuItemSoftwareLicenses.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemSoftwareLicenses.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemSoftwareLicenses.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemSoftwareLicenses.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemSoftwareLicenses);
		
		MenuItemUpdateHistory = new JLabel();
		MenuItemUpdateHistory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				MenuItemUpdateHistory.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\updateHistoryEntered.png"));
				MenuItemUpdateHistory.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				MenuItemUpdateHistory.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\updateHistoryExited.png"));
				MenuItemUpdateHistory.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		MenuItemUpdateHistory.setLocation(20, 487);
		MenuItemUpdateHistory.setSize(236, 30);
		MenuItemUpdateHistory.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\updateHistoryExited.png"));
		MenuItemUpdateHistory.setText("Historial de actualizaciones");
		MenuItemUpdateHistory.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 16));
		MenuItemUpdateHistory.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		MenuItemUpdateHistory.setHorizontalAlignment(SwingConstants.LEFT);
		MenuItemUpdateHistory.setVerticalAlignment(SwingConstants.CENTER);
		MenuItemUpdateHistory.setCursor(new Cursor(Cursor.HAND_CURSOR));
		menuLateralContent.add(MenuItemUpdateHistory);
		
		/**
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 *        Main Elements For Articles Content
		 * +::::::::::::::::::::::::::::::::::::::::::::::::+
		 */
		
		titleArticle = new JLabel();
		titleArticle.setLocation(0, 0);
		titleArticle.setSize(header.getWidth(), header.getHeight());
		titleArticle.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\privacy_ico_default.png"));
		titleArticle.setText("En desarrollo, NO OFICIAL");
		titleArticle.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 23));
		titleArticle.setForeground(new Color(0, 0, 0));
		titleArticle.setHorizontalAlignment(SwingConstants.CENTER);
		titleArticle.setVerticalAlignment(SwingConstants.CENTER);
		header.add(titleArticle);
		
		article = new JTextArea();
		article.setLocation(10, 10);
		article.setSize(articleContent.getWidth() - 20, articleContent.getHeight() - 20);
		article.setWrapStyleWord(true);
		article.setEditable(false);
		article.setLineWrap(true);
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
				disposeDialog2.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_dialog_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				disposeDialog2.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_dialog_exited.png"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				closeDialog();
			}
		});
		disposeDialog2.setLocation(0, mainContainer.getY() - 5);
		disposeDialog2.setSize(directionLateralContainer.getWidth(), 40);
		disposeDialog2.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_dialog_exited.png"));
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
				arrowUp.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				arrowUp.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_exited.png"));
			}
		});
		arrowUp.setLocation(0, 58);
		arrowUp.setSize(directionArrowContent.getWidth(), 30);
		arrowUp.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_exited.png"));
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
				arrowDown.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				arrowDown.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_exited.png"));
			}
		});
		arrowDown.setLocation(0, 118);
		arrowDown.setSize(directionArrowContent.getWidth(), 30);
		arrowDown.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_exited.png"));
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
				disposeDialog.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				disposeDialog.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_exited.png"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				closeDialog();
			}
		});
		disposeDialog.setSize(menuLateralContent.getWidth() + 5, 40);
		disposeDialog.setLocation(menuLateralContent.getX(), footerContent.getHeight() / 2 - (disposeDialog.getHeight() / 2));
		disposeDialog.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_exited.png"));
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
}
