package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
    private String colorPlumas;

    public Ave() {
        this("", 0, "", "", "");
	}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas = colorPlumas;
		Ave.listado.add(this);
	}

    // GET & SET //

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    // METODOS //

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave newHawk = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        halcones++;
        return newHawk;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave newEagle = new Ave(nombre, edad, "montanas", genero, "blanco");
        aguilas++;
        return newEagle;
    }

    public static int cantidadAves() {
        return listado.size();
    }    

    public String movimiento() {
        return "volar";
    }
}
