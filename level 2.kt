fun main () {
    class Calculator {
        fun operation() {

            print("값을 입력하세요: ")
            var num1 = readLine()!!.toDouble()

            print("1 = 더하기 , 2 = 빼기, 3 = 곱하기, 4 = 나누기 , 5 = 나머지 구하기, -1 은 종료입니다: ")
            var operation = readLine()!!.toString()

            print("값을 입력하세요: ")
            var num2 = readLine()!!.toDouble()

            var result = 0.0

            when (operation) {
                "1" -> result = num1 + num2
                "2" -> result = num1 - num2
                "3" -> result = num1 * num2
                "4" -> result = num1 / num2
                "5" -> result = num1 % num2
                "-1" -> println("프로그램을 종료합니다")
                else -> println("잘못된 연산자입니다")
            }

            println("결과: $result")

        }
    }

    Calculator().operation()

}
