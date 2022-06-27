package ru.gb.myhwkotlin

data class Person (val firstName: String, val age: Int) {

    var someVal: Int = 0
        get() {
            return age + 10
        }
        set(value) {
            field = value - 2
        }

    val someField = 10

    fun someMethod() {
        print(someVal)
    }

}
