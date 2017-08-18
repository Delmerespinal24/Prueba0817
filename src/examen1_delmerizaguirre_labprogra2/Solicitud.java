package examen1_delmerizaguirre_labprogra2;

public class Solicitud {
    Usuario emisor;
    Usuario receptor;

    public Solicitud(Usuario emisor, Usuario receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    @Override
    public String toString() {
        return "" + emisor;
    }
    
}
