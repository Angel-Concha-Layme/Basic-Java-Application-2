import javax.swing.*;
import java.awt.event.*;

public class Index extends JFrame implements ActionListener{
    private JLabel lblnombre;
    private JTextField txtnombre;
    private JButton btnIngresar;


    public Index(){
        setLayout(null);
        setTitle("Bienvenido");
    
        lblnombre = new JLabel("Nombre");
        lblnombre.setBounds(50,50,100,30);
        add(lblnombre);

        txtnombre = new JTextField();
        txtnombre.setBounds(150,50,150,30);
        add(txtnombre);

        btnIngresar = new JButton("Ingresar");
        btnIngresar.setBounds(150,100,100,30);
        btnIngresar.addActionListener(this);
        add(btnIngresar);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnIngresar){
            String nombre = txtnombre.getText();
            if(nombre.equals("")){
                JOptionPane.showMessageDialog(null, "Ingrese su nombre");
            }
        }
    }

    public static void main(String args[]){   
        Index index = new Index();
        index.setBounds(0,0,400,400);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}