package proyecto2_201700857;


public class Lista_User {
    
    class NodoU{
        String CUI;
        String Nombre;
        String Correo;
        String Usuario;
        String Contraseña;
        NodoU siguiente,anterior;
        
        public NodoU(){
        }
        
        public NodoU(String c, String N, String C, String U, String P){
            CUI= c;
            Nombre = N;
            Correo = C;
            Usuario=U;
            Contraseña = P;
            anterior = null;
            siguiente = null;
        }
    }
    
    NodoU inicio;
    NodoU fin;
    NodoU Aux;
    NodoU AuxB;
    NodoU cima = new NodoU();
    NodoU fondo = new NodoU();
    int tamaño;
    
    public Lista_User(){
        inicio = null;
        tamaño = 0;
        Aux=null;
        AuxB=null;
    }
    
    public void Push(String c, String n, String C, String U, String P){
      NodoU nuevo = new NodoU(c,n,C,U,P);
      if (inicio == null){
          fondo = nuevo;
          inicio = nuevo;
          fin = inicio;
          Aux = inicio;
          AuxB=inicio;
      }else{
          nuevo.siguiente = inicio;
          inicio.anterior=nuevo;
          inicio = nuevo;
          Aux = inicio;
          AuxB=inicio;
      }
      tamaño++;
    }
    
    public String Pop (){
        if (inicio==null){
            System.out.println("PILA VACÍA");
            return("LA PILA ESTÁ VACÍA");
        //AGREGAR UNA VENTANA DE ERROR    
        }else{
            String nombre = inicio.Usuario;
            inicio = inicio.siguiente;
            Aux = inicio;
            AuxB=inicio;
            tamaño--;
            return("EL USUARIO"+nombre+" HA SIDO ELIMINADO");
        }
    }
    int i =0;
    public String ImprimirNombre(){
        if (Aux!=null){
            String B = Aux.Nombre;
//            Aux = Aux.siguiente;
            return(B);
        }else{
            return("");
        }
    }
    
    public void Siguiente(){
        if (Aux!=null){
            Aux = Aux.siguiente;
        }
    }
    
    public String ImprimirCui(){
        if(Aux!=null){
            String A = Aux.CUI;
            return(A);
        }else{
            return("");
        }
    }
    
    public String ImprimirEmail(){
        if (Aux!=null){
            String C = Aux.Correo;
            return(C);
        }else{
            return("");
        }
    }
    
    public String ImprimirUsuario(){
        if (Aux!=null){
            String U = Aux.Usuario;
            return(U);
        }else{
            return("");
        }
    }
    
    public String ImprimirPass(){
        if(Aux!=null){
            String C = Aux.Contraseña;
            return(C);
        }else{
            return("");
        }
    }
    
    public void Buscar (String usuario){
      while (AuxB!=null||!usuario.contains(AuxB.Usuario)){
                AuxB = AuxB.siguiente;
      }  
    }
    
    public String BuscarU(){
        if(AuxB!=null){
            return(AuxB.Usuario);
        }else{
            return("MISSING");
        }
    }
    
    public String BuscarN(){
        if(AuxB!=null){
            return(AuxB.Nombre);
        }else{
            return("MISSING");
        }
    }
    
    public String BuscarP(){
        if(AuxB!=null){
            return(AuxB.Contraseña);
        }else{
            return("MISSING");
        }
    }
    
    public String BuscarC(){
        if(AuxB!=null){
            return(AuxB.Correo);
        }else{
            return("MISSING");
        }
    }
    
    public String BuscarCui(){
        if(AuxB!=null){
            return(AuxB.CUI);
        }else{
            return("");
        }
    }
    
    public void Actualizar(){
        Aux = inicio;
    }
    
    public void ActualizarB(){
        AuxB=inicio;
    }
    
    public Boolean Existencia(String usuario, String cui,String correo){
        while (AuxB!=null&&(!usuario.contains(AuxB.Usuario)||!cui.contains(AuxB.CUI)||!correo.contains(AuxB.Correo))){
                System.out.println("No hay coincidencias aun");
                AuxB = AuxB.siguiente;
      }
        if(AuxB!=null&&(usuario.contains(AuxB.Usuario)||cui.contains(AuxB.CUI)||correo.contains(AuxB.Correo))){
            System.out.println("Se encontro una coincidencia");
            ActualizarB();
            return(true);
        }else{
            System.out.println("no hubo coincidencia");
            return(false);
        }
    }
}
