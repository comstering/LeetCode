class MyStack() {

    val queue: ArrayDeque<Int> = ArrayDeque()

    fun push(x: Int) {
        queue.add(x)
    }

    fun pop(): Int {
        return queue.removeLast()
    }

    fun top(): Int {
        return queue.last()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

}

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */