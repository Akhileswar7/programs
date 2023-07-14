import java.util.Stack;

public class QueueUsingtowstacks<T> {
    private Stack<T> insertionstack;
    private Stack<T> deletionstack;
    public QueueUsingtowstacks(){
        insertionstack=new Stack<>();
        deletionstack=new Stack<>();
    }
    public void Enqueue(T item){
        insertionstack.push(item);

    }
    public void Dequeue(){
        if(insertionstack.isEmpty()){
            System.out.println("Queue is empty");
        }else{
        for(;!insertionstack.isEmpty();){
            deletionstack.push(insertionstack.pop());
        }
        deletionstack.pop();
        for(;!deletionstack.isEmpty();){
            insertionstack.push(deletionstack.pop());
        }
    }
    }
    public void print(){
        System.out.println(insertionstack);
    }
    public static void main(String[] args) {
        QueueUsingtowstacks q=new QueueUsingtowstacks<>();
        q.Enqueue(5); 
        q.Enqueue(6);  
        q.Enqueue(3);
        q.Dequeue();
        q.print();
    }
}
