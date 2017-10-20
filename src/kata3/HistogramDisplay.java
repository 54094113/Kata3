
package kata3;

import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends  ApplicationFrame{

    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel()); 
        pack();
    }
    
    public void execute(){
        setVisible(true);
    }
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(
                createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart =
                ChartFactory.createBarChart(
                "JFreeChart", 
                "", 
                "Numero ", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                false, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled);
        return chart;
    }
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = 
                new DefaultCategoryDataset();
        dataSet.addValue(12, "", "gmail.com");
        dataSet.addValue(64, "", "hotmail.com");
        dataSet.addValue(567, "", "ulpgc.es");
        return dataSet;
    }
        
}
