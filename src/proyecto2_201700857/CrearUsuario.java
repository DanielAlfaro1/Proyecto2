package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class CrearUsuario {
    public JFrame Ventana;
    public JPanel P1;
    public JButton Crear, Cancelar;
    public JLabel Titulo, usuario, contraseña, cui, nombre, correo,Fondo;
    public JTextField User, Pass, Cui, Name, Email;
    
    public void CrearPanel(){
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,13);
        //Label
        Fondo = new JLabel();
        Fondo.setBounds(0,0,500,450);
        ImageIcon Imagen = new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Portada.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(Fondo.getWidth(),Fondo.getHeight(),Image.SCALE_DEFAULT));
        Fondo.setIcon(icono);        
        
        Titulo = new JLabel("CREACIÓN DE USUARIOS");
        Titulo.setFont(font);
        Titulo.setBounds(160,20,200,25);
        Titulo.setForeground(Color.white);
        usuario = new JLabel("USUARIO");
        usuario.setFont(font);
        usuario.setBounds(20,70,100,25);
        usuario.setForeground(Color.white);
        contraseña = new JLabel("CONTRASEÑA");
        contraseña.setFont(font);
        contraseña.setBounds(20,120,200,25);
        contraseña.setForeground(Color.white);
        cui = new JLabel("CUI");
        cui.setFont(font);
        cui.setBounds(20,170,100,25);
        cui.setForeground(Color.white);
        nombre = new JLabel("NOMBRE");
        nombre.setFont(font);
        nombre.setBounds(20,220,100,25);
        nombre.setForeground(Color.white);
        correo = new JLabel("CORREO ELECTRÓNICO");
        correo.setFont(font);
        correo.setBounds(20,270,200,25);
        correo.setForeground(Color.white);
        //Campos de texto
        User = new JTextField();
        User.setFont(font);
        User.setBounds(240,70,230,25);
        Pass  = new JTextField();
        Pass.setFont(font);
        Pass.setBounds(240,120,230,25);
        Cui = new JTextField();
        Cui.setFont(font);
        Cui.setBounds(240,170,230,25);
        Name = new JTextField();
        Name.setFont(font);
        Name.setBounds(240,220,230,25);
        Email = new JTextField();
        Email.setFont(font);
        Email.setBounds(240,270,230,25);
        //Botones
        Crear = new JButton("CREAR");
        Crear.setFont(font);
        Crear.setBounds(70,320,150,50);
        Crear.addMouseListener(Boton);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(font);
        Cancelar.setBounds(260,320,150,50);
        Cancelar.addMouseListener(Boton);
        //Panel y agregar
        P1 = new JPanel();
        P1.setLayout(null);
        P1.add(Fondo);
        Fondo.add(Titulo);
        Fondo.add(usuario);
        Fondo.add(contraseña);
        Fondo.add(cui);
        Fondo.add(nombre);
        Fondo.add(correo);
        Fondo.add(User);
        Fondo.add(Pass);
        Fondo.add(Cui);
        Fondo.add(Name);
        Fondo.add(Email);
        Fondo.add(Crear);
        Fondo.add(Cancelar);
        
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("CREAR USUARIO");
        Ventana.setBounds(500,100,500,450);
        Ventana.setUndecorated(true);
        Ventana.setVisible(false);
        Ventana.add(P1);
        Ventana.setDefaultCloseOperation(Ventana.HIDE_ON_CLOSE);
    }
    
    public CrearUsuario(){
        CrearPanel();
        CrearVentana();
    }
    
    MouseListener Boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Crear){
                if(!Proyecto2_201700857.Usuarios.ExistenciaUsuario(User.getText())&&!Proyecto2_201700857.Usuarios.ExistenciaCui(Cui.getText())&&!Proyecto2_201700857.Usuarios.ExistenciaCorreo(Email.getText())){
                Proyecto2_201700857.Usuarios.Push(Cui.getText(), Name.getText(), Email.getText(), User.getText(), Pass.getText());
                Proyecto2_201700857.Exito.Mensaje("<html><body>EL USUARIO SE HA REGISTRADO CON EXITO</body></html>");
                Proyecto2_201700857.Exito.Visibilidad();
                }else{
                    Proyecto2_201700857.Ad.Mensaje("<html><body>EL USUARIO, CUI O EMAIL YA HAN <br>SIDO REGISTRADOS</body></html>");
                    Proyecto2_201700857.Ad.Visibilidad();
                }
            }
            if(e.getSource()==Cancelar){
                Ventana.setVisible(false);
//                    System.out.println("Nombre"+Proyecto2_201700857.Usuarios.ImprimirNombre()+" Correo"+Proyecto2_201700857.Usuarios.ImprimirEmail()+" Contraseña"+Proyecto2_201700857.Usuarios.ImprimirPass()+" cui"+Proyecto2_201700857.Usuarios.ImprimirCui()+" Usuario"+Proyecto2_201700857.Usuarios.ImprimirUsuario());
                    Proyecto2_201700857.Usuarios.ActualizarB();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    };
    
}
