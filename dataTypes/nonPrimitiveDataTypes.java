package dataTypes;

public class nonPrimitiveDataTypes {
    public static void main(String[]args){
        String word = "Jaylen";
        System.out.println(word);

        //object
        int num = 21;
        Student Jaylen = new Student(word, num);
        System.out.println(Jaylen.name + " " + Jaylen.age);

        //array
        String[] family = {"Jaylen", "Quinn", "Aaliyah"};
        for (String name : family){
            System.out.println(name);
        }
    }
}
