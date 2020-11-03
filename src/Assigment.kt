// task 1
fun showNumber(one : Double, two : Double) : String{
    return "Angka pertama : ${one}, Angka kedua ${two} "
}

// task 2
fun numberEven(vararg number : Int){
    println("\ntask 2")
    for(i in number){
        if(i % 2 == 0){
            print("${i} ")
        }
    }
}

// task 3
fun udacoding(word : Array<String>){
    println("\n\ntask 3")
    for(i in word){
        if(i == "udacoding"){
            println("${i} nah ini belajar coding yang keren")
        } else {
            println("${i}")
        }
    }
}

// task 4
fun examValue(value : Int){
    println("\ntask 4")
    when(value){
        in 80 downTo 60 -> println("memuaskan")
        in 90 downTo 80 -> println("sangat memuaskan")
        in 100 downTo 90 -> println("sangat memuaskan")
        in 60 downTo 0 -> println("tidak lulus")
        in 100..1000 -> println("nilai tidak valid")
    }
}

// task 5
fun checkWord(city : Array<String>) {
    println("\ntask 5")
    var a = 0
    var b = 0
    var c = 0
    var d = 0
    var e = 0
    var f = 0

     for (i in city.indices){
         if(city[i]=="jakarta") {
             a++
         }
         else if(city[i]=="Padang") {
             b++
         }
         else if(city[i]=="Solo") {
             c++
         }
         else if(city[i]=="Bandung") {
             d++
         }
         else if(city[i]=="Malang") {
             e++
         }
         else if(city[i]=="Bali") {
             f++
         }

     }
    println("""
        Jakarta: ${a}
        Padang: ${b}
        Solo: ${c}
        Bandung: ${d}
        Malang: ${e}
        Bali: ${f}
    """.trimIndent())
}

fun main(){
    println("Task 1\n"+showNumber(5.1,7.5))
    numberEven(1,2,3,4,5,6,7,8)
    udacoding(arrayOf("udacoding","tempat 2","tempat 3","tempat 4" ,"tempat 5"))
    examValue(75)
    checkWord(arrayOf("jakarta","jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali"))
}