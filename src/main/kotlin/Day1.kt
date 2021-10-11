class Day1: Day<List<Int>> {
    override fun parse(input: String): List<Int> {
        return input.trim().lines().map { it.toInt() }
    }

    override fun part1(input: List<Int>): Any {
        for (i in input) {
            for (j in input) {
                if (i+j == 2020) {
                    return i*j;
                }
            }
        }
        return 0
    }

    override fun part2(input: List<Int>): Any {
        for (i in input) {
            for (j in input) {
                for (k in input) {
                    if (i+j+k == 2020) {
                        return i*j*k;
                    }
                }

            }
        }
        return 0
    }

}