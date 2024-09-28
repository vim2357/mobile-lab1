fun main() {
    println("Exercise 1: Variables and Data Types")
    exercise1()

    println("\nExercise 2: Conditional Statements")
    exercise2()

    println("\nExercise 3: Loops")
    exercise3()

    println("\nExercise 4: Collections")
    exercise4()
}

fun exercise1() {
    val someInt: Int = 42
    val someDouble: Double = 99.99
    val someStr: String = "Hello, World!"
    val someBool: Boolean = true

    println("Int: $someInt")
    println("Double: $someDouble")
    println("String: $someStr")
    println("Boolean: $someBool")
}

fun exercise2() {
    val someInt: Int = -10

    if (someInt > 0) {
        println("The number is positive")
    } else if (someInt < 0) {
        println("The number is negative")
    } else {
        println("The number is zero")
    }
}

fun exercise3() {
    for (i in 1..10) {
        println("For loop number: $i")
    }

    var j = 1
    while (j <= 10) {
        println("While loop number: $j")
        j++
    }
}

// Exercise 4: Collections
fun exercise4() {
    // Create a list of numbers
    val numbers = listOf(10, 20, 30, 40, 50)

    // Iterate through the list and print the sum
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    println("Sum of all numbers: $sum")
}
