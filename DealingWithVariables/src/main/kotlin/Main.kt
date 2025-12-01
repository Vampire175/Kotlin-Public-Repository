//region Val Examples
//Val are variables which cannot be changed after a time in program
fun dealWithValInt(){
    val x:Int=5 //We have taken a simple variable named x which is an int which has been assigned a value of 5. You can change this!
    println(x)
}

//ImportantPoint-The float take 32 bit of your memory and doubles take 64 bit of your memory. You can leave double numbers as it is however you have to write an 'f' after your float number. You can check out this example!

fun dealWithValFloat(){
    val x:Float=5.3f //We have taken a simple variable named x which is a float which has been assigned a value of 5.3f. You can change this!
    println(x)
}

fun dealWithValDouble(){
    val x:Double=5.326 //We have taken a simple variable named x which is a double which has been assigned a value of 5.326. You can change this!
    println(x)
}

fun dealWithValBool(){
    val x:Boolean=true //We have taken a simple variable named x which is a Boolean which has been assigned a value true. You can change this!
    println(x)
}

fun dealWithValString(){
    val x:String="Vampire" //We have taken a simple variable named x which is a String which has been assigned a value named Vampire. You can change this!
    println(x)
}

//endregion

//region Var Examples
//Var are variables which can be changed after a time in program
fun dealWithVarInt(){
    var x:Int=5 //We have taken a simple variable named x which is an int which has been assigned a value of 5. You can change this!
    x=6//Now we have changed it to 6
    println(x)
}

//ImportantPoint-The float take 32 bit of your memory and doubles take 64 bit of your memory. You can leave double numbers as it is however you have to write an 'f' after your float number. You can check out this example!

fun dealWithVarFloat(){
    var x:Float=5.3f //We have taken a simple variable named x which is a float which has been assigned a value of 5.3f. You can change this!
    x=4.2f //Now we have changed it to 4.2
    println(x)
}

fun dealWithVarDouble(){
    var x:Double=5.326 //We have taken a simple variable named x which is a double which has been assigned a value of 5.326. You can change this!
    x=3.1//Now we have changed its value to 3.1
    println(x)
}

fun dealWithVarBool(){
    var x:Boolean=true //We have taken a simple variable named x which is a Boolean which has been assigned a value true. You can change this!
    x=false//Now we have changed it to false
    println(x)
}

fun dealWithVarString(){
    var x:String="Vampire" //We have taken a simple variable named x which is a String which has been assigned a value named Vampire. You can change this!
    x="Vampiress"//Now we have changed it to vampiress
    println(x)
}

//endregion
fun main(){
    //Here we are running the functions
    println("Running Val Examples...")
    //region Running Val
    dealWithValInt()
    dealWithValFloat()
    dealWithValDouble()
    dealWithValBool()
    dealWithValString()
    //endregion
    println("Running Var Examples...")
    //region Running Var
    dealWithVarInt()
    dealWithVarFloat()
    dealWithVarDouble()
    dealWithVarBool()
    dealWithVarString()
    //endregion
}