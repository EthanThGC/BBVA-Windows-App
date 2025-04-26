package main.java.com.visual.legal;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.resources.visual.manager.classes.ColorManager;
import main.resources.visual.manager.classes.IconImageManager;
import main.resources.visual.swingcomponents.RoundedPanel;

public class AboutProduct extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	/**/
	private JPanel button_close_dialog;
	private JLabel text_button_close_dialog;
	
	/**/
	private IconImageManager icon = new IconImageManager();	
	private ColorManager background = new ColorManager();
	private ColorManager foreground = new ColorManager();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AboutProduct dialog = new AboutProduct();
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			dialog.setVisible(true);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AboutProduct() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(AboutProduct.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModalityType(ModalityType.DOCUMENT_MODAL);
		setTitle("BBVA for Windows");
		setUndecorated(false);
		setType(Type.POPUP);
		setResizable(false);
		setBounds(435, 200, 500, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl = new JLabel();
		lbl.setIcon(icon.PREVIEW_DATA_BBVA_LOGO_LIGHT_BACKGROUND);
		lbl.setLocation(0, 70);
		lbl.setSize(484, 30);
		lbl.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setVerticalAlignment(SwingConstants.CENTER);
		contentPanel.add(lbl);
		
		JLabel lblComingSoon = new JLabel();
		lblComingSoon.setVerticalAlignment(SwingConstants.CENTER);
		lblComingSoon.setText("Information about this software");
		lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		lblComingSoon.setBounds(0, 165, 484, 30);
		contentPanel.add(lblComingSoon);
		
		JLabel lblComingSoon_1 = new JLabel();
		lblComingSoon_1.setVerticalAlignment(SwingConstants.CENTER);
		lblComingSoon_1.setText("coming soon...");
		lblComingSoon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 19));
		lblComingSoon_1.setBounds(0, 206, 484, 30);
		contentPanel.add(lblComingSoon_1);
		
		button_close_dialog = new RoundedPanel();
		button_close_dialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		button_close_dialog.setSize(170, 40);
		button_close_dialog.setLocation((getWidth() / 2) - button_close_dialog.getWidth() / 2, 300);
		((RoundedPanel) button_close_dialog).setCornerRadius(10);
		button_close_dialog.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		button_close_dialog.setCursor(new Cursor(Cursor.HAND_CURSOR));
		button_close_dialog.setLayout(null);
		contentPanel.add(button_close_dialog);
		
		text_button_close_dialog = new JLabel();
		text_button_close_dialog.setSize(button_close_dialog.getWidth() - 5, button_close_dialog.getHeight() -  5);
		text_button_close_dialog.setLocation(5, 5);
		text_button_close_dialog.setText("Entendido");
		text_button_close_dialog.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 18));
		text_button_close_dialog.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
		text_button_close_dialog.setHorizontalAlignment(SwingConstants.CENTER);
		text_button_close_dialog.setVerticalAlignment(SwingConstants.CENTER);
		button_close_dialog.add(text_button_close_dialog);
	}
}
