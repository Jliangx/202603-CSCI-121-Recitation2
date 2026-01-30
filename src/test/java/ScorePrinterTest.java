import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ScorePrinterTest {

    @Test
    @DisplayName("[1] test printWeightedScore")
    void printWeightedScore() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        ScorePrinter.printWeightedScore(89, 35, 30, 70);

        String expected =
                "Homework Score and Exam Score: 89 35\n" +
                        "Homework Weight and Exam Weight: 30 70\n" +
                        "Homework contribution: 26.7\n" +
                        "Exam contribution: 24.5\n" +
                        "Final score: 51.2\n";
        String actual = out.toString();
        String message = "Test Failed!\nExpecting:\n"+expected+"\nActual:\n"+actual;
        assertTrue(Pattern.compile(expected.replaceAll("\\s",""))
                        .matcher(actual.replaceAll("\\s","")).find(),
                message);
    }
}