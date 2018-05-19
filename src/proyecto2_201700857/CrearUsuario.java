package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class CrearUsuario {
    public JFrame Ventana;
    public JPanel P1;
    public JButton Crear, Cancelar;
    public JLabel Titulo, usuario, contraseña, cui, nombre, correo;
    public JTextField User, Pass, Cui, Name, Email;
    
    public void CrearPanel(){
        //Addons
        Font font = new Font("Arial Black",Font.BOLD,13);
        //Label
        Titulo = new JLabel("CREACIÓN DE USUARIOS");
        Titulo.setFont(font);
        Titulo.setBounds(160,20,200,25);
        usuario = new JLabel("USUARIO");
        usuario.setFont(font);
        usuario.setBounds(20,70,100,25);
        contraseña = new JLabel("CONTRASEÑA");
        contraseña.setFont(font);
        contraseña.setBounds(20,120,200,25);
        cui = new JLabel("CUI");
        cui.setFont(font);
        cui.setBounds(20,170,100,25);
        nombre = new JLabel("NOMBRE");
        nombre.setFont(font);
        nombre.setBounds(20,220,100,25);
        correo = new JLabel("CORREO ELECTRÓNICO");
        correo.setFont(font);
        correo.setBounds(20,270,200,25);
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
        P1.add(Titulo);
        P1.add(usuario);
        P1.add(contraseña);
        P1.add(cui);
        P1.add(nombre);
        P1.add(correo);
        P1.add(User);
        P1.add(Pass);
        P1.add(Cui);
        P1.add(Name);
        P1.add(Email);
        P1.add(Crear);
        P1.add(Cancelar);
        
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("CREAR USUARIO");
        Ventana.setBounds(500,100,500,450);
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
//                Ventana.setVisible(false);
                    System.out.println("Nombre"+Proyecto2_201700857.Usuarios.ImprimirNombre()+" Correo"+Proyecto2_201700857.Usuarios.ImprimirEmail()+" Contraseña"+Proyecto2_201700857.Usuarios.ImprimirPass()+" cui"+Proyecto2_201700857.Usuarios.ImprimirCui()+" Usuario"+Proyecto2_201700857.Usuarios.ImprimirUsuario());
                    Proyecto2_201700857.Usuarios.Siguiente();
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
