package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class VStickers {
    public JFrame Ventana;
    public JPanel P1;
    public JLabel Estampa, Jugador, Equipo, Informacion;
    public JButton SigEquipo, SigEstampa, AntEstampa, AntEquipo;
    
    public void CrearPanel(){
        P1 = new JPanel();
        P1.setLayout(null);
        //addons
        Font font = new Font("Arial Black",Font.BOLD,12);
        //LAbels
        Estampa = new JLabel();
        Estampa.setBounds(220,20,150,200);
        Jugador = new JLabel("UN GRAN JUGADOR");
        Jugador.setFont(font);
        Jugador.setBounds(190,230,200,30);
        Equipo = new JLabel("DE UN GRAN EQUIPO");
        Equipo.setFont(font);
        Equipo.setBounds(190,270,200,30);
        Informacion = new JLabel("<html><body>EL EQUIPO TIENE 444 VICTORIAS<br>UN PASADO RESEÑABLE<br>Y ESTA ES UNA PRUEBA...<br>SI VES ESTO ES PORQUE ALGO FALLÓ</body></html>");
        Informacion.setFont(font);
        Informacion.setBounds(10,280,700,120);
        //Botones
        SigEstampa = new JButton("SIGUIENTE");
        SigEstampa.setFont(font);
        SigEstampa.setBounds(415,400,150,50);
        SigEstampa.addMouseListener(boton);
        AntEstampa = new JButton("ANTERIOR");
        AntEstampa.setFont(font);
        AntEstampa.setBounds(20,400,150,50);
        AntEstampa.addMouseListener(boton);
        //Agregar
        P1.add(Estampa);
        P1.add(Jugador);
        P1.add(Equipo);
        P1.add(Informacion);
        P1.add(SigEstampa);
        P1.add(AntEstampa);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("ESTAMPAS REGISTRADAS");
        Ventana.add(P1);
        Ventana.setVisible(false);
        Ventana.setBounds(400,100,600,500);
        Ventana.setDefaultCloseOperation(Ventana.HIDE_ON_CLOSE);
    }
    
    public VStickers (){
        CrearPanel();
        CrearVentana();
        SetearPrueba();
        Proyecto2_201700857.test.Actualizar();
        Proyecto2_201700857.test.Aux.Players.Actualizar();
        SetearTexto();
        SetearFoto();
    }
    
    public void SetearPrueba(){
        ImageIcon Imagen = new ImageIcon("C:/Users/Bminas/Desktop/Imagenes/Advertencia.png");
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(Estampa.getWidth(),Estampa.getHeight(),Image.SCALE_DEFAULT));
        Estampa.setIcon(icono);        
    }
    
    public void SetearFoto(){
        ImageIcon Imagen = new ImageIcon(Proyecto2_201700857.test3.AuxB.zelda);
        Icon icono = new ImageIcon(Imagen.getImage().getScaledInstance(Estampa.getWidth(),Estampa.getHeight(),Image.SCALE_DEFAULT));
        Estampa.setIcon(icono);        
    }
    
    public void SetearTexto(){
        if(Proyecto2_201700857.test3.AuxB!=null){
        Equipo.setText(Proyecto2_201700857.test3.AuxB.Equipo);
        Jugador.setText(Proyecto2_201700857.test3.AuxB.Jugador);
            System.out.println(Proyecto2_201700857.test3.AuxB.ToB);
        Informacion.setText("<html><body> El numero de victorias de "+Equipo.getText()+" son: "+Proyecto2_201700857.test3.AuxB.Victorias+"<br>"
                + "El número de camisola del jugador "+Proyecto2_201700857.test3.AuxB.Jugador+" es: "+Proyecto2_201700857.test3.AuxB.Camisola+"<br>"
                        + "El Jugador juega en "+Proyecto2_201700857.test3.AuxB.Posicion+" y es "+Proyecto2_201700857.test3.AuxB.ToB+". </body></html>");
        }
    }
    
    MouseListener boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==SigEstampa){
               Proyecto2_201700857.test3.SiguienteB();
               SetearTexto();
               SetearFoto();
            }
            if(e.getSource()==AntEstampa){
                Proyecto2_201700857.test3.AnteriorB();
                SetearTexto();
                SetearFoto();
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
