class Parrot : Bird() {

    override var color = "White"


    //OVERRIDING
    override fun fly() {
        println("Parrot Can Fly")// Parrot Can Fly
        println(super.fly())// Bird Can Fly
    }

    fun printColors() {
        println(color) // White
        println(super.color) // Black
    }
}