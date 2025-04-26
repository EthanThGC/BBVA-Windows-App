package main.java.com.visual.legal;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import main.resources.visual.manager.classes.*;
import javax.swing.ImageIcon;

public class AboutProduct extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	
	/**/
	private IconImageManager icon = new IconImageManager();	
	private ColorManager foreground, background = new ColorManager();

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
		setUndecorated(true);
		setType(Type.POPUP);
		setResizable(false);
		setBounds(435, 100, 500, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(background.BACKGROUND_LIGHT_COLOR_BBVA_OFFICIAL);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lbl = new JLabel();
		lbl.setIcon(new ImageIcon(AboutProduct.class.getResource("/main/resources/visual/icons/V2/previewDataClient/BBVA_logo_light.png")));
		lbl.setLocation(0, 88);
		lbl.setSize(500, 30);
		lbl.setFont(new Font("Yu Gothic UI", Font.PLAIN, 25));
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setVerticalAlignment(SwingConstants.CENTER);
		contentPanel.add(lbl);
		
		JLabel lblComingSoon = new JLabel();
		lblComingSoon.setVerticalAlignment(SwingConstants.CENTER);
		lblComingSoon.setText("Information about this software");
		lblComingSoon.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon.setFont(new Font("Yu Gothic UI", Font.PLAIN, 22));
		lblComingSoon.setBounds(0, 183, 500, 30);
		contentPanel.add(lblComingSoon);
		
		JLabel lblComingSoon_1 = new JLabel();
		lblComingSoon_1.setVerticalAlignment(SwingConstants.CENTER);
		lblComingSoon_1.setText("coming soon...");
		lblComingSoon_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblComingSoon_1.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 19));
		lblComingSoon_1.setBounds(0, 224, 500, 30);
		contentPanel.add(lblComingSoon_1);
	}
}
