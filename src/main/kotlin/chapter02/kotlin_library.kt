package chapter02

data class Person(var name: String, var age: Int)

fun main() {
    val person = Person("FP", 30)

    // let
    val let = person.let {
        it.name = "Kotlin"
        it.age = 10
        it
    }

    // with
    val with = with(person) {
        name = "Kotlin"
        age = 10
        this
    }

    // run
    val run1 = person.run {
        name = "Kotlin"
        age = 10
        this
    }

    val run2 = run {
        val name = "Kotlin"
        val age = 10
        Person(name, age)
    }

    // apply

    val apply = person.apply {
        name = "Kotlin"
        age = 10
    }

    // also

    val also = person.also {
        it.name = "Kotlin"
        it.age = 10
    }


    println(let)
    println(with)
    println(run1)
    println(run2)
    println(apply)
    println(also)

}