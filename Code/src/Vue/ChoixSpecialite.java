
package Vue;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author MARYEM MEZIANE
 */
public class ChoixSpecialite extends JFrame {
	private int x;
	public ChoixSpecialite() {
		initComponents();
	}

	private void button1(ActionEvent e) {
		
		switch (x) {
		case 1:
			System.out.println("");
		}
		// TODO add your code here
	}

	private void radioButton1(ItemEvent e) {
		if (radioButton1.isSelected()==true)
			x=1;
	}

	private void radioButton2(ActionEvent e) {
		if (radioButton2.isSelected()==true)
			x=2;	}
	
	private void radioButton3(ActionEvent e) {
		if (radioButton3.isSelected()==true)
			x=3;	}
	
	private void radioButton4(ActionEvent e) {
		if (radioButton4.isSelected()==true)
			x=4;	}
	
	private void radioButton5(ActionEvent e) {
		if (radioButton5.isSelected()==true)
			x=5;	}
	
	private void radioButton6(ActionEvent e) {
		if (radioButton6.isSelected()==true)
			x=6;	}
	
	private void radioButton7(ActionEvent e) {
		if (radioButton7.isSelected()==true)
			x=7;	}
	
	private void radioButton8(ActionEvent e) {
		if (radioButton8.isSelected()==true)
			x=8;	}
	private void initComponents() {

		// Generated using JFormDesigner Evaluation license - MARYEM MEZIANE
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		label5 = new JLabel();
		label8 = new JLabel();
		label11 = new JLabel();
		label13 = new JLabel();
		label15 = new JLabel();
		label17 = new JLabel();
		label19 = new JLabel();
		label21 = new JLabel();
		label3 = new JLabel();
		label6 = new JLabel();
		label9 = new JLabel();
		label12 = new JLabel();
		label16 = new JLabel();
		label18 = new JLabel();
		label20 = new JLabel();
		label22 = new JLabel();
		label4 = new JLabel();
		label7 = new JLabel();
		label10 = new JLabel();
		label23 = new JLabel();
		label24 = new JLabel();
		label25 = new JLabel();
		label26 = new JLabel();
		label27 = new JLabel();
		label28 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		radioButton3 = new JRadioButton();
		radioButton4 = new JRadioButton();
		radioButton5 = new JRadioButton();
		radioButton6 = new JRadioButton();
		radioButton7 = new JRadioButton();
		radioButton8 = new JRadioButton();
		radioButton9 = new JRadioButton();
		button1 = new JButton();
		panel2 = new JPanel();

		//======== this ========
		setBackground(new Color(135, 206, 250));
		var contentPane = getContentPane();
		contentPane.setLayout(new MigLayout(
			"hidemode 3",
			// columns
			"[fill]",
			// rows
			"[]" +
			"[]"));

		//======== panel1 ========
		{
			panel1.setBackground(new Color(224, 255, 255));
			panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
			new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
			, javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
			, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 )
			, java. awt. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (
			new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
			) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
			; }} );
			panel1.setLayout(new MigLayout(
				"insets panel,novisualpadding,hidemode 3",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]unrel" +
				"[fill]rel" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[12,fill]" +
				"[fill]0" +
				"[0,fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//---- label1 ----
			label1.setText("Veuillez Choisir une sp\u00e9cialit\u00e9");
			label1.setFont(new Font("Arial", Font.BOLD, 26));
			panel1.add(label1, "cell 12 0 35 1");

			//---- label2 ----
			label2.setText("D\u00e9veloppement ");
			label2.setFont(new Font("Arial", Font.BOLD, 11));
			label2.setBackground(Color.white);
			panel1.add(label2, "cell 0 2 4 1");

			//---- label5 ----
			label5.setText("S\u00e9curit\u00e9 et Virtualisation");
			label5.setFont(new Font("Arial", Font.BOLD, 11));
			label5.setBackground(Color.white);
			panel1.add(label5, "cell 4 2");

			//---- label8 ----
			label8.setText("Intelligence");
			label8.setFont(new Font("Arial", Font.BOLD, 11));
			label8.setBackground(Color.white);
			panel1.add(label8, "cell 8 2");

			//---- label11 ----
			label11.setText("Vision");
			label11.setFont(new Font("Arial", Font.BOLD, 11));
			label11.setBackground(Color.white);
			panel1.add(label11, "cell 12 2");

			//---- label13 ----
			label13.setText("Data science");
			label13.setFont(new Font("Arial", Font.BOLD, 11));
			label13.setBackground(Color.white);
			panel1.add(label13, "cell 16 2");

			//---- label15 ----
			label15.setText("M\u00e9thodes et outils de ");
			label15.setFont(new Font("Arial", Font.BOLD, 11));
			label15.setBackground(Color.white);
			panel1.add(label15, "cell 21 2");

			//---- label17 ----
			label17.setText("Conception et deploiement");
			label17.setFont(new Font("Arial", Font.BOLD, 11));
			label17.setBackground(Color.white);
			panel1.add(label17, "cell 27 2");

			//---- label19 ----
			label19.setText("Monde Virtuels");
			label19.setFont(new Font("Arial", Font.BOLD, 11));
			label19.setBackground(Color.white);
			panel1.add(label19, "cell 37 2");

			//---- label21 ----
			label21.setText("Robotique");
			label21.setFont(new Font("Arial", Font.BOLD, 11));
			label21.setBackground(Color.white);
			panel1.add(label21, "cell 44 2");

			//---- label3 ----
			label3.setText("Informatique Avanc\u00e9");
			label3.setFont(new Font("Arial", Font.BOLD, 11));
			label3.setBackground(Color.white);
			panel1.add(label3, "cell 0 3 2 1");

			//---- label6 ----
			label6.setText("de l'infrastructure r\u00e9seau");
			label6.setFont(new Font("Arial", Font.BOLD, 11));
			label6.setBackground(Color.white);
			panel1.add(label6, "cell 4 3");

			//---- label9 ----
			label9.setText("Artificielle");
			label9.setFont(new Font("Arial", Font.BOLD, 11));
			label9.setBackground(Color.white);
			panel1.add(label9, "cell 8 3");

			//---- label12 ----
			label12.setText("Artificielle");
			label12.setFont(new Font("Arial", Font.BOLD, 11));
			label12.setBackground(Color.white);
			panel1.add(label12, "cell 12 3");

			//---- label16 ----
			label16.setText("d\u00e9ploiement logiciel");
			label16.setFont(new Font("Arial", Font.BOLD, 11));
			label16.setBackground(Color.white);
			panel1.add(label16, "cell 21 3");

			//---- label18 ----
			label18.setText("infrastructure r\u00e9seaux");
			label18.setFont(new Font("Arial", Font.BOLD, 11));
			label18.setBackground(Color.white);
			panel1.add(label18, "cell 27 3");

			//---- label20 ----
			label20.setText("UX / UI");
			label20.setFont(new Font("Arial", Font.BOLD, 11));
			label20.setBackground(Color.white);
			panel1.add(label20, "cell 37 3");

			//---- label22 ----
			label22.setText("et syst\u00e8me Embarqu\u00e9s");
			label22.setFont(new Font("Arial", Font.BOLD, 11));
			label22.setBackground(Color.white);
			panel1.add(label22, "cell 44 3");

			//---- label4 ----
			label4.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\t\u00e9l\u00e9charg\u00e9.jpg"));
			panel1.add(label4, "cell 0 5");

			//---- label7 ----
			label7.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\srt-infrastructure-reseau-systeme-iStock-1196622756.jpg"));
			panel1.add(label7, "cell 4 5");

			//---- label10 ----
			label10.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\t\u00e9l\u00e9charg\u00e9 (1).jpg"));
			panel1.add(label10, "cell 8 5");

			//---- label23 ----
			label23.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\raw.jpg"));
			panel1.add(label23, "cell 12 5");

			//---- label24 ----
			label24.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\t\u00e9l\u00e9charg\u00e9 (3).jpg"));
			panel1.add(label24, "cell 16 5");

			//---- label25 ----
			label25.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\DEV.png"));
			panel1.add(label25, "cell 21 5");

			//---- label26 ----
			label26.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\srt-infrastructure-reseau-systeme-iStock-1196622756.jpg"));
			panel1.add(label26, "cell 27 5");

			//---- label27 ----
			label27.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\ux-ui-design-mobile.png"));
			panel1.add(label27, "cell 37 5");

			//---- label28 ----
			label28.setIcon(new ImageIcon("C:\\Users\\HP\\Desktop\\AP4B_Kanagawa_UTBM-main\\images\\t\u00e9l\u00e9charg\u00e9 (2).jpg"));
			panel1.add(label28, "cell 44 5");

			//---- radioButton1 ----
			radioButton1.setBackground(new Color(224, 255, 255));
			radioButton1.addItemListener(e -> radioButton1ItemStateChanged(e));
			panel1.add(radioButton1, "cell 0 6");

			//---- radioButton2 ----
			radioButton2.setBackground(new Color(224, 255, 255));
			radioButton2.addActionListener(e -> radioButton2(e));
			panel1.add(radioButton2, "cell 4 6");

			//---- radioButton3 ----
			radioButton3.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton3, "cell 8 6");

			//---- radioButton4 ----
			radioButton4.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton4, "cell 12 6");

			//---- radioButton5 ----
			radioButton5.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton5, "cell 16 6");

			//---- radioButton6 ----
			radioButton6.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton6, "cell 21 6");

			//---- radioButton7 ----
			radioButton7.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton7, "cell 27 6");

			//---- radioButton8 ----
			radioButton8.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton8, "cell 37 6");

			//---- radioButton9 ----
			radioButton9.setBackground(new Color(224, 255, 255));
			panel1.add(radioButton9, "cell 44 6");

			//---- button1 ----
			button1.setText("Valider Sp\u00e9cialit\u00e9");
			button1.setFont(new Font("Arial", Font.BOLD, 18));
			button1.addActionListener(e -> button1(e));
			panel1.add(button1, "cell 12 8 10 1");
		}
		contentPane.add(panel1, "cell 0 0");

		//======== panel2 ========
		{
			panel2.setBackground(new Color(135, 206, 250));
			panel2.setLayout(new MigLayout(
				"insets panel,novisualpadding,hidemode 3",
				// columns
				"[fill]" +
				"[fill]" +
				"[fill]unrel" +
				"[fill]rel" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[12,fill]" +
				"[fill]0" +
				"[0,fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]0" +
				"[fill]" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]0" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));
		}
		contentPane.add(panel2, "cell 0 1");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	private Object radioButton1ItemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		return null;
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MARYEM MEZIANE
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label5;
	private JLabel label8;
	private JLabel label11;
	private JLabel label13;
	private JLabel label15;
	private JLabel label17;
	private JLabel label19;
	private JLabel label21;
	private JLabel label3;
	private JLabel label6;
	private JLabel label9;
	private JLabel label12;
	private JLabel label16;
	private JLabel label18;
	private JLabel label20;
	private JLabel label22;
	private JLabel label4;
	private JLabel label7;
	private JLabel label10;
	private JLabel label23;
	private JLabel label24;
	private JLabel label25;
	private JLabel label26;
	private JLabel label27;
	private JLabel label28;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JRadioButton radioButton3;
	private JRadioButton radioButton4;
	private JRadioButton radioButton5;
	private JRadioButton radioButton6;
	private JRadioButton radioButton7;
	private JRadioButton radioButton8;
	private JRadioButton radioButton9;
	private JButton button1;
	private JPanel panel2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
