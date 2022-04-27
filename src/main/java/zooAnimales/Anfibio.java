package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal
{
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
    private String colorPiel;
	private boolean venenoso;
    
    public Anfibio() {
		this("", 0, "", "", "", false);
	}

	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Anfibio.listado.add(this);
	}

    // GET & SET //

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    // METODOS 
    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio newFrog = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
        ranas++;
        return newFrog;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio newSalamander = new Anfibio(nombre, edad, "selva", genero, "negro", true);
        ranas++;
        return newSalamander;
    }  

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public String movimiento() {
        return "saltar";
    }
}
