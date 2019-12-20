package challenges;

import java.util.NoSuchElementException;

public class LinkedList {
 private Node headNode,trailNode;

 public LinkedList() {
     this.headNode=null;
     this.trailNode=null;
 }

 public boolean insert(String val) {
     if (this.headNode==null){
         //first element in the linked list
         this.headNode = new Node(val);
         this.trailNode = new Node(val);
     }
     else {
         Node newNode = new Node(val);
         newNode.setNode(this.trailNode);
         this.trailNode = newNode;
     }
     return true;
 }
 @Override
 public String toString() {
     String newString="";
     Node currentNode = this.trailNode;
     //iterate the nodes to makeup a string with all values
     while(currentNode!= null) {
         newString = currentNode.getValue() +  " -> " + newString;
         currentNode = currentNode.getNext();
     }
     return newString + "NULL";
 }

 public String pop() {
     //no nodes validation
     if(this.headNode==null)
     {
         throw new NoSuchElementException();
     }
     //if node is last node
     else if(this.trailNode.getNext()==null){
        this.headNode=null;
         String val = trailNode.getValue();
         this.trailNode = this.trailNode.getNext();
         return val;
     }
     else {
         String val = trailNode.getValue();
         this.trailNode = this.trailNode.getNext();
         return val;
     }
 }
}
