class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var li1 = l1
    var li2 = l2
    val resultListNode=ListNode(0)
    var step:ListNode? = resultListNode;
    var value = 0
    while (li1 != null || li2 != null){
        var numli1 = li1?.`val`?:0
        var numli2 = li2?.`val`?:0
        var sum = numli1 + numli2 
        step!!.next = ListNode(value)
        step = step.next
        if (li1!=null)li1 = li1?.next
        if (li2!=null)li2 = li2?.next
    }
    return resultListNode.next
}
}

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
