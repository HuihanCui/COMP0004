import java.util.ArrayList;

public class UI {
    ArrayList<CelestialBody> cbs = new ArrayList<>();
    public void getInput(){
        FileInput fi = new FileInput("example.txt");
        while (fi.hasNextLine()){
            String name = fi.nextLine();
            double mass = Double.valueOf(fi.nextLine());
            CelestialBody cb = new CelestialBody(name, mass);
            cbs.add(cb);
            String orbiting  = fi.nextLine();
            if (!orbiting.equals("/")){
                double radius = Double.valueOf(fi.nextLine());
                for (CelestialBody body : cbs){
                    if (body.getName().equals(orbiting)){
                        cb.setBodyOrbited(body, radius);
                        body.addToOrbit(cb);
                    }
                }
            }
        }
    }
    public void output(){
        for (CelestialBody cb : cbs){
            System.out.println(cb.toString());
        }
    }
    public static void main(String[] args){
        UI ui = new UI();
        ui.getInput();
        ui.output();
    }
}
