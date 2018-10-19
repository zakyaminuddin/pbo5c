package java_5c;
import javax.swing.*; 
import java.awt.event.*;

public class penjualan_game extends JFrame 
{
JLabel lblnama=new JLabel("NAMA GAME");    
JTextField txnama=new JTextField(20);    
JLabel lblid=new JLabel("ID GAME");    
JTextField txnid=new JTextField(7);    
JLabel lblpembelian=new JLabel("JALUR PEMBELIAN");    
JRadioButton paypal=new JRadioButton("PAYPAL");    
JRadioButton indomaret=new JRadioButton("UNIPIN");    
ButtonGroup total=new ButtonGroup();    
JLabel lbltotal=new JLabel("VERSI");    
JCheckBox sembilanpuluh=new JCheckBox("Standard");    
JCheckBox empatratus=new JCheckBox("FULL DLC");    
JCheckBox sejuta=new JCheckBox("LIMITED EDITION");    
JButton cetak=new JButton("Beli");    
JTextArea hasil=new JTextArea();    
    
penjualan_game ()    
{       
 setTitle("PEMBELIAN GAME STEAM");       
 setLocation(300,100);       
 setSize(300,320);       
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
}  
 
 void KomponenVisual()    
 {       
  getContentPane().setLayout(null);
  getContentPane().add(lblnama);       
  lblnama.setBounds(10,10,80,20);       
  getContentPane().add(txnama);       
  txnama.setBounds(105,10,175,20);       
  getContentPane().add(lblid);       
  lblid.setBounds(10,33,80,20);       
  getContentPane().add(txnid);       
  txnid.setBounds(105,33,70,20);       
  getContentPane().add(lblpembelian);      
  lblpembelian.setBounds(10,56,80,20);  
  total.add(paypal);    
  total.add(indomaret);      
  getContentPane().add(paypal);  
  paypal.setBounds(100,56,82,20);    
  getContentPane().add(indomaret);
  indomaret.setBounds(180,56,100,20);       
  getContentPane().add(lbltotal);       
  lbltotal.setBounds(10,80,120,20);       
  getContentPane().add(sembilanpuluh);       
  sembilanpuluh.setBounds(105,80,100,20);       
  getContentPane().add(empatratus);       
  empatratus.setBounds(105,103,100,20);       
  getContentPane().add(sejuta);       
  sejuta.setBounds(105,126,130,20);       
  getContentPane().add(cetak);       
  cetak.setBounds(10,150,270,20);       
  getContentPane().add(hasil);       
  hasil.setBounds(10,180,270,100);       
  setVisible(true); 
 }

 void AksiReaksi()    
 {       
  cetak.addActionListener(new ActionListener()       
  {          
   public void actionPerformed(ActionEvent e)          
   {             
    hasil.append(txnama.getText()+"\n");             
    hasil.append(txnid.getText()+"\n");             
    if(paypal.isSelected()==true)             
    {                
     hasil.append(paypal.getText()+"\n");             
    }             
    else             
    {                
    hasil.append(indomaret.getText()+"\n");             
    }  
    if(sembilanpuluh.isSelected()==true)             
    {                
     hasil.append(sembilanpuluh.getText()+"\n");             
    }             
    if(empatratus.isSelected()==true)             
    {                
     hasil.append(empatratus.getText()+"\n");             
    }             
    if(sejuta.isSelected()==true)             
    {                
     hasil.append(sejuta.getText()+"\n");             
    } 
  }       
  });    
 }  
  public static void main(String args[])    
  {       
   penjualan_game e5=new penjualan_game();       
   e5.KomponenVisual();       
   e5.AksiReaksi();    
  }

}