package data

class IntegersArray(private val buffer: String?) {

  companion object {
    private const val DELIMITER = " "
  }

  val array: Array<Int>
    get() = buffer
      ?.split(DELIMITER)
      ?.map { it.toInt() }
      ?.toTypedArray() !!
}
