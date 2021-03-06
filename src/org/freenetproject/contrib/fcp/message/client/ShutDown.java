/* This code is part of Freenet. It is distributed under the GNU General
 * Public License, version 2 (or at your option any later version). See
 * http://www.gnu.org/ for further details of the GPL. */

package org.freenetproject.contrib.fcp.message.client;

import org.freenetproject.contrib.fcp.event.support.FcpEventSupportRepository;

/**
 * This command allows an client program to remotely shut down a Freenet node. 
 * A confirmation message will be sent (ProtocolError code 18: Shutting down)
 * @author Ralph Smithen
 */
public class ShutDown extends ClientMessage{
    
    /** Creates a new instance of ShutDown */
    public ShutDown() {
    }

    protected void fireEvents(FcpEventSupportRepository eventSupport) {
    }
    
}
