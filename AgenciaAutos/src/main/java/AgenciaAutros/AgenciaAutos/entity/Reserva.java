package AgenciaAutros.AgenciaAutos.entity;

import jakarta.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "reservas")
public class Reserva {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "dni_cliente", referencedColumnName = "dni")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "dominio_auto", referencedColumnName = "dominio")
    private Auto auto;

    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin")
    private LocalDate fechaFin;

    // Constructores
    public Reserva() {
    }

    public Reserva(Cliente cliente, Auto auto, LocalDate fechaInicio, LocalDate fechaFin) {
        this.cliente = cliente;
        this.auto = auto;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
	
}
