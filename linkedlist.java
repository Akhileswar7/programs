class node{
    public String data;
    public node next;
}
public class linkedlist {
    private int size=0;
    private node head;
    // public linkedlist(){
    //     this.head=null;
    // }
    public void insert(String i){
        node n=new node(),current;
        n.data=i;
        current=head;
        if(head==null){
            head=n;
            head.next=null;
        }else{
            while(current.next!=null){
                current=current.next;
            }
            current.next=n;
            n.next=null;
        }
    }
    public void insertAtStart(String i){
        node n=new node();
        n.data=i;
        n.next=head;
        head=n;
        }
    public void insertAtMiddle(String i,int pos){
        node n=new node();
        n.data=i;
        node current=head;
        if(head!=null && pos<size){
        for(int j=0;j<pos;j++){
            current=current.next;
        }
        n.next=current.next;
        current.next=n;
        }
}
public void traverse(){
    if(head==null){
        System.out.println("no ele");
    }else{
    node current=head;
        while(current.next!=null){
        System.out.println(current.data);
        current=current.next;
    }
}
}
public void deleteAtStart(){
    head=head.next;
}
public void DeleteAtEnd(){
    node current=head;
    while(current.next.next!=null){
        current=current.next;
    }
    current.next=null;
}
public void DeleteAtMiddle(int pos){
    if(head==null && pos<size){
        node current=head;
        for(int j=0;j<pos-1;j++){
            current=current.next;
        }
        current.next=current.next.next;
    }
}
public void find(String value) {
        node current = head;
        boolean flag = false;
        for(int i = 0; i <=size; i++) {
            if (current.data.equals(value)) {
                System.out.println("Element present at index " + i);
                flag = true;
                // break;
            }
            
            current = current.next;

        }
        if (!flag) {
            System.out.println("Element not present in Linked List");
        }

    }
    public static void main(String[] args) {
        linkedlist l=new linkedlist();
        l.insert("A");
        l.insert("B");
        l.insert("C");
        l.insertAtStart("Z");
        l.insertAtMiddle("S", 1);
        l.deleteAtStart();
        l.DeleteAtEnd();
        l.insert("A");
        l.insert("B");
        l.insert("C");
        l.DeleteAtMiddle(2);
        l.traverse();
        l.find("A");
    }
}
