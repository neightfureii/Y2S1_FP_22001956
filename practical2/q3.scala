object q3 {
    def main (args: Array[String]) {
        def normalPay(n: Int) = 250 * n 
        def otPay(n : Int) = 85 * n
        def takeHome(nh: Int, oth: Int) = (normalPay(nh) + otPay(oth)) * 88 / 100
    
        println(takeHome(40,30))
    }
}