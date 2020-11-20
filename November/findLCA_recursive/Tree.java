import javax.swing.tree.TreeNode;

public class Tree<T> {
    public Node<T> root;
    public Tree(){
    }

    class MyBool{
        boolean bool;
        public MyBool(boolean bool)
        {
            this.bool = bool;
        }
    }

    public Node<T> DoFindLCA(Node<T> node1,Node<T> node2)
    {
        MyBool is1 = new MyBool(false);
        MyBool is2 = new MyBool(false);


        Node lca = findLCA(root, node1, node2, is1, is2);

        if (is1.bool == true && is2.bool == true) {
            return lca;
        } else if (is1.bool == true && is2.bool != true) {
            System.out.println("Second input is not present");
        } else if (is2.bool == true && is1.bool != true) {
            System.out.println("First input is not present");
        }else if (is1.bool != true && is2.bool != true) {
            System.out.println("First input and second input are not present");
        }
        return null;
    }

    public Node<T> findLCA(Node<T> current, Node<T> node1,Node<T> node2, MyBool is1, MyBool is2){

        if (current == null) {
            return null;
        }
        Node temp = null;

        if (current == node1) {
            is1.bool= true;
            temp = current;
        }

        if (current == node2)
        {
            is2.bool = true;
            temp = current;
        }

        Node left_lca = findLCA(current.leftChild, node1, node2, is1, is2);
        Node right_lca = findLCA(current.rightChild, node1, node2, is1, is2);

        if (temp != null)
            return temp;

        if (left_lca != null && right_lca != null)
            return current;

        if (left_lca != null){
            return left_lca;
        }
        if(right_lca != null){
            return right_lca;
        }
        return null;
    }

    public static void main(String args[])
    {
        Tree tree = new Tree();
        Node<Integer> node1 = new Node<Integer>(1);
        tree.root = node1;
        Node<Integer> node2 = new Node<Integer>(2);
        tree.root.leftChild = node2;
        Node<Integer> node3 = new Node<Integer>(3);
        tree.root.rightChild = node3;
        Node<Integer> node4 = new Node<Integer>(4);
        tree.root.leftChild.leftChild = node4;
        Node<Integer> node5 = new Node<Integer>(5);
        tree.root.leftChild.rightChild = node5;
        Node<Integer> node6 = new Node<Integer>(6);
        tree.root.rightChild.leftChild = node6;
        Node<Integer> node7 = new Node<Integer>(7);
        tree.root.rightChild.rightChild = node7;
        Node<Integer> node8 = new Node<Integer>(8);
        Node<Integer> node10 = new Node<Integer>(10);
        Node<Integer> node12 = new Node<Integer>(12);

        Node lca = tree.DoFindLCA(node2, node7);
        if (lca != null)
            System.out.println("LCA(2, 7) = " + lca.value);

        lca = tree.DoFindLCA(node2, node8);
        if (lca != null)
            System.out.println("LCA(2, 8) = " + lca.value);
//
        lca = tree.DoFindLCA(node3, node3);
        if (lca != null)
            System.out.println("LCA(3, 3) = " + lca.value);
//
        lca = tree.DoFindLCA(node3, node7);
        if (lca != null)
            System.out.println("LCA(3, 7) = " + lca.value);
//
        lca = tree.DoFindLCA(node10, node12);
        if (lca != null)
            System.out.println("LCA(10, 12) = " + lca.value);
//
       lca = tree.DoFindLCA(node1, node2);
        if (lca != null)
           System.out.println("LCA(1, 2) = " + lca.value);
    }

}
