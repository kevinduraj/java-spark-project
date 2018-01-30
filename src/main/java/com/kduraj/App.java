package com.kduraj;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * Java Spark Project 
 *
 */
public class App 
{
    public static void main( String[] args ) {

        plain_old_java();
    }

    private static void plain_lambda() {

//        String path = "README.md";
//        System.out.println("Trying to open: " + path);
//
//        JavaRDD<String> jrdd = sc.textFile(path.toString());
//
//        // Number of lines
//        System.out.println("# lines: " + jrdd.count() );
//
//        // Number of lines with more than 5 words
//        System.out.println("# > 5 words: " + jrdd.filter(line -> line.split(" ").length > 5 ).count() );
//
//        // Number of lines which contains the word "Spark"
//        System.out.println("# contains Spark: " + jrdd.filter(line -> line.contains("Spark") ).count() );

    }
    private static void plain_old_java() {

        System.out.println( "Java Spark Project" );
 
        SparkConf conf = new SparkConf().setAppName("JavaSparkProject").setMaster("local[2]");
        JavaSparkContext sc = new JavaSparkContext(conf);
        sc.setLogLevel("WARN");
        String path = "linescount.txt";
 
        System.out.println("Trying to open: " + path);
 
        JavaRDD<String> lines = sc.textFile(path.toString());
        System.out.println("Lines count: " + lines.count());
        sc.stop();

    }
}
