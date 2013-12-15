/**
 * Description of the project
 *
 * @version 0.03
 * @author OmiCrown
 */
import java.util.LinkedList;

/**
 *
 * @author Omicrown
 */
public class MyLinkedList {

    private LinkedList<Integer> ll;

    /**
     *
     */
    public MyLinkedList() {
    }

    /**
     *
     * @param e
     */
    public void add(Integer e) {
        ll.add(e);
    }

    /**
     *
     * @param e
     * @param element
     */
    public void add(Integer e, Integer element) {
        ll.add(e, element);
    }

    /**
     *
     * @param e
     */
    public void addFirst(Integer e) {
        ll.addFirst(e);
    }

    /**
     *
     * @param e
     */
    public void addLast(Integer e) {
        ll.add(e);
    }

    /**
     *
     * @param index
     * @return
     */
    public Integer get(int index) {
        return ll.get(index);
    }

    /**
     *
     * @return
     */
    public Integer getFirst() {
        return ll.getFirst();
    }

    /**
     *
     * @return
     */
    public Integer getLast() {
        return ll.getLast();
    }

    /**
     *
     * @param index
     * @return
     */
    public Integer remove(int index) {
        return ll.remove(index);
    }

    /**
     *
     * @return
     */
    public Integer removeFirst() {
        return ll.removeFirst();
    }

    /**
     *
     * @return
     */
    public Integer removeLast() {
        return ll.removeLast();
    }

    /**
     *
     * @param index
     * @param element
     */
    public void set(int index, Integer element) {
        Integer el;
        el = ll.set(index, element);
    }

    /**
     *
     * @return
     */
    public int size() {
        return ll.size();
    }
    
    /**
     *
     * @param o
     * @return
     */
    public int indexOf(Integer o){
        return ll.indexOf(o);
    }
}
