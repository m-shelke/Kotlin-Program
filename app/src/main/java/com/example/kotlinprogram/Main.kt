package com.example.kotlinprogram

import kotlin.io.path.Path

class Main {

    companion object {

        @JvmStatic
        fun main(arr: Array<String>) {


//            Data types in Kotlin (All is Declared In Capital Letters)
            Byte
            Short
            Int
            Long
            Float
            Double
            Char
            Boolean

//            Declaration of Variable In Kotlin
            var int: Int = 10
            var string: String = " Nothing.."

//            Difference btw Var and Val Variable
            val long: Long = 10000;
            //  long = 200

            //            Difference btw Var and Val Variable
            int = 100

//            print Stmt in Kotlin
            println("Hello Kotlin..$string!! " + int)

//            if stmt in Kotlin
            if (int < 120) {
                println("100 Is Greater Than 120")
            }

//            if-else stmt in Kotlin
            if (int > 120) {
                println("100 Is Greater Than 120")
            } else {
                println("Number is Less Than 120")
            }

//            Ternary if-else
            var msg: String = if (int <= 110) "Less Than 110" else "Greater Than or Equal to 110"
            println(msg)

//            else-if stmt in Kotlin
            if (int > 120) {
                println("100 Is Greater Than 120")
            } else if (int == 100) {
                println("100 Is Euqal to 100")
            } else {
                println("No Result Found")
            }

//            switch stmt in Kotlin
            when {

                int > 90 -> {
                    println("100 Is Less Than 90")
                }

                int < 120 -> {
                    println("100 Is Less Than 120")
                }

                else -> {
                    println("Else Nothing")
                }
            }

//            Immutable list with String Type (Immutable = ReadOnly Operation)
            val aList = listOf<String>("A", "B", "C", "D")
            println()
            println(aList)

//            Immutable list of Any data type (Immutable = ReadOnly Operation)
            val blist = listOf<Any>("A", 1, "B", 2.2)
            println(blist)

            //            Immutable Nested List of Any data type (Immutable = ReadOnly Operation)
            val clist = listOf("A", 2.1, "B", 7.8, listOf("a", "b", "c", "c"))
            println(clist)

//            mutable list of String type
            val dlist = mutableListOf("a", "b", "c", "d")
            dlist.add(0, "v")
            println(dlist)

            //            mutable list of any type
            val elist = mutableListOf("a", "b", "c", "d", 1)
            elist.add(0, 20.toString())
            elist.add(2, 20)
            println(elist)

            //            mutable list of any type
            val flist = mutableListOf<Any>("a", "b", "c", "d")
            flist.add(0, 210)
            println(flist)

            //            adding two mutable list
            val glist = mutableListOf<Any>("a", "b", "c", "d")
            glist.add(1, "AA")
            glist.add(0, "v")

            val hlist = mutableListOf("RR", false)
            glist.addAll(hlist)

            println(glist)

//            Immutable set of String
            val aSet = setOf("a", "b", "c")
            println(aSet)

            //            Immutable set of Any datatype
            val bSet = setOf<Any>("10", 1200, "TT")
            println()
            println(bSet)

            //            Mutable set of String
            val cSet = mutableSetOf<Any>("AA", "BB")
            cSet.add(true)
            println(cSet)

            //           Mutable set of Any datatype
            val dSet = mutableSetOf<Any>("QQ", 120.10)
            dSet.add(12121)
            println(dSet)


            //        Immutable map in Kotlin, in form of "Key-Value " paired !!
            val aMap = mapOf<Int, String>(1 to "AA", 2 to "CC")
            println()
            println(aMap)


            //      Any Immutable map in Kotlin, in form of "Key-Value " paired !!
            val bMap = mapOf<Any, String>(120 to "AGE", 12.5 to "545", "Hello" to "58")
            println(bMap)

            //   Any to Any  Mutable map in Kotlin, in form of "Key-Value " paired !!
            val cMap = mutableMapOf<String, Any>("120" to 120, "456" to "HH")
            println(cMap)

            //        Mutable map in Kotlin, in form of "Key-Value " paired !!
            val dMap = mutableMapOf<String, Any>("A" to "1", "B" to "2")
            dMap.putAll(cMap)
            dMap["A"] = "raman"
            println(dMap)

//            Arraylist in Kotlin
            val arr = ArrayList<Int>()

            arr.add(0, 122)
            arr.add(1, 789)
            arr.add(2, 48977)

            arr[1] = 123466
            println()
            println(arr)

            arr.remove(122)
            println(arr)

            arr.removeAt(1)
            println(arr)


            println()

            var number = 0
//            for loop in Kotlin
            for (i in 0..10) {
                println("Number Is ${number++}")
            }

            println()
            //            executing for loop, using "until"
            var num = 0
            for (i in 0 until 10) {
                println(num++)
            }

            //            executing for loop, using "downTo"
            println()
            var num1 = 0
            for (i in 10 downTo 0) {
                println(num1++)
            }

            println()
            var num2 = 0
            //            executing for loop, using "step )(++)"
            for (i in 0.. 10 step 2){
                println(num2++)
            }

//            for using Arraylist

            val arrNo = ArrayList<Int>()
            arrNo.add(1)
            arrNo.add(2)
            arrNo.add(3)
            arrNo.add(4)
            arrNo.add(5)
            arrNo.add(6)
            arrNo.add(7)
            arrNo.add(8)
            arrNo.add(9)
            arrNo.add(10)

            for (i in arrNo){
                println("Values Of ArrayList ${i}")
            }

            println()

//            while loop in Kotlin
            var num5 : Int = 10
            while(num5<20){
                println("Number Is $num5")
                num5++
            }

//            do-while loop in Kotlin
            println()
            println()
            var num6 = 10
            do {
                println("Number Is $num6")
            }while (num6>=20)

            println()
//            Paired in Kotlin
            val (a,b) = Pair(11,true)
            println("$a $b")

//            Orrr
            val name = Pair("Rangit","Solunke")
            println("${name.second}{ $name.flist}")

            val paired = Pair(true, Pair("Anurag","Samkal"))
            println(paired.second.second)

//            Triple in Kotlin
            println()
            val triple = Triple(120,1.2,true)
            println(triple)

            val triple1 = Triple(true,false,true)
            println(triple1.second)
            println(triple1.third)

            val (x,y,z) = Triple("rohan","Gita","Home")
            println("$x $z $y")

            val triple3 = Triple(1,2,Triple("A","B",Triple("x","y","Z")))
            println(triple3.third)

        }

        //        Function declaration is Kotlin with return type
        fun add(): Int {
            return 10 + 20
        }

        //        Method with any return type
        fun any(): Any {
            return false
        }

        //        method overloading in Kotlin
        fun multhify(a: Int = 20, b: Int = 10): Int {
            return a * b
        }

        //                method overloading in Kotlin
        fun overLoading(a: Int = 20, b: Int = 10, c: Int): String {
            return "Solution Is ${a + b + c}"
        }


    }


}