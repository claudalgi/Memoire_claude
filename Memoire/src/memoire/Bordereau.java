package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JSeparator;

public class Bordereau extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Bordereau.class.getResource("/resources/121.png")));
		setTitle("GERER LES EXPEDITIONS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		lblNewLabel.setBounds(133, 230, 310, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_2.setBounds(43, 31, 495, 175);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNumeroFacture = new JLabel("Numero facture");
		lblNumeroFacture.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNumeroFacture.setBounds(10, 11, 99, 14);
		panel_2.add(lblNumeroFacture);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(10, 36, 46, 14);
		panel_2.add(lblDate);
		
		JLabel lblMagasinier = new JLabel("Magasinier");
		lblMagasinier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblMagasinier.setBounds(10, 71, 72, 14);
		panel_2.add(lblMagasinier);
		
		JLabel lblChauffeur = new JLabel("Chauffeur");
		lblChauffeur.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblChauffeur.setBounds(10, 108, 65, 14);
		panel_2.add(lblChauffeur);
		
		JLabel lblChefChantier = new JLabel("Chef chantier");
		lblChefChantier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblChefChantier.setBounds(10, 145, 82, 14);
		panel_2.add(lblChefChantier);
		
		textField = new JTextField();
		textField.setBounds(137, 8, 153, 20);
		textField.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_2.add(textField);
		textField.setColumns(10);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(137, 36, 153, 20);
		dateChooser.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_2.add(dateChooser);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(137, 68, 153, 20);
		comboBox_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_2.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(137, 105, 153, 20);
		comboBox_2.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_2.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(137, 142, 153, 20);
		comboBox_3.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_2.add(comboBox_3);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAjouter.setBounds(379, 7, 89, 23);
		btnAjouter.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_2.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnModifier.setBounds(379, 41, 89, 23);
		btnModifier.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_2.add(btnModifier);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 218, 570, 8);
		panel.add(separator);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_3.setBounds(43, 271, 495, 130);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Numero facture");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 11, 102, 14);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblCodeProduit = new JLabel("Code produit");
		lblCodeProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeProduit.setBounds(10, 36, 102, 14);
		panel_3.add(lblCodeProduit);
		
		JLabel lblQuantit = new JLabel("Quantit\u00E9");
		lblQuantit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantit.setBounds(10, 61, 63, 14);
		panel_3.add(lblQuantit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(144, 8, 146, 20);
		comboBox.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_3.add(comboBox);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(144, 33, 146, 20);
		comboBox_4.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_3.add(comboBox_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 58, 146, 20);
		textField_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBounds(374, 11, 99, 23);
		btnImprimer.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_3.add(btnImprimer);
		btnImprimer.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Veuillez saisir les informations ci-dessous");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_2.setBounds(111, 0, 399, 30);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("Visualiser", null, panel_1, null);
	}
}
