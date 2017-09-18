
class ILinkedList<T> implements ILinkedInterface <T>{
    
    private ILinkedList<T> next;
    private ILinkedList<T> temp;
    private T value;
    
    public ILinkedList (T data){
        value = data;
        
    }//constructor

    
    @Override
    public ILinkedList<T> next() {
      ILinkedList<T> newNode = next;
      return newNode;
        
    }

    @Override
    public ILinkedList<T> last() {
        ILinkedList<T> l1 = this;
        while(l1.next != null){
            l1 = l1.next;
        }
        return l1;
    }

    @Override
    public ILinkedList<T> after(int n) {
        ILinkedList<T> l1 = this;
        while(n != 0){
            l1 = l1.next;
            n--;
        }
        return l1;
    }

    @Override
    public ILinkedList<T> detach() {
        ILinkedList<T> list = this;
        ILinkedList<T> t = this.next;
        this.next = null;
        return t;
    }

    @Override
    public T get() {
        return value;
    }

    @Override
    public void set(T value) {
        this.value = value;
    }

    @Override
    public void setNext(ILinkedList<T> next) {
        this.next = next;
    }

    @Override
    public void append(ILinkedList<T> next) {
        ILinkedList<T> l1 = this;
        l1 = l1.last();
        l1.next= next;
    }

    @Override
    public void insert(ILinkedList<T> newFirst) {
        ILinkedList<T> l1 = this;
        newFirst.next = this;      
    }
    
}
