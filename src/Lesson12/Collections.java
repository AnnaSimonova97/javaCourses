package Lesson12;

import java.util.*;

public class Collections implements CollectionUtils {

    public Collections() {

    }

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null ) {
            throw new NullPointerException("a или b рывны 0");
        }
        Collection<Integer> c = new ArrayList<>(); //или LinkedList
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null ) {
            throw new NullPointerException("a или b рывны 0");
        }
        Collection<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.retainAll(b);

        return c;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null ) {
            throw new NullPointerException("a или b рывны 0");
        }
        Set<Integer> c = new HashSet();
        c.addAll(a);
        c.addAll(b);
        return c;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null ) {
            throw new NullPointerException("a или b рывны 0");
        }
        Set<Integer> c = new HashSet<>();
        c.addAll(a);
        c.retainAll(b);
        return c;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if(a == null || b == null ) {
            throw new NullPointerException("a или b рывны 0");
        }
        Collection<Integer> c = new ArrayList<>();
        c.addAll(a);
        c.removeAll(b);
        return c;
        /*for(Integer num : c) {
            if(c.equals(num)) {
                c.remove(num);
            }

        }*/
    }

}
