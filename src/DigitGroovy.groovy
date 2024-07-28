class DigitGroovy {
    def countDigit(int[] array) {
        def map = [:]
        array.each { num ->
            def count = map.get(num, 0)
            map[num] = count + 1
        }
        return map
    }
}
