package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class VehicleTest {
    
    public static void main(String[] args) {
        
        // create IOC container
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppConfig.class);
        
        // get Vehicle bean
        Vehicle vehic = ctx.getBean("vehicle", Vehicle.class);
        
        // call method
        vehic.journey("Hyd", "Goa");
        
        // close context
        ctx.close();
    }
}
