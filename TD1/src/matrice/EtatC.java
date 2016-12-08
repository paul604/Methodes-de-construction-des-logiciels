package matrice;

/**
 * Created by paul on 28/11/16.
 */
public class EtatC {

    private String name;

    public EtatC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EtatC etatC = (EtatC) o;

        return name != null ? name.equals(etatC.name) : etatC.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
