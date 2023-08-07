public class StackArrayImpl {
    public static void main(String[] args) {
        
        myStack s = new myStack(10) ; 
        s.push(15) ; 
        s.push(20) ; 

        System.out.println(s.pop());

        System.out.println(s.size());
        
    }
}

class myStack{
    int[] arr ; 
    int cap ; 
    int top ; 

    myStack(int x){
        top = -1 ; 
        cap = x ; 
        arr = new int[cap] ; 
    }

    void push(int x){
        top++ ; 
        arr[top] = x ; 
    }
    int pop(){
        int temp = arr[top] ; 
        top-- ; 
        return temp ; 
    }
    int size(){
        return top+1 ; 
    }
    boolean isempty(){
        return (top==-1) ; 
    }

}