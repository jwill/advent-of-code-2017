import java.io.File
import java.util.regex.Pattern

fun main(args: Array<String>) {
        var sum = 0
        val rows = File("day2.txt").readLines()

        val pattern = Pattern.compile("\\p{Space}")
        
        for (row in rows) {
                var values:List<String> = row.split(pattern)
                var nums = mutableListOf<Int>()
                values.forEach { it -> nums.add(it.toInt())}
                val sorted = nums.sorted()

                val lowest = sorted.first().toInt()
                val highest = sorted.last().toInt()
                sum += (highest - lowest)

        }

        println(sum)
}
