import models.Person;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonTest {

    @Test
        //adnotacja
    void shouldCalculateCorrectSalary() {

        Person tomCruise = new Person("Tom", "Hanks");
        int actual = tomCruise.calculatSalary(3, 3);
        int expected = 9;

        // serce testu - asercja - porównaj expected = actual
        assertThat(actual).isEqualTo(expected);

//        //
//        assertThat(actual).isGreaterThan(15);


        //assertThat(actual).as("Błędnie wyliczone wynagrodzenie aktora.").isGreaterThan(15); //.as() - opis błędu


    }

    @Test
        void shouldCalculateBonus(){
        Person angelinaJolie = new Person("Angelina", "Jolie");
        int actual = angelinaJolie.giveBonus(3, 10);
        int expected = 20;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
    }

    @Test
        void shouldCalculateBonusGraterThan10() {
        Person angelinaJolie = new Person("Angelina", "Jolie");
        int actual = angelinaJolie.giveBonus(15, 10);
        int expected = 20;
        assertThat(actual).as("Bonus policzony nieprawidłowo").isEqualTo(expected);
    }

}
