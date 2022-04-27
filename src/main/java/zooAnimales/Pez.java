package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;

    public Pez() {
		this("", 0, "", "", "", 0);
	}

	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Pez.listado.add(this);
	}

    // GET & SET //

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }
    
    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }  
	
    // METODOS //

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez newSalmon = new Pez(nombre, edad, "oceano", genero, "rojo", 6);
        salmones++;
        return newSalmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez newCod = new Pez(nombre, edad, "oceano", genero, "gris", 6);
        bacalaos++;
        return newCod;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public String movimiento() {
        return "nadar";
    }
}
