public void InsertCircular(List head, int value) {
    List current = head;
    if (value > head.value) {
        current = head;
        while(current.value < value && current.value < current.next.value) {
            current = current.next;
        }

    } else {
        while(current.value < current.next.value) {
            current = current.next;
        }
        //go to largest value
        while(current.next.value < value) {
            current = current.next;
        }
    }
    ListNode addedNode = new ListNode(value);
    addedNode.next = current.next;
    current.next = addedNode;
}
