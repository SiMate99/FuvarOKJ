package fuvar;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FuvarProgram {

    public static void main(String[] args) throws IOException {
        List<String> sorok = Files.readAllLines(Paths.get("fuvar.csv"));
        ArrayList<Fuvar> fuvarok = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            fuvarok.add(new Fuvar(sor));
        }
        
        System.out.print("3. Feladat: ");
        System.out.println(fuvarok.size() + " fuvar");
        
    }
    
}
