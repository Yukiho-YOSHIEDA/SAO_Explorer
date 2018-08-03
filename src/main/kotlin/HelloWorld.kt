import java.io.File

fun main(args: Array<String>){
    println("HelloWorld")

    println("> Please input Directory.")
    var fileName: String? = readLine()

    var current: File = File(fileName)

    printDirectory(current, 0)
}

fun printDirectory(fileName: File, depth: Int){
    if(!fileName.exists()){
        return
    }

    for(i in 1..depth){
        print("  ")
    }
    println(fileName.name)

    if(fileName.isDirectory){
        for (child: File in fileName.listFiles()){
            printDirectory(child, depth + 1)
        }
    }
}