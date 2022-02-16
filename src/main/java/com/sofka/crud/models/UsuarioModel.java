package com.sofka.crud.models;
import javax.persistence.*;

@Entity//Le dice que es un modelo real
@Table(name = "usuario")//El nombre de la tabla
public class UsuarioModel {
    @Id//indica que es un id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Auto incremental
    @Column(unique = true,nullable = false)//valor unico y no null
    
    private Long id;
    private String nombre;
    private String email;
    private Integer prioridad;
    

    

    /**
     * @return Long return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return Integer return the prioridad
     */
    public Integer getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad the prioridad to set
     */
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }

}
