package academy.belhard;

public class Plates {
    private double radius;
    private double depth;


    public Plates(double rs, double dh) {
        this.radius = rs;
        this.depth = dh;
    }


    @Override
    public int hashCode() {
        int hash = Double.hashCode(radius) + 9 * Double.hashCode(depth);
        return hash;
    }

    @Override
    public String toString() {
        return "Plates {" +
                "radius = " + radius +
                ", depth = " + depth +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if(!(obj instanceof Plates)){
            return false;
        }

        Plates plates = (Plates) obj;

        return radius == plates.radius && depth == plates.depth;
    }


}
