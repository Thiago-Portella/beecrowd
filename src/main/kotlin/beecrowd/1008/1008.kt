fun main() {
    val employeeNumber = readln().toInt()
    val workedHour = readln().toInt()
    val salaryPerHour = readln().toDouble()
    println("NUMBER = ${employeeNumber}")
    println("SALARY = U$ %.2f".format(workedHour * salaryPerHour))

}