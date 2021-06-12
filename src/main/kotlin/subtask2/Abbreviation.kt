package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        val aArr = arrayListOf<Int>()
        var a2 = ""
        val bArr = arrayListOf<Int>()
        var b2 = ""
        for (i in a.indices) {
            for (j in b.indices) {
                if (a[i].equals(b[j], ignoreCase = true)) {
                    aArr.add(i)
                    a2 += a[i]
                    bArr.add(j)
                    b2 += b[j]
                }
            }
        }
        val a1 = aArr.sorted()
        val b1 = bArr.sorted()
        return if (a1.equals(aArr) && b1.equals(bArr) && b.toUpperCase().equals(b2.toUpperCase())) {
            "YES"
        } else {
            "NO"
        }
    }
}
