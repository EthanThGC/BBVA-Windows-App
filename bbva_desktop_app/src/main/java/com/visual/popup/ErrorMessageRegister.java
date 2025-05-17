package main.java.com.visual.popup;

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

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import main.resources.visual.manager.classes.IconImageManager;
import main.resources.visual.swingcomponents.RoundedPanel;

public class ErrorMessageRegister extends JDialog {

	private static final long serialVersionUID = 4783829757140631524L;

	private final JPanel dialogFrame = new JPanel();
	
	private IconImageManager icon = new IconImageManager();
	
	private JPanel containerMessage;
	private JPanel containerButtonClose;
	
	private JLabel lbl_dialog_line_one;
	private JLabel lbl_dialog_line_two;
	private JLabel lbl_error_dialog_icon;
	
	private JPanel btn_close_dialog;
	private JLabel lbl_content_text_button;

	/**
	 * Launch the application.
	 */
	
	/*try {
			ErrorMessageRegister dialog = new ErrorMessageRegister();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Create the dialog.
	 */
	public ErrorMessageRegister() {
		setTitle("Error en registro");
		setResizable(false);
		setUndecorated(true);
		setType(Type.POPUP);
		//setLocationRelativeTo(null);
		setLocation(getX()+620,getY()+300);
		setSize(340, 185);
		getContentPane().setLayout(new BorderLayout());
		dialogFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(dialogFrame, BorderLayout.CENTER);
		dialogFrame.setLayout(null);
		
		containerMessage = new JPanel();
		containerMessage.setBounds(0,0,340,134);
		containerMessage.setBackground(getBackground());
		containerMessage.setLayout(null);
		dialogFrame.add(containerMessage);
		
		containerButtonClose = new JPanel();
		containerButtonClose.setBounds(0,134,340,50);
		containerButtonClose.setBackground(getBackground());
		containerButtonClose.setLayout(null);
		dialogFrame.add(containerButtonClose);
		
		lbl_error_dialog_icon = new JLabel();
		lbl_error_dialog_icon.setBounds(0,0,325,60);
		lbl_error_dialog_icon.setIcon(icon.ERROR_DIALOG);
		lbl_error_dialog_icon.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_error_dialog_icon.setVerticalAlignment(SwingConstants.CENTER);
		containerMessage.add(lbl_error_dialog_icon);
		
		lbl_dialog_line_one = new JLabel();
		lbl_dialog_line_one.setBounds(0,60,containerMessage.getWidth(),30);
		lbl_dialog_line_one.setText("Información incompleta...");
		lbl_dialog_line_one.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 19));
		lbl_dialog_line_one.setForeground(new Color(203, 67, 53));
		lbl_dialog_line_one.setVerticalAlignment(SwingConstants.TOP);
		lbl_dialog_line_one.setHorizontalAlignment(SwingConstants.CENTER);
		containerMessage.add(lbl_dialog_line_one);
		
		lbl_dialog_line_two = new JLabel();
		lbl_dialog_line_two.setBounds(0,92,containerMessage.getWidth(),30);
		lbl_dialog_line_two.setText("Compruebe y vuelva a intentarlo.");
		lbl_dialog_line_two.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 19));
		lbl_dialog_line_two.setForeground(getForeground());
		lbl_dialog_line_two.setVerticalAlignment(SwingConstants.TOP);
		lbl_dialog_line_two.setHorizontalAlignment(SwingConstants.CENTER);
		containerMessage.add(lbl_dialog_line_two);
		
		btn_close_dialog = new RoundedPanel();
		btn_close_dialog.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				btn_close_dialog.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btn_close_dialog.setBackground(new Color(52, 152, 219));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btn_close_dialog.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btn_close_dialog.setBackground(new Color(46, 134, 193));
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btn_close_dialog.setBounds(105, 2, 130, 40);
		btn_close_dialog.setBackground(new Color(46, 134, 193));
		((RoundedPanel) btn_close_dialog).setCornerRadius(10);
		btn_close_dialog.setOpaque(false);
		btn_close_dialog.setLayout(null);
		containerButtonClose.add(btn_close_dialog);
		
		lbl_content_text_button = new JLabel();
		lbl_content_text_button.setBounds(5, 5, btn_close_dialog.getWidth()-5, btn_close_dialog.getHeight()-5);
		lbl_content_text_button.setText("Entendido");
		lbl_content_text_button.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 17));
		lbl_content_text_button.setForeground(new Color(255,255,255));
		lbl_content_text_button.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_content_text_button.setVerticalAlignment(SwingConstants.CENTER);
		btn_close_dialog.add(lbl_content_text_button);
	}
}
