package tp_collection_ex1;

public class Main {
    public static void main(String[] args) {
    	
    	TacheElementaire t1 = new TacheElementaire("Tâche 1", 5);
        TacheElementaire t2 = new TacheElementaire("Tâche 2", 10);
        
        TacheComplexe tc1 = new TacheComplexe("TacheComplexe");
        tc1.ajouter(t1);
        tc1.ajouter(t2);
        

        System.out.println("Coût total : " + tc1.getCout());
    }
}
