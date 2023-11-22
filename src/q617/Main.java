package q617;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            Person person = new Person(name, height);
            personList.add(person);
        }
        Person shortestPerson = null;
        int minHeight = Integer.MAX_VALUE;

        for (Person person : personList) {
            if (person.getHeight() < minHeight) {
                shortestPerson = person;
                minHeight = person.getHeight();
            }
        }
        System.out.println(shortestPerson.getName() + " " + shortestPerson.getHeight());
    }
}
