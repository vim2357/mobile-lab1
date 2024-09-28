class Exercise3 {
    fun run() {
        val sumResult = addTwoNumbers(10, 20)
        println("Sum of 10 and 20: $sumResult")

        val multiply = { a: Int, b: Int -> a * b }
        val multiplyResult = multiply(5, 6)
        println("Multiplication of 5 and 6: $multiplyResult")

        val higherOrderResult = applyOperation(4, 7, multiply)
        println("Applying multiplication lambda to 4 and 7: $higherOrderResult")

        val additionLambda = { x: Int, y: Int -> x + y }
        val additionResult = applyOperation(10, 15, additionLambda)
        println("Applying addition lambda to 10 and 15: $additionResult")
    }

    fun addTwoNumbers(a: Int, b: Int): Int {
        return a + b
    }

    fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }
}

fun main() {
    val exercise = Exercise3()
    exercise.run()
}
