import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Index extends JFrame implements ActionListener{
    private JLabel lblIcon, lblCorreo, lblBienvenido, lblContrasenia;
    private JTextField txtCorreo, txtContrasenia;
    private JButton btnIniciar;
    private String correo;


    public Index(){
        setLayout(null);
        setTitle("Inicio");
        getContentPane().setBackground(new Color(0,153,255));

        ImageIcon icon = new ImageIcon(getClass().getResource("Images/login.png"));
        lblIcon = new JLabel(icon);
        lblIcon.setBounds(70,0,icon.getIconWidth(),icon.getIconHeight());                  
        add(lblIcon);   
        
        lblBienvenido = new JLabel("Bienvenido");
        lblBienvenido.setBounds(80,190,300,40);
        lblBienvenido.setFont(new Font("Arial",Font.BOLD,35));
        lblBienvenido.setForeground(Color.black);
        add(lblBienvenido);

        
        lblCorreo = new JLabel("Correo");
        lblCorreo.setBounds(70,250,150,20);
        lblCorreo.setForeground(Color.black);
        lblCorreo.setFont(new Font("Arial",Font.BOLD,14));
        add(lblCorreo);

        txtCorreo = new JTextField();
        txtCorreo.setBounds(70,270,200,25);
        txtCorreo.setForeground(Color.black);
        txtCorreo.setFont(new Font("Arial",0,14));
        add(txtCorreo);


        btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(70,310,100,25);
        btnIniciar.setBackground(new Color(255,255,255)); 
        btnIniciar.setForeground(Color.black);
        btnIniciar.setFont(new Font("Arial",Font.BOLD,14));
        btnIniciar.addActionListener(this);
        add(btnIniciar);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==btnIniciar){
            correo = txtCorreo.getText();
            if(correo.equals("")){
                JOptionPane.showMessageDialog(null,"Ingrese su correo");
                return;
            }
            if(correo.matches("[a-zA-Z0-9]{1,}@[a-zA-Z0-9]{1,}[.]{1}[a-zA-Z0-9]{1,}")==false){
                JOptionPane.showMessageDialog(null,"Ingrese un correo valido");
            }
            else{
            }
        }
    }

    public static void main(String args[]){   
        Index index = new Index();
        index.setBounds(0,0,350,450);
        index.setVisible(true);
        index.setResizable(false);
        index.setLocationRelativeTo(null);
        index.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}