package com.advanced.dataStructures.linear.queues;
public class Queue {
    private static final int MAX_SIZE = 10;
    private int[] arr = new int[MAX_SIZE]; // This is the array for the queue
    private int front;
    private int rear;
    public Queue(){
        front = rear = -1; // Initially the queue is empty
    }
    public boolean isFull(){
        return rear == MAX_SIZE - 1;
    }
    public boolean isEmpty(){
        return (front == -1 && rear == -1);
    }
    public void enqueue(int element){
        if(isFull()){
            System.out.println("Queue is full. Can't add more elements.");
            return;
        }
        else if(isEmpty()){ // If empty, move front & rear from -1 to 0
            front = rear = 0;
        }else { // If there are multiple elements, increment rear by +1
            rear++;
        }
        arr[rear] = element; // Insert the element at the rear index
        System.out.println("The enqueued element is: " + element);
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty, can't remove elements.");
        }else if(front == rear){
            front = rear = -1; // We shift to 0 index & lose access to the single element
        }else {
            front++; // Remove access for the oth index value (Front Element)
        }
    }
    public int getFront(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }else {
            return arr[front];
        }
    }
    public int getRear(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }else {
            return arr[rear];
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty. No elements to display.");
            return;
        }
        for (int i=front; i <= rear; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // This is to go to the next line
    }
    public int size(){
        if(isEmpty()){
            return 0;
        }
        return rear - front + 1;
    }
    public static void main(String[] args) {
        Queue queue = new Queue();
        int[] arr = {10,13,67,9,5};
        for (int num : arr){
            queue.enqueue(num);
        }
        queue.display();
        System.out.println("Front Element: " + queue.getFront());
        System.out.println("Back Element: " + queue.getRear());
        System.out.println("Size: " + queue.size());
        queue.dequeue();
        queue.display();
        System.out.println("Size: " + queue.size());
    }
}
