package matrice;

/**
 * Created by paul on 08/12/2016.
 */
public class transition {

    private String in;
    private String out;

    public transition(String in, String out) {
        this.in = in;
        this.out = out;
    }

    public String getIn() {
        return in;
    }

    public String getOut() {
        return out;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        transition that = (transition) o;

        return in != null ? in.equals(that.in) : that.in == null;

    }

    @Override
    public int hashCode() {
        return in != null ? in.hashCode() : 0;
    }
}
