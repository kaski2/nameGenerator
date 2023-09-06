import java.util.concurrent.ThreadLocalRandom;

public class Person {
    private String name;
    private String nickName;
    private static String[] usedNicknames = new String[12];

    public Person(){
        setNickName(generateNick());
        for (int i=0; i< usedNicknames.length; i++){
            if(usedNicknames[i] == null){
                usedNicknames[i] = nickName;
                break;
            }
        }
    }
    public Person(String name){
        this();
        setName(name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setNickName(String nickName){
        this.nickName = nickName;
    }

    public String getNickName(){
        return nickName;
    }

    public String generateNick(){
        String firstNick;
        String lastNick;
        String wholeNick;
        do {
            int index = ThreadLocalRandom.current().nextInt(ConstantValues.firstNick.length);
            firstNick = ConstantValues.firstNick[index];

            index = ThreadLocalRandom.current().nextInt(ConstantValues.lastNick.length);
            lastNick = ConstantValues.lastNick[index];
            wholeNick = firstNick + " " + lastNick;
        } while (checkDupe(wholeNick, usedNicknames));

        return wholeNick;
    }

    private boolean checkDupe(String nick, String[] oldNicks){
        if(oldNicks == null){
            return false;
        }

        for(String oldNick : oldNicks) {
            if (oldNick == null) {
                return false;
            }

            if (oldNick.equals(nick)) {
                return true;
            }
        }
        return false;
    }
}
