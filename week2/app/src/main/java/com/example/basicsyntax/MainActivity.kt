package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        //if-else문 확인하기
        var ball = 4
        if(ball > 3){
            Log.d("ControlFlow", "4볼로 출루합니다.")
        }else{
            Log.d("ControlFlow", "타석에서 다음 타구를 기다립니다.")
        }
         */


        /*
        //변수에 if문 직접 사용하기
        var eraOfRyu = 2.32
        var eraOfDegrom = 2.43

        val era = if(eraOfRyu<eraOfDegrom){
            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
            eraOfRyu
        } else{
            Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
            eraOfDegrom
        }

        Log.d("MLB_Result", "2019년 MLB에서 가장 높은 ERA는 ${era}입니다.")
        //${} >> 코드블록. if-else문이 들어감.
         */


        /*
        //배열 실습
        var students = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)
        //arrayOf를 사용한 즉시 값 대입
        var intArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
        //문자열 배열 선언
        var stringArray= Array(10, {item->""})
        //arrayOf 값을 직접 입력
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")
        //대괄호를 사용한 값 대입
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94
        //set함수 사용하여 값 대입
        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)
        //값 변경
        intArray[6] = 137
        intArray.set(9, 200)
        //배열 사용하기
        var seventhValue = intArray[6]
        Log.d("Array", "여덟 번째 intArray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array", "열 번째 intArray의 값은 ${tenthValue}입니다.")
        //변수에 담지 않고 직접 사용하기
        Log.d("Array", "첫 번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array", "여섯 번째 dayArray의 값은 ${dayArray.get(5)}입니다.")
         */

        /*
        //반복문(for 실습)
        for(index in 1..10){
            Log.d("For", "현재 숫자는 ${index}")
        }
        //until 사용
        var array = arrayOf("Jan", "FEB", "MAR", "APR", "MAY", "JUN")
        for(index in 0 until array.size){
            Log.d("For", "현재 월은 ${array.get(index)}입니다.")
        }
        //건너뛰기(step)
        for(index in 0..10 step 3){
            Log.d("For", "건너뛰기: ${index}")
        }
        //감소시키기(downTo)
        for(index in 10 downTo 0) {
            Log.d("For", "감소시키기: ${index}")
        }
        //건너뛰며 감소시키기(downTo step)
        for(index in 10 downTo 0 step 3){
            Log.d("For", "건너뛰며 감소시키기: ${index}")
        }
        //배열 컬렉션 그대로 사용하기
        for(index in array){
            Log.d("For", "현재 월은 ${index}입니다.")
        }
         */

        /*
        //클래스
        //부모 클래스 직접 호출하기
        var parent = Parent()
        parent.sayHello()
        //자식클래스 호출해서 사용하기
        var child = Child()
        child.myHello()

        testStringExtension()
         */

        /*
        //null 사용하기
        var nullable:String?= null
        var size = nullable.length:33
        Log.d("Nullable", "문자열의 길이 = ${size}")
         */
    }

    fun testStringExtension(){
        var original = "Hello"
        var added = " Guys~"
        Log.d("Extension", "added를 더한 값은 ${original.plus(added)}입니다.")
    }

    open class Parent{
        var hello: String = "안녕하세요"
        fun sayHello(){
            Log.d("Extension", "${hello}")
        }
    }

    class Child: Parent() {
        fun myHello(){
            hello = "Hello"
            sayHello()
        }
    }

    open class BaseClass{
        open fun opened(){}
        fun notOpened(){}
    }

    class ChildClass:BaseClass(){
        override fun opened() {}
        //override fun notOpened() {} //오류
    }

    open class BaseClass2{
        open var opened: String = "I am"
    }
    class ChildClass2: BaseClass2(){
        override var opened: String = "You are"
    }
    fun String.plus(word: String): String{
        return this + word
    }
}