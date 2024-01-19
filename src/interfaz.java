import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz extends  JFrame{

    private JPanel panel1;
    private JTextField tField01;
    private JButton cerrarButton;
    private JButton unonButton;
    private JButton sumarButton;
    private JTextField tField02;
    private JLabel label01;
    private JLabel label02;
    private JButton limpiar;
    private JTextField resultado;
    private JTextField r_union;

    public  interfaz(){
        super("OPERACIONES");
        setContentPane(panel1);

        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                System.exit(0);
            }
        });

        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tField01.setText(" ");
                tField02.setText(" ");
            }
        });

        sumarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double t01 = Double.parseDouble(tField01.getText());
                    double t02 = Double.parseDouble(tField02.getText());
                    double recibe_resultado = t01 + t02;
                    resultado.setText(Double.toString(recibe_resultado));
                }catch (Exception e1 ){
                    System.out.println("ha ocurrido un error");
                    JOptionPane.showMessageDialog(null, "Error");
                }

            }
        });
        unonButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String union = tField01.getText() + tField02.getText();
                r_union.setText(union);
            }
        });
    }

}

