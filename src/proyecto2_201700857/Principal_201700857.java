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
       Usuario.setBounds(70,0,200,30);
       Pass.setBounds(70,50,200,30);
       Usuario.setVisible(true);
       Pass.setVisible(true);
       
       //Label
       ImagenPrincipal = new JLabel();
       ImagenPrincipal.setBounds(0,100,300,300);
       ImagenPrincipal.setVisible(true);
       
       
       //Botones
       Ingresar = new JButton("INGRESAR");
       Ingresar.setBounds(100,100,105,30);
       Ingresar.addMouseListener(Boton);
       Crear = new JButton("CREAR");
       Crear.setBounds(100,200,105,30);
       Crear.addMouseListener(Boton);
       Salir = new JButton("CANCELAR");
       Salir.setBounds(100,300,105,30);
       Salir.addMouseListener(Boton);
       //Agregar
       P1 = new JPanel();
       P1.setLayout(null);
       P1.add(Usuario);
       P1.add(Pass);
       P1.add(Ingresar);
       P1.add(Crear);
       P1.setVisible(true);
       P1.add(Salir);
   }
   
   public void CrearVentana(){
       Ventana = new JFrame("INICIO");
       Ventana.setBounds(500,50,600,600);
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
                    VAdmin windo = new VAdmin();
                    Ventana.setVisible(false);
                }else{
                    
                }
            }
            if(e.getSource()==Crear){
                if(Proyecto2_201700857.test.Aux!=null){
                String Name =Proyecto2_201700857.test.ImprimirNombre();
                int Code = Proyecto2_201700857.test.ImprimirCodigo();
                int Vic = Proyecto2_201700857.test.ImprimirVictorias();
                System.out.println("Nombre del equipo: "+Name+" Codigo del equipo: "+Code+" Numero de victorias: "+Vic);
                Proyecto2_201700857.test.Siguiente();
                }else{
                    Proyecto2_201700857.test.Actualizar();
                }
                if(Proyecto2_201700857.test2.Aux!=null){
                    String Nombre = Proyecto2_201700857.test2.ImprimirNombre();
                    int camisola = Proyecto2_201700857.test2.ImprimirCamisola();
                    String Posicion = Proyecto2_201700857.test2.ImprimirPosicion();
                    String tOb=Proyecto2_201700857.test2.ImprimirToP();
                    int Code = Proyecto2_201700857.test2.ImprimirCodigo();
                    System.out.println("Nombre del jugador: "+Nombre+" Numero de Camisola: "+camisola+" Posicion de campo: "+Posicion+" El jugador es: "+tOb+" El pertenece al equipo de codigo: "+Code);
                    Proyecto2_201700857.test2.Siguiente();
                }else{
                    Proyecto2_201700857.test2.Actualizar();
                }
            }
            if(e.getSource()==Salir){
//                Proyecto2_201700857.test.Ordenar(Proyecto2_201700857.test, Proyecto2_201700857.test2);
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

