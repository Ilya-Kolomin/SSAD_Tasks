package SSAD.SolidPrinciples;

public class Nickname {
    String name;
    String nickname;

    void creatNickName(String postFix) {
        nickname = name.concat(postFix);
    }
}
