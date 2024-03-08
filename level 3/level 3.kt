import com.example.level3.kt.AddOperation
import com.example.level3.kt.MultiplyOperation
import com.example.level3.kt.SubstractOperation
import com.example.level3.kt.DivideOperation

fun main(){
    var result = 0.0

    class Calculate{
        fun calculate () {
            if (result == 0.0) {
                print("값을 입력해주세요 :")
                var num1 = readLine()!!.toDouble()

                print("연산기호를 입력해주세요(+,-,x,/) :")
                var operation = readLine()!!.toString()

                print("값을 입력하세요 : ")
                var num2 = readLine()!!.toDouble()

                when (operation) {
                    "+" -> result = AddOperation().add(num1, num2)
                    "-" -> result = SubstractOperation().sub(num1, num2)
                    "x" -> result = MultiplyOperation().time(num1, num2)
                    "/" -> result = DivideOperation().divide(num1, num2)
                    else -> {
                        println("다시 계산해주세요")
                        calculate()
                    }

                }

            } else {
                print ("${result}뒤에 연산기호를 넣어주세요 (+,-,x,/) :")
                var operation2 = readLine()!!.toString()

                print ("값을 입력해주세요 : ")
                var num2 = readLine()!!.toDouble()

                when (operation2) {
                    "+" -> result = AddOperation().add(result, num2)
                    "-" -> result = SubstractOperation().sub(result, num2)
                    "x" -> result = MultiplyOperation().time(result, num2)
                    "/" -> result = DivideOperation().divide(result, num2)
                    else -> {
                        println ("다시 시작해주세요")
                    }
                }
                print("결과값은 $result 입니다")
            }

            Calculate().again()

        }

        fun again(){
            print (" 결과값에 더 계산하시려면 1, 다시 계산하시려면 2,종료하시려면 3을 눌러주세요 :")
            var again = readLine()!!.toInt()

            when (again){
                1 -> calculate()
                2 -> {
                    result = 0.0
                    calculate()
                }
                3 -> print("종료되었습니다")
                else-> {
                    print ("값이 아닙니다, 다시 해주세요")
                    result = result
                    Calculate().again()
                }

            }
        }

    }

    Calculate().calculate()
}