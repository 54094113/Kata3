package kata3;

public class Kata3 {

public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("google.es");
        histogram.increment("gmail.es");
        histogram.increment("google.com");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        histogram.increment("gmail.es");
        
        new HistogramDisplay(histogram).execute();
    }
}
