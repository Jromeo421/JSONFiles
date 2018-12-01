/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author JJHugh
 */
public class JSONExercise {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"unchecked", "unchecked"})
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Client's Name: ");
        String client = input.nextLine();
        
         //create a new JSON object
        JSONObject root = new JSONObject();
        
        //put the name name-value pair
        root.put("client", client);
        
        JSONArray services = new JSONArray();
        
        while(true){
           
        //getting the course name
        System.out.print("Enter Service type: ");
        String service = input.nextLine();
        
        //check to see if user hits Enter
        if (service.length() == 0){
            break;
        }
        //getting the grade
        System.out.print("Enter price: ");
        int price = input.nextInt();
        
        if(input.hasNextLine()){
            input.nextLine();
        }
        //create a JSON array and store a class object.
        JSONObject serviceObject = new JSONObject();
        serviceObject.put("price", price);
        serviceObject.put("client", service);
        
        //adding the course to the array.
        services.add(serviceObject);
        }
        
        //add the array to the root object.
        root.put("services", services);
        
        System.out.println(root.toJSONString());
        //creating a file and writing the JSON structure to it.
        File file = new File("ClientServices.txt");
        
        try (PrintWriter writer = new PrintWriter(file)){
            writer.print(root.toJSONString());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        System.out.println("File Created Successfully\n\n Hit Return to display");
        input.nextLine();
        
        try {
            input = new Scanner(file);
            
            StringBuilder jsonIn = new StringBuilder();
            
            while(input.hasNextLine()){
                
                jsonIn.append(input.nextLine());
            }
            System.out.print(jsonIn.toString());
            
            JSONParser parser = new JSONParser();
            
            JSONObject objRoot = (JSONObject) parser.parse(jsonIn.toString());
            System.out.printf("Client's name is %s\n", objRoot.get("client").toString());
            JSONArray servicesIn = (JSONArray) objRoot.get("services");
            
            for (int i = 0; i < servicesIn.size(); i++){
                JSONObject serviceIn = (JSONObject) servicesIn.get(i);
                long priceIn = (long) serviceIn.get("price");
                String clientIn = (String) serviceIn.get("client");
                System.out.printf("Service %s; price %d\n", clientIn, priceIn);
                }
            
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());
        } catch (ParseException ex) {
            System.out.println(ex.toString());
        }
        }
    }