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

class BinarySearchTree {
 
    /* Class containing left and right child of current node and key value*/
    class RestaurantsNode {
    String contactNum;
    String nameofRes;
   
    
    RestaurantsNode left;
    RestaurantsNode right;
    
    public RestaurantsNode(String name,String contactNum){
        this.nameofRes=name;
        this.contactNum=contactNum;
     }
    
    }
 
    // Root of BST
    RestaurantsNode root;
 
    // Constructor
    BinarySearchTree() { 
        root = null; 
    }
 
    // This method mainly calls insertRec()
    void insert(String restname,String ContactNum) {
       root = insertRec(root, restname,ContactNum);
    }
     
    /* A recursive function to insert a new key in BST */
    RestaurantsNode insertRec(RestaurantsNode root, String name,String contactNum) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new RestaurantsNode(name,contactNum);
            
            return root;
        }
 
        /* Otherwise, recur down the tree */
        else if (name.compareToIgnoreCase(root.nameofRes)<0)
            root.left = insertRec(root.left, name,contactNum);
        else if (name.compareToIgnoreCase( root.nameofRes)>0){
            root.right = insertRec(root.right, name,contactNum);
        }
        /* return the (unchanged) node pointer */
        return root;
    }
 
    // This method mainly calls InorderRec()
    String inorder()  {
      return  inorderRec(root);
       
    }
 
    // A utility function to do inorder traversal of BST
   String  inorderRec(RestaurantsNode root) {
       String str="";
     //  while(root!=null ){
       if(root!= null) {
            inorderRec(root.left);
            //System.out.println(root.nameofRes+" "+root.contactNum);
            str=str+root.nameofRes+" --"+root.contactNum;
            //System.out.println(str);
            inorderRec(root.right);
            //str=str+root.nameofRes+" --"+root.contactNum;
        }
   
        return str;
    }
    public RestaurantsNode search(RestaurantsNode root, String name)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.nameofRes.equalsIgnoreCase(name)){
        System.out.println(root.nameofRes+" "+root.contactNum);
        return root;
    }
    // val is greater than root's key
    if (root.nameofRes.compareToIgnoreCase(name)>0){
        return search(root.left, name);
    }
    // val is less than root's key
    else{
    return search(root.right, name);
        }
}




}
