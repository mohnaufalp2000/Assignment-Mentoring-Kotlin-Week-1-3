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
     for (i in city.indices){
         print(city[i]+",")
     }
}

fun main(){
    println("Task 1\n"+showNumber(5.1,7.5))
    numberEven(1,2,3,4,5,6,7,8)
    udacoding(arrayOf("udacoding","tempat 2","tempat 3","tempat 4" ,"tempat 5"))
    examValue(75)
    checkWord(arrayOf("jakarta","jakarta","Padang","Solo","Padang","Bandung","Padang","Malang","Bali"))
}