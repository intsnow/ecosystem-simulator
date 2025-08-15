
import java.util.List;

public class Action
{
    public Action(List<Object> bodyparts){
        //GenericSystem system = GenericSystem.setSystem();
        Action action = getAction(bodyparts);
        displayAction(action);
    }

     static Action getAction(List<Object> bodyParts){

         Action action = null;

        for (Object bodyPart: bodyParts){



        }

         return action;
    }

    public void displayAction(Action action){
        //System.out.printf("\n\t %s is:\t %s ",);
    }

}
