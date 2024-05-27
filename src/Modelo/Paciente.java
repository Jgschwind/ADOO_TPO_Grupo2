package Modelo;


import java.util.*;

public class Paciente {

	Date fechaDeNacimietno;
	
	int telefono;
	
	String direccion;
	
	String obraSocial;
	
	ArrayList<TurnoMedico> listaTurnos = new ArrayList<TurnoMedico>();
	
	boolean jubilado;

	public Paciente(Date fechaDeNacimietno, int telefono, String direccion, String obraSocial, boolean jubilado) {
		super();
		this.fechaDeNacimietno = fechaDeNacimietno;
		this.telefono = telefono;
		this.direccion = direccion;
		this.obraSocial = obraSocial;
		this.jubilado = jubilado;
	}

	public ArrayList<TurnoMedico> getListaTurnos() {
		return listaTurnos;
	}

	public void setListaTurnos(TurnoMedico turnos) {
		listaTurnos.add(turnos);
	}
	
	public void solicitarCita(int dni, int matricula, Date fechaTurno, int complejidad) {
		
	}
	
	public void verHistorialMedico() {
		for (TurnoMedico turno: listaTurnos) {
			//Agregar despues para ver el historial de los turnos	
		}
	}

}
