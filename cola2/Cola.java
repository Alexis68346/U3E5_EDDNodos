package cola2;
public class Cola{
    Nodo inicio,fin;
    int tamanio;
        public boolean vacia(){
            if (inicio==null){
                return true;
            }else{
                return false;
            }
    }
    
    public void empuja(int elemento){

        Nodo nodo= new Nodo(elemento);
         if(fin==null && inicio==null){
         fin=nodo;
         inicio=nodo;
        }
        inicio.Siguiente=nodo;
        inicio=nodo;
        tamanio++;
        
    }
    
    public void mostrar(){
      if(vacia()){
            System.out.println("La pila esta vacia");
        }
        else{
        Nodo recorre=fin;
        while(recorre!=null){
            System.out.println("  "+"["+recorre.elemento+"]");
            recorre=recorre.Siguiente;
        }
        }
    }
    

    public void eliminar(){
       fin=fin.Siguiente;
       tamanio--;
       
    
}
    
}
