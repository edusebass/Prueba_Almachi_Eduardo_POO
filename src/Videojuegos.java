//creamos una clase publica llamada Videojuegos
public class Videojuegos {
    //Atributos
    //aqui crearemos 5 atributos que caracterizan a un videojuego
    String nombre;
    String tipo;
    int precio;
    String compañia;
    int valoracion;

    //constructor
    //el constructor nos ayudara a poder establecer los valores para cada atributo del objeto
    public Videojuegos(String nombre, String tipo, int precio, String compañia, int valoracion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
        this.compañia = compañia;
        this.valoracion = valoracion;
        //con la palabra predeterminada this se podra acceder a cada valor del atributo
    }

    //getters and setters

    //gett retornara el valor asignado de ese atributo de cada objeto
    public String getNombre() {
        return nombre;
    }
    //sett nos ayudara a poder cambiar el valor del atributo del objeto
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //gett retornara el valor asignado de ese atributo de cada objeto
    public String getTipo() { return tipo; }
    //sett nos ayudara a poder cambiar el valor del atributo del objeto
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    //gett retornara el valor asignado de ese atributo de cada objeto
    public int getPrecio() {
        return precio;
    }
    //sett nos ayudara a poder cambiar el valor del atributo del objeto
    public void setPrecio(int precio) {
        this.precio = precio;
    }


    //gett retornara el valor asignado de ese atributo de cada objeto
    public String getCompañia() {
        return compañia;
    }
    //sett nos ayudara a poder cambiar el valor del atributo del objeto
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }


    //gett retornara el valor asignado de ese atributo de cada objeto
    public int getValoracion() {
        return valoracion;
    }
    //sett nos ayudara a poder cambiar el valor del atributo del objeto
    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


    //metodo imprimir todos los datos
    public void imprimirDatos() {
        //aqui con un sout y dentro de el espcificando podremos hacer que se imprima
        //segun la instancia a la que llamemos
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio: " + this.precio);
        System.out.println("Compañia: " + this.compañia);
        System.out.println("Valoracion: " + this.valoracion);
    }
}
