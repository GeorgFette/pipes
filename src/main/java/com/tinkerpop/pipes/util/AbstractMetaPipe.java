package com.tinkerpop.pipes.util;

import com.tinkerpop.pipes.AbstractPipe;
import com.tinkerpop.pipes.Pipe;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public abstract class AbstractMetaPipe<S, E> extends AbstractPipe<S, E> implements MetaPipe {

    public void enablePath(final boolean enable) {
        super.enablePath(enable);
        for (final Pipe pipe : this.getPipes()) {
            pipe.enablePath(enable);
        }
    }
}
