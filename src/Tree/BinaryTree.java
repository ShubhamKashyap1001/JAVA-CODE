package Tree;
import java.util.Scanner;
public class BinaryTree {
    BinaryTree(){

    }

    private static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val = val;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int val = scanner.nextInt();
        root = new Node(val);
        populate(scanner,root);
    }

    private void populate(Scanner scanner , Node node){
        System.out.println("Do you want to enter left of "+ node.val);
        boolean left = scanner.nextBoolean();
        if(left){
            System.out.println("Enter the value of the left of: " +node.val);
            int val = scanner.nextInt();
            node.left = new Node(val);
            populate(scanner,node.left);
        }

        System.out.println("Do you want to enter rigth of "+node.val);
        boolean right = scanner.nextBoolean();
        if(right){
            System.out.println("Enter the value of the right of "+ node.val);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner,node.right);
        }

    }

    public void display(){
        display(this.root,"");
    }

    private void display(Node node,String indent){
        if(node == null){
            return;
        }
        System.out.println(indent+node.val);
        display(node.left,indent+"\t");
        display(node.right,indent+"\t");
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }

    public void prettyDisplay(Node node,int level){
        if(node == null){
            return;
        }
        prettyDisplay(node.right,level+1);

        if(level !=0){
            for(int i = 0; i<level-1;i++){
                System.out.println("|\t\t");
            }
            System.out.println("|------->"+node.val);
        }else{
            System.out.println(node.val);
        }
        prettyDisplay(node.left,level+1);
    }

    //traversal
    //preOrder

    public void preOrder(Node node){
        if(node == null){
            return;
        }
        System.out.println(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //inOrder
    public void inOrder(Node node){
        if(node == null){
            return;
        }
        preOrder(node.left);
        System.out.println(node.val + " ");
        preOrder(node.right);
    }

    public void postOrder(){
        preOrder(root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        preOrder(node.left);
        preOrder(node.right);
        System.out.println(node.val+ " ");
    }

}


