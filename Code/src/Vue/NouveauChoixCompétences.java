/*
 * Created by JFormDesigner on Mon Jan 03 09:45:49 CET 2022
 */

package Vue;

import java.awt.*;
import javax.swing.*;
import net.miginfocom.swing.*;

/**
 * @author MARYEM MEZIANE
 */
public class NouveauChoixCompétences extends JFrame {
	public NouveauChoixCompétences() {
		initComponents();
	}

	private void initComponents() {
		
		panel1 = new JPanel();
		label1 = new JLabel();

		//======== this ========
		var contentPane = getContentPane();
		contentPane.setLayout(new GridLayout());

		//======== panel1 ========
		{
			panel1.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border. EmptyBorder
			( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax. swing. border
			. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 ), java. awt
			. Color. red) ,panel1. getBorder( )) ); panel1. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void
			propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
			; }} );
			panel1.setLayout(new MigLayout(
				"hidemode 3",
				// columns
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
				"[fill]" +
				"[fill]",
				// rows
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]" +
				"[]"));

			//---- label1 ----
			label1.setText("Veuillez Choisir une Carte de Comp\u00e9tence");
			label1.setFont(new Font("Arial", Font.BOLD, 26));
			panel1.add(label1, "cell 16 0");
		}
		contentPane.add(panel1);
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - MARYEM MEZIANE
	private JPanel panel1;
	private JLabel label1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
