package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;

public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setTitle("GeMagasinSoft");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 534);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 809, 21);
		contentPane.add(toolBar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 14));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBounds(0, 23, 809, 452);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("GESTION STOCK", null, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		tabbedPane_3.setBounds(0, 0, 642, 443);
		tabbedPane_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(tabbedPane_3);
		
		JPanel panel_10 = new JPanel();
		tabbedPane_3.addTab("Visualiser \u00E9tat de stock", null, panel_10, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("MOUVEMENT PRODUIT", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		tabbedPane_1.setBounds(0, 0, 646, 447);
		panel_1.add(tabbedPane_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane_1.addTab("Fournisseur", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Traitement Commande", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		tabbedPane_2.setBounds(0, 0, 641, 419);
		panel_3.add(tabbedPane_2);
		
		JPanel panel_4 = new JPanel();
		tabbedPane_2.addTab("Commande fournisseur", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nouvelle commande fournisseur");
		lblNewLabel.setBounds(137, 0, 288, 21);
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		panel_4.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(31, 28, 457, 89);
		panel_8.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_4.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Numero commande");
		lblNewLabel_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(10, 11, 122, 14);
		panel_8.add(lblNewLabel_1);
		
		JLabel lblFournisseur = new JLabel("Fournisseur");
		lblFournisseur.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblFournisseur.setBounds(10, 36, 90, 14);
		panel_8.add(lblFournisseur);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(10, 61, 46, 14);
		panel_8.add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(142, 8, 122, 20);
		panel_8.add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(142, 33, 122, 20);
		panel_8.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(142, 61, 122, 20);
		panel_8.add(dateChooser);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnEnregistrer.setBounds(312, 7, 104, 23);
		panel_8.add(btnEnregistrer);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 139, 510, 2);
		panel_4.add(separator);
		
		JLabel lblNewLabel_2 = new JLabel("D\u00E9taille commande fournisseur");
		lblNewLabel_2.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel_2.setBounds(137, 152, 288, 21);
		panel_4.add(lblNewLabel_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_9.setBounds(31, 184, 457, 219);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblCodeCommande = new JLabel("Code commande");
		lblCodeCommande.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeCommande.setBounds(10, 11, 105, 14);
		panel_9.add(lblCodeCommande);
		
		JLabel lblCodeProduit = new JLabel("Code produit");
		lblCodeProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeProduit.setBounds(10, 36, 105, 14);
		panel_9.add(lblCodeProduit);
		
		JLabel lblQuantitEntre = new JLabel("Quantit\u00E9 entr\u00E9e");
		lblQuantitEntre.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantitEntre.setBounds(10, 61, 105, 14);
		panel_9.add(lblQuantitEntre);
		
		JLabel lblPrixUnitaire = new JLabel("Prix unitaire");
		lblPrixUnitaire.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblPrixUnitaire.setBounds(10, 86, 105, 14);
		panel_9.add(lblPrixUnitaire);
		
		JLabel lblUnit = new JLabel("Unit\u00E9");
		lblUnit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblUnit.setBounds(10, 111, 46, 14);
		panel_9.add(lblUnit);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate_1.setBounds(10, 136, 46, 14);
		panel_9.add(lblDate_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(144, 8, 123, 20);
		panel_9.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(144, 33, 123, 20);
		panel_9.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 58, 123, 20);
		panel_9.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 83, 123, 20);
		panel_9.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(144, 108, 123, 20);
		panel_9.add(textField_3);
		textField_3.setColumns(10);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(143, 136, 124, 20);
		panel_9.add(dateChooser_1);
		
		JButton btnCrerProduit = new JButton("Cr\u00E9er produit");
		btnCrerProduit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Creer creer = new Creer();
				      creer.setVisible(true);
			}
		});
		btnCrerProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnCrerProduit.setBounds(330, 185, 117, 23);
		panel_9.add(btnCrerProduit);
		
		JButton btnEntrer = new JButton("Entrer");
		btnEntrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnEntrer.setBounds(347, 7, 86, 23);
		panel_9.add(btnEntrer);
		
		JPanel panel_5 = new JPanel();
		tabbedPane_2.addTab("Commande client", null, panel_5, null);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Nouvelle commande client");
		lblNewLabel_3.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_3.setBounds(144, 5, 235, 22);
		panel_5.add(lblNewLabel_3);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_11.setBounds(29, 38, 432, 92);
		panel_5.add(panel_11);
		panel_11.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Numero commande");
		lblNewLabel_4.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(22, 11, 119, 14);
		panel_11.add(lblNewLabel_4);
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblClient.setBounds(22, 36, 46, 14);
		panel_11.add(lblClient);
		
		JLabel lblDate_2 = new JLabel("Date");
		lblDate_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate_2.setBounds(22, 61, 46, 14);
		panel_11.add(lblDate_2);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 8, 140, 20);
		panel_11.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(146, 33, 140, 20);
		panel_11.add(comboBox_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(146, 61, 140, 20);
		panel_11.add(dateChooser_2);
		
		JButton btnEnregistrer_1 = new JButton("Enregistrer");
		btnEnregistrer_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEnregistrer_1.setBounds(313, 7, 109, 23);
		panel_11.add(btnEnregistrer_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 141, 491, 2);
		panel_5.add(separator_1);
		
		JLabel lblNewLabel_5 = new JLabel("D\u00E9taille commande client");
		lblNewLabel_5.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_5.setBounds(142, 151, 235, 22);
		panel_5.add(lblNewLabel_5);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_12.setBounds(29, 191, 432, 194);
		panel_5.add(panel_12);
		panel_12.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Code commande");
		lblNewLabel_6.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_6.setBounds(26, 11, 109, 14);
		panel_12.add(lblNewLabel_6);
		
		JLabel lblCodeProduit_1 = new JLabel("Code produit");
		lblCodeProduit_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeProduit_1.setBounds(26, 51, 94, 14);
		panel_12.add(lblCodeProduit_1);
		
		JLabel lblQuantitSortie = new JLabel("Quantit\u00E9 sortie");
		lblQuantitSortie.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantitSortie.setBounds(26, 76, 94, 14);
		panel_12.add(lblQuantitSortie);
		
		JLabel lblDate_3 = new JLabel("Date");
		lblDate_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate_3.setBounds(26, 101, 46, 14);
		panel_12.add(lblDate_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(145, 8, 141, 20);
		panel_12.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(145, 48, 141, 20);
		panel_12.add(comboBox_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 73, 141, 20);
		panel_12.add(textField_5);
		textField_5.setColumns(10);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(145, 101, 141, 20);
		panel_12.add(dateChooser_3);
		
		JButton btnSortir = new JButton("Sortir");
		btnSortir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnSortir.setBounds(320, 11, 89, 23);
		panel_12.add(btnSortir);
		
		JButton btnBordereauDexpedition = new JButton("Bordereau d'expedition");
		btnBordereauDexpedition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Bordereau bordereau = new Bordereau();
				bordereau.setVisible(true);
			}
		});
		btnBordereauDexpedition.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnBordereauDexpedition.setBounds(10, 160, 186, 23);
		panel_12.add(btnBordereauDexpedition);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("GERER CLIENTS", null, panel_6, null);
		
		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("ADMINISTRATEUR", null, panel_7, null);
	}
}
