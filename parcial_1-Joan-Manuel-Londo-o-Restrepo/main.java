import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos a registrar");
        int cantidadProductos = sc.nextInt();
        objproducto[][] registros = new objproducto[cantidadProductos][1];
        registro r = new registro();
        registros = r.LlenarRegistros(registros);
        r.MostrarRegistros(registros);
       

        r.mostrarPrecioMasElevado(registros);
    }
    
}
