package edu.knoldus

import scala.annotation.tailrec

class Searching {

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    val newArray = array.sorted
    @tailrec
    def toBinarySearch(newArray: Array[Int], elem: Int, firstIndex: Int, lastIndex: Int): Boolean = {
      if (elem>newArray(lastIndex)) false
      else {
        val middle = (firstIndex + lastIndex)/2
        if (elem==newArray(middle)) true
        else if(elem<newArray(middle)) toBinarySearch(newArray,elem,firstIndex, middle-1)
        else toBinarySearch(newArray,elem,middle+1,lastIndex)
      }
    }
    toBinarySearch(newArray,elem,0,newArray.length-1)
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = array.filter(_==elem).lengthIs>0

}
