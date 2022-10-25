package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> actual1 = App.take(numbers1, 3);
        assertThat(actual1).isEqualTo(Arrays.asList(1, 2, 3));

        List<Integer> actual2 = App.take(numbers1, 7);
        assertThat(actual2).isEqualTo(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> actual3 = App.take(numbers1, 0);
        assertThat(actual3).isEqualTo(Arrays.asList());

        List<Integer> numbers2 = new ArrayList<>();
        List<Integer> actual4 = App.take(numbers2, 2);
        assertThat(actual4).isEqualTo(Arrays.asList());
        // END
    }
}
