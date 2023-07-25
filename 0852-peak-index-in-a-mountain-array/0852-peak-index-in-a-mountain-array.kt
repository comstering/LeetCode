class Solution {
    fun peakIndexInMountainArray(arr: IntArray): Int {
        val length = arr.size
        
        if (length < 3) {
            return if (arr[0] > arr[1]) {
                0
            } else {
                1
            }
        }

        val idx = length / 2

        if (arr[idx] > arr[idx - 1] && arr[idx] > arr[idx + 1]) {
            return idx
        }

        return if (arr[idx] < arr[idx - 1]) {
            peakIndexInMountainArray(arr.sliceArray(0 until idx))
        } else {
            idx + peakIndexInMountainArray(arr.sliceArray(idx until length))
        }
    }
}