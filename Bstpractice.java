class Node{
    int value;
    Node right;
    Node left;
    Node root;
    public Node(int value){
        this.value = value;
        right = null;
        left = null;
    }
}
public class Bstpractice {
    public Node root;
    // public void insert(int value){
    //     if(root==null){
    //         root = new Node(value);
    //         return ;
    //     }
    //      Node current = root;
    //      Node parent = null;
    //      while(current!=null){
    //         parent = current;
    //         if(value<current.value){
    //             current = current.left;
    //         }
    //         else if(value>current.value){
    //             current = current.right;
    //         }
    //         else{
    //             return ;
    //         }
         
// }
//          Node newnode = new Node(value);
//          if (value < parent.value) {
//             parent.left = newnode;
//         } else {
//             parent.right = newnode;
//         }
public void insert(int value) {
    if (root == null) {
        root = new Node(value);
        return;
    }

    Node current = root;

    while (true) {
        if (value < current.value) {
            if (current.left == null) {
                current.left = new Node(value);
                break;
            } else {
                current = current.left;
            }
        } else if (value > current.value) {
            if (current.right == null) {
                current.right = new Node(value);
                break;
            } else {
                current = current.right;
            }
        } else {
                   return;
        }
    }
}

    public int max(){
        Node maxele = root;
        while(maxele.right!=null){
            maxele = maxele.right;
        }
        return maxele.value;
    } 
    public int min(){
         Node minele = root;
        while(minele.left!=null){
            minele = minele.left;
        }
        return minele.value;
    } 
}
