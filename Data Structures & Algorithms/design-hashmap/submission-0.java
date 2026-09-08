class MyHashMap {
   private final static int SIZE=1009;
    private class Node{
        int key;
        int value;
        Node next;

        public Node(int k, int v){
            this.key=k;
            this.value=v;
        }
    }
    private Node[] buckets;

    private int hash(int key){
        return key%SIZE;
    }
    public MyHashMap() {
        buckets=new Node[SIZE]; // create buckets of some size and of Node type    
    }
    
    public void put(int key, int value) {
        int index=hash(key);
        Node current=buckets[index];
        while(current!=null){
            if(current.key==key){
                current.value=value;
                return; //just updating if already exists , that's what map do
            }
            //if not current Node , search the next in chain
            current=current.next;
        }
        //as the current is null at this point ,means this is a new pair in this bucket
        Node newNode=new Node(key,value);
        newNode.next=buckets[index];
        buckets[index]=newNode;
        
    }
    
    public int get(int key) {
        int index=hash(key);
        Node current=buckets[index];
        while(current!=null){
            if(current.key==key){
                return current.value;
            }
            current=current.next;
        }
        return -1;
        
    }
    
public void remove(int key) {
        int index = hash(key);

        Node current = buckets[index];
        Node previous = null;

        while (current != null) {

            if (current.key == key) {

                if (previous == null) {
                    // Removing first node
                    buckets[index] = current.next;
                } else {
                    // Removing middle/last node
                    previous.next = current.next;
                }

                return;
            }

            previous = current;
            current = current.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */