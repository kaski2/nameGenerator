public class Main {



    public static void main(String[] args) {
        Person[] people = new Person[12];

        for(int i=0; i<people.length; i++){
            people[i] = new Person(ConstantValues.names[i]);
        }

        for(Person person : people){
            System.out.println(person.getNickName());
        }
        StringBuilder sb = new StringBuilder();
    }

}