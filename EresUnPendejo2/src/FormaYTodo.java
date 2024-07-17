

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager; 



public class FormaYTodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(2,1,0,10));
		
		JButton boton = new JButton();
		boton.setText("Averigualo");
		
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Boton pendejo");
				frame.setVisible(false);
				JOptionPane.showMessageDialog(null,"Eres un pendejo","Respuesta",1,UIManager.getIcon("FileView.hardDriveIcon"));
				frame.setVisible(true);
			}
		});
		
		JLabel label = new JLabel();
		label.setText("Eres un pendejo?");
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("Helvetica",Font.BOLD,30));
		
		
		
		frame.add(label);
		frame.add(boton);
		
		
		
		
		frame.setVisible(true);
	}

}
