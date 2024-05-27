package Modelo;
<<<<<<< HEAD
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente {

    private LocalDate fechadeNacimiento;
=======
import java.util.ArrayList;
import java.util.Date;

public class Paciente {

    private Date fechadeNacimiento;
>>>>>>> c411b5b3883c7d084e21867700929b629a9dfe96
    private int telefono;
    private String direccion;
    private String obraSocial;
    private ArrayList<TurnoMedico> listaTurnos;
    private boolean jubilado;
<<<<<<< HEAD
	public Paciente(int dia, int mes, int anio, int telefono, String direccion, String obraSocial,
			 boolean jubilado) {
		super();
		//this.fechadeNacimiento = fechadeNacimiento;
		this.fechadeNacimiento = LocalDate.of(anio, mes, dia);
		this.telefono = telefono;
		this.direccion = direccion;
		this.obraSocial = obraSocial;
		this.listaTurnos = new ArrayList<>();
		this.jubilado = jubilado;
	}
    
	
    
=======
>>>>>>> c411b5b3883c7d084e21867700929b629a9dfe96
}
