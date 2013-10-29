package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;
//import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import net.proteanit.sql.DbUtils;

import stat.db.Stconnection;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.JSpinner;

public class Application extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTable table;
	private PreparedStatement pst;
	private ResultSet rs;
	JPanel panel = new JPanel();
	JPanel panel_1 = new JPanel();
	JPanel panel_6 = new JPanel();
	JPanel panel_7 = new JPanel();
	JComboBox combofournisseur = new JComboBox();
	JDateChooser dateChooser = new JDateChooser();
	JComboBox comboBox_2 = new JComboBox();
	JComboBox comboBox_1 = new JComboBox();
	JDateChooser dateChooser_1 = new JDateChooser();
	
	//requette d'inserer les valeurs dans les tables
	String sql1="select * from fournisseur";
	String sql2 = "select * from client";
	
	private JTable table_1;
	private JTextField textField_13;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	JMenu Date_txt = new JMenu("Date");
	JMenu Time_txt = new JMenu("Time");

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Application.class.getResource("/resources/121.png")));
		setTitle("GeMagasinSoft");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 534);
		setResizable(false);
		
		//appel des differentes fonctions 
		ComboFournisseur();//appel de combo pour mettre les id du fournisseur dans le combo.
		 Comboproduit() ;//appel de combo pour mettre les id du produit dans le combo.
		 Combocmdfournisseur();//appel de combo pour mettre les id du cmdfournisseur dans le combo.
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(0, 0, 833, 21);
		contentPane.add(toolBar);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		tabbedPane.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 14));
		tabbedPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane.setBounds(0, 23, 833, 452);
		contentPane.add(tabbedPane);
		
		ImageIcon img=new ImageIcon(getClass().getResource("/resources/404.png"));
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("SITUATION STOCK",img, panel, null);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane_3 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_3.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		tabbedPane_3.setBounds(0, 0, 642, 443);
		tabbedPane_3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.add(tabbedPane_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane_3.addTab("Visualiser \u00E9tat de stock", null, panel_10, null);
		panel_10.setLayout(null);
		
		
		ImageIcon img3=new ImageIcon(getClass().getResource("/resources/produit.png"));
		tabbedPane.addTab("MOUVEMENT PRODUIT", img3, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		tabbedPane_1.setBounds(0, 0, 646, 447);
		panel_1.add(tabbedPane_1);
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane_1.addTab("Fournisseur",null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_13.setBounds(61, 45, 333, 117);
		panel_2.add(panel_13);
		panel_13.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Code fournisseur");
		lblNewLabel_7.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_7.setBounds(22, 11, 103, 14);
		panel_13.add(lblNewLabel_7);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNom.setBounds(22, 36, 46, 14);
		panel_13.add(lblNom);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblAdresse.setBounds(22, 61, 65, 14);
		panel_13.add(lblAdresse);
		
		JLabel lblTlphone = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblTlphone.setBounds(22, 86, 65, 14);
		panel_13.add(lblTlphone);
		
		textField_6 = new JTextField();
		textField_6.setBounds(138, 8, 147, 20);
		textField_6.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_13.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(138, 33, 147, 20);
		textField_7.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_13.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(138, 58, 147, 20);
		textField_8.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_13.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(138, 83, 147, 20);
		textField_9.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_13.add(textField_9);
		textField_9.setColumns(10);
		
		JPanel panel_14 = new JPanel();
		panel_14.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_14.setBounds(435, 45, 152, 117);
		panel_2.add(panel_14);
		panel_14.setLayout(null);
		
		JButton btnNewButton = new JButton("Enregistrer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//evenement d'ajouter
				try{
					String str=textField_6.getText().trim();
					String str1=textField_7.getText().trim();
					String str2=textField_8.getText().trim();
					String str3=textField_9.getText().trim();
					if(str.equals("")||str1.equals("")||str2.equals("")||str3.equals("")){
						JOptionPane.showMessageDialog(null ,"Veuillez remplir le(s) champ(s) vide(e) s'il vous plait","Ge_MagasinSoft",JOptionPane.INFORMATION_MESSAGE);	
					}else{
						String sql="insert into fournisseur values(\'"+str+"\',\'"+str1+"\',\'"+str2+"\',\'"+str3+"\') ";
						UpdateFuction(sql);
						
						Update_Table(table,sql1);
						
					//vider les zonnes de saisies
						textField_6.setText("");
						textField_7.setText("");
						textField_8.setText("");
						textField_9.setText("");
					}
					
					
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null ,e.getMessage());
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton.setBounds(20, 7, 111, 23);
		btnNewButton.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_14.add(btnNewButton);
		
		JLabel lblNewLabel_8 = new JLabel("Enregistrement d'un fournisseur");
		lblNewLabel_8.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_8.setBounds(161, 0, 333, 34);
		panel_2.add(lblNewLabel_8);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(61, 170, 526, 235);
		panel_2.add(scrollPane);
		
		table = new JTable();
		Update_Table(table,sql1);
		scrollPane.setViewportView(table);
		
		JPanel panel_3 = new JPanel();
		tabbedPane_1.addTab("Traitement Commande", null, panel_3, null);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.RIGHT);
		tabbedPane_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tabbedPane_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 13));
		tabbedPane_2.setBounds(0, 0, 641, 419);
		panel_3.add(tabbedPane_2);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane_2.addTab("Commande fournisseur", null, panel_4, null);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nouvelle commande fournisseur");
		lblNewLabel.setBounds(137, 0, 288, 21);
		lblNewLabel.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		panel_4.add(lblNewLabel);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBounds(31, 28, 426, 89);
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
		textField.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_8.add(textField);
		textField.setColumns(10);
		
		
		combofournisseur.setBounds(142, 33, 122, 20);
		combofournisseur.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_8.add(combofournisseur);
		dateChooser.setDateFormatString("yyyy-MM-dd ");
		
		
		dateChooser.setBounds(142, 61, 122, 20);
		dateChooser.setBorder(new BevelBorder (BevelBorder.LOWERED));
		
		panel_8.add(dateChooser);
		
		JButton btnEnregistrer = new JButton("Enregistrer");
		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
			            if ( textField.getText().equals("")) 
			        {
				JOptionPane.showMessageDialog(null, "Veuillez remplir la case numero commande s'il vous plait !","Ge_MagasinSoft",JOptionPane.WARNING_MESSAGE);
			        }
			        else{
			        String sql = "Insert into cmdfournisseur(idcommande,numfournisseur,date) values(?,?,?)";
			        pst = Stconnection.getInstance().prepareStatement(sql);
			        pst.setString(1, textField.getText());
			        pst.setString(2, (String)combofournisseur.getSelectedItem());
			        pst.setString(3, ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
			        pst.execute();
			        
			        textField.setText("");
			        dateChooser.setDate(null);
			        combofournisseur.setSelectedIndex(0);
			        JOptionPane.showMessageDialog(null,"Les informations du nouvelle commande sont enregistrées avec succès");
			        ComboFournisseur();
			            }
			        }catch(Exception e){JOptionPane.showMessageDialog(null,e);} 
				 }
		});
		btnEnregistrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnEnregistrer.setBounds(312, 7, 104, 23);
		btnEnregistrer.setBorder(new BevelBorder (BevelBorder.RAISED));
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
		panel_9.setBounds(31, 184, 426, 204);
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
		lblPrixUnitaire.setBounds(10, 92, 105, 14);
		panel_9.add(lblPrixUnitaire);
		
		JLabel lblDate_1 = new JLabel("Date");
		lblDate_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate_1.setBounds(10, 117, 46, 14);
		panel_9.add(lblDate_1);
		
		
		comboBox_1.setBounds(144, 8, 123, 20);
		comboBox_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_9.add(comboBox_1);
		
		
		comboBox_2.setBounds(144, 33, 123, 20);
		comboBox_2.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_9.add(comboBox_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 58, 123, 20);
		textField_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_9.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 89, 123, 20);
		textField_2.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_9.add(textField_2);
		textField_2.setColumns(10);
		
		
		dateChooser_1.setDateFormatString("yyyy-MM-dd ");
		dateChooser_1.setBounds(143, 117, 124, 20);
		dateChooser_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_9.add(dateChooser_1);
		
		JButton btnCrerProduit = new JButton("Cr\u00E9er produit");
		btnCrerProduit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Creer creer = new Creer();
				      creer.setVisible(true);
			}
		});
		btnCrerProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnCrerProduit.setBounds(10, 173, 117, 23);
		btnCrerProduit.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_9.add(btnCrerProduit);
		
		JButton btnEntrer = new JButton("Entrer");
		btnEntrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Code pour enregistrer detail commande fournisseur
		         try{
		         String cmdfournisseur=((String)comboBox_1.getSelectedItem());
		         String codeproduit=((String)comboBox_2.getSelectedItem());
		         String quantite_entree =(String)textField_1.getText().trim();
		         String prix_unitaire =(String)textField_2.getText().trim();
		         String date =  (((JTextField)dateChooser_1.getDateEditor().getUiComponent()).getText());
		        if ( textField_1.getText().equals("")||textField_2.getText().equals("")) 
		        {
			JOptionPane.showMessageDialog(null, "Veuillez remplir toutes les cases vides s'il vous plait !","Ge_MagasinSoft",JOptionPane.WARNING_MESSAGE);
		        }
		        else{
		         String strins ="insert into detail_cmd_fr values (null,\'"+cmdfournisseur+"\',\'"+codeproduit+"\',\'"+quantite_entree+"\',\'"+prix_unitaire+"\',\'"+date+"\')";
		         UpdateFuction(strins);
		         String strup = "update produit set quantite_stock = quantite_stock + "+quantite_entree+" where idproduit = \'"+codeproduit+"\'";
		         UpdateFuction(strup);
		         Comboproduit() ;
		         Combocmdfournisseur();
		        JOptionPane.showMessageDialog(null,"Les informations du produit ont été enregistrées avec succès");
		        textField_1.setText("");
		        textField_2.setText("");
		        dateChooser_1.setDate(null);
		        
		            }
		        }catch(Exception e){
		        JOptionPane.showMessageDialog(null,e);
		        } 	
			}
		});
		btnEntrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnEntrer.setBounds(303, 7, 86, 23);
		btnEntrer.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_9.add(btnEntrer);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
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
		textField_4.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_11.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(146, 33, 140, 20);
		comboBox_3.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_11.add(comboBox_3);
		
		JDateChooser dateChooser_2 = new JDateChooser();
		dateChooser_2.setBounds(146, 61, 140, 20);
		dateChooser_2.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_11.add(dateChooser_2);
		
		JButton btnEnregistrer_1 = new JButton("Enregistrer");
		btnEnregistrer_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnregistrer_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnEnregistrer_1.setBounds(296, 7, 126, 23);
		btnEnregistrer_1.setBorder(new BevelBorder (BevelBorder.RAISED));
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
		lblCodeProduit_1.setBounds(26, 42, 94, 14);
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
		comboBox_4.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_12.add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(145, 39, 141, 20);
		comboBox_5.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_12.add(comboBox_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(145, 73, 141, 20);
		textField_5.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_12.add(textField_5);
		textField_5.setColumns(10);
		
		JDateChooser dateChooser_3 = new JDateChooser();
		dateChooser_3.setBounds(145, 101, 141, 20);
		dateChooser_3.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_12.add(dateChooser_3);
		
		JButton btnSortir = new JButton("Sortir");
		btnSortir.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnSortir.setBounds(320, 11, 89, 23);
		btnSortir.setBorder(new BevelBorder (BevelBorder.RAISED));
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
		btnBordereauDexpedition.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_12.add(btnBordereauDexpedition);
		
		
		ImageIcon img1=new ImageIcon(getClass().getResource("/resources/empl.png"));
		panel_6.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("GERER CLIENTS", img1, panel_6, null);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Enregistrement d'un client");
		lblNewLabel_9.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel_9.setBounds(198, 7, 293, 31);
		panel_6.add(lblNewLabel_9);
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_15.setBounds(65, 49, 343, 144);
		panel_6.add(panel_15);
		panel_15.setLayout(null);
		
		JLabel lblCodeClient = new JLabel("Code client");
		lblCodeClient.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeClient.setBounds(10, 11, 76, 14);
		panel_15.add(lblCodeClient);
		
		JLabel lblAdresse_1 = new JLabel("Nom");
		lblAdresse_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblAdresse_1.setBounds(10, 47, 65, 14);
		panel_15.add(lblAdresse_1);
		
		JLabel lblTlphone_1 = new JLabel("Adresse");
		lblTlphone_1.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblTlphone_1.setBounds(10, 78, 76, 14);
		panel_15.add(lblTlphone_1);
		
		textField_10 = new JTextField();
		textField_10.setBounds(110, 8, 163, 20);
		textField_10.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_15.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setBounds(110, 44, 163, 20);
		textField_11.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_15.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(110, 75, 163, 20);
		textField_12.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_15.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblTlphone_2 = new JLabel("T\u00E9l\u00E9phone");
		lblTlphone_2.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblTlphone_2.setBounds(10, 108, 76, 14);
		panel_15.add(lblTlphone_2);
		
		textField_13 = new JTextField();
		textField_13.setBounds(110, 105, 163, 20);
		textField_13.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_15.add(textField_13);
		textField_13.setColumns(10);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_16.setBounds(451, 49, 138, 107);
		panel_6.add(panel_16);
		panel_16.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Enregistrer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//inserer les client dans la BD
				try{
					String str=textField_10.getText().trim();
					String str1=textField_11.getText().trim();
					String str2=textField_12.getText().trim();
					String str3=textField_13.getText().trim();
					if(str.equals("")||str1.equals("")||str2.equals("")){
						JOptionPane.showMessageDialog(null ,"Veuillez remplir le(s) champ(s) vide(e) s'il vous plait","Ge_MagasinSoft",JOptionPane.INFORMATION_MESSAGE);	
					}else{
						String sql="insert into client values(\'"+str+"\',\'"+str1+"\',\'"+str2+"\',\'"+str3+"\') ";
						UpdateFuction(sql);
						Update_Table(table_1,sql2);
						JOptionPane.showMessageDialog(null ,"Les informations du client sont enregistrées avec succes","Ge_MagasinSoft",JOptionPane.INFORMATION_MESSAGE);
					//vider les zonnes de saisies
						textField_10.setText("");
						textField_11.setText("");
						textField_12.setText("");
						textField_13.setText("");
					}
					
					
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null ,e.getMessage());
				}	
				
				
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnNewButton_1.setBounds(10, 7, 118, 23);
		btnNewButton_1.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_16.add(btnNewButton_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(65, 204, 524, 228);
		panel_6.add(scrollPane_1);
		
		table_1 = new JTable();
		Update_Table(table_1,sql2);
		scrollPane_1.setViewportView(table_1);
		
		ImageIcon img4=new ImageIcon(getClass().getResource("/resources/modifier.jpg"));
		panel_7.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		tabbedPane.addTab("ADMINISTRATEUR", img4, panel_7, null);
		panel_7.setLayout(null);
		
		JLabel lblDonnerLesDroits = new JLabel("Donner les droits aux utilisateurs du systeme");
		lblDonnerLesDroits.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 24));
		lblDonnerLesDroits.setBounds(134, 0, 412, 30);
		panel_7.add(lblDonnerLesDroits);
		
		
		ImageIcon img2=new ImageIcon(getClass().getResource("/resources/stock-key.jpg"));
		JLabel lblNewLabel_10 = new JLabel(img2);
		lblNewLabel_10.setBounds(182, 177, 450, 255);
		panel_7.add(lblNewLabel_10);
		
		JButton btnClickerIci = new JButton("Cliquer ici !!");
		btnClickerIci.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnClickerIci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ZPassword1 zd = new ZPassword1(null, "Affectation des droits", true);
				ZPasswordInfo1 zInfo = zd.showZDialog(); 
				String squery=zInfo.toString();
				if (squery.length()>0){
					UpdateFuction(squery);}
			}
		});
		btnClickerIci.setBounds(511, 136, 121, 30);
		btnClickerIci.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_7.add(btnClickerIci);
		
		JLabel lblNewLabel_11 = new JLabel("Modifier droit ");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_11.setBounds(529, 111, 103, 14);
		panel_7.add(lblNewLabel_11);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), "Donner droit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_17.setBounds(34, 42, 240, 134);
		panel_7.add(panel_17);
		panel_17.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Login");
		lblNewLabel_12.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_12.setBounds(10, 24, 46, 14);
		panel_17.add(lblNewLabel_12);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblPassword.setBounds(10, 49, 67, 14);
		panel_17.add(lblPassword);
		
		JLabel lblConfirmer = new JLabel("Confirmer");
		lblConfirmer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblConfirmer.setBounds(10, 74, 67, 14);
		panel_17.add(lblConfirmer);
		
		textField_3 = new JTextField();
		textField_3.setBounds(87, 21, 122, 20);
		textField_3.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_17.add(textField_3);
		textField_3.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(87, 46, 122, 20);
		passwordField.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_17.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(87, 71, 122, 17);
		passwordField_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_17.add(passwordField_1);
		
		JButton btnAffecter = new JButton("Affecter");
		btnAffecter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String str = textField_3.getText().trim();
				String str1=passwordField.getText().trim();
				String str2=passwordField_1.getText().trim();
				if (str.equals("")||str1.equals("")||str2.equals(""))
	        	{
	 		    JOptionPane.showMessageDialog(null, "Remplir tous les champs vides avant d'affecter", "Ge_MagasinSoft Information", JOptionPane.INFORMATION_MESSAGE);
	    	     
	        	}else{
	        		try{ 
	        		
	        		if(str1.equals(str2)){
	        			                 if(!str1.equals("")){
		                     	         String strcpte = "insert into administrateur values(null,\'" + str + "\',md5(\'" + str1 + "\'))";
		                     	         UpdateFuction(strcpte);
		                                 }
	    	       
	        		  } else{
		  
		            	 JOptionPane.showMessageDialog(null, "Les mots de passe ne sont pas identiques"+"\n"+"Entrer les mot de passe identiques", "Ge_MagasinSoft Information", JOptionPane.INFORMATION_MESSAGE);
		            	 
	        		     }
	        		}catch(NullPointerException e){}
	           }
				
			 textField_3.setText("");
           	 passwordField.setText("");
           	 passwordField_1.setText("");
			}
		});
		btnAffecter.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnAffecter.setBounds(10, 99, 89, 23);
		btnAffecter.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_17.add(btnAffecter);
		
	}   //fin du constructeur
	
	
	//definition des differentes fonctions
	private void UpdateFuction(String query)
	  {
	      try{
	          //on cree un statement qui permet l'execution des requetes
	          Statement state =Stconnection.getInstance().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	          state.executeUpdate(query);
	          state.close();
	      }
	      catch(SQLException e)
	          
	              {
	                  JOptionPane.showMessageDialog(null,e.getMessage(),"Erreur",JOptionPane.ERROR_MESSAGE);
	              }
	      }
	
	//fonction de mettre les valeur dans la table
	
	 private void Update_Table(JTable table,String query){
	        try{
	        pst = Stconnection.getInstance().prepareStatement(query);
	        rs = pst.executeQuery();
	       table.setModel(DbUtils.resultSetToTableModel(rs));
	        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
	        }
	 //fonction pour mettre les id du fournisseur dans le combo
	 private void ComboFournisseur(){
		 combofournisseur.removeAllItems();
	    try{
	     String sql = "select * from fournisseur";
	     pst = Stconnection.getInstance().prepareStatement(sql);
	     rs = pst.executeQuery();
	     while(rs.next()){
	     String code = rs.getString("idfournisseur");
	     combofournisseur.addItem(code);
	    
	     }
	    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
	 }
	 
	 //fonction pour mettre les id du cmdcommande dans le combo
	 private void Combocmdfournisseur(){
		 comboBox_1.removeAllItems();
	    try{
	     String sql = "select * from cmdfournisseur";
	     pst = Stconnection.getInstance().prepareStatement(sql);
	     rs = pst.executeQuery();
	     while(rs.next()){
	     String code1 = rs.getString("idcommande");
	     comboBox_1.addItem(code1);
	    
	     }
	    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
	 }
	 
	//fonction pour mettre les id du cmdcommande dans le combo
		 private void Comboproduit(){
			 comboBox_2.removeAllItems();
		    try{
		     String sql = "select * from produit";
		     pst = Stconnection.getInstance().prepareStatement(sql);
		     rs = pst.executeQuery();
		     while(rs.next()){
		     String code2 = rs.getString("idproduit");
		     comboBox_2.addItem(code2);
		    
		     }
		    }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
		 }
	 
	 
}
