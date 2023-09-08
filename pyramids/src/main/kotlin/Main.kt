fun main() {
println("input the size of your pyramid")
    val height= readLine()?.toInt()
    if (height == null) {
            println("input a valid height")
        }
    else pyramid(height)

}
fun pyramid(height: Int) {
    var resultSentence = listOf<String>()
    var width = 1
    var str = ""
    for (i in 0..height - 1) {
        for (i in 0..width - 1) {
            str += '#'
        }
            while (str.length < height * 2) {
                str = " $str "
            }
            println(str)
            resultSentence += str
            str = ""
            width += 2
        }
    }

