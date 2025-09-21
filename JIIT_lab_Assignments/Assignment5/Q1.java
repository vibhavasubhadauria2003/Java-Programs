// 1.Create an enum TrafficLight with constants RED, YELLOW, and GREEN. Each constant
// should have a duration associated with it. Write a program to simulate a traffic light system.

//package JIIT_lab_Assignments.Assignment5;

enum TrafficLight{
    RED,
    YELLOW,
    GREEN
}

public class Q1 {
    public static void main(String args[]){
         
         for(TrafficLight light1:TrafficLight.values()){
            switch (light1) {
                case GREEN:
                    System.out.println(light1);
                    System.out.println("Go");
                    break;
                case YELLOW:
                    System.out.println(light1);
                    System.out.println("Ready");
                    break;
                case RED:
                    System.out.println(light1);
                    System.out.println("Stop");
                    break;
            
                default:
                    break;
            }
         }
    }
}
