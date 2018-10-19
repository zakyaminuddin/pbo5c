package daftartest;
import javax.swing.*; 
import testing.tester;
public class daftartes extends JFrame 
{
 JLabel nama=new JLabel("Nama");
 JLabel tim=new JLabel("Nama Team");
 JLabel platforms=new JLabel("Platform");
 
 JRadioButton console=new JRadioButton("PC/Console");
 JRadioButton mobile=new JRadioButton("Smartphone");
  ButtonGroup game=new ButtonGroup();
 JTextField txnim=new JTextField(20);
JTextField txnim2=new JTextField(20);
JButton daftar=new JButton("Daftar");
JButton update=new JButton("Update");
JButton hapus=new JButton("Hapus");
JButton keluar=new JButton("Keluar");
JLabel games=new JLabel("Games");
String[] jenisgame={"DOTA 2","CS GO","Call OF Duty Black ops 4","PUBG","AOV","ML","Granblue Fantasy"};
JComboBox daftargame=new JComboBox(jenisgame);

daftartes()
{
 setTitle("Pendaftaran GARUDA E-Sports 2018"); 
 setLocation(300,100);
 setSize(300,150);
 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 setVisible(true);   
    
}

void komponen ()
{
 getContentPane().setLayout(null);
getContentPane().add(nama);
getContentPane().add(tim);
getContentPane().add(platforms);
getContentPane().add(txnim);
 getContentPane().add(txnim2);
 getContentPane().add(daftar);
 getContentPane().add(update);
 getContentPane().add(hapus);
  getContentPane().add(keluar);
 nama.setBounds(10,10,70,20);
 tim.setBounds(10,30,70,20);
 platforms.setBounds(10,50,70,20);
 txnim.setBounds(80,10,100,20);
 txnim2.setBounds(80,32,202,20);
 daftar.setBounds(125,120,95,20);
 update.setBounds(125,140,95,20);
 hapus.setBounds(125,160,95,20);
 keluar.setBounds(125,180,95,20);
 getContentPane().add(console);
 console.setBounds(75,50,100,20);
  getContentPane().add(mobile);
   mobile.setBounds(180,50,100,20);
 game.add(console);
 game.add(mobile);
 getContentPane().add(games);
 games.setBounds(10,70,100,20);
 getContentPane().add(daftargame);
 daftargame.setBounds(75,70,165,20);
 setVisible(true);
 }
public static void main(String args[])
{
 daftartes ap=new daftartes();
 ap.komponen(); 
}
    
    
}
