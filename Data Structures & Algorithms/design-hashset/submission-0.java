class MyHashSet {
    private final static int SIZE=100;
    private LinkedList<Integer>[] bucket;

    public MyHashSet() {
        bucket=new LinkedList[SIZE];
        for(int i=0;i<SIZE;i++){
            bucket[i]=new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int index=key%SIZE;
        if(!bucket[index].contains(key)){
            bucket[index].add(key);
        }
        
    }
    
    public void remove(int key) {
        int index=key%SIZE;
        if(bucket[index].contains(key)){
            bucket[index].remove(Integer.valueOf(key));
        }
        
    }
    
    public boolean contains(int key) {
        int index=key%SIZE;
        return bucket[index].contains(key);    
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */