import java.io.File


fun main(args: Array<String>) {
        /*val testCase1 = "1122"
        val results1 = 3

        val testCase2 = "1111"
        val results2 = 4

        val testCase3 = "1234"
        val results3 = 0

        val testCase4 = "91212129"
        val results = 9*/

        
        val input = File("day1.txt").readText().trim()
        
        var sum = 0
        val ZERO = '0'.toInt()
        

        input.forEachIndexed { index, value ->

                var nextIndex = index + 1
                        // Check wrap around
        if (nextIndex == input.length) {
                nextIndex = 0
        }
                println("${input[index]} : ${input[nextIndex]}")
                        if (input[index].equals(input[nextIndex])) {
                                sum += input[index].toInt() - ZERO
                        }
        }

        
        println(sum)
}
