package main.java.com.visual.legal;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class CorporateInformation extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel ContentFrame;
		
	static JPanel ContainerPositionLeft, ContentPositionLeft;
	static JPanel ContainerPositionRight;
	static JPanel ContainerMessage;
	static JPanel ContainerArrowBottom, ContainerArrowTop;
	
	static JLabel lblNameCo, lblTerms, lblAboutGame, lblOpinions,lblAboutCo, lblLastUpdate;
	static JLabel lbltitle;
	static JLabel lblArrowBottom, lblArrowTop;
	
	static JButton btnReturn, btn;
		
	static JTextArea txtarea;
	
	/*URL ICON*/
	
	/*//Icon for frame and header
	static final URL url_PrivacyPolicyIconDefault = privacy_policy_window.class.getResource("/ico/privacy_ico_default.png");
		
	//Direction handling arrows
	//Chain layer direction control ->
	static final URL url_UpDirectionArrowHandling_entered = privacy_policy_window.class.getResource("/ico_testing/arrow_up_entered.png");
	static final URL url_UpDirectionArrowHandling_exited = privacy_policy_window.class.getResource("/ico_testing/arrow_up_exited.png");

	static final URL url_DownDirectionArrowHandling_entered = privacy_policy_window.class.getResource("/ico_testing/arrow_down_entered.png");
	static final URL url_DownDirectionArrowHandling_exited = privacy_policy_window.class.getResource("/ico_testing/arrow_down_exited.png");

	//control for exit frame ->
	static final URL url_WindowExitIcon_entered = privacy_policy_window.class.getResource("/ico/arrowClose_and_back_36x36.png");
	static final URL url_WindowExitIcon_exited = privacy_policy_window.class.getResource("/ico/arrowClose_and_back_30x30.png");;;
	
	//More info about last update
	static final URL url_LastUpdateIcon_entered = privacy_policy_window.class.getResource("/ico/date_modify_ico_25x25_entered.png");
	static final URL url_LastUpdateIcon_exited = privacy_policy_window.class.getResource("/ico/date_modify_ico_25x25_exited.png");
	*/
			
	/*layer of text for the out message of user*/
	static final String 
	        STRING_LAYER1="En cumplimiento de la normativa de protección de datos personales, presentamos este Aviso de Privacidad para informarle sobre "
	        		+ "cómo se recopila, utiliza y protege su información personal cuando utiliza nuestros servicios. Por favor, tómese un momento para leer "
	        		+ "detenidamente la siguiente información."
	        		+ "\n\n1. Responsable del tratamiento de datos personales: El responsable del tratamiento de sus datos personales es SaspraGames,Inc - LLC. "
	        		+ "Nuestra dirección física se encuentra en  651 Brannan Street. San Francisco, CA y puede contactarnos a través de technicalteam@saspragames.com"
	        		+ "\n\n2. Información que recopilamos: Recopilamos información personal que usted proporciona voluntariamente al utilizar nuestros servicios. "
	        		+ "Esto puede incluir, entre otros, su nombre, dirección, número de teléfono, dirección de correo electrónico y cualquier otra información que "
	        		+ "nos proporcione al completar formularios o al comunicarse con nosotros.", 
			
	        STRING_LAYER2="y cualquier otra información que nos proporcione al completar formularios o al comunicarse con nosotros."
	        		+ "\n\n3. Uso de la información recopilada: Utilizamos la información personal recopilada para los siguientes fines:"
	        		+ "\n- Procesar y gestionar sus solicitudes, consultas o pedidos."
	        		+ "\n- Proporcionarle los productos o servicios solicitados."
	        		+ "\n- Mejorar nuestros servicios y personalizar su experiencia como usuario."
	        		+ "\n- Enviarle comunicaciones relacionadas con nuestros servicios, como actualizaciones, notificaciones o cambios en los mismos."
	        		+ "\n- Cumplir con nuestras obligaciones legales y resolver cualquier disputa que pueda surgir."
	        		+ "\n\n4. Compartir información con terceros:", 
	        
			STRING_LAYER3="4. Compartir información con terceros: En ciertos casos, podemos compartir su información personal con terceros únicamente cuando sea"
					+ " necesario para brindarle los servicios solicitados. Estos terceros pueden incluir proveedores de servicios, socios comerciales o entidades "
					+ "legales autorizadas. Nos comprometemos a no vender, alquilar ni compartir su información personal con terceros para fines de marketing o "
					+ "publicidad sin su consentimiento expreso."
					+ "\n\n5. Protección de datos personales: Tomamos las medidas necesarias para proteger su información personal y garantizar su confidencialidad. "
					+ "Implementamos medidas de seguridad físicas, técnicas y organizativas para proteger sus datos contra accesos no autorizados, divulgación, alteración o destrucción."
					+ "\n\n6. Derechos del titular de los datos: Como titular de los datos personales, usted tiene los siguientes derechos", 
			
			STRING_LAYER4="6. Derechos del titular de los datos: Como titular de los datos personales, usted tiene los siguientes derechos:"
					+ "\n- Acceder, rectificar o eliminar sus datos personales."
					+ "\n- Limitar o oponerse al procesamiento de sus datos personales."
					+ "\n- Solicitar la portabilidad de sus datos personales."
					+ "\n- Revocar el consentimiento otorgado para el tratamiento de sus datos personales."
					+ "\n\nPara ejercer estos derechos, puede comunicarse con nosotros a través de los medios de contacto proporcionados en este aviso."
					+ "\n\n7. Actualizaciones al aviso de privacidad: Nos reservamos el derecho de actualizar o modificar este Aviso de Privacidad en cualquier momento. Cualquier"
					+ "cambio significativo se comunicará de manera oportuna a través de nuestros canales de comunicación habituales."
					+ "\n\nLe recomendamos revisar periódicamente este aviso para mantenerse informado sobre cómo protegemos su información personal.",
					
			STRING_LAYER5="Agradecemos su confianza al proporcionarnos su información personal y nos comprometemos a utilizarla de manera responsable y segura. Si tiene alguna pregunta o"
					+ "inquietud sobre nuestro Aviso de Privacidad, no dude en ponerse en contacto con nosotros."
					+ "\n\n\nAtentamente."
					+ "\n\n\nEquipo legal de SaspraSoftware. Inc - LLC"
					+ "\n\n651 Brannan Street, San Francisco, CA, 94107"
					+ "\n\nCopyright © All rights reserved 2010 - 2023";

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					CorporateInformation frame = new CorporateInformation();
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
	public CorporateInformation() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent e) {
				
				lblArrowTop.setVisible(false);
				txtarea.setText(STRING_LAYER1);
			}
		});
		
		setIconImage(null);
		setTitle("SaspraGames, Inc | Privacidad - 2023");
		setType(Type.POPUP);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setBounds(350, 40, 699, 680);
		
		//Dimension window = Toolkit.getDefaultToolkit().getScreenSize();
		/*
		 * int height = 600;
		   int width = 790;
		 */
		setSize(802, 615);
		
		setLocationRelativeTo(null);
		
		ContentFrame = new JPanel();
		ContentFrame.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(ContentFrame);
		ContentFrame.setLayout(null);
		
		ContainerPositionLeft = new JPanel();
		//ContainerPositionLeft.setBackground(new Color(34, 34, 34));
		ContainerPositionLeft.setBackground(Color.BLACK);
		ContainerPositionLeft.setBounds(0, 0, 265, 586);
		ContainerPositionLeft.setLayout(null);
		ContentFrame.add(ContainerPositionLeft);
		
		ContentPositionLeft = new JPanel();
		ContentPositionLeft.setBackground(new Color(34,34,34));
		ContentPositionLeft.setBounds(0, 100, 265, 486);
		ContentPositionLeft.setLayout(null);
		ContainerPositionLeft.add(ContentPositionLeft);
		
		ContainerPositionRight = new JPanel();
		//ContainerPositionRight.setBackground(new Color(56,56,56));
		ContainerPositionRight.setBackground(new Color(232, 232, 232));
		ContainerPositionRight.setBounds(265, 0, 531, 533);
		ContainerPositionRight.setLayout(null);
		ContentFrame.add(ContainerPositionRight);
		
		ContainerArrowTop = new JPanel();
		//ContainerArrowTop.setBackground(new Color(56,56,56));
		ContainerArrowTop.setBackground(new Color(232, 232, 232));
		ContainerArrowTop.setBounds(0, 60, 521, 51);
		ContainerArrowTop.setLayout(null);
		ContainerPositionRight.add(ContainerArrowTop);
		
		ContainerArrowBottom = new JPanel();
		ContainerArrowBottom.setBackground(new Color(232, 232, 232));
		//ContainerArrowBottom.setBackground(new Color(56,56,56));
		ContainerArrowBottom.setBounds(265, 532, 521, 40);
		ContainerArrowBottom.setLayout(null);
		ContentFrame.add(ContainerArrowBottom);
		
		lblNameCo = new JLabel();
		lblNameCo.setText("SaspraGames,Inc - LLC");
		lblNameCo.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		lblNameCo.setForeground(new Color(174, 182, 191));
		lblNameCo.setHorizontalAlignment(SwingConstants.CENTER);
		lblNameCo.setVerticalAlignment(SwingConstants.CENTER);
		lblNameCo.setBounds(0, 0, 265, 99);
		ContainerPositionLeft.add(lblNameCo);
		
		lbltitle = new JLabel();
		lbltitle.setIcon((null));
		lbltitle.setText("Política de privacidad");
		lbltitle.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 25));
		//lbltitle.setForeground(new Color(242, 243, 244));
		lbltitle.setForeground(new Color(0, 0, 0));
		lbltitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbltitle.setBounds(0, 20, 531, 40);
		ContainerPositionRight.add(lbltitle);
		
	{
		
		JSeparator js_more_info = new JSeparator();
		js_more_info.setBounds(57, 38, 96, 1);
		js_more_info.setBackground(new Color(255,255,255));
		js_more_info.setForeground(new Color(255,255,255));
		js_more_info.setVisible(false);
		ContentPositionLeft.add(js_more_info);
		
		lblLastUpdate = new JLabel();
		lblLastUpdate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblLastUpdate.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblLastUpdate.setForeground(new Color(229, 231, 233));
				lblLastUpdate.setBounds(20, 11, 136, 30);
				lblLastUpdate.setIcon((null));
				js_more_info.setVisible(true);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblLastUpdate.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblLastUpdate.setForeground(new Color(255, 255, 255));
				lblLastUpdate.setBounds(20, 11, 133, 30);
				lblLastUpdate.setIcon((null));
				js_more_info.setVisible(false);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null, "Fecha y hora sobre la última actualización de la política de\nprivacidad del usuario.\n\n11/09/2023 - 13:52 p.m. (UTC-5)"
						+ "\n\nBy SaspraGames, Inc - LLC | © All rights reserved - 2023\n\n", "Privacy update", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		lblLastUpdate.setText("  Actualización");
		lblLastUpdate.setIcon((null));
		lblLastUpdate.setForeground(Color.WHITE);
		lblLastUpdate.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblLastUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		lblLastUpdate.setBounds(20, 11, 133, 30);
		ContentPositionLeft.add(lblLastUpdate);
	}
		lblTerms = new JLabel();
		lblTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblTerms.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblTerms.setForeground(new Color(202, 207, 210));
			}
		});
		lblTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblTerms.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblTerms.setForeground(new Color(255, 255, 255));
			}
		});
		lblTerms.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showInternalOptionDialog(null, "No disponible.\n\nEl contenido de este espacio está en desarrollo\n\n", "Aviso de usuario", 
						JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_OPTION, null, new Object[] {"Entendido"}, "Entendido");
			}
		});
		lblTerms.setText("Términos y condiciones");
		lblTerms.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		lblTerms.setForeground(Color.WHITE);
		lblTerms.setHorizontalAlignment(SwingConstants.LEFT);
		lblTerms.setBounds(20, 136, 204, 30);
		ContentPositionLeft.add(lblTerms);
		
		lblOpinions = new JLabel();
		lblOpinions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblOpinions.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblOpinions.setForeground(new Color(202, 207, 210));
			}
		});
		lblOpinions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblOpinions.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblOpinions.setForeground(new Color(255, 255, 255));
			}
		});
		lblOpinions.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showInternalOptionDialog(null, "No disponible.\n\nEl contenido de este espacio está en desarrollo\n\n", "Aviso de usuario", 
						JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_OPTION, null, new Object[] {"Entendido"}, "Entendido");
			}
		});
		lblOpinions.setText("¿Opiniones o sugerencias?");
		lblOpinions.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		lblOpinions.setForeground(Color.WHITE);
		lblOpinions.setHorizontalAlignment(SwingConstants.LEFT);
		lblOpinions.setBounds(20, 186, 204, 30);
		ContentPositionLeft.add(lblOpinions);
		
		lblAboutGame = new JLabel();
		lblAboutGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblAboutGame.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblAboutGame.setForeground(new Color(202, 207, 210));
			}
		});
		lblAboutGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblAboutGame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblAboutGame.setForeground(new Color(255, 255, 255));
			}
		});
		lblAboutGame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showInternalOptionDialog(null, "No disponible.\n\nEl contenido de este espacio está en desarrollo\n\n", "Aviso de usuario", 
						JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_OPTION, null, new Object[] {"Entendido"}, "Entendido");
				
				/*String player1="", player2="";
				
				game = new tic_tac_toe_game_mode_classic(player1, player2);
				game.setVisible(true);*/
				
			}
		});
		lblAboutGame.setText("Sobre TicTacToe-Game");
		lblAboutGame.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		lblAboutGame.setForeground(Color.WHITE);
		lblAboutGame.setHorizontalAlignment(SwingConstants.LEFT);
		lblAboutGame.setBounds(20, 236, 204, 30);
		ContentPositionLeft.add(lblAboutGame);
		
		lblAboutCo = new JLabel();
		lblTerms.setLabelFor(lblAboutCo);
		lblAboutCo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblAboutCo.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblAboutCo.setForeground(new Color(202, 207, 210));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblAboutCo.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblAboutCo.setForeground(new Color(255, 255, 255));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				JOptionPane.showInternalOptionDialog(null, "No disponible.\n\nEl contenido de este espacio está en desarrollo\n\n", "Aviso de usuario", 
						JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_OPTION, null, new Object[] {"Entendido"}, "Entendido");
			}
		});
		lblAboutCo.setText("Acerca de");
		lblAboutCo.setFont(new Font("Gill Sans MT", Font.PLAIN, 19));
		lblAboutCo.setForeground(Color.WHITE);
		lblAboutCo.setHorizontalAlignment(SwingConstants.LEFT);
		lblAboutCo.setBounds(20, 286, 204, 30);
		ContentPositionLeft.add(lblAboutCo);
		
		lblArrowTop = new JLabel();
		lblArrowTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblArrowTop.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblArrowTop.setIcon(null);
			}
		});
		lblArrowTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblArrowTop.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblArrowTop.setIcon(null);
			}
		});
		lblArrowTop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblArrowBottom.setVisible(true);
								
				if(txtarea.getText().equals(STRING_LAYER5)) {
					txtarea.setText(STRING_LAYER4);
				}else if(txtarea.getText().equals(STRING_LAYER4)) {
					txtarea.setText(STRING_LAYER3);
				}else if(txtarea.getText().equals(STRING_LAYER3)) {
					txtarea.setText(STRING_LAYER2);
				}else if(txtarea.getText().equals(STRING_LAYER2)) {
					txtarea.setText(STRING_LAYER1);
					lblArrowTop.setVisible(false);
				}
			}
		});
		lblArrowTop.setIcon((null));
		lblArrowTop.setBounds(241, 21, 50, 30);
		lblArrowTop.setHorizontalAlignment(SwingConstants.CENTER);
		ContainerArrowTop.add(lblArrowTop);
		
		lblArrowBottom = new JLabel();
		lblArrowBottom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				lblArrowBottom.setCursor(new Cursor(Cursor.HAND_CURSOR));
				lblArrowBottom.setIcon((null));
			}
		});
		lblArrowBottom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				lblArrowBottom.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				lblArrowBottom.setIcon((null));
			}
		});
		lblArrowBottom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblArrowTop.setVisible(true);
				
				if(txtarea.getText().equals(STRING_LAYER1)) {
					txtarea.setText(STRING_LAYER2);
				}else if(txtarea.getText().equals(STRING_LAYER2)) {
					txtarea.setText(STRING_LAYER3);
				}else if(txtarea.getText().equals(STRING_LAYER3)) {
					txtarea.setText(STRING_LAYER4);
				}else if(txtarea.getText().equals(STRING_LAYER4)) {
					txtarea.setText(STRING_LAYER5);
					lblArrowBottom.setVisible(false);
				}
				
			}
		});
		lblArrowBottom.setIcon((null));
		lblArrowBottom.setBounds(241, 0, 50, 30);
		lblArrowBottom.setHorizontalAlignment(SwingConstants.CENTER);
		ContainerArrowBottom.add(lblArrowBottom);
		
		txtarea = new JTextArea();
		txtarea.setWrapStyleWord(true);
		txtarea.setEditable(false);
		txtarea.setLineWrap(true);
		txtarea.setForeground(new Color(0, 0, 0));
		txtarea.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		txtarea.setBounds(30, 135, 467, 367);
		txtarea.setBackground(new Color(232, 232, 232));
		//txtarea.setBackground(new Color(56,56,56));
		ContainerPositionRight.add(txtarea);
		
		btn = new JButton();
		btn.setBounds(0,0,0,0);
		ContainerPositionLeft.add(btn);
		
		btnReturn = new JButton();
		btnReturn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
				btnReturn.setCursor(new Cursor(Cursor.HAND_CURSOR));
				btnReturn.setBackground(new Color(231, 76, 60));
				btnReturn.setIcon((null));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				
				btnReturn.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				btnReturn.setBackground(new Color(34,34,34));
				btnReturn.setIcon((null));
			}	
		});
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
			}
		});
		btnReturn.setText(" Cerrar y regresar");
		btnReturn.setIcon(null);
		btnReturn.setForeground(Color.WHITE);
		btnReturn.setBackground(new Color(34,34,34));
		btnReturn.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 22));
		btnReturn.setBorderPainted(false);
		btnReturn.setHorizontalAlignment(SwingConstants.LEFT);
		btnReturn.setBounds(0, 416, 265, 61);
		ContentPositionLeft.add(btnReturn);

	}

}
