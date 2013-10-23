package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Bordereau extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bordereau frame = new Bordereau();
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
	public Bordereau() {
		setTitle("GERER LES EXPEDITIONS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 459);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBounds(0, 0, 657, 421);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("Imprimer", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imprimer bordereau d'expedition");
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setBounds(150, 7, 310, 29);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(43, 47, 495, 339);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNumeroFacture = new JLabel("Numero facture");
		lblNumeroFacture.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNumeroFacture.setBounds(10, 11, 99, 14);
		panel_2.add(lblNumeroFacture);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantit.setBounds(10, 36, 82, 14);
		panel_2.add(lblQuantit);
		
		JLabel lblNewLabel_1 = new JLabel("Unit\u00E9");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 77, 46, 14);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		lblDsignation.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDsignation.setBounds(10, 113, 82, 14);
		panel_2.add(lblDsignation);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(10, 147, 46, 14);
		panel_2.add(lblDate);
		
		JLabel lblObservation = new JLabel("Observation");
		lblObservation.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblObservation.setBounds(10, 172, 92, 14);
		panel_2.add(lblObservation);
		
		JLabel lblMagasinier = new JLabel("Magasinier");
		lblMagasinier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblMagasinier.setBounds(10, 237, 72, 14);
		panel_2.add(lblMagasinier);
		
		JLabel lblChauffeur = new JLabel("Chauffeur");
		lblChauffeur.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblChauffeur.setBounds(10, 262, 65, 14);
		panel_2.add(lblChauffeur);
		
		JLabel lblChefChantier = new JLabel("Chef chantier");
		lblChefChantier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblChefChantier.setBounds(10, 287, 82, 14);
		panel_2.add(lblChefChantier);
		
		textField = new JTextField();
		textField.setBounds(137, 8, 153, 20);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 33, 152, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 74, 153, 20);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(137, 110, 153, 20);
		panel_2.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(137, 147, 153, 20);
		panel_2.add(dateChooser);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(137, 178, 152, 37);
		panel_2.add(textArea);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(137, 234, 153, 20);
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(137, 259, 153, 20);
		panel_2.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(137, 284, 153, 20);
		panel_2.add(comboBox_3);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAjouter.setBounds(379, 7, 89, 23);
		panel_2.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnModifier.setBounds(379, 41, 89, 23);
		panel_2.add(btnModifier);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnImprimer.setBounds(369, 83, 99, 23);
		panel_2.add(btnImprimer);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("Visualiser", null, panel_1, null);
	}
}
