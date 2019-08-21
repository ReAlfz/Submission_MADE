package com.realfz.submission

class GameData {
    private  val  data = arrayOf(
        arrayOf(
            "Sekiro",
            "Salah satu game dari steam yang kesulitannya tergolong tinggi",
            "https://i.ibb.co/n0z34hf/skir.png"
        ),
        arrayOf(
            "Dota 2",
            "Salah satu game yang terpopuler yang menggunakan strategi untuk memenangkan permainan",
            "https://i.ibb.co/PxL77tz/dota.png"
        ),
        arrayOf(
            "Counter-Strike: Global Offensive",
            "Game Fps yang tidak boleh terlewatkan oleh para gamers, yang memerlukan strategi dan aim yang bagus",
            "https://i.ibb.co/8cFKsHC/csg.png"
        ),
        arrayOf(
            "Paladins",
            "Game Fps dengan skill yang seru dan pahlawan yang bervariasi",
            "https://i.ibb.co/LNj7WFQ/paladins.png"
        ),
        arrayOf(
            "Battlefield V",
            "Game Fps yang bertema perang dunia, dimana kita akan merebut daerah untuk mengurangi point lawan",
            "https://i.ibb.co/84VMwPd/battlefield.png"
        ),
        arrayOf(
            "This War of Mine",
            "Game bertema perang yang menceritakan dari sudut pandang masyarakat sipil",
            "https://i.ibb.co/F7mJ4J9/thiswarofmine.png"
        ),
        arrayOf(
            "Sniper Elite V2",
            "Game dengan membunuh lawan  secara sembunyi-sembunyi dan mengeliminasi musuh seraca satu per satu",
            "https://i.ibb.co/SyNdW0y/sniperelit.png"
        ),
        arrayOf(
            "Watch Dog",
            "Game yang menceritakan seseorang hacker yang menyimpan dendam setelah kematian keponakannya",
            "https://i.ibb.co/gr1Mcdg/watchdogs.png"
        ),
        arrayOf(
            "Resident Evil 7: Biohazard",
            "Salah satu game bertema zombie dimana perjuangan sang tokoh utama mencari istrinya",
            "https://i.ibb.co/KzVTwqy/residentevil.png"
        ),
        arrayOf(
            "Forza Horizon 4",
            "Game genre Racing open world dengan grapich yang menawan",
            "https://i.ibb.co/Mfgv3wt/forza.png"
        )
    )

    val listData : ArrayList<Gem>
        get() {
            val list = arrayListOf<Gem>()
            for (aData in data){
                val main = Gem()
                main.name = aData[0]
                main.from = aData[1]
                main.photo = aData[2]

                list.add(main)
            }

            return list
        }
}