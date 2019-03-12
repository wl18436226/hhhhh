package com.yychatclient.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class FriendList extends JFrame implements ActionListener,MouseListener{
	CardLayout cardLayout;
	
	JPanel myFriendPanel;
	JButton myFriendJButton;
	
	JScrollPane myFriendJScrollPanel;
	JPanel myFriendListJPanel;
	static final int FRIENDCOUNT=51;
	JLabel[] myFriendJLabel=new JLabel[FRIENDCOUNT];
	
	JScrollPane sky;
	JPanel myStrangerListJPanel;
	static final int A=21;
	JLabel[] myStrangerJLabel=new JLabel[A];
	
	JPanel myStrangerBlackListJPanel;
	JButton myStrangerJButton;
	JButton blackListJButton;
	
	JPanel myStrangerPanel;
	
	JPanel myFriendStrangerPanel;
	JButton myFriendJButton1;
	JButton myStrangerJButton1;
	
	JButton blackListJButton1;

	public FriendList() {
		
		myFriendPanel=new JPanel(new BorderLayout());
		
		
		myFriendJButton=new JButton("我的好友");
		myFriendPanel.add(myFriendJButton,"North");
		
		
		/*JScrollPane myFriendJScrollPanel;
		JPanel myFriendListJPanel;
		static final int FRIENDCOUNT=51;
		JLabel[] myFriendJLabel;*/
		myFriendListJPanel=new JPanel(new GridLayout(FRIENDCOUNT-1,1));
		for(int i=1;i<FRIENDCOUNT;i++) {
			myFriendJLabel[i]=new JLabel(i+"",new ImageIcon("Images/YY1.gif"),Label.LEFT);
			myFriendJLabel[i].addMouseListener(this);
			myFriendListJPanel.add(myFriendJLabel[i]);
		}
		//myFriendJScrollPanel=new JScrollPane();
		//myFriendJScrollPanel.add(myFriendListJPanel);
		myFriendJScrollPanel=new JScrollPane(myFriendListJPanel);
		myFriendPanel.add(myFriendJScrollPanel);
		
		myStrangerBlackListJPanel=new JPanel(new GridLayout(2,1));
		myStrangerJButton=new JButton("我的陌生人");
		
		myStrangerJButton.addActionListener(this);
		
		blackListJButton=new JButton("黑名单");
		myStrangerBlackListJPanel.add(myStrangerJButton);
		myStrangerBlackListJPanel.add(blackListJButton);
		myFriendPanel.add(myStrangerBlackListJPanel,"South");
		
		
		myStrangerPanel=new JPanel(new BorderLayout());
		
		myFriendStrangerPanel=new JPanel(new GridLayout(2,1));
		myFriendJButton1=new JButton("我的好友");
		myFriendJButton1.addActionListener(this);
		myStrangerJButton1=new JButton("我的陌生人");
		myFriendStrangerPanel.add(myFriendJButton1);
		myFriendStrangerPanel.add(myStrangerJButton1);
		myStrangerPanel.add(myFriendStrangerPanel,"North");
		
		myStrangerListJPanel=new JPanel(new GridLayout(A-1,1));
		for(int s=1;s<A;s++)
		{
			myStrangerJLabel[s]=new JLabel(s+"",new ImageIcon("images/YY1.gif"),JLabel.LEFT);
			myStrangerJLabel[s].addMouseListener(this);
			myStrangerListJPanel.add(myStrangerJLabel[s]);
		}
		sky=new JScrollPane(myStrangerListJPanel);
		myStrangerPanel.add(sky);
		
		
		blackListJButton1=new JButton("黑名单");
		myStrangerPanel.add(blackListJButton1,"South");
		
		cardLayout=new CardLayout();
		this.setLayout(cardLayout);
		this.add(myFriendPanel,"1");
		this.add(myStrangerPanel,"2");
		
		this.setSize(150,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
		
		public static void main(String[] args) {
			FriendList friendList=new FriendList();
			
		}
		
		
		public void actionPerformed(ActionEvent arg0) {
			if(arg0.getSource()==myStrangerJButton) {
				cardLayout.show(this.getContentPane(),"2");
			}
			if(arg0.getSource()==myFriendJButton1) {
				cardLayout.show(this.getContentPane(),"1");
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		   JLabel jLabel=(JLabel)e.getSource();
		   jLabel.setForeground(Color.red);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			JLabel jLabel=(JLabel)e.getSource();
		  jLabel.setForeground(Color.black);
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

}
