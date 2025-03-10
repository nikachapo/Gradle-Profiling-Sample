package ge.chapo.feature5

import kotlin.random.Random

class ComplexFeatureProcessor {

    private val dataList: MutableList<DataItem> = mutableListOf()

    init {
        // Simulate a large amount of data initialization
        for (i in 0..10000) {
            dataList.add(DataItem("Item $i", Random.nextInt(0, 1000), generateRandomData()))
        }
    }

    fun processAllItems(): List<ProcessedData> {
        return dataList.map { processItem(it) }
    }

    private fun processItem(item: DataItem): ProcessedData {
        val processedValues = item.data.map { it * 2 }
        val averageValue = processedValues.average()

        return ProcessedData(
            name = item.name,
            originalValue = item.value,
            processedValues = processedValues,
            averageValue = averageValue
        )
    }

    private fun generateRandomData(): List<Int> {
        return List(1000) { Random.nextInt(0, 100) }
    }

    // Nested classes to simulate complexity
    data class DataItem(val name: String, val value: Int, val data: List<Int>)

    data class ProcessedData(
        val name: String,
        val originalValue: Int,
        val processedValues: List<Int>,
        val averageValue: Double
    )

    // Additional methods for complexity
    fun filterItemsByThreshold(threshold: Int): List<DataItem> {
        return dataList.filter { it.value > threshold }
    }

    fun sortItemsByValue(): List<DataItem> {
        return dataList.sortedBy { it.value }
    }

    fun findTopNItems(n: Int): List<DataItem> {
        return dataList.sortedByDescending { it.value }.take(n)
    }

    fun complexNestedLoops(): Int {
        var sum = 0
        for (i in 0 until 1000) {
            for (j in 0 until 1000) {
                sum += i * j
            }
        }
        return sum
    }

    fun stringManipulationTask(): String {
        return (0..5000).joinToString(",") { "String $it" }
    }
}
