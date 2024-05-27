package Modelo;

public class ConcreteFacturaBuilder extends FacturaBuilder{
    private Factura factura;


    public String ObtenerDetalleFactura(){

    };
    public Paciente obtenerPaciente(int dni){
        return factura.getPaciente();
    };

    public TurnoMedico obtenerTurnoMedico(Paciente paciente){
        if (factura.getPaciente() == paciente){
            return factura.getTurnoMedico();
        }
        return null;
    };
    public int obtenerTotal(int descuento){
        return factura.getTotal();
    };

    public int obtenerDescuento(Paciente paciente){
        return null;
    };

    public Factura obtenerFactura(){
        return this.factura;
    };


}