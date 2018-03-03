/*
 * Clase Datos para ingresar los datos de los candidatos
 * Libreria java.math.BigDecimal para ingresar el numero de telefono
 */
package congreso;
import java.math.BigDecimal;

/**
 * Ingresa los datos de los candidatos
 * @author Camilo Tinoco
 * @version 1.0, 03/03/2018
 */
public class Partido {
    // Variables de clase o miembro
    private String nombrePar;
    private int numeroCan;
    private BigDecimal costoCam;
    private String nombreCan;
    private String apellidoCan;
    
    Partido (String nombrePar, int numeroCan, BigDecimal costoCam, String nombreCan, String apellidoCan){
        this.nombrePar=nombrePar;
        this.numeroCan=numeroCan;
        this.costoCam=costoCam;
        this.nombreCan=nombreCan;
        this.apellidoCan=apellidoCan;
    }
}
