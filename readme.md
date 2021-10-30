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
**Второе задание.** Используя жизненный цикл активности вывести в логе строки стихотворения в правильном порядке.
***   
``Ты видел деву на скале
В одежде белой над волнами
Когда, бушуя в бурной мгле,
Играло море с берегами,
Когда луч молний озарял
Ее всечасно блеском алым
И ветер бился и летал
С ее летучим покрывалом?
Прекрасно море в бурной мгле
И небо в блесках без лазури;
Но верь мне: дева на скале
Прекрасней волн, небес и бури.``

***
***Жизненный цикл***
```kotlin */
class MainActivity : AppCompatActivity() {

    private lateinit var helloTextView: TextView
    private lateinit var randomizeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        helloTextView = findViewById(R.id.hello_text_view)
        helloTextView.text = getString(R.string.app_name)
        randomizeButton = findViewById(R.id.randomize_button)

        if (savedInstanceState != null)
            helloTextView.text = savedInstanceState.getString(VALUE)
        else
            randomize()


        randomizeButton.setOnClickListener {
            randomize()
        }
            Log.d(MY_OWN_LOG_TAG, "Ты видел деву на скале\n" +
                        "В одежде белой над волнами")


    }
        override fun onStart() {
            super.onStart()
            Log.d(MY_OWN_LOG_TAG, "Когда, бушуя в бурной мгле,\n" +
                    "Играло море с берегами,")
        }

        override fun onResume() {
            super.onResume()
            Log.d(MY_OWN_LOG_TAG, "Когда луч молний озарял\n" +
                    "Ее всечасно блеском алым")
        }

        override fun onPause() {
            super.onPause()
            Log.d(MY_OWN_LOG_TAG, "И ветер бился и летал\n" +
                    "С ее летучим покрывалом?")
        }

        override fun onStop() {
            super.onStop()
            Log.d(MY_OWN_LOG_TAG, "Прекрасно море в бурной мгле\n" +
                    "И небо в блесках без лазури;")
        }

        override fun onRestart() {
            super.onRestart()
            Log.d(MY_OWN_LOG_TAG, "Ты видел деву на скале\n" +
                    "В одежде белой над волнами")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(MY_OWN_LOG_TAG, "Но верь мне: дева на скале\n" +
                    "Прекрасней волн, небес и бури.")
        }

```