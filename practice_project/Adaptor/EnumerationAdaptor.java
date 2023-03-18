
package Adaptor;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationAdaptor<T> implements Iterator<T>{

    Enumeration<T> enumeration;

   public EnumerationAdaptor(Enumeration<T> enumeration) {
        this.enumeration = enumeration;
    }

    @Override
    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    @Override
    public T next() {
       return enumeration.nextElement();
    }

    @Override
    public void remove(){
        throw new UnsupportedOperationException();
    }

}
