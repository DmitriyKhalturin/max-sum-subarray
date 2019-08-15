package algorithm

import data.IntegersArray
import data.MaxSumIntoRange

class GetMaxSumSubarray(private val data: IntegersArray) {

  private val integersArray = data.array
  private val maxSumRange = MaxSumIntoRange(0, 0, integersArray[0])

  fun run(): MaxSumIntoRange {
    for (i in integersArray.indices) {
      var currentSum = 0

      loop@ for (j in i..integersArray.lastIndex) {
        currentSum += integersArray[j]

        when {
          (currentSum > maxSumRange.sum) -> {
            maxSumRange.apply {
              sum = currentSum
              startIndex = i
              endIndex = j
            }
          }
          (currentSum < 0) -> break@loop
        }
      }
    }

    return maxSumRange
  }
}
