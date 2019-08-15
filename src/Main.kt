import algorithm.GetMaxSumSubarray
import data.IntegersArray

class Main {
  companion object{
    @JvmStatic
    fun main(args: Array<String>) {
      print("Put Integer numbers: ")

      val buffer = readLine()

      try {
        val data = IntegersArray(buffer)
        val algorithm = GetMaxSumSubarray(data)

        println(algorithm.run())
      } catch (exception: Exception) {
        when(exception) {
          is NumberFormatException -> println("Failed convert to Integer")
        }
      }
    }
  }
}
