package subtask1

import java.text.SimpleDateFormat

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String{
        return try {
            val formatter = SimpleDateFormat("dd.MM.yyyy")
            formatter.isLenient = false
            val date = "$day.$month.$year"
            val localDate = formatter.parse(date)
            "$day ${map1[month]}, ${map[localDate.toString().split(" ")[0]]}"
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}

    val map = mapOf("Mon" to "понедельник",
        "Tue" to "вторник",
        "Wed" to "среда",
        "Thu" to "четверг",
        "Fri" to "пятница",
        "Sat" to "суббота",
        "Sun" to "воскресенье")
    val map1 = mapOf("1" to "января",
        "2" to "февраля",
        "3" to "марта",
        "4" to "апреля",
        "5" to "мая",
        "6" to "июня",
        "7" to "июля",
        "8" to "августа",
        "9" to  "сентября",
        "10" to  "октября",
        "11" to  "ноября",
        "12" to  "декабря")
