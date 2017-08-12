package main;


import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

public class Application {
   
    public static void main(String[] args) {
        Spark.port(8080);
        Spark.get("/", (req, res) -> {
            Map values = new HashMap();
            values.put("title", "helloworld");
            values.put("message", "Welcome to your first website");
            
            return new ModelAndView(values, "src/main/templates/index.html");
        }, new MustacheTemplateEngine());
    }
}
