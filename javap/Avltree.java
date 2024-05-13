//balanced and left and rotate.
import java.util.*;
public class Avltree {
    public static void main(String[] args) {
    //Scanner sc=new Scanner(System.in);
    BST b=new BST();
    b.insert(50);
     b.insert(60);
      b.insert(70);
           b.inord(b.root);
    }
}
class BST{
  node root;
  class node{
    int data,height;
    node left,right;
    node(int val){
      data=val;
      height=0;
      left=right=null;
    }
  }
   //inorder
  void inord(node root){
    if(root!=null){
      inord(root.left);
      System.out.println(root.data+" height ofd the node is:  "+root.height);
      inord(root.right);
    }

  }
BST(){
    root=null;
  }
public int getheight(node node)
  {
      if(node==null)
      return -1;
      return node.height;
  }
//   public int max(int a,int b)
//   {
//       return a>b?a:b;
//   }
  //data insertion
   public void insert(int value){
    root=insValue(root,value);
  }
   public node insValue(node ref,int value){
    if(ref==null)
    {
      ref=new node(value);
     
      return ref;
    }
    if(ref.data<value)
    ref.right=insValue(ref.right,value);
    else if(ref.data>value)
    ref.left=insValue(ref.left,value);
    else
    return ref;
    
    ref.height=1+Math.max(getheight(ref.left),getheight(ref.right));
    if(value==40)
    System.out.println("the height of" +ref.data+ "is" +ref.height);
    int balfactor=getbalancefactor(ref);
    //ll case 
    if(balfactor>1&&value<ref.left.data)
    {
        return rightrotate(ref);
        
    }
    //lr case 
    if(balfactor>1&&value>ref.left.data)
    {
        ref.left=leftrotate(ref.left);
        return rightrotate(ref);
    }
    //rr case 
    if(balfactor<-1&& value > ref.right.data)
    {
        return leftrotate(ref);
    }
     //rl case 
    if(balfactor<-1&& value < ref.right.data)
    {
        ref.right=rightrotate(ref.right);
        return leftrotate(ref);
    }
        
    return ref;
  }
  private node rightrotate(node z)
  {
      node y=z.left;
      node t3=y.right;
      
      y.right=z;
      z.left=t3;
      
      z.height=1+Math.max(getheight(z.left),getheight(z.right));
       y.height=1+Math.max(getheight(y.left),getheight(y.right));
  return y;
      
  }
  private node leftrotate(node z)
  {
      node y=z.right;
      node t3=y.left;
      
      y.left=z;
      z.right=t3;
      
       z.height=1+Math.max(getheight(z.left),getheight(z.right));
       y.height=1+Math.max(getheight(y.left),getheight(y.right));
  return y;
      
  }
 private int  getbalancefactor(node temp){
      if(temp==null)
      return 0;
      return getheight(temp.left)-getheight(temp.right);
  }
}