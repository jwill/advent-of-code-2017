import java.io.File


fun main(args: Array<String>) {
        /*val testCase1 = "1122"
        val results1 = 6

        val testCase2 = "1221"
        val results2 = 0

        val testCase3 = "123425"
        val results3 = 4*/


        val input = File("day1.txt").readText().trim()
        
        var sum = 0
        val ZERO = '0'.toInt()
        
        val interval = input.length / 2
        println(interval)
        
        input.forEachIndexed { index, value ->

                var nextIndex = (index + interval) % input.length
                println(nextIndex)
                        
                println("${input[index]} : ${input[nextIndex]}")
                        if (input[index].equals(input[nextIndex])) {
                                sum += input[index].toInt() - ZERO
                        }
        }

        
        println(sum)
}
