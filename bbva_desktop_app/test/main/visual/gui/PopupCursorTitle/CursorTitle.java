package main.visual.gui.PopupCursorTitle;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class CursorTitle extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel Container = new JPanel();
	private JLabel title = new JLabel();
		
	/*public static void main(String[] args) {
		try {
			CursorTitle dialog = new CursorTitle(obj);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public CursorTitle(String e) {
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
		//setBounds(326, 196, 120, 20);
		//showPopupTitle(obj);
		getContentPane().setLayout(new BorderLayout());
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Container, BorderLayout.CENTER);
		Container.setLayout(null);
	}

	public void buildWithCoordinates(PopupTitleBounds obj, String e)
	{
		setBounds(obj.getPositionX(), obj.getPositionY() - 35, 120, 40);

		title.setBounds(0, 0, getWidth(), getHeight());
		title.setText("Ingresar con Usuario");
		title.setFont(new Font("Yu Gothic UI", Font.PLAIN, 12));
		title.setForeground(new Color(0, 0, 0));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setVerticalAlignment(SwingConstants.CENTER);
		Container.add(title);
	}
	
}

class PopupTitleBounds
{
	//setBounds(100, 100, 120, 20);
	private int x = 0;
	private int y = 0;
	
	public void setCoordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getPositionX() {
		return x;
	}
	
	public int getPositionY() {
		return y;
	}
}
