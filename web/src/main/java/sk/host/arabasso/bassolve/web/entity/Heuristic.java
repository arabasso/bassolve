package sk.host.arabasso.bassolve.web.entity;

import groovy.lang.GroovyClassLoader;
import sk.host.arabasso.bassolve.core.visitor.HeuristicExpressionVisitor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by arabasso on 19/03/2017.
 */
@Entity
@Table(name = "heuristic")
public class Heuristic implements Serializable {
    private static final long serialVersionUID = -6113123348770067062L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private LocalDate date;
    @Lob
    public String source;
	
	public Heuristic(){
	}

    public Heuristic(String name, LocalDate date, String source) {
        this(name, date);

        this.source = source;
    }

    public Heuristic(String name, LocalDate date) {
        this.date = date;
        this.name = name;
    }

    public Heuristic(String name) {
        this(name, LocalDate.now());
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

    public HeuristicExpressionVisitor getHeuristic() {
        Class clazz = compile();

        try {
            return (HeuristicExpressionVisitor) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return new HeuristicExpressionVisitor();
    }

    public Class compile() {
        GroovyClassLoader gcl = new GroovyClassLoader();

        return gcl.parseClass(source);
    }
}
