import human_BodyParts.Head.BodyParts;

import java.util.*;

public class Human
{
    private LiveBeing liveBeing;
    private BodyParts bodyParts;
    private Collection<Object> parts;
    public Boolean hasDisplayed;


    public Human(LiveBeing liveBeing){
        setLiveBeing(liveBeing);
        setBodyParts();
        //this.hasDisplayed =
        displayInfo_Human();
        doAction();
    }

    private <T> void doAction(){

        System.out.println("\n\tSelect which action to do:");

        System.out.println (
                "\n\t\t1 - Comb hair" +
                "\n\t\t2 - Blink" +
                "\n\t\t3 - Sleep" +
                "\n\t\t4 - Smell" +
                "\n\t\t5 - Eat" );

        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();

        Collection<Object> chosenParts = new HashSet<>();

        switch (op){

            case 1:
                 /* Talvez seja melhor tornar tudo em hashmap,
                    para chave ser o nome da parte corporal,
                    e o valor, uma collection de infos ou
                    apenas ser a classe da parte do corpo

                    HashMap <String, Object>
                ou
                    Hashmap <String, Collection<Object>>


                  */

                //chosenParts.add(parts.)


        }

        //Action action = Action.getAction();


    }

    private Boolean setBodyParts(){

        this.bodyParts = new BodyParts();
        this.parts = new HashSet<>();

        if (!bodyParts.equals(null))
            this.parts = this.bodyParts.getBodyParts();

        if (parts.equals(null)) return false;

        return true;
    }

    private void setLiveBeing(LiveBeing liveBeing){
        this.liveBeing = liveBeing;

    }


    private Boolean displayInfo_Human(){

        System.out.printf("\n\n\t Displaying INFO...\n", this.liveBeing.getPopular_Name());
        this.liveBeing.displayInfo();

        return true;
    }


}
