package memoire;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
public class ZPassword1 extends JDialog {
	
private static final long serialVersionUID = 1L;
private ZPasswordInfo1 zInfo = new ZPasswordInfo1();
private JLabel lno,lnouv, lconf;
private JTextField txtno;
private JPasswordField txtnouv,txtconf;
Font policebtn = new Font("monospace", Font.BOLD, 10);// font des boutons
Font policelbl = new Font("tahoma", 0,12);
			
			
public ZPassword1(JFrame parent, String title, boolean modal){
super(parent, title, modal);
this.setSize(250, 250);
this.setLocationRelativeTo(null);
this.setResizable(false);
this.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
this.initComponent();
			}
			
public ZPasswordInfo1 showZDialog(){
this.setVisible(true);
return this.zInfo;
			}
			
private void initComponent(){
			//Icone
JPanel pancomposant = new JPanel();
pancomposant.setPreferredSize(new Dimension(290,180));
txtno = new JTextField();
txtno.setPreferredSize(new Dimension(100, 20)); 
txtnouv = new JPasswordField();
txtnouv.setPreferredSize(new Dimension(100, 20));
txtconf = new JPasswordField();
txtconf.setPreferredSize(new Dimension(100, 20));

lno = new JLabel("Login "); 
lno.setPreferredSize(new Dimension(100, 20));
lno.setFont(policelbl);
lnouv = new JLabel("Nouveau P");
lnouv.setPreferredSize(new Dimension(100, 20));
lnouv.setFont(policelbl);
lconf = new JLabel("Confirmez");
lconf.setPreferredSize(new Dimension(100, 20));
lconf.setFont(policelbl);
			
//pancomposant.setLayout(new BorderLayout());
//jr51.setSelected(true);
pancomposant.add(lno);pancomposant.add(txtno);
pancomposant.add(lnouv);pancomposant.add(txtnouv);
pancomposant.add(lconf);pancomposant.add(txtconf);
//pancomposant.add(jr51);pancomposant.add(jr52);
//Le nom
			
JPanel content = new JPanel();
content.setBackground(Color.white);
content.add(pancomposant);
pancomposant.setBackground(Color.pink);
			
JPanel control = new JPanel();
//ImageIcon imag = new ImageIcon("images/okbtn.png");
JButton okBouton = new JButton("OK");//,img
okBouton.setMnemonic('O');
okBouton.setPreferredSize(new Dimension(80,20));
okBouton.setFont(policebtn);okBouton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
			
okBouton.addActionListener(new ActionListener(){
			@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent arg0) {
			
if (txtnouv.getText().equals(txtconf.getText())){
zInfo = new ZPasswordInfo1(txtno.getText(),txtnouv.getText());
setVisible(false);}
else{
			
JOptionPane.showMessageDialog(null, "Les nouvelles entrées ne sont pas identiques"+"\n"+"Entrer les mot de passe identiques", "Ge_MagasinSoft Information", JOptionPane.INFORMATION_MESSAGE);
 txtnouv.setText("");txtconf.setText("");     
	}
			
}
			
});
//ImageIcon img = new ImageIcon("images/supprimer.png");
JButton cancelBouton = new JButton("Annuler");
cancelBouton.setMnemonic('A');
cancelBouton.setPreferredSize(new Dimension(90,20));
cancelBouton.setFont(policebtn);okBouton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
		
			cancelBouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
			setVisible(false);
			}
			});
			control.add(okBouton);
			control.add(cancelBouton);
			control.setBackground(Color.darkGray);
			this.getContentPane().add(content, BorderLayout.NORTH);
			this.getContentPane().add(control, BorderLayout.SOUTH);
			}
}
