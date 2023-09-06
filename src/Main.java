public class Main {



    public static void main(String[] args) {
        Person[] people = new Person[12];

        for(int i=0; i<people.length; i++){
            people[i] = new Person(ConstantValues.names[i]);
        }

        String sb = "Wu-Tang name generator for programmers\n" +
                "--------------------------------------\n" +
                "- The generator can produce " +
                ConstantValues.firstNick.length * ConstantValues.lastNick.length + " unique names";

        System.out.println(sb);
        for(int i=0; i< people.length; i++){
            System.out.format("%3s%s%16s%s%n", i + 1 + ".", people[i].getName(), "a.k.a. ", people[i].getNickName());
        }
    }
}