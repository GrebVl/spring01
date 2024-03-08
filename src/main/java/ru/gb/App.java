package ru.gb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person person = new Person();
        person.setSurname("Ivanov");
        person.setFirstname("Ivan");
        System.out.println(person.toString());
    }
}
