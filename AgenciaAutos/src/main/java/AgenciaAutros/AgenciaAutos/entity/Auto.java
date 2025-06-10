package AgenciaAutros.AgenciaAutos.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @Column(length = 10)
    private String dominio;

    @Column(length = 50)
    private String marca;

    @Column(length = 50)
    private String modelo;

    @Column(length = 50)
    private String kilometros;

    @Column(nullable = false)
    private boolean alquilado = false;

    // Constructores
    public Auto() {
    }

    public Auto(String dominio, String marca, String modelo, String kilometros, boolean alquilado) {
        this.dominio = dominio;
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.alquilado = alquilado;
    }

    // Getters y Setters
    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometros() {
        return kilometros;
    }

    public void setKilometros(String kilometros) {
        this.kilometros = kilometros;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }
}
