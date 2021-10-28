**Курс Андроид разработка**
=====================
Это тестовый проект, где будут выкладываться задания с курса и их решения.
***
**Первое задание.** Вывести каждую четную букву алфавита, используя циклы и коллекции.
***
***Функция collection()***
```kotlin */
fun collection(){
        val helloTextView: TextView = findViewById(R.id.hello_text_view)
        val alphabet = mutableListOf("а","б","в","г","д","е","ё","ж","з","и","й","к","л","м","н","о","п","р","с","т","у","ф","х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я")
        val letters = mutableListOf<String>()
            alphabet.forEachIndexed { index, value
            ->
                if (index % 2 != 0)
                    letters.add(value)
            }
        helloTextView.text = letters.toString().replace("[", "").replace("]", "")

    }
    ```