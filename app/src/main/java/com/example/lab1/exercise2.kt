open class Person(val name: String, val age: Int, val email: String) {
    open fun displayInfo() {
        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}

class Employee(name: String, age: Int, email: String, val salary: Double) : Person(name, age, email) {
    override fun displayInfo() {
        super.displayInfo()
        println("Salary: $$salary")
    }
}

class BankAccount(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount < 0) {
            println("Deposit amount cannot be negative.")
        } else {
            balance += amount
            println("Deposited: $$amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > balance) {
            println("Insufficient funds. Cannot withdraw $$amount")
        } else {
            balance -= amount
            println("Withdrew: $$amount")
        }
    }

    fun displayBalance() {
        println("Current balance: $$balance")
    }
}

fun main() {
    val person = Person("Gaukhar Uzakbay", 21, "test123@gmail.com")
    println("Person Info:")
    person.displayInfo()

    val employee = Employee("Gaukhar Uzakbay", 21, "test123@gmail.com",30000.0)
    println("\nEmployee Info:")
    employee.displayInfo()

    val bankAccount = BankAccount(1000.0)
    println("\nBank Account Operations:")
    bankAccount.displayBalance()
    bankAccount.deposit(500.0)
    bankAccount.displayBalance()
    bankAccount.withdraw(300.0)
    bankAccount.displayBalance()
    bankAccount.withdraw(2000.0)
    bankAccount.displayBalance()
}
