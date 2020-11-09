package TugasSwing;
import javax.swing.*; 
import java.awt.*; 
import java.awt.Color; 
import java.awt.event.*; 
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
  
class Swing 
    extends JFrame 
    implements ActionListener { 
  
    // Components of the Form 
    private Container c; 
    private JLabel title; 
    private JLabel nama; 
    private JTextField tnama; 
    private JLabel rek; 
    private JTextField trek;
    private JLabel nim; 
    private JTextField tnim; 
    private JLabel jenkel; 
    private JRadioButton laki; 
    private JRadioButton perempuan; 
    private ButtonGroup gengp; 
    private JLabel prodi; 
    private JRadioButton si; 
    private JRadioButton inf; 
    private ButtonGroup gengpro; 
    private JLabel ttl; 
    private JComboBox tanggal; 
    private JComboBox bulan; 
    private JComboBox tahun; 
    private JLabel alamat; 
    private JTextArea talamat; 
    private JCheckBox term; 
    private JButton sub; 
    private JButton reset; 
    private JTextArea tout; 
    private JLabel res; 
    private JTextArea resadd; 
  
    private String Tanggal[] 
        = { "1", "2", "3", "4", "5", 
            "6", "7", "8", "9", "10", 
            "11", "12", "13", "14", "15", 
            "16", "17", "18", "19", "20", 
            "21", "22", "23", "24", "25", 
            "26", "27", "28", "29", "30", 
            "31" }; 
    private String Bulan[] 
        = { "Jan", "Feb", "Mar", "Apr", 
            "Mei", "Jun", "Juli", "Aug", 
            "Sep", "Okt", "Nov", "Des" }; 
    private String Tahun[] 
        = { "1995", "1996", "1997", "1998", 
            "1999", "2000", "2001", "2002", 
            "2003", "2004", "2005", "2006", 
            "2007", "2008", "2009", "2010", 
            "2011", "2012", "2013", "2014", 
            "2015", "2016", "2017", "2018", 
            "2019", "2020" }; 
  
    // constructor, to initialize the components 
    // with default values. 
    public Swing() 
    { 
        setTitle("Formulir Registrasi Reseller Shopee"); 
        
       // pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setResizable(true); 
        setExtendedState(getExtendedState()|JFrame.MAXIMIZED_BOTH);
        c = getContentPane(); 
        c.setLayout(null); 
  
        title = new JLabel("Formulir Validasi Data Mahasiswa Bidikmisi\n " +
                "Jurusan Teknik Informatika 2020"); 
        title.setFont(new Font("Times New Roman", Font.PLAIN, 30)); 
        title.setSize(1000, 40); 
        title.setLocation(200, 30); 
        c.add(title); 
  
        nama = new JLabel("Nama"); 
        nama.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        nama.setSize(100, 20); 
        nama.setLocation(300, 100); 
        c.add(nama); 
  
        tnama = new JTextField(); 
        tnama.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        tnama.setSize(190, 20); 
        tnama.setLocation(400, 100); 
        c.add(tnama); 
  
        nim = new JLabel("NIM"); 
        nim.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        nim.setSize(100, 20); 
        nim.setLocation(300, 150); 
        c.add(nim); 
  
        tnim = new JTextField(); 
        tnim.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        tnim.setSize(190, 20); 
        tnim.setLocation(400, 150); 
        c.add(tnim); 
  
        jenkel = new JLabel("Jenis Kelamin"); 
        jenkel.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        jenkel.setSize(150, 20); 
        jenkel.setLocation(300, 200); 
        c.add(jenkel); 
  
        laki = new JRadioButton("Laki-laki"); 
        laki.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        laki.setSelected(true); 
        laki.setSize(80, 20); 
        laki.setLocation(420, 200); 
        laki.setBackground(Color.cyan);
        c.add(laki); 
  
        perempuan = new JRadioButton("Perempuan"); 
        perempuan.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        perempuan.setSelected(false); 
        perempuan.setSize(120, 20); 
        perempuan.setLocation(500, 200); 
        perempuan.setBackground(Color.cyan);
        c.add(perempuan); 
  
        gengp = new ButtonGroup(); 
        gengp.add(laki); 
        gengp.add(perempuan); 
  
        ttl = new JLabel("Tanggal Lahir"); 
        ttl.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        ttl.setSize(120, 25); 
        ttl.setLocation(300, 250); 
        c.add(ttl); 
  
        tanggal = new JComboBox(Tanggal); 
        tanggal.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        tanggal.setSize(50, 20); 
        tanggal.setLocation(430, 250); 
        c.add(tanggal); 
  
        bulan = new JComboBox(Bulan); 
        bulan.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        bulan.setSize(60, 20); 
        bulan.setLocation(480, 250); 
        c.add(bulan); 
  
        tahun = new JComboBox(Tahun); 
        tahun.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        tahun.setSize(60, 20); 
        tahun.setLocation(540, 250); 
        c.add(tahun); 
        
        prodi = new JLabel("Prodi"); 
        prodi.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        prodi.setSize(70, 20); 
        prodi.setLocation(300, 300); 
        c.add(prodi); 
  
        si = new JRadioButton("Sistem Informasi"); 
        si.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        si.setSelected(true); 
        si.setSize(130, 20); 
        si.setLocation(390, 300); 
        si.setBackground(Color.cyan);
        c.add(si); 
  
        inf = new JRadioButton("Informatika"); 
        inf.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        inf.setSelected(false); 
        inf.setSize(120, 20); 
        inf.setLocation(520, 300); 
        inf.setBackground(Color.cyan);
        c.add(inf); 
  
        gengpro = new ButtonGroup(); 
        gengpro.add(si); 
        gengpro.add(inf); 
        
        rek = new JLabel("No. Rek"); 
        rek.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        rek.setSize(100, 20); 
        rek.setLocation(300, 350); 
        c.add(rek); 
  
        trek = new JTextField(); 
        trek.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        trek.setSize(190, 20); 
        trek.setLocation(400, 350); 
        c.add(trek);
        
        alamat = new JLabel("Alamat"); 
        alamat.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        alamat.setSize(100, 20); 
        alamat.setLocation(300, 400); 
        c.add(alamat); 
  
        talamat = new JTextArea(); 
        talamat.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        talamat.setSize(200, 75); 
        talamat.setLocation(400, 400); 
        talamat.setLineWrap(true); 
        c.add(talamat); 
  
        term = new JCheckBox("Data yang saya masukkan benar"); 
        term.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        term.setSize(300, 20); 
        term.setLocation(350, 500); 
        term.setBackground(Color.cyan);
        c.add(term); 
  
        sub = new JButton("Simpan"); 
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        sub.setSize(100, 20); 
        sub.setLocation(350, 550); 
        sub.addActionListener(this); 
        c.add(sub); 
  
        reset = new JButton("Reset"); 
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        reset.setSize(100, 20); 
        reset.setLocation(470, 550); 
        reset.addActionListener(this); 
        c.add(reset); 
  
        tout = new JTextArea(); 
        tout.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        tout.setSize(300, 400); 
        tout.setLocation(800, 100); 
        tout.setLineWrap(true); 
        tout.setEditable(false); 
        c.add(tout); 
  
        res = new JLabel(""); 
        res.setFont(new Font("Times New Roman", Font.PLAIN, 20)); 
        res.setSize(800, 25); 
        res.setLocation(100, 500); 
        c.add(res); 
  
        resadd = new JTextArea(); 
        resadd.setFont(new Font("Times New Roman", Font.PLAIN, 15)); 
        resadd.setSize(200, 75); 
        resadd.setLocation(800, 175); 
        resadd.setLineWrap(true); 
        c.add(resadd); 
  
        setVisible(true); 
        this.getContentPane().setBackground(Color.cyan);
    } 
  
    // method actionPerformed() 
    // to get the action performed 
    // by the user and act accordingly 
    public void actionPerformed(ActionEvent e) 
    { 
        if (e.getSource() == sub) { 
            if (term.isSelected()) { 
                String data1,data3 = null; 
                String data 
                    = "Nama : "
                      + tnama.getText() + "\n"
                      + "NIM : "
                      + tnim.getText() + "\n"; 
                if (laki.isSelected()) 
                    data1 = "Jenis Kelamin : Laki-laki"
                            + "\n"; 
                else
                    data1 = "Jenis Kelamin : Perempuan"
                            + "\n"; 
                String data2 
                    = "Tanggal lahir : "
                      + (String)tanggal.getSelectedItem() 
                      + "/" + (String)bulan.getSelectedItem() 
                      + "/" + (String)tahun.getSelectedItem() 
                      + "\n"; 
                
                
                if (si.isSelected()) 
                    data3 = "Prodi : Sistem Informasi"
                            + "\n"; 
                else if (inf.isSelected())
                    data3 = "Prodi : Informatika"
                            + "\n";
                
                String data4 = "No. Rek : " + trek.getText()+"\n";
                
                String data5 = "Alamat : " + talamat.getText(); 
                tout.setText(data + data1 + data2 + data3 + data4 + data5); 
                tout.setEditable(false); 
                res.setText("Validasi Data Berhasil Disimpan !"); 
                res.setLocation(300, 600);
            } 
            else { 
                tout.setText(""); 
                resadd.setText(""); 
                res.setText("Mohon centang pernyataan"
                            + " terlebih dahulu !"); 
                res.setLocation(300, 600);
            } 
        } 
  
        else if (e.getSource() == reset) { 
            String def = ""; 
            tnama.setText(def); 
            talamat.setText(def); 
            tnim.setText(def); 
            trek.setText(def); 
            res.setText(def); 
            tout.setText(def); 
            term.setSelected(false); 
            tanggal.setSelectedIndex(0); 
            bulan.setSelectedIndex(0); 
            tahun.setSelectedIndex(0); 
            resadd.setText(def); 
        } 
    } 
} 
  
// Driver Code 
public class TugasSwing extends JFrame{ 
  
    public static void main(String[] args) throws Exception 
    { 
        Swing f = new Swing(); 
    } 
} 
