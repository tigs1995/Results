package ResultsExercise.Results;

import ResultsCalculator.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator myResults = new Calculator();
        myResults.results(53,  67,  80);
        myResults.percentage(100,  100,  59);
    }
}
