/**
 * 
 */
package com.tmax.client;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.apache.axis2.AxisFault;

import localhost.demandeprestation.DemandePrestationRequest;
import localhost.demandeprestation.DemandePrestationResponse;
import localhost.demandeprestation.DemandePrestationStub;

/**
 * @author Bruce GONG
 *
 */
public class Client extends JFrame {
	
	public static DemandePrestationResponse getService(String name, String location, String email){
		DemandePrestationRequest dpr = new DemandePrestationRequest();
		dpr.setName(name);
		dpr.setLocation(location);
		dpr.setEmail(email);
		DemandePrestationStub dpStub;
		DemandePrestationResponse dpRes=null;
		try {
			dpStub = new DemandePrestationStub();
			dpRes = dpStub.process(dpr);
			//System.out.println(dpRes.getCompteRendu() + dpRes.getFacture() + dpRes.getResult());
			return dpRes;
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dpRes;
	}

	private JPanel jpanel;
	private JLabel jlabName;
	private JLabel jlabLocation;
	private JLabel jlabEmail;
	private JTextField jtxtName;
	private JTextField jtxtLocation;
	private JTextField jtxtEmail;
	private JButton jbtn;
	private JLabel jlabResult;
	
	public Client() throws HeadlessException {
		super();
		// TODO Auto-generated constructor stub
		//initialization of components
		this.jpanel = new JPanel();
		this.jlabName = new JLabel("Qui :");
		this.jlabLocation = new JLabel("O�� :");
		this.jlabEmail = new JLabel("Email :");
		
		this.jtxtName = new JTextField();
		this.jtxtLocation = new JTextField();
		this.jtxtEmail = new JTextField();
		
		this.jbtn = new JButton("Demandez");
		
		this.jlabResult = new JLabel("Response :");
		
		//configurations of components
		Dimension disLab = new Dimension(50, 30);
		Dimension disTxt = new Dimension(200, 30);
		this.jlabName.setPreferredSize(disLab);
		this.jlabName.setLocation(10, 10);
		this.jlabLocation.setPreferredSize(disLab);
		this.jlabEmail.setPreferredSize(disLab);
		this.jtxtName.setPreferredSize(disTxt);
		this.jtxtLocation.setPreferredSize(disTxt);
		this.jtxtEmail.setPreferredSize(disTxt);
		this.jlabResult.setPreferredSize(new Dimension(250, 120));
		//this.jpanel.setLayout(new GridLayout());
		
		//add all the components on frame
		this.jpanel.add(jlabName);
		this.jpanel.add(jtxtName);
		this.jpanel.add(jlabLocation);
		this.jpanel.add(jtxtLocation);
		this.jpanel.add(jlabEmail);
		this.jpanel.add(jtxtEmail);
		this.jpanel.add(jbtn);
		this.jpanel.add(jlabResult);
		this.add(jpanel);
		
		//event listener of button
		this.jbtn.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = (JButton)e.getSource();	
				JPanel panel = (JPanel) btn.getParent();
				Client c = (Client) SwingUtilities.getAncestorOfClass(Client.class, panel);
				String name = c.jtxtName.getText();
				String location = c.jtxtLocation.getText();
				String email = c.jtxtEmail.getText();
				if(name.trim().equals("") || 
						location.trim().equals("") ||
						email.trim().equals("")){
					c.jlabResult.setText("Nous n'acceptons pas de valeur vide.");
				}else{
					DemandePrestationResponse dpr = getService(name, location, email);
					String result = "<html><body>Response : <br>";
					if(dpr.getResult().equals("tns:result")){
						result += "Compte Rendu : " + dpr.getCompteRendu()
								+ "<br>Facture : " + dpr.getFacture();
					}else{
						result += dpr.getResult();
					}
					result += "</body></html>";
					c.jlabResult.setText(result);
				}
			}			
		});
		
		//configurations of frame
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Demander une Prestation");
		this.setSize(300, 300);
		this.setFont(getFont());
		this.setLocation(500, 100);
		this.setLayout(new GridLayout(1,1));
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args){
		Client client = new Client();
	}
	
}
