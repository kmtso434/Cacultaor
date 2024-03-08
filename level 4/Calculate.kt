package `level 4`

import com.example.level4.kt.MultiplyOperation
import com.example.level4.kt.AddOperation
import com.example.level4.kt.DivideOperation
import com.example.level4.kt.SubstractOperation
import java.math.BigDecimal

class Calculate {
    private val addOperation =AddOperation()
    private val substractOperation = SubstractOperation()
    private val multiplyOperation = MultiplyOperation()
    private val divideOperation = DivideOperation()

    var result = 0.toBigDecimal()

    fun first(){
        print("숫자를 입력해주세요 : ")
        var num1 = readLine()!!.toBigDecimal()

        print("연산기호를 입력해주세요(+,-,/,x,=,c 초기화) : ")
        var operate = readLine()!!.toString()

        print ("숫자를 입력해주세요 : ")
        var num2 = readLine()!!.toBigDecimal()

        when(operate) {
            "+" -> {
                result = addOperation.operate(num1, num2)
                second()
            }
            "/" -> {
                result = divideOperation.operate(num1, num2)
                second()
            }
            "-" -> {
                result = substractOperation.operate(num1, num2)
                second()
            }
            "x" -> {
                result = multiplyOperation.operate(num1 , num2)
                second()
            }
            "c" ->{
                result = 0.toBigDecimal()
                print("다시 시작하겠습니다")
                first()
            }
            else-> {
                print("잘못 입력하셨습니다. 숫자부터 다시 입력해주세요")
                Calculate().first()
            }
        }

        result = result

    }

    fun second(){
        print("연산기호를 입력해주세요(+,-,/,x,=,c) : ")
        var operate = readLine()!!.toString()

        when(operate) {
            "+" -> {
                print ("숫자를 입력해주세요")
                var num2 = readLine()!!.toBigDecimal()
                result = addOperation.operate(result, num2)
                second()
            }
            "/" -> {
                print ("숫자를 입력해주세요")
                var num2 = readLine()!!.toBigDecimal()
                result = divideOperation.operate(result, num2 )
                second()
            }
            "-" -> {
                print ("숫자를 입력해주세요")
                var num2 = readLine()!!.toBigDecimal()
                result = substractOperation.operate(result , num2)
                second()
            }
            "x" -> {
                print ("숫자를 입력해주세요")
                var num2 = readLine()!!.toBigDecimal()
                result = multiplyOperation.operate(result , num2)
                second()
            }
            "=" -> {
                print("결과값은 $result 입니다")
                print("종료하시겠습니까? 네 | 아니요")
                var end = readLine()!!.toString()

                when (end){
                    "아니요" -> first()
                    "네" -> third()
                }
            }
            "c" ->{
                result = 0.toBigDecimal()
                print("다시 시작하겠습니다")
                first()
            }
            else-> {
                print("잘못 입력하셨습니다. 숫자부터 다시 입력해주세요")
                Calculate().first()
            }
        }

    }

    fun third(){
        print("수고하셨습니다, 이용해주셔서 감사합니다")

    }

}