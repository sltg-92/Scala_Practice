import scala.collection.mutable.ListBuffer

case object Exercices{

  //Ejercicio 1 Escribe un programa Scala para imprimir "Hola, mundo" y la versión del lenguaje Scala.

  //Ejercicio 2 Escribe un programa Scala para calcular la suma de los dos valores enteros dados. Si los dos valores son iguales, entonces devuelve el triple de su suma.
  def sum (x: Int, y: Int): Int = if (x == y) {
    3 * (x + y)
  } else {
    x + y
  }

  //Ejercicio 3 Escribe un programa Scala para obtener la diferencia absoluta entre n y 51. Si n es mayor que 51 devuelve el triple de la diferencia absoluta.
  def absDif (n: Int): Int = if (n > 51) {
    3 * (n - 51)
  } else {
    51 - n
  }

  //Ejercicio 4 Escribe un programa Scala para comprobar dos enteros dados, y devolver true si uno de ellos es 30 o si su suma es 30.
  def checkVal (x: Int, y: Int): Boolean = x == 30 || y == 30 || x  + y == 30

  //Ejercicio 5 Escribe un programa Scala que compruebe un entero dado y devuelva true si está a menos de 20 de 100 o de 300.
  def checkDist (x: Int): Boolean = x > 80 && x < 100 || x > 280 && x < 300

  //Ejercicio 6 Escribe un programa Scala para crear una nueva cadena en la que se añada 'if' al principio de una cadena dada. Si la cadena ya comienza con 'if', devuelve la cadena sin cambios.
  def charStr (x: String): String = if (x startsWith "if") {
    x
  } else {
    "if " + x
  }

  //Ejercicio 7 Escribe un programa Scala para eliminar el carácter en una posición dada de una cadena dada. La posición dada estará en el rango 0...longitud de la cadena -1 inclusive.
  def delChar (x: String, y: Int): String = x.substring(0, y) + x.substring(y + 1)

  //Ejercicio 8 Escribe un programa Scala para intercambiar el primer y el último carácter de una cadena dada y devolver la nueva cadena.
  def swapChar (x: String): String = if (x.head.equals(x.last)) {
    x
  } else {
    val lastCh = x.head
    val firstCh = x.last
    val delStr = x.substring(1)
    firstCh + delStr.substring(0, delStr.length -1) + delStr.substring(delStr.length) + lastCh
  }

  //Ejercicio 9 Escribe un programa Scala para crear una nueva cadena que sea 4 copias de los 2 primeros caracteres de una cadena dada, si la longitud de la cadena dada es menor que 2 devuelva la cadena original.
  def newString (x: String): String = if (x.length < 2){
    x
  } else {
    x.substring(0, 2) * 4
  }

  //Ejercicio 10 Escribe un programa Scala para crear una nueva cadena con el último carácter añadido en la parte delantera y trasera de una cadena dada de longitud 1 o más.
  def newString2 (x: String): String = x.head + x.substring(x.length - 1)

  //Ejercicio 11 Escribe un programa en Scala para crear una lista de diferentes maneras.
  //Tabulate
  def tabulateList (x: Int): List[Int] =  List.tabulate(x)(_ + 2)

  //Range
  def rangeList (x:Int, y: Int): List[Int] = List.range(x , y)

  //Ejercicio 12 Escribe un programa Scala para añadir un solo elemento y múltiples elementos a un listbuffer/lista dado
  //ListBuffer
  def addListB (myList: ListBuffer[Int], newArr: Array[Int]): ListBuffer[Int] = {
    for (i <- newArr){
      myList += i
    }
    myList
  }

  //List
  def addList (myList: List[Int], x: List[Int]): List[Any] = {
    myList ::: x
  }

  //Ejercicio 13 Escribe un programa Scala para eliminar elementos simples y múltiples de un listbuffer/lista dado.
  //ListBuffer
  def delList (myList:ListBuffer[Int], delArr: Array[Int]): ListBuffer[Int] = {
    for (i <- delArr){
      myList -= i
    }
    myList
  }

  //Ejercicio 14 Escribe un programa en Scala para eliminar elementos de una lista dada.


  //Ejercicio 15 Escribe un programa Scala para iterar sobre una lista para imprimir los elementos y calcular la suma y el producto de todos los elementos de esta lista
  def iterLista (myList:List[Int]): String = {
    var total = 0
    var mult = 1
    for (i <- myList){
      total += i
      mult *= i
      print(i + " ")
    }
    "\nLa suma total es: " + total + "\nLa multiplicación total: " + mult
  }

  //Ejercicio 16 Escribe un programa Scala para eliminar duplicados de un listbuffer/lista dado
  //ListBuffer
  def duplList (myList:ListBuffer[Int]): ListBuffer[Int] = myList.distinct

  //Ejercicio 17 Escribe un programa Scala para concatenar una cadena dada al final de otra cadena
  def concatString (x: String, y: String): String = x.concat(" " + y)

  //Ejercicio 18 Escribe un programa Scala para comprobar si dos objetos String contienen los mismos datos
  def equalString (x: String, y: String): Boolean = x.equals(y)

  //Ejercicio 19 Escribe un programa Scala para convertir todos los caracteres a cadenas en minúsculas y mayúsculas
  def minMay (x: String): String = {
    "Minúsculas: " + x.toLowerCase() + "\nMayúsculas: " + x.toUpperCase()
  }

  //Ejercicio 20 Escribe un programa Scala para sumar los valores de un array dado
  def sumArr (myArr:Array[Int]): Int = {
    var total = 0
    for (i <- myArr) {
      total += i
    }
    total
  }

  //Ejercicio 21 Escribe un programa en Scala para comprobar si el valor del primer o último elemento de un array dado (de longitud 1 o más) son iguales o no
  def equalVal (x: Array[Int]): Boolean = x(0) == x(x.length - 1)

  //Ejercicio 22 Escribe un programa Scala para encontrar el valor máximo y mínimo de un array de enteros
  def maxMin (x: Array[Int]): String = {
    "El valor máximo del array es: " + x.max + " y el mínimo  es: " + x.min
  }

  //Ejercicio 23 Escribe un programa en Scala para comprobar la igualdad de dos arrays
  def equalArr (myArr: Array[Int], otherArr: Array[Int]): Boolean = myArr.sameElements(otherArr)




  def main(args: Array[String]): Unit ={
    println()
  }
}




