class Solution {
    fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
        val soldiers = mutableListOf<Int>()
        for(m in mat) {
            soldiers.add(m.count { it == 1 })
        }

        val rank = mutableListOf<Int>()

        for ((idx, soldier) in soldiers.withIndex()) {
            if (rank.size == 0) {
                rank.add(idx)
            }
            else {
                for (i in 0 until rank.size) {
                    if (soldiers[rank[i]] > soldier) {
                        rank.add(i, idx)
                        break
                    }
                    if (i == rank.size - 1) {
                        rank.add(idx)
                    }
                }
            }
        }

        return rank.subList(0, k).toIntArray()
    }
}