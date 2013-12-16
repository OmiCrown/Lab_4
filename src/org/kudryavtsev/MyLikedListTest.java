
/**
 *
 * @author Omicrown
 */
package org.kudryavtsev;

public class MyLikedListTest {

    public static void main(String[] args) {
        MyLinkedList mll;
        mll = new MyLinkedList();
        
        mll.add(1);
        mll.addFirst(0);
        mll.addLast(2);
        mll.add(0, 4);
        int t;
        t = mll.removeLast();
        
        
        
        System.out.println(mll.getLast());
        System.out.println(t);
        System.out.println(mll.size());
        System.out.println(mll.indexOf(4));
        
        
        
        
    }
}
