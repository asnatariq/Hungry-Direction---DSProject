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

class Area{
String areaName;

BinarySearchTree bbq;
BinarySearchTree chinese;
BinarySearchTree continental;
public Area(String areaName,BinarySearchTree b,BinarySearchTree chinese,BinarySearchTree continental){
    this.areaName=areaName;
    this.bbq=b;
    this.chinese=chinese;
    this.continental=continental;
}
public void setArea(String area){
    this.areaName=area;
    
}
String getArea(){
    return this.areaName;
}

}
