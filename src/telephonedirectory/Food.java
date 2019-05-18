/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonedirectory;

//import java.util.ArrayList;

/**
 *
 * @author hp
 */
class Food  {
    String foodType;
    Cities[] city;
    public Food(String type,Cities[] c){
        this.foodType=type;
    city=c;
    }
    
    public void setType(String type){
        this.foodType=type;
    }
    public String getType(){
        return foodType;
    }
}
 
