class Solution {
   fun lengthOfLongestSubstring(s: String): Int {
    val str:String = s
    if (str=="") return 1
    var maxlength= 0
    for(i in 0 until s.length){
        val list = mutableListOf<Char>()
        var next= true
        for (j in i+1 until s.length){
            val char = str.get(j)
            if (list.contains(char)) next = false
            list.add(char)
            if (next) maxlength = Math.max(maxlength,j-i)
        }
    }
    return maxlength
}

}
