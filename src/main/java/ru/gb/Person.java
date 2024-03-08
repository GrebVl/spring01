package ru.gb;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private int id;
    private String firstname;
    @Setter(AccessLevel.PROTECTED)
    private String surname;
}
