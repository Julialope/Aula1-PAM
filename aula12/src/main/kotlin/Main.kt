package fundamentos

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>){
    val nota = 9
    if (nota in 9..10) {
        println("Fantastico")
    } else if (nota in 7..8) {
        println("Parabens")
    } else if (nota in 4..6) {
        println("Tem como recuperar")
    } else if (nota in 0..3) {
        println("Te vejo no proximo ano")
    } else {
        println("Nota invalida")
    }

}