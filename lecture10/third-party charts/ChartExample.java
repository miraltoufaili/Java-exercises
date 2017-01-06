import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;

// EXAMPLE: This must be run on your computer -- doesn't work on cloud9 because
// you can't open new windows on it
//
// This is how you can use a third party library in java
// A jar is like a zip folder full of classes.
// I downloaded the xchart jar from here http://knowm.org/open-source/xchart/
// and used the documentation to create a chart from an array of data
// compile and run with the commands:
// javac -classpath .:xchart-3.1.0.jar ChartExample.java
// java  -classpath .:xchart-3.1.0.jar ChartExample
class ChartExample
{

    public static void main(String[] args)
    {
        int[] array = { 3, 4, 0, 2, 9, 7, 1, 6, 8, 5};
        barChart("some numbers", array);
    }

    public static void barChart(String title, int[] arr) 
    {
        // Add chart info to the builder object
        CategoryChartBuilder builder = new CategoryChartBuilder();
        builder.width(800);
        builder.height(600);
        builder.title("Int array values");
        builder.xAxisTitle("Index");
        builder.yAxisTitle("Number");

        // Add data and title to the chart
        CategoryChart chart = builder.build();
        chart.addSeries(title, null, arr);

        // display the chart:
        new SwingWrapper(chart).displayChart();
    }
}
