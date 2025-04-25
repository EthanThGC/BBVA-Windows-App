package main.visual.gui.PopupCursorTitle;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

//import main.java.com.bbva_digital_app.access.LoginApplication;

public class Application extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Container;
	
	private PopupTitleBounds coord = new PopupTitleBounds();
	private CursorTitle ed = new CursorTitle("build");
	
	//private LoginApplication login = new LoginApplication();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Application frame = new Application();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Application() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Application.class.getResource("/main/resources/visual/icons/V2/bbva_logo/favicon.png")));
		setOpacity(1.0f);
		setTitle("Testing");
		setType(Type.NORMAL);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		Container = new JPanel();
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Container);
		Container.setLayout(null);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.addMouseListener(new MouseAdapter() {
			 
			@Override
			public void mouseEntered(MouseEvent e) {
		
				//login.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel.setText("el cursor está fuera del JLabel");
			    
				//login.toBack();
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel.setText("Se detecto un 'clic'");
			}
		
		});
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\193246164_1190274388101434_6216819532284969717_n.jpg"));
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.PLAIN, 17));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(58, 64, 240, 30);
		Container.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(334, 65, 46, 14);
		Container.add(lblNewLabel_1);
	}
	
	/*int mouseY, mouseX;
	private void controller()
	{
		mouseY = MouseInfo.getPointerInfo().getLocation().y/3;
        mouseX = MouseInfo.getPointerInfo().getLocation().x/3;    
        
        //check X coordinates
        System.out.print(mouseX+"\n"+mouseY+"\n\n");
        if (mouseX >= 60 && mouseX <= 298)
        {
        	if (mouseY >= 63 && mouseY <= 93)
        	{
        		df();
        	}
        }
	}*/
	
	public void df()
	{
		//get cursor's coordinates
		int mouseY = MouseInfo.getPointerInfo().getLocation().y;
        int mouseX = MouseInfo.getPointerInfo().getLocation().x;    
     
        //send the coordinates
        coord.setCoordinates(mouseX, mouseY);
     
        //show the cursor dialog
        ed.buildWithCoordinates(coord, "show");
        ed.setVisible(true);
        
		
		//reset coordinates
		coord.setCoordinates(0, 0);
	}
}
