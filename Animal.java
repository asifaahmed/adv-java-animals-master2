package us.mattgreen;
import java.io.*;



public class Animal extends Pet implements Talkable {

private int age;
    private String sound;
    public Animal( String name, String sound) {

        super(name);
        this.sound=sound;

    }
    public String getSound() {
        return sound;
    }

    @Override
    public String talk()  {
        return sound;
    }

    @Override
    public String toString() {
        return "Animal: " + "name=" + name + " Sound"+sound;
    }
}




