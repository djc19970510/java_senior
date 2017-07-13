package chapter21;

public class GenericStack<E> {
  private int size = 0;
  private int max = 10;
  private E[] e = (E[]) new Object[this.max];
  public int getSize(){
    return this.size;
  }
  public E peek(){
    return e[size-1];
  }

  public void push(E o){
    if(size==max){
      extend();
    }
    e[size++] = o;
  }

  private void extend(){
    E[] n = (E[]) new Object[this.max*2];
    this.max *= 2;
    for (int i=0;i<size;i++){
      n[i]=e[i];
    }
    e = n;
  }

  public E pop(){
    E result = e[size-1];
    size--;
    return result;
  }

  public boolean isEmpty(){
    return size==0;
  }
//  private java.util.ArrayList<E> list = new java.util.ArrayList<E>();
//
//  public int getSize() {
//    return list.size();
//  }
//
//  public E peek() {
//    return list.get(getSize() - 1);
//  }
//
//  public void push(E o) {
//    list.add(o);
//  }
//
//  public E pop() {
//    E o = list.get(getSize() - 1);
//    list.remove(getSize() - 1);
//    return o;
//  }
//
//  public boolean isEmpty() {
//    return list.isEmpty();
//  }
}
