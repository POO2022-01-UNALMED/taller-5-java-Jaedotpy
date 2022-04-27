package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
    private boolean pelaje;
	private int patas;

    public Mamifero() {
		this("", 0, "", "", false, 0);
	}

	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje = pelaje;
		this.patas = patas;
		Mamifero.listado.add(this);
	}

    // GET & SET 

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    // METODOS

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero newHorse = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        caballos++;
        return newHorse;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero newLion = new Mamifero(nombre, edad, "selva", genero, true, 4);
        leones++;
        return newLion;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }    
}