import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class practica1 extends JFrame{
    private JPanel panel1;
    private JTextField txt1;
    private JTextField txt2;
    private JButton button1;
    public practica1(){
        super("Mi practica 1");
        setContentPane(panel1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String recibe = txt1.getText();
                JOptionPane.showMessageDialog(null,recibe);
            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dato1 = txt1.getText();
                JOptionPane.showMessageDialog(null, dato1);
            }
        });
    }

    public void iniciar(){
        setLocationRelativeTo(null);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
