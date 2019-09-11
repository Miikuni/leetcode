class Solution {
    fun reverse(x: Int): Int {
        var x=x
        var result = 0
        while (x!=0){
            if (result>(Int.MAX_VALUE/10)||result<(Int.MIN_VALUE/10))return 0
            result = x%10 +result*10
            x = x/10        
        }
        return result
    }
}
