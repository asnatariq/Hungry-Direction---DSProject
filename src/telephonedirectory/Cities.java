/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telephonedirectory;
/**
 *
 * @author hp
 */
public class Cities {
   String cityName;
   Area[] area;
   
public Cities(Area[]a,String Cityname){
   this.cityName=Cityname;
   this.area=a;
    
  }
public void setCity(String city){
    this.cityName=city;
  }
   
public String getCity(){
    return cityName;
   }
}