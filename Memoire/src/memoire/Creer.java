package memoire;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JScrollPane;

import net.proteanit.sql.DbUtils;

import stat.db.Stconnection;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Creer extends JDialog {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JScrollPane scrollPane = new JScrollPane();
	private JTable table;
	private PreparedStatement pst;
	private ResultSet rs;
	JDateChooser dateChooser = new JDateChooser();
	String sql1="select * from produit";
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Creer frame = new Creer();
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
	public Creer() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Creer.class.getResource("/resources/121.png")));
		setTitle("CREER PRODUIT\r\n");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 566, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBounds(0, 0, 550, 384);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblEnregistrementDuNouveau = new JLabel("Enregistrement du nouveau produit");
		lblEnregistrementDuNouveau.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 23));
		lblEnregistrementDuNouveau.setBounds(134, 11, 316, 30);
		panel.add(lblEnregistrementDuNouveau);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel_1.setBounds(54, 52, 428, 147);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCodeProduit = new JLabel("Code produit");
		lblCodeProduit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblCodeProduit.setBounds(10, 11, 88, 14);
		panel_1.add(lblCodeProduit);
		
		JLabel lblDsignation = new JLabel("D\u00E9signation");
		lblDsignation.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDsignation.setBounds(10, 36, 88, 14);
		panel_1.add(lblDsignation);
		
		JLabel lblUnit = new JLabel("Unit\u00E9 ");
		lblUnit.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblUnit.setBounds(10, 64, 46, 14);
		panel_1.add(lblUnit);
		
		JLabel lblQuantitAlerte = new JLabel("Quantit\u00E9 alerte");
		lblQuantitAlerte.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblQuantitAlerte.setBounds(10, 86, 105, 14);
		panel_1.add(lblQuantitAlerte);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		lblDate.setBounds(10, 122, 46, 14);
		panel_1.add(lblDate);
		
		textField = new JTextField();
		textField.setBounds(137, 8, 124, 20);
		textField.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(137, 33, 124, 20);
		textField_1.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(137, 58, 124, 20);
		textField_2.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(137, 85, 124, 20);
		textField_3.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		
		dateChooser.setBounds(137, 116, 124, 20);
		dateChooser.setBorder(new BevelBorder (BevelBorder.LOWERED));
		panel_1.add(dateChooser);
		
		JButton btnCrer = new JButton("Cr\u00E9er");
		btnCrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try{
					String str=textField.getText().trim();
					String str1=textField_1.getText().trim();
					String str2=textField_2.getText().trim();
					String str3=textField_3.getText().trim();
					String str4=(((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
					if(str.equals("")||str1.equals("")||str2.equals("")||str3.equals("")){
						JOptionPane.showMessageDialog(null ,"Veuillez remplir le(s) champ(s) vide(e) s'il vous plait","Ge_MagasinSoft",JOptionPane.INFORMATION_MESSAGE);	
					}else{
						String sql="insert into fournisseur values(\'"+str+"\',\'"+str1+"\',\'"+str2+"\',\'"+str3+"\',\'"+str4+"\') ";
						UpdateFuction(sql);
						
						Update_Table(table,sql1);
						
					//vider les zonnes de saisies
						textField.setText("");
						textField_1.setText("");
						textField_2.setText("");
						textField_3.setText("");
						
					}
					
					
					
				}catch(Exception e){
					JOptionPane.showMessageDialog(null ,e.getMessage());
				}
				
				
				
				
			}
		});
		btnCrer.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnCrer.setBounds(329, 7, 89, 23);
		btnCrer.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_1.add(btnCrer);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 14));
		btnModifier.setBounds(329, 36, 89, 23);
		btnModifier.setBorder(new BevelBorder (BevelBorder.RAISED));
		panel_1.add(btnModifier);
		
		table = new JTable();
		Update_Table(table,sql1);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				try{
			        int row = table.getSelectedRow();
			        String Table_click = (table.getModel().getValueAt(row, 0).toString());
			        String sql = "select * from produit where idproduit = '"+Table_click+"'";
			        pst = Stconnection.getInstance().prepareStatement(sql);
			        rs = pst.executeQuery();
			        if(rs.next()){
			        String add1 = rs.getString("idproduit");
			        textField.setText(add1);
			        String add2 = rs.getString("designation");
			        textField_1.setText(add2);
			        String add3 = rs.getString("unite");
			        textField_2.setText(add3);
			        String add4 = rs.getString("quantite_alerte");
			        textField_3.setText(add4);
			        Date add6 = rs.getDate("date");
			        dateChooser.setDate(add6);
			       } 
			       } catch(Exception e){JOptionPane.showMessageDialog(null,e);}
				
				
				
			}
		});
		scrollPane.setBounds(54, 210, 428, 163);
		panel.add(scrollPane);
		
		
		scrollPane.setViewportView(table);
	}
	//definition des differentes fonction
	
	
	
	//fonction de mise a jour les donnees update,delete modify
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
	
	
	//fonction pour afficher la valeur dans la table
	 private void Update_Table(JTable table,String query){
	        try{
	       // String sql = "select * from fournisseur";
	        pst = Stconnection.getInstance().prepareStatement(query);
	        rs = pst.executeQuery();
	       table.setModel(DbUtils.resultSetToTableModel(rs));
	        }catch(Exception e){JOptionPane.showMessageDialog(null, e);}
	        }
	
	
}
