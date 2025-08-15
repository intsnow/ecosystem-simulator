import java.util.ArrayList;
import java.util.List;

// Logica completa! Porem, apenas para classes concretas!

/* Transformar LiveBeing em abstrato, e criar classes ENUM
   para guardar cada reino e especie (talvez fazer isso em
   uma classe só? Ou dividir em duas entidades? De toda forma,
   associar tais casos a classes como Human e outras, para tais
   infos serem associadas diretamente DENTRO de cada entidade criada!
 */


public class LiveBeing {

    private Specie specie;
    private Kingdom kingdom;
    private String popular_Name;
    private Object liveBeing;
    private Boolean hasDisplayed_Info;

    // Enumerando os reinos
    private enum Kingdom{
        ANIMALIA, PLANTAE, FUNGI, PROTISTA, MONERA;
    }

    //Enumerando especies de cada reino
    private enum Specie{

        HOMO_SAPIENS("Human", Kingdom.ANIMALIA),
        COCOS_NUCIFERA("Coconut", Kingdom.PLANTAE),
        AGARICUS_BISPORUS("Champignon", Kingdom.FUNGI),
        AMOEBA_PROTEUS("Ameba", Kingdom.PROTISTA),
        OSCILLATORIA("Cyanobacteria", Kingdom.MONERA);

        private final String name, specie;
        private final Kingdom kingdom;

        Specie(String name, Kingdom kingdom) {
            this.name = name.toLowerCase();
            this.kingdom = kingdom;
            this.specie = this.name().toLowerCase();
        }

        public String getName(){
            return name;
        }
        public Kingdom getKingdom(){
            return kingdom;
        }
        public String getSpecie(){
            return specie;
        }

    }

    public LiveBeing(String popular_Name){
        startLiveBeing(popular_Name.toLowerCase());
        //hasDisplayed_Info = this.liveBeing();

        displayInfo();
    }

    private void startLiveBeing(String popular_Name) {
        this.popular_Name = popular_Name;
        this.specie = setSpecie();
        this.kingdom = setKingdom();
        this.liveBeing = setLiveBeing();
    }

    private Specie setSpecie(){

        List<String> species = getSpecies();
        if (species.contains(popular_Name.toLowerCase())) {
            for (Specie spc : Specie.values()) {
                if (popular_Name.equals(spc.name)) {
                    return spc;
                }
            }
        }

        return null;
    }

    public Specie getSpecie(){
        return this.specie;
    }

    public List<String> getSpecies(){
        List<String> species_names = new ArrayList<>();

        for (Specie spc: Specie.values()){
            species_names.add(spc.name);
        }

        return species_names;
    }

    private Kingdom setKingdom(){

        if (this.specie != null) {
            Kingdom kingdom = this.specie.kingdom;
            return kingdom;
        }

        return null;
    }


    private Object setLiveBeing(){
        Object liveBeing = new Object();

        switch (popular_Name){

            case "human":
                liveBeing = new Human(this);

        }

        return liveBeing;
    }


    public Object getLiveBeing(){
        return this.liveBeing;
    }

    public String getPopular_Name(){
        return this.popular_Name;
    }

    public void displayInfo() {

        List<String> species = getSpecies();

        //System.out.println("\n==========================================================================" +
        //        "==========================================================================");

        if (species.contains(popular_Name.toLowerCase())) {
            System.out.printf("\n\t Popular_Name: %s\n\t Kingdom_Name: %s\n\t Scientific_Name: %s\n", specie.getName(), specie.getKingdom(), specie.getSpecie());
        } else {
            System.out.printf("\n\t Sorry... Live being '%s' is not registered :C\n", popular_Name);
        }

        System.out.println("\n\n==========================================================================" +
                "==========================================================================\n");




    }

}
