object q2 {
    def main (args:Array[String]) {
        var a:Int = 2
        var b:Int = 3
        var c:Int = 4
        var d:Int = 5
        var k:Float = 4.3f

        //a)
        b -= 1
        val resulta = b * a + c * d
        d -= 1
        println(resulta)

        //b)
        println(a)
        a += 1

        //c)
        val resultc = (-2) * (a - k) + c //used a instead of g, as g is not given
        println(resultc)

        //d)
        println(c)

        //e)
        c += 1
        c = c * a
        println(c)
        a += 1
    }
}