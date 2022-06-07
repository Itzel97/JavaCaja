package operaciones;

public class Caja {

    int ancho;
    int alto;
    int profundo;

    public Caja() {

    }

    public Caja(int ancho, int alto, int profundo) {

        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void calcularVolumen(){
    
        var volumen = this.ancho * this.alto * this.profundo;
        
        System.out.println("volumen = " + volumen);
        
    }

}
