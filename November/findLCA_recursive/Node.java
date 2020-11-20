public class Node <T>
{
    T value;
    Node leftChild;
    Node rightChild;

    public Node(T item)
    {
        value = item;
        leftChild = null;
        rightChild = null;
    }
}
