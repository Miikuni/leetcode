# leetcode
#kotlin
刷题 


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
     var i:Int = 0
        var j:Int = i+1
        var arrayMark = mutableListOf<Int>()
        while(i<nums.size){
            while(j<nums.size){
                var sum:Int = nums[i]+nums[j]
                if(sum==target){
                    return intArrayOf(i,j)               
                }
                j++
            }
            i++
        }
	return throw IllegalArgumentException("arrayMark.size = ${arrayMark.size}")
    }
    
}

