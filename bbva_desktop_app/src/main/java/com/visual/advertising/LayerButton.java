package main.java.com.visual.advertising;

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

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import main.resources.visual.swingcomponents.RoundedPanel;

public class LayerButton extends JPanel {
	
	private static final long serialVersionUID = 4735359284665422449L;
	
	private  JPanel buttonLayer = new JPanel();
	
	//bounds
	private int positionX = 200;
	private static final int positionY = 25;
	private static final int width = 40;
	private static final int height = 20;
	
	//visibility
	//private boolean visibility = false;
	
	//color
	private Color background_layer_button = null;
	
	/**
	 * <strong>getter and setter methods</strong>
	 * @param positionX
	 */
	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}
	
	public int getPositionX() {
		return positionX;
	}
	
	public void setBackgroundColor(Color background_layer_button) {
		this.background_layer_button = background_layer_button;
	}
	
	private Color getBackgroundColor() {
		return background_layer_button;
	}
	
	public LayerButton() {
		super();
		setOpaque(false);
	}

	/**
	 * @see Build the layer button
	 * @return JPabel 
	 */
		
	public JPanel paintJPanelComponent() {
		buttonLayer = new RoundedPanel();
		buttonLayer.setBounds(getPositionX(), positionY, width, height);
		((RoundedPanel) buttonLayer).setCornerRadius(15);
		buttonLayer.setBackground(getBackgroundColor());
		buttonLayer.setLayout(null);
		return buttonLayer;
	}
	
	public void getProperties() {
		 JOptionPane.showMessageDialog(null, 
				"Bounds: \n\tPositionX: "+getPositionX()+"\n\tPositionY: "+positionY+"\n\tWidth: "+width+"\n\tHeight: "+height
				+"\nBackgroundColor: "+getBackgroundColor()
				+"\nVisible: "+isVisible()+"\n\n",
				"", JOptionPane.INFORMATION_MESSAGE);
	}
}
