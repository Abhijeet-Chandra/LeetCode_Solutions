class MyCircularQueue {
    int [] queue;
    int front = 0;
    int rear = -1;
    int n;
    int currentSize = 0;
    public MyCircularQueue(int k) {
        queue = new int[k];
        this.n = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull())return false;
        rear = (rear+1)%n;
        queue[rear] = value;
        currentSize++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        front = (front+1)%n;
        currentSize--;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return currentSize==0;
    }
    
    public boolean isFull() {
        return currentSize==n;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */