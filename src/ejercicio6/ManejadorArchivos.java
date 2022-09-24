package ejercicio6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class ManejadorArchivos {

    private FileWriter fw;
    private File file;
    private BufferedReader bf;

    public ManejadorArchivos(String nombre_archivo) {
        file = new File(nombre_archivo);
    }

    public void obtenerProductos(ArrayList<Producto> lista) {
        try {
            bf = new BufferedReader(new FileReader(file));
            String linea = "";
            while ((linea = bf.readLine()) != null) {
                System.out.println(linea);
                StringTokenizer tk = new StringTokenizer(linea, "|");
                int codigo = Integer.parseInt(tk.nextToken());
                String descripcion = tk.nextToken();
                int stock = Integer.parseInt(tk.nextToken());
                int minimo = Integer.parseInt(tk.nextToken());
                double precio = Double.parseDouble(tk.nextToken());
                lista.add(new Producto(codigo, descripcion, stock, minimo, precio));
            }
        } catch (IOException ioEx) {
            JOptionPane.showMessageDialog(null, ioEx.getMessage());
        }
    }

    public void guardarArchivo(Producto producto) {
        try {
            fw= new FileWriter(file,true);
            String dataProducto = producto.getCodigo() + "|" + producto.getDescripcion() + "|" + producto.getStock() + "|" + producto.getMinimo() + "|" + producto.getPrecio()+"\n";
            fw.write(dataProducto);
            fw.close();
        } catch (IOException ioEx) {
            JOptionPane.showMessageDialog(null, ioEx.getMessage());
        }

    }
}
