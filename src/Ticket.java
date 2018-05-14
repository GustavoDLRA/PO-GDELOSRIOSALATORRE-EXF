public class Ticket<T> {
Elemento<T> inicio, pivote;
int cantElementos;
float costoLeche, costoManzana, costoPasta;

public Ticket(){
    inicio=pivote=null;
    cantElementos=0;
}
public Ticket(Elemento<T> objeto, int cantElementos){
    this.cantElementos=cantElementos;
    inicio=pivote=objeto;
}
public void comprarAlgo(float costoLeche,float costoManzana, float costoPasta, String claves, int cantElementos){
    Articulo manzana = new Articulo(10);
    Articulo leche = new Articulo(20);
    Articulo Pasta = new Articulo(10);

    if (claves.equals("Manzana")&&cantElementos<manzana.getCantidad()){


    }
    else if (claves.equals("Leche" )&& cantElementos<leche.getCantidad()){

    }
    else if (claves.equals("Pasta" )&&cantElementos<Pasta.getCantidad()){

    }else{

    }
}
}
