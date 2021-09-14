package SSAD.SolidPrinciples;

import SSAD.SolidPrinciples.Languages.Arabic;
import SSAD.SolidPrinciples.Languages.Language;
import SSAD.SolidPrinciples.Needs.*;

public class Human implements Religious, Sportive, Marriageable, Entrepreneurial, Employable {

    Nickname nickname;

    Hobbies hobbies;

    Salary salary;

    public String sayHello(Language language) {
        return language.sayHello();
    }

    @Override
    public void becomeEmployee() {

    }

    @Override
    public void ownCompany() {

    }

    @Override
    public void getMarried() {

    }

    @Override
    public void pray() {

    }

    @Override
    public void playSports() {

    }

    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human.sayHello(new Arabic()));
    }

}
