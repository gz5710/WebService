/**
 * 
 */
package com.tmax;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * @Author: Bruce GONG
 * @Project: Tester
 * @Package: com.tmax
 * @Filename: JFormTest
 * @Datetime: 2014年11月16日 / 下午10:44:01
 */
public class JFormTest extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public JFormTest() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		//1.initialization
		JPanel jpanel = new JPanel();
		JButton jbtn1 = new JButton("Button 1");
		JButton jbtn2 = new JButton("Button 2");
		
		//2.configuration
		Dimension d = new Dimension(180,30);
		jbtn1.setPreferredSize(d);
		jbtn2.setPreferredSize(d);
		jpanel.add(jbtn1);
		jpanel.add(jbtn2);
		this.add(jpanel);
		this.setTitle("JForm Test");
		this.setSize(800, 300);
		this.setFont(getFont());
		this.setLocation(300, 100);
		this.setLayout(new GridLayout(1,1));
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//3.set the listeners
		jbtn1.addActionListener(new btnListener());
		jbtn2.addActionListener(new btnListener());
		this.addWindowListener(new windowListener());
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFormTest jft = new JFormTest();
	}

}

class windowListener implements WindowListener{

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		int r = JOptionPane.showConfirmDialog(arg0.getComponent(), 
				"Are you sure to close this window",
				"Warning Message", 
				JOptionPane.OK_CANCEL_OPTION);
		if(r == JOptionPane.OK_OPTION){
			System.exit(0);
		}
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}

class btnListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		Toolkit.getDefaultToolkit().beep();
		System.out.println(arg0.getActionCommand());
		System.out.println(arg0.getModifiers());
		System.out.println(arg0.getID());
		System.out.println(arg0.getSource());
		System.out.println(arg0.getWhen());
		JOptionPane.showMessageDialog(null, arg0.getActionCommand(), "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	
}
