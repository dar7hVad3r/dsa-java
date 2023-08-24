package sangram.dsa;

public class DoublyLinkedList<T> {
  class Node <T> {
    Node(T data, Node <T> next, Node <T> prev) {
      this.data = data;
      this.next = next;
      this.prev = prev;
    }

    Node<T> prev;
    Node<T> next;
    T data;
  }
  private Integer size = 0;
  private Node<T> head;
  private Node<T> tail;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public boolean isEmpty() {
    return this.size == 0;
  }

  public Integer size() {
    return this.size;
  }
  
  public T addLast(T data) {
    if (this.isEmpty()) this.head = this.tail = new Node<T>(data, null, null);
    else {
      this.tail.next = new Node<T>(data, null, this.tail);
      this.tail = this.tail.next;
    }
    size++;
    return data;
  }

  public T add(T data) {
    return addLast(data);
  }
 
  public void setSize(Integer size) {
    this.size = size;
  }
  public Node<T> getHead() {
    return head;
  }
  public void setHead(Node<T> head) {
    this.head = head;
  }
  public Node<T> getTail() {
    return tail;
  }
  public void setTail(Node<T> tail) {
    this.tail = tail;
  }

  public void print() {
    Node<T> trav = head;
    while(trav != null) {
      System.out.println(trav.data);
      trav = trav.next;
    }
  }
}