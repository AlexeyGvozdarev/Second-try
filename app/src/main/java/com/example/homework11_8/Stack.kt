package com.example.homework11_8

class Stack<T> {
    private var stackList: MutableList<T> = mutableListOf()

    fun push(item: T) {
        stackList.add(item)
    }

    fun pop(): T? {
        val temp = stackList.firstOrNull() ?: return null
        stackList.removeAt(0)
        return temp
    }

    fun isEmpty(): Boolean {
        return stackList.isNullOrEmpty()
    }

    fun listSize(): Int {
        return stackList.size
    }


    override fun toString(): String {
        return "Stack(stackList=$stackList)"
    }
}




