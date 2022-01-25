/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackney.tollbooth;

/**
 *
 * @author Edward Hackney
 */
public class Tolls {
    private int people;
    private int axelAmount;
    private boolean electric;
    
    public Tolls(boolean electric, int people, int axelAmount){
        this.people = people;
        this.axelAmount = axelAmount;
        this.electric = electric;
    }
    public String getToll(){
        double cost = 5;
        if( people >= 3){
            cost -= 3;
        }
        if(axelAmount >= 3){
            cost += (axelAmount - 2) * 2;
        }
        if(electric){
            cost = cost/2;
        }
        return "" + cost * 1.1;
    }
    
}
