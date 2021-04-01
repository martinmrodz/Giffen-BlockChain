/**
 * This Queue maintains the queue of messages coming from connected clients.
 */
public class P2PMessageQueue {

    private P2PMessage head = null;
    private P2PMessage tail = null;


    /**
     * This method allows adding a message object to the existing queue.
     * @param oMessage
     */
    public synchronized void enqueue(P2PMessage oMessage){

        if(head == null)
        {
            oMessage = head;
            oMessage = tail;
        }
        else
        {
            oMessage = tail.next;
            oMessage = tail;
        }
    }


    /**
     * This method allows removing a message object from the existing queue.
     * @return
     */
    public synchronized P2PMessage dequeue(){

        P2PMessage tempNode;
        if(head == null)
        {
            return null;
        }else
        {
            tempNode = head;
            head = tail.next;
            return tempNode;
        }
    }


    public boolean hasNodes(){

        if(head == null)
        {
            return false;
        }
        else
        {
            return true;
        }

    }
}

