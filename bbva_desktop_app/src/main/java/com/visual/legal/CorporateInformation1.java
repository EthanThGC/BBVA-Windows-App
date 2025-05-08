package main.java.com.visual.legal;

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
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.java.com.visual.access.ClientRedirection;
import main.resources.visual.manager.classes.ColorManager;
import main.resources.visual.swingcomponents.RoundedPanel;

public class CorporateInformation1 extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel Container = new JPanel();
	
	private static ClientRedirection home;
	
	private static ColorManager background = new ColorManager();
	private static ColorManager foreground = new ColorManager();

	private static JPanel containerLeftLateral, containerRightLateral;
	private static JPanel header, content_center;
	private JPanel content_illustration;
	private JPanel container_menu_lateral;
	private JLabel lblNewLabel_1;
	
	private JTextArea txtarea;
	
	/*layer of text for the out message of user*/
	static final String 
	        STRING_LAYER1="En cumplimiento de la normativa de protección de datos personales, presentamos este Aviso de Privacidad para informarle sobre "
	        		+ "cómo se recopila, utiliza y protege su información personal cuando utiliza nuestros servicios. Por favor, tómese un momento para leer "
	        		+ "detenidamente la siguiente información."
	        		+ "\n\n1. Responsable del tratamiento de datos personales: El responsable del tratamiento de sus datos personales es SaspraGames,Inc - LLC. "
	        		+ "Nuestra dirección física se encuentra en  651 Brannan Street. San Francisco, CA y puede contactarnos a través de technicalteam@saspragames.com"
	        		+ "\n\n2. Información que recopilamos: Recopilamos información personal que usted proporciona voluntariamente al utilizar nuestros servicios. "
	        		+ "Esto puede incluir, entre otros, su nombre, dirección, número de teléfono, dirección de correo electrónico y cualquier otra información que "
	        		+ "nos proporcione al completar formularios o al comunicarse con nosotros." 
			        + "y cualquier otra información que nos proporcione al completar formularios o al comunicarse con nosotros.\"\r\n"
			        + "3. Uso de la información recopilada: Utilizamos la información personal recopilada para los siguientes fines:\"\r\n"
			        + "	        		+ \"\\n- Procesar y gestionar sus solicitudes, consultas o pedidos.\"\r\n"
			        + "	        		+ \"\\n- Proporcionarle los productos o servicios solicitados.\"\r\n"
			        + "	        		+ \"\\n- Mejorar nuestros servicios y personalizar su experiencia como usuario.\"\r\n"
			        + "	        		+ \"\\n- Enviarle comunicaciones relacionadas con nuestros servicios, como actualizaciones, notificaciones o cambios en los mismos.\"\r\n"
			        + "	        		+ \"\\n- Cumplir con nuestras obligaciones legales y resolver cualquier disputa que pueda surgir.\"\r\n"
			        + "	        		+ \"\\n\\n4. Compartir información con terceros:",
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
	private JPanel content_menu_item;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			CorporateInformation1 dialog = new CorporateInformation1();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public CorporateInformation1() {
		setUndecorated(true);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ithan\\eclipse-workspace\\bbva-desktop-app\\bbva_app_runnable\\bin\\main\\resources\\visual\\icons\\V2\\bbva_logo\\favicon.png"));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("BBVA for Windows");
		setType(Type.POPUP);
		setBounds(250, 50, 868, 638);
		getContentPane().setLayout(new BorderLayout());
		Container.setBackground(new Color(240, 242, 245));
		Container.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(Container, BorderLayout.CENTER);
		Container.setLayout(null);
		
		containerLeftLateral = new JPanel();
		containerLeftLateral.setBounds(12, 0, 300, 627);
		containerLeftLateral.setBackground(new Color(240, 242, 245));
		containerLeftLateral.setLayout(null);
		Container.add(containerLeftLateral);
		
		container_menu_lateral = new RoundedPanel();
		container_menu_lateral.setBounds(0, 20, 295, 552);
		container_menu_lateral.setBackground(new Color(7, 33, 70));	
		((RoundedPanel) container_menu_lateral).setCornerRadius(20);
		container_menu_lateral.setLayout(null);
		containerLeftLateral.add(container_menu_lateral);
		
		containerRightLateral = new JPanel();
		containerRightLateral.setBounds(310, 11, 484, 616);
		containerRightLateral.setBackground(new Color(240, 242, 245));
		containerRightLateral.setLayout(null);
		Container.add(containerRightLateral);
		
		/**
		 * +----------------------------------------+
		 *               RIGHT LATERAL
		 * +----------------------------------------+
		 */
		
	    header = new JPanel();
		header.setBounds(0, 0, 484, 75);
		header.setBackground(new Color(240, 242, 245));
		header.setLayout(null);
		containerRightLateral.add(header);
		
		lblNewLabel_1 = new JLabel("Políticas de privacidad");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ithan\\eclipse-workspace\\SaspraGames,Inc\\prototype_beta\\src\\ico\\privacy_ico_default.png"));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 11, 484, 53);
		header.add(lblNewLabel_1);
		
		content_center = new JPanel();
		content_center.setBounds(0, 75, 484, 530);
		content_center.setBackground(new Color(240, 242, 245));
		content_center.setLayout(null);
		containerRightLateral.add(content_center);
		
		txtarea = new JTextArea();
		txtarea.setWrapStyleWord(true);
		txtarea.setEditable(false);
		txtarea.setLineWrap(true);
		txtarea.setForeground(new Color(0, 0, 0));
		txtarea.setFont(new Font("Yu Gothic UI Semilight", Font.PLAIN, 15));
		txtarea.setBounds(28, 11, 446, 465);
		txtarea.setBackground(new Color(240, 242, 245));
		//txtarea.setBackground(new Color(56,56,56));
		txtarea.setText(STRING_LAYER1);
		content_center.add(txtarea);
		
		content_illustration = new RoundedPanel();
		content_illustration.setBounds(0, 0, 295, 100);
		content_illustration.setBackground(background.BACKGROUND_COLOR_BBVA_OFFICIAL);
		((RoundedPanel) content_illustration).setCornerRadius(20);
		content_illustration.setLayout(null);
		container_menu_lateral.add(content_illustration);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ithan\\git\\BBVARepository\\bbva_desktop_app\\src\\main\\resources\\visual\\icons\\V2\\bbva_logo\\bbva_illustration26x26.png"));
		lblNewLabel.setBounds(5, 5, 280, 95);
		content_illustration.add(lblNewLabel);
		
		content_menu_item = new JPanel();
		content_menu_item.setBounds(12, 100, 275, 441);
		content_menu_item.setBackground(new Color(7, 33, 70));
		content_menu_item.setLayout(null);
		container_menu_lateral.add(content_menu_item);
		
		lblNewLabel_2 = new JLabel("Términos y condiciones");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_2.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_2.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 40, 210, 30);
		lblNewLabel_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Políticas de privacidad");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_3.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_3.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(10, 82, 210, 30);
		lblNewLabel_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("Reportar un fallo de la app");
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_5.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_5.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_5.setBounds(10, 162, 210, 30);
		lblNewLabel_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Necesitas ayuda con algo?");
		lblNewLabel_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_6.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_6.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_6.setBounds(10, 122, 210, 30);
		lblNewLabel_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("  Historial de actualizaciones");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_7.setForeground(new Color(91, 190, 255));
				lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\published_with_changes_25dp_5BBEFF_FILL0_wght200_GRAD-25_opsz24.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_7.setForeground(Color.WHITE);
				lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\published_with_changes_25dp_FFFFFF_FILL0_wght200_GRAD-25_opsz24.png"));
			}
		});
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\published_with_changes_25dp_FFFFFF_FILL0_wght200_GRAD-25_opsz24.png"));
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_7.setBounds(10, 400, 225, 30);
		lblNewLabel_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("  Licencias de software");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_8.setForeground(new Color(91, 190, 255));
				lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\code_25dp_5BBEFF_FILL0_wght200_GRAD-25_opsz24.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\code_25dp_FFFFFF_FILL0_wght200_GRAD0_opsz24.png"));
				lblNewLabel_8.setForeground(Color.WHITE);
			}
		});
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\code_25dp_FFFFFF_FILL0_wght200_GRAD0_opsz24.png"));
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(10, 355, 210, 30);
		lblNewLabel_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Acerca de BBVA Digital");
		lblNewLabel_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_9.setForeground(foreground.FOREGROUND_COLOR_LIGHT_BLUE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_9.setForeground(foreground.PRIMARY_COLOR_FONT_TEXT_WHITE);
			}
		});
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setFont(new Font("Microsoft JhengHei", Font.PLAIN, 14));
		lblNewLabel_9.setBounds(10, 202, 210, 30);
		lblNewLabel_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
		content_menu_item.add(lblNewLabel_9);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 255, 255));
		separator.setBounds(10, 330, 255, 1);
		content_menu_item.add(separator);
		
		JLabel lblNewLabel_4 = new JLabel("  Volver a inicio");
		lblNewLabel_4.setBounds(0, 587, 298, 29);
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_exited.png"));
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				home = new ClientRedirection();
				home.setVisible(true);
			}
		});
		lblNewLabel_4.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\close_window_exited.png"));
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Yu Gothic UI", Font.PLAIN, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
		containerLeftLateral.add(lblNewLabel_4);
		
		JPanel container_lateral_arrow_control = new JPanel();
		container_lateral_arrow_control.setBounds(794, 0, 68, 627);
		container_lateral_arrow_control.setBackground(new Color(240, 242, 245));
		container_lateral_arrow_control.setLayout(null);
		Container.add(container_lateral_arrow_control);
		
		JLabel arrow_up_control = new JLabel();
		arrow_up_control.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				arrow_up_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				arrow_up_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_exited.png"));
			}
		});
		arrow_up_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_up_control_exited.png"));
		arrow_up_control.setHorizontalAlignment(SwingConstants.CENTER);
		arrow_up_control.setCursor(new Cursor(Cursor.HAND_CURSOR));
		arrow_up_control.setBounds(15, 250, 35, 35);
		container_lateral_arrow_control.add(arrow_up_control);
		
		JLabel arrow_down_control = new JLabel();
		arrow_down_control.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				arrow_down_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_entered.png"));
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				arrow_down_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_exited.png"));
			}
		});
		arrow_down_control.setIcon(new ImageIcon("C:\\Users\\ithan\\Downloads\\arrow_down_control_exited.png"));
		arrow_down_control.setHorizontalAlignment(SwingConstants.CENTER);
		arrow_down_control.setCursor(new Cursor(Cursor.HAND_CURSOR));
		arrow_down_control.setBounds(15, 310, 35, 35);
		container_lateral_arrow_control.add(arrow_down_control);
		
		/**
		 * +----------------------------------------+
		 *               LEFT LATERAL
		 * +----------------------------------------+
		 */
	}
}
