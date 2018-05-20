package proyecto2_201700857;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Principal_201700857 {
   
    JFrame Ventana;
    JPanel P1;
    JTextField Usuario, Pass;
    JButton Ingresar, Crear, Salir;
    JLabel ImagenPrincipal,nombre,contra;
    
   public void CrearPanel(){
       //Añadidos
           Font font = new Font("Arial Black",Font.BOLD,12);
       //TextBox
       Usuario = new JTextField();
       Pass = new JTextField();
       Usuario.setBounds(140,20,200,30);
       Pass.setBounds(140,70,200,30);
       Usuario.setVisible(true);
       Pass.setVisible(true);
       
       //Label
       ImagenPrincipal = new JLabel();
       ImagenPrincipal.setBounds(0,0,600,600);
       ImageIcon Imagen = new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Portada.jpg");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(ImagenPrincipal.getWidth(),ImagenPrincipal.getHeight(),Image.SCALE_DEFAULT));
        ImagenPrincipal.setIcon(icono);        
       
       ImagenPrincipal.setVisible(true);
       nombre = new JLabel("USUARIO");
       nombre.setBounds(60,20,200,30);
       nombre.setForeground(Color.WHITE);
       contra = new JLabel("CONTRASEÑA");
       contra.setForeground(Color.WHITE);
       contra.setBounds(40,70,200,30);
       
       //Botones
       Ingresar = new JButton("INGRESAR");
       Ingresar.setBounds(70,150,105,30);
       Ingresar.addMouseListener(Boton);
       Crear = new JButton("INFORMACION");
       Crear.setBounds(440,480,140,30);
       Crear.addMouseListener(Boton);
       Salir = new JButton("SALIR");
       Salir.setBounds(210,150,105,30);
       Salir.addMouseListener(Boton);
       //Agregar
       P1 = new JPanel();
       P1.setLayout(null);
       P1.add(ImagenPrincipal);
       ImagenPrincipal.add(Usuario);
       ImagenPrincipal.add(Pass);
       ImagenPrincipal.add(Ingresar);
       ImagenPrincipal.add(Crear);
       ImagenPrincipal.add(nombre);
       ImagenPrincipal.add(contra);
       ImagenPrincipal.setVisible(true);
       ImagenPrincipal.add(Salir);
   }
   
   public void CrearVentana(){
       Ventana = new JFrame("INICIO");
       Ventana.setBounds(400,50,600,600);
       Ventana.setUndecorated(true);
       Ventana.setResizable(false);
       Ventana.add(P1);
       Ventana.setVisible(true);
       Ventana.setDefaultCloseOperation(Ventana.EXIT_ON_CLOSE);
   }
   
   public Principal_201700857(){
       CrearPanel();
       CrearVentana();
   }
   
   MouseListener Boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==Ingresar){
                if(Usuario.getText().equals("Admin")&&Pass.getText().contains("201700857")){
                    Usuario.setText("");
                    Pass.setText("");
                    VAdmin windo = new VAdmin();
                    Ventana.setVisible(false);
                }else{
                    if(Proyecto2_201700857.Usuarios.Aux!=null){
                        Proyecto2_201700857.Usuarios.Buscar(Usuario.getText());
                        if(Proyecto2_201700857.Usuarios.BuscarU().equals(Usuario.getText())&&Proyecto2_201700857.Usuarios.BuscarP().equals(Pass.getText())){
                            System.out.println("SE ENCONTRÓ COINCIDENCIA");  
                        }else{
                            Proyecto2_201700857.Ad.Mensaje("<html><body>EL USUARIO O CONTRASEÑA NO CONCUERDAN.");
                            Proyecto2_201700857.Ad.Ventanita.setVisible(true);
                            Proyecto2_201700857.Usuarios.ActualizarB();
                        }
                     }else{
                        Proyecto2_201700857.Ad.Mensaje("<html><body>EL USUARIO O CONTRASEÑA NO CONCUERDAN.");
                        Proyecto2_201700857.Ad.Ventanita.setVisible(true);
                    }
                }
            }
            if(e.getSource()==Crear){
                
            }
            if(e.getSource()==Salir){
                System.exit(0);
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

