import java.util.Scanner;
public class registro {
   
     Scanner sc = new Scanner(System.in);
    public objproducto[][] LlenarRegistros(objproducto[][] r){
       
        for (int i = 0; i<r.length; i++){
            objproducto o = new objproducto();
            System.out.println("el nombre del producto");
            o.setNombre(sc.next());
            System.out.println("Ingrese el precio delproducto");
            o.setPrecio(sc.nextDouble());
            System.out.println("Ingrese el cantidad");
            o.setCantidad(sc.nextInt());
            System.out.println("el precio total del producto es: " + o.getPrecio() * o.getCantidad());
            r[i][0] = o;
            
}
return r;
    }
    public void MostrarRegistros(objproducto[][] r){
        for (int i = 0; i<r.length; i++){
            System.out.println("el nombre del producto es: " + r[i][0].getNombre());
            System.out.println("el precio del producto es: " + r[i][0].getPrecio());
            System.out.println("la cantidad del producto es: " + r[i][0].getCantidad());
            System.out.println("el precio total del producto es: " + r[i][0].getPrecio() * r[i][0].getCantidad());
        }
    }
    public void mostrarPrecioMasElevado(objproducto[][] r){
        double precioMasElevado = 0;
        String nombreProducto = "";
        for (int i = 0; i<r.length; i++){
            if (r[i][0].getPrecio() * r[i][0].getCantidad() > precioMasElevado){
                precioMasElevado = r[i][0].getPrecio() * r[i][0].getCantidad();
                nombreProducto = r[i][0].getNombre();
            }
        }
        System.out.println("el producto con el precio mas elevado es: " + nombreProducto + " con un precio total de: " + precioMasElevado);
    }
     
}
