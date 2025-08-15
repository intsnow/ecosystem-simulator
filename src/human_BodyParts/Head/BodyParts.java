package human_BodyParts.Head;

import java.util.Collection;
import java.util.HashSet;

public class BodyParts {
    private Hair hair;
    private Eyebrows eyebrows;
    private Eyes eyes;
    private Ears ears;
    private Nose nose;
    private Mouth mouth;

    private Collection<Object> parts;
    private Boolean isReady;

    public BodyParts(){
        Boolean isReady = setBodyParts();

    }

    public Boolean setBodyParts(){
        this.hair = new Hair();
        this.eyebrows = new Eyebrows();
        this.eyes = new Eyes();
        this.ears = new Ears();
        this.nose = new Nose();
        this.mouth = new Mouth();

        Collection<Object> bodyParts = new HashSet<>();

        bodyParts.add(hair);
        bodyParts.add(eyebrows);
        bodyParts.add(eyes);
        bodyParts.add(ears);
        bodyParts.add(nose);
        bodyParts.add(mouth);

        this.parts = new HashSet<>();
        this.parts.addAll(bodyParts);

        for (Object part: parts){
            if (part.equals(null)) {

                System.out.printf("FAIL! Human body is NOT ready...");
                return false;
            }
        }

        return true;
    }

    public Collection<Object> getBodyParts(){
        return this.parts;
    }

    public Object getPart(Object part){

        for (Object p: parts){
            if (p.equals(part)) return p;
        }

        return null;
    }

    private static class Hair{}
    private class Eyebrows{}
    private class Eyes{}
    private class Ears{}
    private class Nose{}
    private class Mouth{}
}
