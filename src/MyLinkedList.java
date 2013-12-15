/**
 * Description of the project
 *
 * @version 0.03
 * @author OmiCrown
 */
import java.util.LinkedList;

public class MyLinkedList {

    private LinkedList<Integer> ll;

    public MyLinkedList() {
    }

    public void add(Integer e) {
        ll.add(e);
    }

    public void add(Integer e, Integer element) {
        ll.add(e, element);
    }

    public void addFirst(Integer e) {
        ll.addFirst(e);
    }

    public void addLast(Integer e) {
        ll.add(e);
    }

    public Integer get(int index) {
        return ll.get(index);
    }

    public Integer getFirst() {
        return ll.getFirst();
    }

    public Integer getLast() {
        return ll.getLast();
    }

    public Integer remove(int index) {
        return ll.remove(index);
    }

    public Integer removeFirst() {
        return ll.removeFirst();
    }

    public Integer removeLast() {
        return ll.removeLast();
    }

    public void set(int index, Integer element) {
        Integer el;
        el = ll.set(index, element);
    }

    public int size() {
        return ll.size();
    }
    
    public int indexOf(Integer o){
        return ll.indexOf(o);
    }
}
