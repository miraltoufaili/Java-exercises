import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import org.knowm.xchart.XYSeries;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import java.awt.Color;
import java.util.Random;

class ChartExample2
{
    public static void main(String[] args)
    {
        int[] bigUnsorted = S1ArrayUtils.randomArray(12500);
        scatterPlot("unsorted array", bigUnsorted);

        int[] sorted = S1ArrayUtils.sortedArray(100);
        barChart("sorted array", sorted);

        int[] unsorted = S1ArrayUtils.randomArray(100);
        barChart("unsorted array", unsorted);
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


    public static void scatterPlot(String title, int[] arr) 
    {
        // Add chart info to the builder object
        XYChartBuilder builder = new XYChartBuilder();
        builder.width(800);
        builder.height(600);
        builder.title("Int array values");
        builder.xAxisTitle("Index");
        builder.yAxisTitle("Number");

        // Add data and title to the chart
        XYChart chart = builder.build();
        chart.getStyler().setDefaultSeriesRenderStyle(XYSeriesRenderStyle.Scatter);
        chart.getStyler().setMarkerSize(2);

        XYSeries series = chart.addSeries(title, null, arr);
        series.setMarkerColor(Color.BLACK);

        // display the chart:
        new SwingWrapper(chart).displayChart();
    }


}
