package Modelo;

import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Persona{

    private LocalDate fechadeNacimiento;

    private int telefono;
    private String direccion;
    private String obraSocial;
    private ArrayList<TurnoMedico> listaTurnos;
    private boolean jubilado;
	public Paciente(String nombre, String apellido, int dni, int dia, int mes, int anio, int telefono, String direccion, String obraSocial,
			 boolean jubilado) {
		super(nombre,apellido,dni);
		//this.fechadeNacimiento = fechadeNacimiento;
		this.fechadeNacimiento = LocalDate.of(anio, mes, dia);
		this.telefono = telefono;
		this.direccion = direccion;
		this.obraSocial = obraSocial;
		this.listaTurnos = new ArrayList<>();
		this.jubilado = jubilado;
	}
    
	
}
