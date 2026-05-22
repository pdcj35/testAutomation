package examples;

import io.karatelabs.core.Runner;
import io.karatelabs.core.SuiteResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ExamplesTest {

    @Test
    void testAll() {
        SuiteResult result = Runner.path(
                "classpath:examples/signup.feature",
                "classpath:examples/login.feature")
            .outputHtmlReport(true)
            .parallel(1);
        assertTrue(result.isPassed());
    }
}