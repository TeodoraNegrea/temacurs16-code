package ro.fasttrackit.temacurs16.ex1;

import org.junit.jupiter.api.Test;
import  static org.assertj.core.api.Assertions.*;

public class RecursionTest {
    @Test
    void testSum(){
        Recursion recursion = new Recursion();
        assertThat(recursion.sum(7)).isEqualTo(7);
        assertThat(recursion.sum(1234)).isEqualTo(1234);
        assertThat(recursion.sumEvenNumbers(4)).isEqualTo(3);
        assertThat(recursion.sumEvenNumbers(8)).isEqualTo(7);
        assertThat(recursion.palindrome("aer").compareTo("rea"));
        assertThat(recursion.palindrome("ana").compareTo("ana"));
        assertThat(recursion.digitSum(890)).isEqualTo(17);
        assertThat(recursion.fib(7)).isEqualTo(13);





    }
}
