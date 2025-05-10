package main.java.com.visual.legal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JLabel;

public class ItemMenuLateral extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8451709412940334806L;
	
	/**
	 * +--------------------------------------------------------+
	 */
	
	private String textContent;
	
	/**
	 * Position: X, Y
	 */
	private int posX;
	private int posY;
	
	/**
	 * Size: Height, Width
	 */
	private int height;
	private int width;
	
	private static JLabel item;
	
	
	public ItemMenuLateral() {
		super();
		
		posX = 0;
		posY = 0;
		width = 0;
		height = 0;
		
		textContent = "Lorem lorem";
	}
	
	/**
	 * +--------------------------------------------------------+
	 */
	
	/**
	 * @param textContent
	 */
	
	public void buildItem(String textContent) {
		item = new JLabel();
		
		item.setLocation(getPosX(), getPosY());
		//item.setLocation(10, 40);
		item.setSize(210, 30);
		
		item.setText(textContent);
		
		item.setForeground(new Color(255, 255, 255));
		item.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		item.setCursor(new Cursor(Cursor.HAND_CURSOR));
		item.setVisible(true);
	}
	
	public JLabel paintComponent() {
		return item;
	}
	
	/**
	 * +--------------------------------------------------------+
	 *            SETTER METHODS
	 * +--------------------------------------------------------+
	 */
	
	/**
	 * @param int => posX
	 * @param int => posY
	 */
	public void setLocationYX(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	/**
	 * @param int => posX
	 */
	public void setLocationX(int posX) {
		this.posX = posX;
	}
	
	/**
	 * @param int => posY
	 */
	public void setLocationY(int posY) {
		this.posY = posY;
	}
	
	/**
	 * @param int => width
	 * @param int => height
	 */
	public void setSizeWH(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param int => width
	 */
	public void setSizeWidth(int width) {
		this.width = width;
	}
	
	/**
	 * @param int => height
	 */
	public void setSizeHeight(int height) {
		this.height = height;
	}
	
	/**
	 * +--------------------------------------------------------+
	 *            GETTER METHODS
	 * +--------------------------------------------------------+
	 */
	
	private int getPosX() {
		return posX;
	}
	
	private int getPosY() {
		return posY;
	}
	
	private int getWidthSize() {
		return width;
	}
	
	private int getHeightSize() {
		return height;
	}
	
	public void getLocations() {
		System.out.print("Position X: " + getPosX() + "\nPosition Y:" + getPosY());
	}
	
	public void getSizes() {
		System.out.print("Width: " + getWidthSize() + "\nHeight: " + getHeightSize());
	}
	
	public String getItemText() {
		return textContent;
	}
}
