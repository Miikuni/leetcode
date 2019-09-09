class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var li1 = l1
    var li2 = l2
    val resultListNode=ListNode(0)
    var step:ListNode? = resultListNode;
    var value = 0
    var up = 0
    while (li1 != null || li2 != null){
        var numli1 = li1?.`val`?:0
        var numli2 = li2?.`val`?:0
        var sum = numli1 + numli2 + up
        if (sum>=10){
            up = 1
            value = sum%10
        }else{
            up = 0
            value =sum
        }
        step!!.next = ListNode(value)
        step = step.next
        if (li1!=null)li1 = li1?.next
        if (li2!=null)li2 = li2?.next
    }
    if (up>0){
        step!!.next = ListNode(up)
    }
    return resultListNode.next
}
}

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
