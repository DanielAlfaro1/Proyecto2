package proyecto2_201700857;


public class ListaJugadores {
    
    class NodoJugadores{
        public String NombreJ;
        public int Camisola;
        public String Posicion;
        public String ToB;
        public int CodigoTeam;
        public NodoJugadores siguiente, anterior;
        
        public NodoJugadores(){     
        }
        
        public NodoJugadores(String N, String cam, String P, String tOb, String Code){
            NombreJ = N;
            Camisola = Integer.parseInt(cam);
            Posicion = P;
            ToB = tOb;
            CodigoTeam = Integer.parseInt(Code);
            siguiente = null;
            anterior = null;
        }
    }
        NodoJugadores inicio, fin, Aux, AuxB;
        int Tamaño;
        
        public ListaJugadores(){
            inicio = null;
            Tamaño = 0;
            Aux = null;
            AuxB = null;
        }
        
        public void Insertar(String N, String cam, String P, String tOb,String Code){
            NodoJugadores nuevo = new NodoJugadores(N,cam,P,tOb,Code);
            if (inicio==null){
                inicio = nuevo;
                fin = inicio;
                AuxB=inicio;
                Aux=inicio;
                System.out.println("PRIMERA INSERCIÓN DE JUGADORES");
            }else{
                nuevo.siguiente = inicio;
                inicio.anterior = nuevo;
                inicio = nuevo;
                Aux = inicio;
                AuxB = inicio;
                System.out.println("SE INSERTÓ UN JUGADOR CON EXITO");
            }
            Tamaño++;
        }
    
        public String Eliminar(){
            if (inicio==null){
                System.out.println("LOS JUGADORES YA ESTAN ELIMINADOS");
                return("LA LISTA ESTA VACIA");
            }else{
                String nombre = inicio.NombreJ;
                inicio = inicio.siguiente;
                Aux = inicio;
                AuxB = inicio;
                Tamaño--;
                return("EL JUGADOR "+nombre+" HA SIDO ELIMINADO");
            }
         }
        
        public String ImprimirNombre(){
            if (Aux!=null){
                String B = Aux.NombreJ;
                return(B);
            }else{
                return("");
            }
        }
        
        public void Siguiente(){
            if (Aux!=null&&Aux.siguiente!=null){
                Aux = Aux.siguiente;
            }
        }
        
        public void Anterior(){
            if(Aux!=null&&Aux.anterior!=null){
                Aux = Aux.anterior;
            }
        }
        
        public int ImprimirCamisola(){
            if(Aux!=null){
                int A = Aux.Camisola;
                return(A);
            }else{
                return(99);
            }
        }
        
        public int ImprimirCodigo(){
            if (Aux!=null){
                int C = Aux.CodigoTeam;
                return(C);
            }else{
                return(99);
            }
        }
        
        public String ImprimirPosicion(){
            if(Aux!=null){
                String C = Aux.Posicion;
                return(C);
            }else{
                return("");
            }
        }
        
        public String ImprimirToP(){
            if(Aux!=null){
                String D = Aux.ToB;
                return(D);
            }else{
                return("");
            }
        }
        
        public void Actualizar(){
            Aux = inicio;
        }
}
