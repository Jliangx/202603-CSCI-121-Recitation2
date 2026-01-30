public class ScorePrinter {

    /*
     * Prints a weighted score summary.
     *
     * Output must look like:
     * Homework Score and Exam Score: <homeworkScore> <examScore>
     * Homework Weight and Exam Weight: <homeworkWeight> <examWeight>
     * Homework contribution: <homeworkPart>
     * Exam contribution: <examPart>
     */
    public static void printWeightedScore(
            int homeworkScore,
            int examScore,
            int homeworkWeight,
            int examWeight)

        int totalWeight = homeworkWeight + examWeight

        // TODO 1:
        // Print the homework score and exam score on one line.
        // Format:
        // Homework Score and Exam Score: <homeworkScore> <examScore>

        // TODO 2:
        // Print the homework weight and exam weight on one line.
        // Format:
        // Homework Weight and Exam Weight: <homeworkWeight> <examWeight>

        double homeworkPart =
                homeworkScore * homeworkWeight / totalWeight;

        double examPart =
                examScore * examWeight / totalWeight;

        System.out.println("Homework contribution: " + homeworkPart);
        System.out.println("Exam contribution: " + examPart);

        // TODO 3:
        // Print the final score.
        // Format:
        // Final score: <sum of homeworkPart and examPart>
    }
}

