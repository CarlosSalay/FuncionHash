
package funcionhash;
import static HashModelo.FuncionModelo.multiplyHash;
import java.util.Scanner;
/**
 *
 * @author Carlos Salay
 */
public class FuncionHashMain {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la clave: ");
        String key = scanner.nextLine();
        
        System.out.print("Ingrese el tamaño de la tabla: ");
        int tableSize = scanner.nextInt();
        
        int hash = multiplyHash(key, tableSize);
        System.out.println("Valor HASH: " + hash);
        
        scanner.close();
    }
}
