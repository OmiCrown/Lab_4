/**
 * Description of the project
 *
 * @version 0.05
 * @author OmiCrown
 */

package org.kudryavtsev;

import java.util.LinkedList;

public class MyLinkedList {

    private LinkedList<Integer> ll;

    /**
     *
     */
    public MyLinkedList() {
        ll = new LinkedList<>();
        
    }

    /**
     *
     * @param e
     */
    public void add(Integer e) {
        ll.add(e);
    }

    /**
     * хм.. Делать обработку исключений IndexOutOfBoundsException?
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
     * Делать обработку исключений IndexOutOfBoundsException?
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
     * Делать обработку исключений IndexOutOfBoundsException?
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
     *  Поскольку в задании set без возврата, 
     * то мы меняем элемент на нужный, 
     * а старый назад не возвращаем
     * 
     *    Делать обработку исключений IndexOutOfBoundsException?
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
