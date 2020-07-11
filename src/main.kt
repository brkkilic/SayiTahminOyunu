import kotlin.random.Random
import kotlin.random.nextInt


fun main() {


    println("0 ile kaç arası?")
    var ust = readLine()?.toInt()
    val randomTut = Random.nextInt(0,ust!!)
    var sayi : Int = ust
    var sayi2 : Int = ust
    var sayac = 0

    println(randomTut)


    do {

        

        if (sayi < randomTut){

            sayi = (sayi+sayi2)/2

            sayac++

        }
        else if (sayi >randomTut){
            sayi2=sayi
            sayi = sayi/2

            sayac++

        }
        if (sayi == randomTut) println("$sayac kerede buldunuz sayi: $sayi")



    }while (randomTut!=sayi)

















}