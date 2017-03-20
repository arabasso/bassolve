package sk.host.arabasso.bassolve.web.form;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;
import sk.host.arabasso.bassolve.web.entity.Heuristic;

import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
@Validated
public class HeuristicForm {
    private long id;
    @NotBlank
    private String name;
    private LocalDate date;
    @NotBlank
    private String source;

    public HeuristicForm() {
        this.date = LocalDate.now();
        this.source = new Scanner(getClass().getResourceAsStream("/heuristic.groovy")).useDelimiter("\\A").next();
    }

    public HeuristicForm(Heuristic heuristic) {
        this.id = heuristic.getId();
        this.name = heuristic.getName();
        this.source = heuristic.getSource();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
