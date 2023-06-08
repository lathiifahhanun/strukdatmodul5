
package latihan;


public class Main {

    
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        
        pohon.NewNode(1);
        pohon.NewNode(5);
        pohon.NewNode(23);
        pohon.NewNode(7);
        pohon.NewNode(100);
        
        System.out.print("\nPre Order : ");
        pohon.preOrder(pohon.root);
        
        System.out.print("\nIn Order : ");
        pohon.inOrder(pohon.root);
        
        System.out.print("\nPostOrder : ");
        pohon.postOrder(pohon.root);
    }
    
}
