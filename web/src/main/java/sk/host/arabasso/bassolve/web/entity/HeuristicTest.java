package sk.host.arabasso.bassolve.web.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by arabasso on 19/03/2017.
 *
 */
@Entity
@Table(name = "heuristic_test")
public class HeuristicTest implements Serializable {
    private static final long serialVersionUID = -611313348770067062L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String input;
    public String result;
    @ManyToOne
    private Heuristic heuristic;

    protected HeuristicTest() {
    }

    public HeuristicTest(String input, String result, Heuristic heuristic) {
        this.input = input;
        this.result = result;
        this.heuristic = heuristic;
    }

    public HeuristicTest(Heuristic heuristic) {
        this.heuristic = heuristic;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Heuristic getHeuristic() {
        return heuristic;
    }
}
