package io.mateu.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.net.URL;
import java.time.LocalDate;

@Entity@Getter@Setter
public class Proyecto {

    @Id@GeneratedValue
    private long id;

    @NotEmpty
    private String nombre;

    private LocalDate creado = LocalDate.now();

    private URL url;

    private boolean visible = true;

}
