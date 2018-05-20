package proyecto2_201700857;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class MostrarContenido {
    public JFrame Ventana;
    public JPanel P1,P2;
    public JButton EquipoSiguiente, JugadorSiguiente,Cancelar,EquipoAnterior,JugadorAnterior;
    public JTextField Equipo, Victorias, Jugador, Camisola, Posicion, ToB,zeldo;
    public JLabel team, victory, player, shirt, position, tOb,Link;
    
    public void CrearPanel(){
        P1 = new JPanel();
        P1.setLayout(null);
//        P2 = new JPanel();
//        P2.setLayout(null);
//        P2.setBounds(0,100,400,300);
        //ADDONS
        Font font = new Font("Arial Black",Font.BOLD,12);
        //Botones
        EquipoSiguiente = new JButton("SIGUIENTE");
        EquipoSiguiente.setFont(font);
        EquipoSiguiente.setBounds(400,0,150,30);
        EquipoSiguiente.addMouseListener(boton);
        JugadorSiguiente = new JButton("SIGUIENTE");
        JugadorSiguiente.setFont(font);
        JugadorSiguiente.setBounds(400,450,150,30);
        JugadorSiguiente.addMouseListener(boton);
        Cancelar = new JButton("CANCELAR");
        Cancelar.setFont(font);
        Cancelar.setBounds(400,500,150,30);
        
        EquipoAnterior = new JButton("ANTERIOR");
        EquipoAnterior.setFont(font);
        EquipoAnterior.setBounds(0,0,150,30);
        EquipoAnterior.addMouseListener(boton);
        JugadorAnterior = new JButton("ANTERIOR");
        JugadorAnterior.setFont(font);
        JugadorAnterior.setBounds(0,450,150,30);
        JugadorAnterior.addMouseListener(boton);
        //Cuadros de Texto
        Equipo = new JTextField();
        Equipo.setFont(font);
        Equipo.setBounds(75,100,175,30);
        Victorias = new JTextField();
        Victorias.setFont(font);
        Victorias.setBounds(350,100,175,30);
        Jugador = new JTextField();
        Jugador.setFont(font);
        Jugador.setBounds(75,250,175,30);
        Camisola = new JTextField();
        Camisola.setFont(font);
        Camisola.setBounds(350,250,175,30);
        Posicion = new JTextField();
        Posicion.setFont(font);
        Posicion.setBounds(75,375,175,30);
        ToB = new JTextField();
        ToB.setFont(font);
        ToB.setBounds(350,375,175,30);
        zeldo = new JTextField();
        zeldo.setFont(font);
        zeldo.setBounds(350,415,175,30);
        //LABELS
        team = new JLabel("NOMBRE DEL EQUIPO");
        team.setFont(font);
        team.setBounds(83,80,200,25);
        victory = new JLabel("NO. DE VICTORIAS");
        victory.setFont(font);
        victory.setBounds(370,80,200,25);
        player = new JLabel("NOMBRE DEL JUGADOR");
        player.setFont(font);
        player.setBounds(75,230,200,25);
        shirt = new JLabel("NO. DE CAMISOLA");
        shirt.setFont(font);
        shirt.setBounds(370,230,200,25);
        position = new JLabel("POSICION DE CAMPO");
        position.setFont(font);
        position.setBounds(85,355,200,25);
        tOb = new JLabel("TITULAR O BANCA");
        tOb.setFont(font);
        tOb.setBounds(370,355,200,25);
        //AÑADIR
        //Panel 2
        P1.add(Jugador);
        P1.add(player);
        P1.add(Camisola);
        P1.add(shirt);
        P1.add(Posicion);
        P1.add(position);
        P1.add(tOb);
        P1.add(ToB);
        P1.add(zeldo);
        //Panel 1
//        P1.add(P2);
        P1.add(Equipo);
        P1.add(team);
        P1.add(Victorias);
        P1.add(victory);
        P1.add(JugadorSiguiente);
        P1.add(EquipoSiguiente);
        P1.add(Cancelar);
        P1.add(EquipoAnterior);
        P1.add(JugadorAnterior);
        P1.setVisible(true);
    }
    
    public void CrearVentana(){
        Ventana = new JFrame("MOSTRAR JUGADORES");
        Ventana.setBounds(600,100,600,600);
        Ventana.setVisible(false);
        Ventana.add(P1);
        
    }
    
    public void setearTextoEquipo(){
        if(Proyecto2_201700857.test.Aux!=null){
        Equipo.setText(Proyecto2_201700857.test.Aux.Nombre);
        Victorias.setText(Integer.toString(Proyecto2_201700857.test.ImprimirVictorias()));
    }}
    public void setearTextoJugador(){
        if(Proyecto2_201700857.test.Aux.Players.Aux!=null){
            Jugador.setText(Proyecto2_201700857.test.Aux.Players.ImprimirNombre());
            Camisola.setText(Integer.toString(Proyecto2_201700857.test.Aux.Players.ImprimirCamisola()));
            Posicion.setText(Proyecto2_201700857.test.Aux.Players.ImprimirPosicion());
            ToB.setText(Proyecto2_201700857.test.Aux.Players.ImprimirToP());
            zeldo.setText(Proyecto2_201700857.test.Aux.Players.Aux.zelda);
        }else{
            Jugador.setText("");
            Camisola.setText("");
            Posicion.setText("");
            ToB.setText("");
            zeldo.setText("");
        }
    }
    
    public MostrarContenido(){
        CrearPanel();
        CrearVentana();
        setearTextoEquipo();
        setearTextoJugador();
    }
    
    
    
    MouseListener boton = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getSource()==EquipoSiguiente){
                if(Proyecto2_201700857.test.Aux.siguiente!=null){
                Proyecto2_201700857.test.Siguiente();
                setearTextoEquipo();
                setearTextoJugador();
                }
            }
            if(e.getSource()==JugadorSiguiente){
                Proyecto2_201700857.test.Aux.Players.Siguiente();
//                Proyecto2_201700857.test.Aux.Players.Aux.Estampas.SiguienteMost();
                setearTextoJugador();
            }
            if(e.getSource()==JugadorAnterior){
                Proyecto2_201700857.test.Aux.Players.Anterior();
//                Proyecto2_201700857.test.Aux.Players.Aux.Estampas.Anterior();
                setearTextoJugador();
            }
            if(e.getSource()==EquipoAnterior){
                if(Proyecto2_201700857.test.Aux.anterior!=null){
                Proyecto2_201700857.test.Anterior();
                setearTextoEquipo();
                setearTextoJugador();
                }
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
