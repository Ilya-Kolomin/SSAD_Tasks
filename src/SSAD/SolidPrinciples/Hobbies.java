package SSAD.SolidPrinciples;

import java.util.List;

public class Hobbies {
    public List<String> hobbies;

    public int addHobby(String hobby) {
        hobbies.add(hobby);
        return hobbies.size();
    }
}
