package proyecto2_201700857;

public class ListaEquipo {
    
    class NodoEquipo{
        public int Codigo;
        public String Nombre;
        public int Victorias;
        public NodoEquipo siguiente, anterior;
        public ListaJugadores Players;
        
        public NodoEquipo(){
        }
        
        public NodoEquipo(String code, String Name, String Vic){
            Codigo = Integer.parseInt(code);
            Nombre = Name;
            Victorias = Integer.parseInt(Vic);
            Players = new ListaJugadores();
            siguiente = null;
            anterior = null;
        }
    }
    
    NodoEquipo inicio,fin,Aux,AuxB;
    int Tamaño;
    
    public ListaEquipo(){
        inicio = null;
        Tamaño = 0;
        Aux = null;
        AuxB = null;
    }
    
    public void Insertar(String code, String name, String vic){
        NodoEquipo nuevo = new NodoEquipo(code,name,vic);
        if(inicio == null){
            inicio = nuevo;
            fin = inicio;
            Aux = inicio;
            AuxB = inicio;
            System.out.println("PRIMERA INSERCIÓN");
        }else{
            nuevo.siguiente = inicio;
            inicio.anterior=nuevo;
            inicio = nuevo;
            Aux = inicio;
            AuxB= inicio;
            System.out.println("SE INSERTÓ CORRECTAMENTE");
        }
        Tamaño++;
    }
    
    public String Eliminar(){
        if(inicio==null){
            System.out.println("LA LISTA SE HA VACIADO");
            return("LA LISTA SE HA VACIADO");
        }else{
            String nombre = inicio.Nombre;
            inicio = inicio.siguiente;
            Aux = inicio;
            AuxB = inicio;
            Tamaño--;
            return("EL EQUIPO "+nombre+" HA SIDO ELIMINADO");
        }
    }
    
    int i = 0;
    public String ImprimirNombre(){
        if (Aux!=null){
            String B = Aux.Nombre;
            return(B);
        }else{
            return("");
        }
    }
    
    public void Siguiente(){
        if(Aux.siguiente!=null){
            Aux = Aux.siguiente;
        }
    }
    
    public void Anterior(){
        if(Aux.anterior!=null){
            Aux = Aux.anterior;
        }
    }
    
    public int ImprimirCodigo(){
        if(Aux!=null){
            int A = Aux.Codigo;
            return(A);
        }else{
            return(99);
        }
    }
    
    public int ImprimirVictorias(){
        if(Aux!=null){
            int C = Aux.Victorias;
            return(C);
        }else{
            return(99);
        }
    }
    
    public void Actualizar(){
        Aux = inicio;
    }
    
    public void Ordenar(ListaEquipo E, ListaJugadores J){
        E.Actualizar();
        J.Actualizar();
          for (int x=0;x<=E.Tamaño-1;x++){
              for (int y =0;y<=J.Tamaño-1;y++){
                  if(E.Aux!=null&&J.Aux!=null){
//                      System.out.println("Funciona el null");
//                      System.out.println("Codigo de Equipo "+E.Aux.Codigo);
//                      System.out.println("Codigo del jugador "+J.Aux.CodigoTeam);
                  if (E.Aux.Codigo==J.Aux.CodigoTeam){
                      String Nombre = J.Aux.NombreJ;
                      String camisola = Integer.toString(J.Aux.Camisola);
                      String Posicion = J.Aux.Posicion;
                      String tOb = J.Aux.ToB;
                      String Code = Integer.toString(J.Aux.CodigoTeam);
                      E.Aux.Players.Insertar(Nombre, camisola, Posicion, tOb,Code);
                      System.out.println("Codigo "+x+" Guardado.");
                      System.out.println("Jugador "+Nombre+" En el equipo "+E.Aux.Nombre);
                  }
                  
                  J.Siguiente();
                  }
              }
              System.out.println("//////////////////////////////");
              J.Actualizar();
              E.Siguiente();
          }
          System.out.println("TERMINADO");
          E.Actualizar();
          J.Actualizar();
          E.Aux.Players.Actualizar();
        }
    
}
