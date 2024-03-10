package tp_collection_ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class TacheComplexe implements Tache {
    private String nom;
    private Collection<Tache> sousTaches;

    public TacheComplexe(String nom) {
        this.nom = nom;
        this.sousTaches = new ArrayList<>();
    }

    public void ajouter(Tache t) {
        sousTaches.add(t);
    }

    public void supprimer(Tache t) {
        sousTaches.remove(t);
    }

    @Override
    public String getNom() {
        return nom;
    }

    public int getCout() {
        int coutTotal = 0;
        Iterator<Tache> it = sousTaches.iterator();
        while (it.hasNext()) {
            Tache tache = it.next();
            coutTotal += tache.getCout();
        }
        return coutTotal;
    }
}
