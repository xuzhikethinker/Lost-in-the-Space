/*
 * Mojito Distributed Hash Table (Mojito DHT)
 * Copyright (C) 2006-2007 LimeWire LLC
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */

package org.limewire.mojito.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/**
 * An adapter implementation of DHTFutureListener.
 */
public class DHTFutureAdapter<T> implements DHTFutureListener<T> {

    /*
     * (non-Javadoc)
     * @see com.limegroup.mojito.concurrent.DHTFutureListener#handleFutureCancelled(java.util.concurrent.CancellationException)
     */
    public void handleCancellationException(CancellationException e) {
    }

    /*
     * (non-Javadoc)
     * @see com.limegroup.mojito.concurrent.DHTFutureListener#handleFutureFailure(java.util.concurrent.ExecutionException)
     */
    public void handleExecutionException(ExecutionException e) {
    }

    /*
     * (non-Javadoc)
     * @see com.limegroup.mojito.concurrent.DHTFutureListener#handleFutureInterrupted(java.lang.InterruptedException)
     */
    public void handleInterruptedException(InterruptedException e) {        
    }

    /*
     * (non-Javadoc)
     * @see com.limegroup.mojito.concurrent.DHTFutureListener#handleFutureSuccess(java.lang.Object)
     */
    public void handleFutureSuccess(T result) {
    }
}
