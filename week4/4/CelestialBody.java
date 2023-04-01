import java.util.ArrayList;

public class CelestialBody {
    private String name;
    private double mass;
    private CelestialBody bodyOrbited;
    private ArrayList<CelestialBody> bodyInOrbit = new ArrayList<>();
    private double radiusFromParent;
    public CelestialBody(String name, double mass){
        this.name = name;
        this.mass = mass;
    }
    public String getName(){
        return name;
    }
    public void setBodyOrbited(CelestialBody c, double r){
        this.bodyOrbited = c;
        this.radiusFromParent = r;
    }
    public void addToOrbit(CelestialBody c){
        bodyInOrbit.add(c);
    }
    public void removeFromOrbit(CelestialBody c){
        for (CelestialBody body : bodyInOrbit){
            if (body.getName().equals(c.getName())){
                bodyInOrbit.remove(body);
                return;
            }
        }
    }
    public String toString(){
        String str = "The celestial body " + name + " with mass " + mass;
        if (bodyOrbited != null){
            str += " is orbiting " + bodyOrbited.getName() + " at radius " + radiusFromParent;
        }
        if (bodyInOrbit.size() > 0){
            str += ". And ";
            for (CelestialBody c : bodyInOrbit){
                str += c.getName() + ", ";
            }
            str += "is orbiting it.";
        }
        return str;
    }
}
