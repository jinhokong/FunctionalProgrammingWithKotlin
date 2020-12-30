package chapter01

val lazyValue:String by lazy{
    println("Loooooong Time")
    "hello"
}

fun main(args: Array<String>){
    println(lazyValue)
    println(lazyValue)
}