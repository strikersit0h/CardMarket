fun main(){
    var articulos = arrayOf("cartas", "colecciones", "accesorios", "caja")
    var precios = arrayOf(5, 10, 15, 25)

    comprar(articulos, precios)
}

fun comprar(articulos: Array<String>, precios: Array<Int>) {

    var carrito = Array(20){""}
    var pos = 0
    var total = 0

    var aux = 1
    var contProdCart = 0
    var contProdCol = 0
    var contProdAcc = 0
    var contProdCaja = 0

    do {
        println("Que artículo/s quieres comprar? (pulsando 0 saldrás)")
        for (i in 0..3){
            print("${aux}. ${articulos[i]}, ${precios[i]}")
            println()
            aux++
        }

        aux = 1

        var eleccion = readln().toInt() - 1

        when(eleccion){
            0 -> {
                carrito[pos] += articulos[eleccion]
                pos++
                total += precios[eleccion]
                println("${articulos[eleccion]} se ha añadido al carrito")
                contProdCart++
            }
            1 -> {
                carrito[pos] += articulos[eleccion]
                pos++
                total += precios[eleccion]
                println("${articulos[eleccion]} se ha añadido al carrito")
                contProdCol++
            }
            2 -> {
                carrito[pos] += articulos[eleccion]
                pos++
                total += precios[eleccion]
                println("${articulos[eleccion]} se ha añadido al carrito")
                contProdAcc++
            }
            3 -> {
                carrito[pos] += articulos[eleccion]
                pos++
                total += precios[eleccion]
                println("${articulos[eleccion]} se ha añadido al carrito")
                contProdCaja++
            }
            else -> {
                if(eleccion != -1){
                    println("No existe ese artículo en nuestra tienda")
                }
            }
        }
    }while (eleccion != -1)

    println("Tu carrito es el siguiente:")
    for (i in 0..pos-1){
        if (i == pos -1){
            print(carrito[i])
        }else{
            print("${carrito[i]}, ")
        }

    }

    println()
    println("En total cuesta $total€")
}