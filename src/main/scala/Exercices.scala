

import scala.annotation.tailrec
import scala.collection.mutable.{ArrayBuffer, ListBuffer}


case object Exercices{

  //Ejercicio 1 Escribe un programa Scala para imprimir "Hola, mundo" y la versión del lenguaje Scala.
  //println("Hola Mundo" + "\nVersión de scala: " + util.Properties.versionString)

  //Ejercicio 2 Escribe un programa Scala para calcular la suma de los dos valores enteros dados. Si los dos valores son iguales, entonces devuelve el triple de su suma.
  def sum (x: Int, y: Int): Int =
  {
    if (x == y) 3 * (x + y) else x + y
  }


  //Ejercicio 3 Escribe un programa Scala para obtener la diferencia absoluta entre n y 51. Si n es mayor que 51 devuelve el triple de la diferencia absoluta.
  def absDif (n: Int): Int =
  {
    if (n > 51) 3 * (n - 51) else 51 - n
  }
  //OK
  def abs_dif (x: Int): Int ={ val abs_diff = Math.abs(x - 51)
    if (x > 51) 3 * abs_diff else abs_diff}

  //Ejercicio 4 Escribe un programa Scala para comprobar dos enteros dados, y devolver true si uno de ellos es 30 o si su suma es 30.
  def checkVal (x: Int, y: Int): Boolean =
    {
      x == 30 || y == 30 || x + y == 30
    }

  //Ejercicio 5 Escribe un programa Scala que compruebe un entero dado y devuelva true si está a menos de 20 de 100 o de 300.
  def checkDist (x: Int): Boolean =
    {
      x > 80 && x < 100 || x > 280 && x < 300
    }
  //Other Solution
  def checkDist2 (x: Int): Boolean =
  {
    Math.abs(100 - x) <= 20 || Math.abs(300 - x) <= 20
  }

  //Ejercicio 6 Escribe un programa Scala para crear una nueva cadena en la que se añada 'if' al principio de una cadena dada. Si la cadena ya comienza con 'if', devuelve la cadena sin cambios.
  def charStr (x: String): String =
    {
      if (x startsWith "if") x else "if " + x
    }

  //Ejercicio 7 Escribe un programa Scala para eliminar el carácter en una posición dada de una cadena dada. La posición dada estará en el rango 0...longitud de la cadena -1 inclusive.
  def delChar (x: String, y: Int): String =
    {
      x.substring(0, y) + x.substring(y + 1)
    }
  //Other solution
  def delChar2(str: String, n: Int): String =
  {
    str.take(n) + str.drop(n + 1)
  }

  //Ejercicio 8 Escribe un programa Scala para intercambiar el primer y el último carácter de una cadena dada y devolver la nueva cadena.
  def swapChar (x: String): String =
    {
      if (x.head.equals(x.last)) x else {
        val lastCh = x.head
        val firstCh = x.last
        val delStr = x.substring(1)
        firstCh + delStr.substring(0, delStr.length -1) + delStr.substring(delStr.length) + lastCh
      }
    }
  //Other solution
  def swapChar2 (str: String): String =
  {
    val len = str.length
    if (len <= 1) str
    else str.charAt(len - 1) + str.substring(1, len - 1) + str.charAt(0)
  }

  //Ejercicio 9 Escribe un programa Scala para crear una nueva cadena que sea 4 copias de los 2 primeros caracteres de una cadena dada, si la longitud de la cadena dada es menor que 2 devuelva la cadena original.
  def newString (x: String): String =
    {
      if (x.length < 2) x else x.substring(0, 2) * 4
    }

  //Ejercicio 10 Escribe un programa Scala para crear una nueva cadena con el último carácter añadido en la parte delantera y trasera de una cadena dada de longitud 1 o más.
  def newString2 (x: String): String =
    {
      x.last + x + x.last
    }
  //Other solution
  def newString3 (str: String): String =
    {
      val len = str.length
      val last = str.charAt(len - 1)
      last + str + last
    }

  //Ejercicio 11 Escribe un programa en Scala para crear una lista de diferentes maneras.
  //Tabulate
  def tabulateList (x: Int): List[Int] =
    {
      List.tabulate(x)(_ + 2)
    }

  //Range
  def rangeList (x:Int, y: Int): List[Int] =
    {
      List.range(x , y)
    }

  //Uniform
  def uniformList (x: Int, y: Int): List[Int] = List.fill(x)(y)

  //Java
  val list2 = List(1, 2, 3)

  //lisp
  //val list1 = 1::2::2::Nil



  //Ejercicio 12 Escribe un programa Scala para añadir un solo elemento y múltiples elementos a un listbuffer/lista dado
  //ListBuffer
  def addListB (myList: ListBuffer[Any], newArr: Array[Any]): ListBuffer[Any] = {
    for (i <- newArr){
      myList += i
    }
    myList
  }

  //List
  def addList[T] (myList: List[T], x: List[T]): List[T] = {
    myList ::: x
  }


  //Ejercicio 13 Escribe un programa Scala para eliminar elementos simples y múltiples de un listbuffer/lista dado.
  //ListBuffer
  def delList (myList:ListBuffer[Int], elem: ListBuffer[Int]): ListBuffer[Int] = {
    myList --= elem
  }


  //Ejercicio 14 Escribe un programa en Scala para eliminar elementos de una lista dada.
  def removList[T](myList: List[T], elem: Any): List[T]= myList.filter(x => x != elem)


  //Ejercicio 15 Escribe un programa Scala para iterar sobre una lista para imprimir los elementos y calcular la suma y el producto de todos los elementos de esta lista
  def iterLista1 (myList:List[Int]): String = {
    myList.foreach(println)
    "\nLa suma de los elementos es: " + myList.sum + "\nLa multiplicación de los elementos es: " + myList.product
  }

  def iterLista2 (myList:List[Int]): String = {
    var sum = 0
    var mult = 1
    myList.foreach(println)
    myList.foreach(sum += _)
    myList.foreach(mult *= _)

    "\nLa suma total es: " + sum + "\nLa multiplicación total: " + mult
  }


  //Ejercicio 16 Escribe un programa Scala para eliminar duplicados de un listbuffer/lista dado
  //ListBuffer
  def duplList (myList:ListBuffer[Int]): ListBuffer[Int] = myList.distinct

  //Ejercicio 17 Escribe un programa Scala para concatenar una cadena dada al final de otra cadena
  def concatString (x: String, y: String): String = x.concat(y)

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

  //Otra opcion
  def sumArr2 (myArr:Array[Int]): Int = myArr.sum

  //Ejercicio 21 Escribe un programa en Scala para comprobar si el valor del primer o último elemento de un array dado (de longitud 1 o más) son iguales o no
  def equalVal (x: Array[Int]): Boolean = x(0) == x(x.length - 1)

  //Ejercicio 22 Escribe un programa Scala para encontrar el valor máximo y mínimo de un array de enteros
  def maxMin (x: Array[Int]): String = {
    "El valor máximo del array es: " + x.max + " y el mínimo  es: " + x.min
  }

  //Ejercicio 23 Escribe un programa en Scala para comprobar la igualdad de dos arrays
  def equalArr[T] (myArr: Array[T], otherArr: Array[T]): Boolean = myArr.sameElements(otherArr)

  // Ejercicio 24 Comprobar que un número sea multiplo de 3 o de 7
  def multipl (x: Int): Boolean =
  {
    x % 3 == 0 || x % 7 == 0
  }

  //Ejercicio 25 Escriba un programa Scala para crear una nueva cadena tomando los primeros 3 caracteres de una cadena dada y devuelva la cadena con los 3 caracteres agregados al frente y al reverso. Si la longitud de la cadena dada es inferior a 3, utilice los caracteres que haya.
  def caract_3 (str: String): String =
    {
      if (str.length < 3) str * 3
      else str.substring(0, 3) + str + str.substring(0, 3)
    }

  //Ejercicio 26 Escriba un programa en Scala para verificar si una cadena dada comienza con 'Sc' o no.
  def strStarts (str: String): Boolean =
    {
      str.startsWith("Sc")
    }

  //Ejercicio 27 Escriba un programa en Scala para comprobar si una de las temperaturas dadas es inferior a 0 y la otra es superior a 100
  def temp (temp1: Int, temp2: Int): Boolean =
    {
      (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)
    }

  //Ejercicio 28 Escriba un programa en Scala para verificar dos enteros dados si alguno de ellos está en el rango 100..200 inclusive
  def verfEnt (x: Int, y : Int): Boolean =
    {
      (x >= 100 && x <= 200) || (y >= 100 && y <= 200)
    }

  //Ejercicio 29 Escriba un programa en Scala para verificar si tres valores enteros dados están en el rango 20..50 inclusive. Devuelve verdadero si 1 o más de ellos están en dicho rango; de lo contrario, es falso.
  def range3 (x: Int, y: Int, z: Int): Boolean =
    {
      (x >= 20 && x <= 50) || (y >= 20 && y <= 50) || (z >= 20 && z <= 50)
    }

  //Ejercicio 30 Escriba un programa en Scala para verificar si dos valores enteros dados están en el rango 20..50 inclusive. Devuelve verdadero si 1 u otro está en dicho rango; de lo contrario, es falso
  def range2 (x : Int, y: Int): Boolean =
    {
      (x <= 20 || y >= 50) || (y <= 20 && x >= 50)
    }

  //Ejercicio 31 Escriba un programa en Scala para verificar si aparece una cadena 'yt' en el índice 1 en una cadena determinada. Si aparece, devuelva una cadena sin 'yt'; de lo contrario, devuelva la cadena original.
  def verfStr (str: String): String =
    {
      if (str.drop(1).startsWith("yt")) str.replaceFirst("yt", " ")
      else str
    }

  //Ejercicio 32 Escriba un programa en Scala para verificar el número más grande entre tres enteros dados.
  def maxNum (x: Int, y: Int, z: Int): Int =
    {
      List(x, y, z).max
    }

  //Ejercicio 33 Escriba un programa en Scala para comprobar qué número está más cerca del valor 100 entre dos enteros dados. Devuelve 0 si los dos números son iguales.
  def dist100 (x: Int, y: Int): Int =
    {
      val x_abs = Math.abs(x - 100)
      val y_abs = Math.abs(y - 100)
      if (x_abs == y_abs) 0
      else if (x_abs < y_abs) x
      else y
    }

  //Ejercicio 34 Escriba un programa en Scala para verificar si dos enteros dados están en el rango 40...50 inclusive, o si ambos están en el rango 50...60 inclusive.
  def range4060 (x: Int, y:Int): Boolean =
    {
      List(x, y).forall (m => m >= 40 && m <= 50) || List(x, y).forall (n => n >= 50 && n <= 60)
    }

  //Ejercicio 35 Escriba un programa en Scala para encontrar el valor más grande de dos valores enteros positivos en el rango 20..30 inclusive, o devuelva 0 si ninguno está en ese rango.
  def maxValRange (x: Int, y: Int): Int =
    {
      val max_of_two = List(x, y).max
      if (max_of_two >= 20 && max_of_two <= 30) max_of_two else 0
    }

  //Ejercicio 36 Escriba un programa en Scala para verificar si un carácter dado se presenta en una cadena entre 2 y 4 veces.
  def countChar (str: String): Boolean =
    {
      val count_char = str.count(n => n == 'o')
      count_char >= 2 && count_char <= 4
    }

  //Ejercicio 37 Escriba un programa en Scala para verificar si dos enteros positivos dados tienen el mismo último dígito.
  def sameDigi(x: Int, y: Int): Boolean =
    {
      Math.abs(x % 10) == Math.abs(y % 10)
    }

  //Ejercicio 38 Escriba un programa Scala para convertir los últimos 4 caracteres de una cadena dada en mayúsculas. Si la longitud de la cadena es inferior a 4, escriba en mayúsculas todos los caracteres.
  def convertLastChar (str: String): String =
    {
      str.take(str.length - 4) + str.drop(str.length - 4).toUpperCase()
    }

  //Ejercicio 39 Escriba un programa Scala para crear una nueva cadena que sea n (entero no negativo) copias de una cadena dada.
  def copiesString (str: String, n: Int): String =
    {
      str * n
    }

  //Ejercicio 40 Escriba un programa en Scala para obtener el carácter en el índice dado dentro de una Cadena dada. También imprima la longitud de la cadena.
  def positChar (str: String, x: Int): String =
    {
      "El caracter seleccionado es la letra " + str.charAt(x) + " y la longitud de la cadena original es " + str.length
    }

  //Ejercicio 41 Escriba un programa en Scala para comparar dos cadenas lexicográficamente.
  def comparLex (str1: String, str2: String): String =
    {
      val result = str1.compareTo(str2)

      if (result < 0) '"' + str1 + '"' + " is less than " + '"' + str2 + '"'
      else if (result == 0) '"' + str1 + '"' + " is iqual to " + '"' + str2 + '"'
      else '"' + str1 + '"' + " is greater than " + '"' + str2 + '"'
    }

  //Ejercicio 42 Escriba un programa en Scala para verificar si dos objetos String contienen los mismos datos.
  def concatStr (str1: String, str2: String): Boolean =
    {
      str1.equalsIgnoreCase(str2)
    }

  //Ejercicio 43 Escriba un programa en Scala para probar si una cadena dada contiene la secuencia especificada de valores de caracteres.
  def contenChar (str1: String, str2: String): Boolean =
    {
      str1.contains(str2)
    }

  //Ejercicio 44 Escriba un programa Scala para crear un nuevo objeto String con el contenido de una matriz de caracteres.
  def newStrArr (arr: Array [Char], x: Int, y: Int): String =
    {
      String.copyValueOf(arr, x, y)
    }

  //Ejercicio 45 Escriba un programa en Scala para verificar si una cadena dada termina con el contenido de otra cadena.
  def strEndsStr (str1: String, str2: String): Boolean =
    {
      str1.endsWith(str2)
    }

  //Ejercicio 46 Escriba un programa Scala para reemplazar un carácter específico con otro carácter.
  def sustChar (str: String, x: Char, y: Char): String =
    {
      str.replace(x, y)
    }

  //Ejercicio 47 Escriba un programa Scala para obtener una subcadena de una cadena dada entre dos posiciones específicas.
  def substr (str: String, x: Int, y: Int): String =
    {
      str.substring(x, y)
    }

  // Ejercicio 48 Escriba un programa Scala para recortar cualquier espacio en blanco inicial o final de una cadena determinada.
  def whiteSpace (str: String): String =
    {
      str.trim
    }

  //Ejercicio 49 Escriba un programa Scala para imprimir después de eliminar los duplicados de una cadena dada.
  def duplStr (str: String): String =
    {
      var targetStr = ""
      for (value <- str){
        if (targetStr.indexOf(value) == -1){
          targetStr += value
        }
      }
      targetStr
    }

  //Ejercicio 50 Escriba un programa en Scala para encontrar el carácter máximo que aparece en una cadena.
  def maxChar (str: String): Char =
    {
      val N = 256
      val ctr = new Array[Int](N)
      val l = str.length
      for (i <- 0 until l)
        ctr(str.charAt(i)) = ctr(str.charAt(i)) + 1
      var max = -1
      var result = ' '
      for (i <- 0 until l){
        if (max < ctr(str.charAt(i))){
          max = ctr(str.charAt(i))
          result = str.charAt(i)
        }
      }
      result
    }

  //Ejercicio 51 Escriba un programa en Scala para invertir cada palabra en una cadena dada.
  def wordInReverse (str: String): String =
    {
      val each_words = str.split(" ")
      var revString = ""
      for (i <- 0 until each_words.length) {
        val word = each_words(i)
        var reverseWord = ""
        for ( j <- word.length - 1 to 0 by -1){
          reverseWord = reverseWord + word.charAt(j)
        }
        revString = revString + reverseWord + " "
      }
      revString
    }

  //Ejercicio 52 Escriba un programa Scala para contar e imprimir todos los duplicados en la cadena de entrada
  def showDuplicates (str: String): Unit =
    {
      val maxChars = 256
      val ctr = new Array[Int](maxChars)
      for (i <- 0 until str.length)
        ctr(str.charAt(i)) = ctr(str.charAt(i)) + 1
      for (i <- 0 until maxChars)
        if (ctr(i) > 1)
          printf("%c appears %d times\n", i, ctr(i))
    }

  //Ejercicio 53 Escriba un programa en Scala para verificar si dos cadenas dadas son rotaciones entre sí.
  def checkForRotation (str1: String, str2: String): Boolean =
    {
      (str1.length == str2.length) && ((str1 + str1).indexOf(str2) != -1)
    }

  //Ejercicio 54 Escriba un programa en Scala para agregar dos cadenas dadas de modo que, si la concatenación crea caracteres dobles, omita uno de los caracteres.
  def conCat (str1: String, str2: String): String =
    {
      if (str1.nonEmpty && str2.nonEmpty && str1.charAt(str1.length - 1) == str2.charAt(0)) str1 + str2.substring(1)
      else str1 + str2
    }

  //Ejercicio 55 Escriba un programa Scala para crear una nueva cadena a partir de una cadena dada, intercambiando los dos últimos caracteres de la cadena dada. La longitud de la cadena dada debe ser dos o más.
  def lastTwo (str: String): String =
    {
      if (str.length < 2) str
      else str.substring (str.length - 2) + str.charAt(str.length - 1) + str.charAt(str.length - 2)
    }

  //Ejercicio 56 Escriba un programa Scala para leer una cadena y devolver verdadero si termina con una cadena especificada de longitud 2.
  def lengthStr (str1: String, str2: String): Boolean=
    {
      if (str1.length < 2)
        false
      else if (str2.equals(str1.substring(str1.length - 2, str1.length)))
        true
      else false
    }

  //Ejercicio 57 Escriba un programa en Scala para leer dos cadenas, agréguelas y devuelva el resultado. Si la longitud de las cadenas es diferente, elimine los caracteres del comienzo de la cadena más larga y haga que tengan la misma longitud.
  def twoStrTogeth (str1: String, str2: String): String =
    {
      if (str1.length == str2.length)
        str1 + str2
      if (str1.length > str2.length){
        var diff = str1.length - str2.length
        str1.substring(diff, str1.length) + str2
      }
      else{
        var diff = str2.length - str1.length
        str1 + str2.substring(diff, str2.length)
      }
    }

  //Ejercicio 58 Escriba un programa Java para crear una nueva cadena tomando un número específico de caracteres desde la primera y la última posición de una cadena dada.
  def newStrChar (str: String, x: Int, y: Int): String =
    {
      val firstChar = str.substring(0, x)
      val lastChar = str.drop(str.length - y)
      firstChar + lastChar
    }

  //Ejercicio 59 Escriba un programa en Scala para verificar si los primeros dos caracteres están presentes al final de una cadena determinada.
  def verifChar (str: String): Boolean =
    {
      if (str.length < 2)
        false
      else if (str.substring(0, 2).equals(str.drop(str.length - 2)))
        true
      else false
    }

  //Ejercicio 60 Escriba un programa Scala para leer una cadena dada y si el primer o el último carácter son iguales, devuelva la cadena sin esos caracteres; de lo contrario, devuelva la cadena sin cambios.
  def firstCharlast (str: String): String =
    {
      if (str.head.equals(str.last)) str.substring(1, str.length - 1)
      else str
    }

  //Ejercicio 61 Escriba un programa Scala para leer una cadena dada y si el primer o el último carácter son iguales a un caracter dado, devuelva la cadena sin esos caracteres; de lo contrario, devuelva la cadena sin cambios.
  def firstLastCharEqualChar (str: String, c: Char): String =
    {
      var temp_str = str
      if (temp_str.isEmpty) temp_str
      if (temp_str.length == 1){
        if (temp_str.charAt(0) == c) ""
        else temp_str
      }
      if (str.charAt(0) == c)
        temp_str = temp_str.substring(1, temp_str.length)
      if (str.charAt(str.length - 1) == c)
        temp_str = temp_str.substring(0, temp_str.length - 1)
      temp_str
    }

  //Ejercicio 62 Escriba un programa Scala para leer una cadena y devolver la cadena sin los dos primeros caracteres. Mantenga el primer carácter si es 'g' y mantenga el segundo carácter si es 'h'.
  def twoFirstCharsOutStr (str: String): String =
    {
      var temp = ""
      for (i <- 0 until str.length){
        if (i == 0 && str.charAt(i) == 'g') temp += 'g'
        else if (i == 1 && str.charAt(i) == 'h') temp += 'h'
        else if (i > 1) temp += str.charAt(i)
      }
      temp
    }

  //Ejercicio 63 Escriba un programa Scala para leer una cadena y, si uno o los dos primeros caracteres es igual al carácter especificado, regrese sin esos caracteres; de lo contrario, devolverá la cadena sin cambios.
  def towFirstCharEqualChar (str: String, c: Char): String =
  {
    var temp = ""
    for (i <- 0 until str.length){
      if (i == 0 && str.charAt(i) != c)
        temp += str.charAt(i)
      else if (i == 1 && str.charAt(i) != c)
        temp += str.charAt(i)
      else if (i > 1)
        temp += str.charAt(i)
    }
    temp
  }

  //Ejercicio 64 Escriba un programa Scala para leer una cadena y regrese después de eliminar un carácter específico y sus caracteres izquierdo y derecho inmediatos.
  def deletLeftCharRight (str: String, c: Char): String =
  {
    var resultString = ""
    for (i <- 0 until str.length){
      if (i == 0 && str.charAt(i) != c)
        resultString += str.charAt(i)
      if (i > 0 && str.charAt(i) != c && str.charAt(i - 1) != c)
        resultString += str.charAt(i)
      if (i > 0 && str.charAt(i) == c && str.charAt(i - 1) != c)
        resultString = resultString.substring(0, resultString.length - 1)
    }
    resultString
  }

  //Ejercicio 65 Escriba un programa en Scala para verificar dos cadenas dadas si alguna de ellas aparece al final de la otra cadena (ignore la distinción entre mayúsculas y minúsculas).
  def strEndsOtherStr (str1: String, str2: String): Boolean =
    {
      var  stng1 = str1.toLowerCase()
      var aLen = str1.length
      var stng2 = str2.toLowerCase()
      var bLen = str2.length
      if (aLen < bLen) {
        var temp = stng2.substring(bLen - aLen, bLen)
        if  (temp.compareTo(stng1) == 0)
          true
        else
          false
      } else {
        var temp = stng1.substring(aLen - bLen, aLen)
        if (temp.compareTo(stng2) == 0)
          true
        else false
      }
    }

  // Ejercicio 66 Escriba un programa en Scala para verificar si una subcadena aparece antes de un punto (.) dentro de una cadena dada.
  /*def beforDotStr (str1: String, str2: String): Boolean =
    {
      val len = str1.length
      var bool: Boolean = false
      if (len < 3)
        false
      for (i <- 0 to len - 3){
        var temp = str1.substring(i, i + 3)
        if (temp.contains(str2) == 0 && i == 0)
          bool = true
        else if (temp.compareTo(str2) == 0 && str1.charAt(i - 1) != 46)
          bool = true
      }
      bool
    }*/

  // Ejercicio 67 Escriba un programa en Scala para verificar si una cadena de prefijo se crea usando los primeros caracteres específicos en una cadena dada y aparece en otro lugar de la cadena.
  def preCharInStr (str1: String, n_char: Int): Boolean =
    {
      var len = str1.length
      var pre_str = str1.substring(0, n_char)
      for (i <- n_char until len){
        if (n_char + 1 <= len){
          if (pre_str.equals(str1.substring(i, n_char + 1)))
            true
        }
      }
      false
    }

  //Ejercicio 68 Escriba un programa en Scala para verificar si una subcadena dada se presenta en medio de otra cadena dada. Aquí medio significa diferencia entre el número de caracteres a la izquierda y a la derecha de la subcadena dada no más de 1
  def verifSubsInStr (str1: String, str2: String): Boolean =
    {
      var len = str1.length
      var mid_pos = len / 2
      if (len < 3)
        false
      if (len % 2 != 0) {
        if (str2.equals(str1.substring(mid_pos - 1, mid_pos + 2))){
          true
        } else {
          false
        }
      } else if (str2.equals(str1.substring(mid_pos - 1, mid_pos + 2)) || str2.equals(str1.substring(mid_pos - 2, mid_pos + 1))){
        true
      } else
        false
    }

  //Ejercicio 69 Escriba un programa en Scala para contar cuántas veces está presente la subcadena 'life' en cualquier lugar de una cadena dada. El conteo también puede ocurrir para la subcadena 'li?e', cualquier carácter en lugar de 'f'.
  def countLife(stng: String): Int = {
    var l = stng.length()
    var ctr = 0
    var firsttwo = "li"
    val lastone = "e"
    if (l < 4)
      0
    for (i <- 0 to l - 3) {
      if (firsttwo.compareTo(stng.substring(i, i + 2)) == 0 && lastone
        .compareTo(stng.substring(i + 3, i + 4)) == 0)
        ctr = ctr + 1
    }
    ctr
  }

  //Ejercicio 70 Escriba un programa en Scala para agregar una cadena con un número específico de veces separadas por una subcadena.
  def aggStr(main_str: String, sep_str: String, ctr: Int): String = {
    var new_word = ""
    for (i <- 0 until ctr) {
      if (i < ctr - 1)
        new_word = new_word + (main_str + sep_str)
      else
        new_word += main_str
    }
    new_word
  }

  //Ejercicio 71  Escriba un programa en Scala para repetir un número específico de caracteres durante un número específico de veces desde la última parte de una cadena dada.
  def repeatChar(stng: String, no_repeat: Int): String = {
    val l = stng.length
    var new_word = ""
    for (i <- 0 until no_repeat) {
      new_word += stng.substring(l - no_repeat, l)
    }
    new_word
  }

  //Ejercicio 72 Escriba un programa Scala para crear una nueva cadena a partir de una cadena dada después de eliminar el segundo carácter de la subcadena de longitud tres que comienza con 'z' y termina con 'g' presente en dicha cadena.
  def newStr(stng: String): String = {
    val len = stng.length
    var newformstring = ""
    for (i <- 0 until len)
    {
      newformstring += stng.substring(i,i+1)
      if (i > 0 && i < len-1)
      {
        if (stng.charAt(i-1) == 'z' && stng.charAt(i+1) == 'g')
          newformstring = newformstring.substring(0,newformstring.length()-1)
      }
    }
    newformstring
  }

  //Ejercicio 73 Escriba un programa en Scala para verificar si el carácter inmediatamente anterior y posterior a un carácter específico es el mismo en una cadena dada.
  def confEqualChar(stng: String, schar: Char): Boolean = {
    var l = stng.length
    var found = true
    var tmpString: Char = ' '
    for (i <- 0 until l) {
      tmpString = stng(i)
      if (tmpString.compare(schar) == 0) {
        if (stng.charAt(i - 1) == stng.charAt(i + 1)) {
          found = true
        } else {
          found = false

        }
      }
    }
    found
  }

  //Ejercicio 74 Escriba un programa Java para verificar si dos cadenas de longitud 3 y 4 aparecen el mismo número de veces en una cadena dada.
  def progJava(stng: String, str1: String, str2: String): Boolean = {
    val l = stng.length
    var red = 0
    var blue = 0
    for (i <- 0 to l-3)
    {
      var tmp = stng.substring(i, i+3)
      if (tmp.compareTo(str2) == 0)
        red=red+1
    }
    for (i <- 0 to l-4)
    {
      var tmp = stng.substring(i, i+4)
      if (tmp.compareTo(str1) == 0)
        blue=blue+1
    }

    if (red == blue)
      true
    else
      false
  }

  //Ejercicio 75 Escriba un programa en Scala para crear una nueva cadena que repita cada carácter dos veces de una cadena dada.
  def newStr2xChar(stng: String): String = {
    val l = stng.length
    var newstring = ""
    for (i <- 0 until l) {
      newstring += stng.substring(i, i + 1) + stng.substring(i, i + 1)
    }
    newstring
  }

  //Ejercicio 76 Escriba un programa en Scala para hacer una nueva cadena a partir de dos cadenas dadas de tal manera que cada carácter de dos cadenas venga respectivamente.
  def newStr_2Str(stng1: String, stng2: String): String = {
    val len1 = stng1.length
    val len2 = stng2.length
    var max_len = Math.max(len1, len2)
    var newstring = ""
    for (i <- 0 until max_len) {
      if (i <= len1 - 1)
        newstring = newstring + stng1.substring(i, i + 1)
      if (i <= len2 - 1)
        newstring = newstring + stng2.substring(i, i + 1)
    }
    newstring
  }

  //Ejercicio 77 Escriba un programa en Scala para crear una nueva cadena formada por un número p de caracteres desde el primero de una cadena dada y seguido de p-1 caracteres numéricos hasta que p sea mayor que cero.
  def newStr3(stng: String, n: Int): String = {
    var l = n
    var newstring = ""

    for (i<-n to 0 by -1)
    {
      newstring = newstring + stng.substring(0,l)
      l = l -1
    }
    newstring
  }

  //Ejercicio 78 Escriba un programa Scala para crear una nueva cadena con cada carácter justo antes y después de una subcadena no vacía, cualquiera que sea la que aparezca en una cadena dada no vacía.
  def newStr4(m_stng: String, t_stng: String): String = {
    var m_st_len = m_stng.length()
    var t_st_len = t_stng.length()
    var fin = ""
    for (i <- 0 to m_st_len-t_st_len)
    {
      var tmp = m_stng.substring(i,i+t_st_len)
      if (i > 0 && tmp.equals(t_stng))
        fin += m_stng.substring(i-1,i)
      if (i < m_st_len-t_st_len && tmp.equals(t_stng))
        fin += m_stng.substring(i+t_st_len,i+t_st_len+1)
    }
    fin
  }

  //Ejercicio 79 Escriba un programa en Scala para contar el número de triples (caracteres que aparecen tres veces seguidas) en una cadena dada.
  def count3Char(stng: String): Int = {
    var l = stng.length()
    var ctr = 0
    for (i <- 0 to l-3)
    {
      var tmp = stng.charAt(i)
      if (tmp == stng.charAt(i+1) && tmp == stng.charAt(i+2))
        ctr=ctr+1
    }
    ctr
  }

  //Ejercicio 80 Escribe un programa en Scala para verificar si un personaje específico está feliz o no. Un personaje está feliz cuando el mismo personaje aparece a su izquierda o derecha en una cadena.
  def happyChar(stng: String, spc: Char): Boolean = {
    var l = stng.length()
    var char_happy = true
    for (i <- 0 until l) {
      if (stng.charAt(i) == spc) {
        if (i > 0 && stng.charAt(i - 1) == spc)
          char_happy = true
        else if (i < l - 1 && stng.charAt(i + 1) == spc)
          char_happy = true
        else
          char_happy = false
      }
    }
    char_happy
  }

  //Ejercicio 81 Escriba un programa en Scala para calcular la suma de los números que aparecen en una cadena dada.
  def sumNumChar(stng: String): Int = {
    val l = stng.length
    var sum = 0
    var temp = ""
    for (i <- 0 until l)
    {
      if (Character.isDigit(stng.charAt(i)))
      {
        if (i < l-1 && Character.isDigit(stng.charAt(i+1)))
        {
          temp += stng.charAt(i)
        }
        else
        {
          temp += stng.charAt(i)
          sum += Integer.parseInt(temp)
          temp = ""
        }
      }
    }
    sum
  }

  //Ejercicio 82 Escriba un programa Java para comprobar el número de apariciones de las dos subcadenas que aparecen en cualquier parte de la cadena.
  def test(stng: String): Boolean = {
    var l = stng.length
    var st_the = 0
    var st_is = 0
    for (i <- 0 until l)
    {
      if (i < l - 2)
      {
        var tmp = stng.substring(i, i+3)
        if (tmp.equals("the"))
          st_the = st_the +1
      }
      if (i < l - 1)
      {
        var tmp2 = stng.substring(i,i+2)
        if (tmp2.equals("is"))
          st_is = st_is + 1
      }
    }
    if (st_the == st_is)
      true
    else
      false
  }

  //Ejercicio 83 Escriba un programa en Scala para encontrar el índice de un elemento en una matriz dada.
  def indexNum (str: String, arr: Array[String]): Int =
    {
      arr.indexOf(str)
    }

  //Ejercicio 84 Escriba un programa en Scala para verificar si el valor del elemento rápido o último de dos matrices dadas (longitud 1 o más) de números enteros es el mismo o no.
  def firstlastCharSame2Arr (arr1: Array[Int], arr2: Array[Int]): Boolean =
    {
      if (arr1.length < 1 || arr2.length < 1) false
      else arr1.head == arr2.head || arr1.last == arr2.last
    }

  //Ejercicio 85 Escriba un programa en Scala para eliminar un elemento específico de una matriz dada.
  def delElemArra (arr: Array[String], pos: Int): Array[String] =
    {
      arr(pos) = ""
      // Or arr(pos) = null
      arr
    }

  //Ejercicio 86 Escriba un programa en Scala para rotar un elemento a la izquierda de una matriz dada (longitud 1 o más) de enteros.
  def  rotateLeft (arr: Array[Int]): Array[Int] =
    {
      arr.tail :+ arr.head
    }

  //Ejercicio 87 Escriba un programa en Scala para crear una nueva matriz tomando el elemento central de tres matrices de longitud 5.
  def newArrMiddle (arr1: Array[Int], arr2: Array[Int], arr3: Array[Int]): Array[Int] =
    {
      if (arr1.length != 5 || arr2.length != 5 || arr3.length != 5) throw new IllegalArgumentException("Array length not matched!")
      else Array(arr1(2), arr2(2), arr3(2))
    }

  //Ejercicio 88 Escriba un programa en Scala para invertir una matriz de valores enteros.
  def reverseArr (arr: Array[Int]): Array[Int] =
    {
      var temp1 = 0
      var temp2 = 0
      var index_position = 0
      var index_last_pos = arr.length - 1
      while (index_position < index_last_pos){
        temp1 = arr(index_position)
        temp2 = arr(index_last_pos)
        arr(index_position) = temp2
        arr(index_last_pos) = temp1
        index_position += 1
        index_last_pos += 1
      }
      arr
    }

  //Ejercicio 89 Escriba un programa en Scala para verificar dos números, 4 o 7 presentes en una matriz dada de enteros.
  def existNum (arr: Array[Int]): Boolean =
  {
    arr.exists(x => x == 4 || x == 7)
  }

  //Ejercicio 90 Escriba un programa en Scala para encontrar los elementos comunes entre dos matrices de enteros.
  def compar2Arr (arr1: Array[ Int], arr2: Array[Int]): List[Int] =
    {
      var j = 0
      var temp: List[Int] = List.empty[Int]
      for (i <- arr1.indices){
        j = 0
        for (j <- arr2.indices){
          if (arr1(i) == arr2(j)){
            temp :+ arr1(i)
          }
        }
      }
      temp
    }

  //Ejercicio 91 Escriba un programa en Scala para encontrar los elementos comunes entre dos matrices de cadenas.
  def findCommonElemArr (arr1: Array[String], arr2: Array[String]): ArrayBuffer[String] =
    {
      val temp: ArrayBuffer[String] = ArrayBuffer.empty[String]
      for (i <- arr1.indices){
        for (j <- arr2.indices){
          if (arr1(i).equals(arr2(j))){
            temp.append(arr1(i))
          }
        }
      }
      temp
    }

  //Ejercicio 92 Escriba un programa en Scala para detectar elementos duplicados de una matriz de cadenas.
  def duplicateArr (arr: Array[String]): Unit =
    {
      var f = 0
      for (i <- arr.indices){
        var x = f + 1
        for (j <- x until arr.length){
          if (arr(f) == arr(x) && (f != x)){
            println(arr(x))
          }
          x = x  + 1
        }
        f = f + 1
      }
    }

  //Ejercicio 93 Escriba un programa en Scala para eliminar elementos duplicados de una matriz de enteros.







  //Ejercicio  Pascal´s triangle
  def pascal(c: Int, r: Int): Int =
    if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)

  //Ejercicio  Parentheses Balancing
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def score(chars: List[Char], acc: Int = 0): Int =
      if (chars.isEmpty || acc < 0)
        acc
      else {
        val c = chars.head
        score(chars.tail, if (c == '(') acc + 1 else if (c == ')') acc - 1 else acc)
      }
    score(chars) == 0
  }

  //Ejercicio  Counting Change
  def countChange(money: Int, coins: List[Int]): Int = {
    def countChangeCombinations(money: Int, coins: List[Int]): Int =
      if (money == 0)
        1
      else if (money < 0 || coins.isEmpty)
        0
      else
      // total combinations = using the first coin only + using all other coins
        countChangeCombinations(money - coins.head, coins) + countChangeCombinations(money, coins.tail)

    countChangeCombinations(money, coins)
  }




  def main(args: Array[String]): Unit = {
    println()
  }
}




