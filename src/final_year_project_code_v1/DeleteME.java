/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/




package final_year_project_code_v1;

/**
 *
 * @author Muhammad Yahya
 */

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;

public class DeleteME extends JFrame
{
    private JTree tree;
    
    public DeleteME()
    {
        
        ArrayList<String> x =  new ArrayList<>();
        
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("d");
        x.add("a");
        x.add("e");
        x.add("a");
        x.add("f");
        x.add("a");
        x.add("g");        
//create the root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        //create the child nodes
        DefaultMutableTreeNode vegetableNode = new DefaultMutableTreeNode("Vegetables");
        vegetableNode.add(new DefaultMutableTreeNode("Capsicum"));
        vegetableNode.add(new DefaultMutableTreeNode("Carrot"));
        vegetableNode.add(new DefaultMutableTreeNode("Tomato"));
        vegetableNode.add(new DefaultMutableTreeNode("Potato"));
        
        DefaultMutableTreeNode fruitNode = new DefaultMutableTreeNode("Fruits");
        fruitNode.add(new DefaultMutableTreeNode("Banana"));
        fruitNode.add(new DefaultMutableTreeNode("Mango"));
        fruitNode.add(new DefaultMutableTreeNode("Apple"));
        fruitNode.add(new DefaultMutableTreeNode("Grapes"));
        fruitNode.add(new DefaultMutableTreeNode("Orange"));
        
        
        DefaultMutableTreeNode fNode;
        for (int i = 0; i < 2; i++) {
            
            fNode = new DefaultMutableTreeNode("Fruits");
            for (int j = 0; j < x.size(); j++) {
                
                fNode.add(new DefaultMutableTreeNode(x.get(j)));
                System.out.println("arraylist"+x.get(j));
            }  
            
            root.add(fNode);
        }
        
        System.out.println("fnode    :" +"fnode");
        
        
        //add the child nodes to the root node
        root.add(vegetableNode);
        root.add(fruitNode);
        
        //create the tree by passing in the root node
        tree = new JTree(root);
        add(tree);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JTree Example");
        this.pack();
        this.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DeleteME();
            }
        });
    }
}



