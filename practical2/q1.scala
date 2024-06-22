object q1 {
    def main(args:Array[String]) {
        var k = 2;
        var i = 2;
        var j = 2;
        var m = 5;
        var n = 5;
        var f = 12.0f;
        var g = 4.0f;
        var c = 'X';

        val result1 = k + 12 * m;
        val result2 = m / j;
        val result3 = n % j;
        val result4 = m / j * j;
        val result5 = f + 10 * 5 + g;
        val result6 = {
            i = i + 1
            i * n
        }

        println(s"a) k + 12 * m = $result1");
        println(s"b) m / j = $result2");
        println(s"c) n % j = $result3");
        println(s"d) m / j * j = $result4");
        println(s"e) f + 10 * 5 + g = $result5");
        println(s"f) ++i * n = $result6");
    }
}
