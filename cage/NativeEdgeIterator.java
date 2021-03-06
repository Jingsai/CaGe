package cage;

import java.util.NoSuchElementException;

import lisken.systoolbox.MutableInteger;

/**
 * Returned by a {@link NativeEmbeddableGraph} as an iterator over its edges.
 */
public class NativeEdgeIterator implements EdgeIterator {

    /** The pointer to the iterator in the native code*/
    private long nIter;

    private native boolean nHasNextEdge(long nIter);

    private native int nGetNextEdge(long nIter);

    private native void nFinalize(long nIter);

    /**
     * Returns <tt>true</tt> if the iteration has more edges. (In other
     * words, returns <tt>true</tt> if <tt>next</tt> would return an element
     * rather than throwing an exception.)
     *
     * @return <tt>true</tt> if the iterator has more elements.
     */
    @Override
    public boolean hasNext() {
        return nHasNextEdge(nIter);
    }

    /**
     * Returns the next edge in the iteration.  Calling this method
     * repeatedly until the {@link #hasNext()} method returns false will
     * return each element in the underlying collection exactly once.
     *
     * @return the next edge in the iteration as an <code>MutableInteger</code>.
     * @exception NoSuchElementException iteration has no more elements.
     */
    @Override
    public Object next() throws NoSuchElementException {
        return new MutableInteger(nGetNextEdge(nIter));
    }

    /**
     * Returns the next edge in the iteration.  Calling this method
     * repeatedly until the {@link #hasNext()} method returns false will
     * return each element in the underlying collection exactly once.
     *
     * @return the next edge in the iteration as an <code>int</code>.
     * @exception NoSuchElementException iteration has no more elements.
     */
    @Override
    public int nextEdge() throws NoSuchElementException {
        return nGetNextEdge(nIter);
    }

    /**
     * Throws <code>UnsupportedOperationException</code> because edges can't
     * be removed.
     *
     * @exception UnsupportedOperationException if the <tt>remove</tt>
     *		  operation is not supported by this Iterator.
     */
    @Override
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Graph edges can't be removed");
    }

    /**
     * Lets the native code run its finalization first and then just call <code>
     * super.finalize()</code>.
     * @throws java.lang.Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        nFinalize(nIter);
        super.finalize();
    }
}
