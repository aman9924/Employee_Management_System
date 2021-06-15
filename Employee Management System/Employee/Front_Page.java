import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Front_Page implements ActionListener {

    JFrame f;
    JLabel id,l1;
    JButton b;
    Front_Page(){
        f = new JFrame("Employee Management System");
        f.setBackground(Color.red);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,150,1360,530);
        f.add(l1);

        b = new JButton("Click Here To Continue");
        b.setBackground(Color.black);
        b.setForeground(Color.white);

        b.setBounds(500,600,300,70);
        b.addActionListener(this);
        b.setFocusable(false);
        id = new JLabel();
        id.setBounds(0,0,1360,750);

        JLabel lid = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        lid.setBounds(80,20,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(Color.red);
        id.add(b);
        f.add(id);
        f.add(lid);

        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,750);
        f.setLocation(200,100);

        while(true){
            lid.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lid.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b){
            f.setVisible(false);
            Login l = new Login();
        }
    }

    public static void main(String[] args) {
        Front_Page f = new Front_Page();
    }
}
