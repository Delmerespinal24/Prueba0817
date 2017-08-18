
package examen1_delmerizaguirre_labprogra2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Owner
 */
public class Usuario {
    private String nick;
    private String pass;
    private Date nacimiento;
    private String Telefono;
    private String correo;
    private String nombreCompleto;
    private String generoFavorito;
    private ArrayList<Usuario> ListaAmigos = new ArrayList();
    private ArrayList<Libro> ListaLibros = new ArrayList();

    public Usuario() {
    }

    public Usuario(String nick, String pass, Date nacimiento, String Telefono, String correo, String nombreCompleto, String generoFavorito) {
        this.nick = nick;
        this.pass = pass;
        this.nacimiento = nacimiento;
        this.Telefono = Telefono;
        this.correo = correo;
        this.nombreCompleto = nombreCompleto;
        this.generoFavorito = generoFavorito;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getGeneroFavorito() {
        return generoFavorito;
    }

    public void setGeneroFavorito(String generoFavorito) {
        this.generoFavorito = generoFavorito;
    }

    public ArrayList<Usuario> getListaAmigos() {
        return ListaAmigos;
    }

    public void setListaAmigos(ArrayList<Usuario> ListaAmigos) {
        this.ListaAmigos = ListaAmigos;
    }

    public ArrayList<Libro> getListaLibros() {
        return ListaLibros;
    }

    public void setListaLibros(ArrayList<Libro> ListaLibros) {
        this.ListaLibros = ListaLibros;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nick=" + nick + ", pass=" + pass + ", nacimiento=" + nacimiento + ", Telefono=" + Telefono + ", correo=" + correo + ", nombreCompleto=" + nombreCompleto + ", generoFavorito=" + generoFavorito + ", ListaAmigos=" + ListaAmigos + ", ListaLibros=" + ListaLibros + '}';
    }
    
    
}
