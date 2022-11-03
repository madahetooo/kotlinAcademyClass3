class AtmBank {
    var pinCode:Int = 0
    var balance:Float = 0f
    var selectedOperation:Int =0
    var money:Float =0f
    fun enterYourCardInformation(){
        println("Welcome to our bank")
        println("Please enter your PIN Code ****")
        pinCode = readLine()!!.toInt() // Scan PinCode from the user as int
        println("Please insert your Balance")
        balance = readLine()!!.toFloat() // Scan balance from user as Float
        selectOperation()
    }
    fun selectOperation() {
         println("Please select your operation")
         println("1:For Deposit, 2: For Withdraw, 3: Check Balance, 4: Exit")
         selectedOperation = readLine()!!.toInt()
         when(selectedOperation){
             1 -> deposit()
             2 -> withdraw()
             3 -> checkBalance()
             4 ->{
                 println("Thank for using our bank")
                 System.exit(0)
             }
         }
    }
    fun checkBalance() {
        println("Your current balance is $balance")
        doYouNeedAnyThingElse()
    }
    fun withdraw() {
        println("How much money you want to withdraw")
        money = readLine()!!.toFloat()
        if (money <= balance){
            balance -= money
            println("Withdraw done successfully")
            checkBalance()
        }else{
            println("Sorry you dont have enough money")
        }
    }
    fun deposit() {
        println("How much money you want to deposit")
        money = readLine()!!.toFloat() // Get the money from the user
        balance += money
        println("Deposit done successfully")
        checkBalance()
    }
    fun doYouNeedAnyThingElse(){
        println("Do you need anything else ?!")
        println("1:Yes, 2:No")
        selectedOperation = readLine()!!.toInt()
        when(selectedOperation){
            1 -> selectOperation()
            2 -> {
                println("Thanks for using our ATM, Good Bye")
                System.exit(0)
            }
            else ->{
                println("Not valid Choice")
            }
        }
    }
}