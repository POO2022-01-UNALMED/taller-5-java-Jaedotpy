package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
    private String colorEscamas;
	private int largoCola;

    public Reptil() {
		this("", 0, "", "", "", 0);
	}

	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		Reptil.listado.add(this);
	}   

    // GET & SET // 

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }

    // METODOS //

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil newIguana = new Reptil(nombre, edad, "humedal", genero, "verde", 3);
        iguanas++;
        return newIguana;
    }


    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil newSnake = new Reptil(nombre, edad, "jungla", genero, "blanco", 1);
        serpientes++;
        return newSnake;
    }

    public static int cantidadReptiles() {
        return listado.size();
    }   

    public String movimiento() {
        return "reptar";
    }
}
