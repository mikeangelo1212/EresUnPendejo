

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
		
//		JFrame frame = new JFrame();
//		frame.setSize(500,500);
//		frame.setLayout(new GridLayout(2,1,0,10));
//		
//		JButton boton = new JButton();
//		boton.setText("Averigualo");
//		
//		boton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Boton pendejo");
//				frame.setVisible(false);
//				JOptionPane.showMessageDialog(null,"Eres un pendejo","Respuesta",1,UIManager.getIcon("FileView.hardDriveIcon"));
//				frame.setVisible(true);
//			}
//		});
//		
//		JLabel label = new JLabel();
//		label.setText("Eres un pendejo?");
//		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setFont(new Font("Helvetica",Font.BOLD,30));
//		
//		
//		
//		frame.add(label);
//		frame.add(boton);
//		
//		
//		
//		
//		frame.setVisible(true);
		boolean perro=true;
		while(perro) {
			int res= JOptionPane.showConfirmDialog(null, "Eres un pendejo?","Pregunta importante",JOptionPane.YES_NO_CANCEL_OPTION);
			switch (res) {
			case 0:
				System.out.println("Yes");
				JOptionPane.showMessageDialog(null, "Me alegro que lo sepas :)","Felicidades",JOptionPane.INFORMATION_MESSAGE);
				perro=false;
				break;
	
			case 1:
				System.out.println("No");
				JOptionPane.showMessageDialog(null, "Siguelo creyendo. Pendejo.","La dura verdad",JOptionPane.ERROR_MESSAGE);
				break;
			case 2:
				System.out.println("Cancel");
				JOptionPane.showMessageDialog(null, "A donde crees que vas? Responde la pregunta","Ni creas que te iras",JOptionPane.WARNING_MESSAGE);
				break;
			default:
				System.out.println("App closed");
				JOptionPane.showMessageDialog(null, "Para mi que eres marica","No seas culo",JOptionPane.WARNING_MESSAGE);
				break;
			}
		}

	}

}
