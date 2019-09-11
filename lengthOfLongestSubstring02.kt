class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val str:String = s
        if (str=="") return 1
        var maxlength= 0
        for(i in 0 until s.length){
            val list = mutableListOf<Char>()
            var next= true
            for (j in i+1 .. s.length){
            if (traverseAll(str,i,j)) maxlength = Math.max(maxlength,j-i)
        }
    }
    return maxlength
}

    fun traverseAll(s:String,begin:Int,end:Int):Boolean{
        val str=s
        val list = mutableListOf<Char>()
        for(i in begin until end){
            val char = str.get(i)
            if (list.contains(char)) return false
            list.add(char)
        }
        return true
}

}
