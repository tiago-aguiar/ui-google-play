package co.tiagoaguiar.clone.googleplay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import co.tiagoaguiar.clone.googleplay.model.Feed
import com.google.gson.Gson

const val ARG_OBJECT = "object"

class ForYouFragment : Fragment() {

    private lateinit var verticalAdapter: VerticalAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_collection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            println(getSerializable(ARG_OBJECT))
//            val textView: TextView = view.findViewById(android.R.id.text1)
//            textView.text = getInt(ARG_OBJECT).toString()

            verticalAdapter = VerticalAdapter()
            view.findViewById<RecyclerView>(R.id.rv_vertical).adapter = verticalAdapter

            request()
        }
    }

    private fun request() {
        Thread {
            Thread.sleep(1000)
            val feed = Gson().fromJson(feed, Feed::class.java)

            activity?.runOnUiThread {
                verticalAdapter.add(feed.categories)
            }
        }.start()
    }

}




val news = """{
    "title" : "Novos jogos que amamos",
    "games": [
{
"AppSize": "Hothead Games Inc.",
"id": "1110217724",
"releaseDate": "2018-01-30",
"Name": "Hero Hunters",
"kind": "iosSoftware",
"copyright": "© 2020 Hothead Games Inc.",
"artistId": "410923092",
"App": "https://apps.apple.com/br/developer/hothead-games-inc/id410923092",
"imageUrl": "https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/93/9b/7a/939b7a1c-50ea-81bc-e3a7-ffe5ae07b673/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "6016",
"Name": "Entretenimento",
"url": "https://itunes.apple.com/br/genre/id6016"
},
{
"genreId": "7001",
"Name": "Ação",
"url": "https://itunes.apple.com/br/genre/id7001"
},
{
"genreId": "7014",
"Name": "RPG",
"url": "https://itunes.apple.com/br/genre/id7014"
}
],
"url": "https://apps.apple.com/br/app/hero-hunters/id1110217724"
},
{
"AppSize": "Kenny Sun",
"id": "1265660005",
"releaseDate": "2018-02-01",
"Name": "A Hollow Doorway",
"kind": "iosSoftware",
"copyright": "© Kenny Sun",
"artistId": "916299994",
"App": "https://apps.apple.com/br/developer/kenny-sun/id916299994",
"imageUrl": "https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/2d/e2/6f/2de26f03-d69d-23b4-060a-c6874bccda8e/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7001",
"Name": "Ação",
"url": "https://itunes.apple.com/br/genre/id7001"
},
{
"genreId": "7003",
"Name": "Casual",
"url": "https://itunes.apple.com/br/genre/id7003"
}
],
"url": "https://apps.apple.com/br/app/a-hollow-doorway/id1265660005"
},
{
"AppSize": "Not My Jeans AB",
"id": "1260955587",
"releaseDate": "2018-02-01",
"Name": "Run Gun Sports",
"kind": "iosSoftware",
"copyright": "© 2018 Not My Jeans AB",
"artistId": "946531018",
"App": "https://apps.apple.com/br/developer/not-my-jeans-ab/id946531018",
"imageUrl": "https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/8c/9a/9a/8c9a9a4a-a6cd-d849-9346-a4a773295886/AppIcon-1x_U007emarketing-0-7-85-220.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7003",
"Name": "Casual",
"url": "https://itunes.apple.com/br/genre/id7003"
},
{
"genreId": "7016",
"Name": "Esportes",
"url": "https://itunes.apple.com/br/genre/id7016"
},
{
"genreId": "6004",
"Name": "Esportes",
"url": "https://itunes.apple.com/br/genre/id6004"
}
],
"url": "https://apps.apple.com/br/app/run-gun-sports/id1260955587"
},
{
"AppSize": "Alike Studio",
"id": "1320681231",
"releaseDate": "2018-02-01",
"Name": "Bring You Home",
"kind": "iosSoftware",
"copyright": "© 2017 Marc Terris Meler & Xavi Terris Meler",
"artistId": "1075862244",
"App": "https://apps.apple.com/br/developer/alike-studio/id1075862244",
"imageUrl": "https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/2e/bb/4e/2ebb4eb2-5b8a-2e06-d47e-f919fc0352d4/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-P3-0-0-0-85-220-0-0-0-3.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7012",
"Name": "Quebra-cabeça",
"url": "https://itunes.apple.com/br/genre/id7012"
},
{
"genreId": "7002",
"Name": "Aventura",
"url": "https://itunes.apple.com/br/genre/id7002"
}
],
"url": "https://apps.apple.com/br/app/bring-you-home/id1320681231"
},
{
"AppSize": "SQUARE ENIX",
"id": "1282951846",
"releaseDate": "2018-01-31",
"Name": "DISSIDIA FINAL FANTASY OO",
"kind": "iosSoftware",
"copyright": "©2017,2018 KOEI TECMO GAMES/SQUARE ENIX CO., LTD. All Rights Reserved. CHARACTER DESIGN: TETSUYA NOMURA",
"artistId": "300186801",
"App": "https://apps.apple.com/br/developer/square-enix/id300186801",
"imageUrl": "https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/7c/46/3c/7c463c60-05d6-6b11-b73b-4a1eea5a83eb/AppIcon-0-0-1x_U007emarketing-0-0-0-9-85-220.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7014",
"Name": "RPG",
"url": "https://itunes.apple.com/br/genre/id7014"
}
],
"url": "https://apps.apple.com/br/app/dissidia-final-fantasy-oo/id1282951846"
},
{
"AppSize": "Turborilla",
"id": "1037758394",
"releaseDate": "2018-01-31",
"Name": "Mad Skills BMX 2",
"kind": "iosSoftware",
"copyright": "© 2018 Turborilla AB",
"artistId": "410229365",
"App": "https://apps.apple.com/br/developer/turborilla/id410229365",
"imageUrl": "https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/c9/83/3c/c9833c0e-7309-991e-a534-8db86ef3c26e/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7001",
"Name": "Ação",
"url": "https://itunes.apple.com/br/genre/id7001"
},
{
"genreId": "7013",
"Name": "Corridas",
"url": "https://itunes.apple.com/br/genre/id7013"
},
{
"genreId": "6004",
"Name": "Esportes",
"url": "https://itunes.apple.com/br/genre/id6004"
}
],
"url": "https://apps.apple.com/br/app/mad-skills-bmx-2/id1037758394"
},
{
"AppSize": "Tree Men Games",
"id": "1317692806",
"releaseDate": "2018-02-01",
"Name": "PAKO 2",
"kind": "iosSoftware",
"copyright": "© 2016-2017 Tree Men Games",
"artistId": "875238560",
"App": "https://apps.apple.com/br/developer/tree-men-games/id875238560",
"imageUrl": "https://is3-ssl.mzstatic.com/image/thumb/Purple128/v4/7c/44/7c/7c447c2a-b07d-0323-5476-be8f42f4b108/AppIcon-1x_U007emarketing-85-220-8.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7013",
"Name": "Corridas",
"url": "https://itunes.apple.com/br/genre/id7013"
},
{
"genreId": "7003",
"Name": "Casual",
"url": "https://itunes.apple.com/br/genre/id7003"
}
],
"url": "https://apps.apple.com/br/app/pako-2/id1317692806"
},
{
"AppSize": "Geewa",
"id": "1230892664",
"releaseDate": "2018-01-29",
"Name": "Smashing Four",
"kind": "iosSoftware",
"copyright": "© 2017 Geewa",
"artistId": "594449005",
"App": "https://apps.apple.com/br/developer/geewa/id594449005",
"imageUrl": "https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/cb/9f/95/cb9f955d-223b-0066-3b7f-dc1537946e6b/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7017",
"Name": "Estratégia",
"url": "https://itunes.apple.com/br/genre/id7017"
}
],
"url": "https://apps.apple.com/br/app/smashing-four/id1230892664"
},
{
"AppSize": "Pixelocity Software LLC",
"id": "1225500131",
"releaseDate": "2018-02-01",
"Name": "Disc Drivin' 2",
"kind": "iosSoftware",
"copyright": "© 2018-2020 Pixelocity Software LLC",
"artistId": "402379683",
"App": "https://apps.apple.com/br/developer/pixelocity-software-llc/id402379683",
"imageUrl": "https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/b3/d0/82/b3d08220-77d3-c46a-642b-adc5da2b33e8/AppIcon-1x_U007emarketing-0-4-0-85-220.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7013",
"Name": "Corridas",
"url": "https://itunes.apple.com/br/genre/id7013"
},
{
"genreId": "7004",
"Name": "Jogos de tabuleiro",
"url": "https://itunes.apple.com/br/genre/id7004"
}
],
"url": "https://apps.apple.com/br/app/disc-drivin-2/id1225500131"
},
{
"AppSize": "Nevzat Goksan Guner",
"id": "1327810800",
"releaseDate": "2018-01-02",
"Name": "Jogo Laser com Matemática",
"kind": "iosSoftware",
"copyright": "© Göksan Güner 2018",
"artistId": "1443729702",
"App": "https://apps.apple.com/br/developer/nevzat-goksan-guner/id1443729702",
"imageUrl": "https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/48/ef/d9/48efd9c7-50ed-4f10-5c16-0eff7c78cc4d/AppIcon-1x_U007emarketing-85-220-6.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7018",
"Name": "Trívia",
"url": "https://itunes.apple.com/br/genre/id7018"
},
{
"genreId": "6017",
"Name": "Educação",
"url": "https://itunes.apple.com/br/genre/id6017"
},
{
"genreId": "7009",
"Name": "Família",
"url": "https://itunes.apple.com/br/genre/id7009"
}
],
"url": "https://apps.apple.com/br/app/jogo-laser-com-matem%C3%A1tica/id1327810800"
},
{
"AppSize": "YOUNG JAE SIM",
"id": "1074318543",
"releaseDate": "2017-10-02",
"Name": "Cat World - The RPG of cats",
"kind": "iosSoftware",
"copyright": "© 2015-2019 BTNcafe Co.",
"artistId": "654838916",
"App": "https://apps.apple.com/br/developer/young-jae-sim/id654838916",
"imageUrl": "https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/58/05/76/58057668-4640-f034-8def-b6915a798b67/AppIcon-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "7001",
"Name": "Ação",
"url": "https://itunes.apple.com/br/genre/id7001"
},
{
"genreId": "7014",
"Name": "RPG",
"url": "https://itunes.apple.com/br/genre/id7014"
}
],
"url": "https://apps.apple.com/br/app/cat-world-the-rpg-of-cats/id1074318543"
},
{
"AppSize": "Marat Giliazov",
"id": "1176727141",
"releaseDate": "2018-01-15",
"Name": "The Stair",
"kind": "iosSoftware",
"copyright": "© 2017, Marat Gilyazov",
"artistId": "860231719",
"App": "https://apps.apple.com/br/developer/marat-giliazov/id860231719",
"imageUrl": "https://is2-ssl.mzstatic.com/image/thumb/Purple62/v4/e4/88/10/e4881080-542c-b847-07fb-e6188c434365/mzl.dxvihkak.png/200x200bb.png",
"genres": [
{
"genreId": "6014",
"Name": "Jogos",
"url": "https://itunes.apple.com/br/genre/id6014"
},
{
"genreId": "6016",
"Name": "Entretenimento",
"url": "https://itunes.apple.com/br/genre/id6016"
},
{
"genreId": "7003",
"Name": "Casual",
"url": "https://itunes.apple.com/br/genre/id7003"
},
{
"genreId": "7001",
"Name": "Ação",
"url": "https://itunes.apple.com/br/genre/id7001"
}
],
"url": "https://apps.apple.com/br/app/the-stair/id1176727141"
}
]
}
    """

val json = """{
    
    
    
    
    "title" : "Pay Once Play Forever",
    "games" : [
  {
    "ID": 85052,
    "imageUrl": "https:\/\/lh6.ggpht.com\/M9q_Zs_CRt2rbA41nTMhrPqiBxhUEUN8Z1f_mn9m89_TiHbIbUF8hjnc_zwevvLsRIJy=w300",
    "Name": "Angry Birds",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "4040062",
    "AppSize": "48",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85052\/PlayStore\/angry-birds"
  },
  {
    "ID": 85080,
    "imageUrl": "https:\/\/lh3.googleusercontent.com\/0vquFcjLdlClPFZlnq3S-kNSyYWyc4MkYwluIfMPHf92QYL8s9rOfozPiG7RQ-7bfQ3R=w300",
    "Name": "Angry Birds Go!",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_RACING",
    "Price": "0",
    "Reviewers": "2695984",
    "AppSize": "152",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85080\/PlayStore\/angry-birds-go"
  },
  {
    "ID": 85085,
    "imageUrl": "https:\/\/lh5.ggpht.com\/rp_WwrHlSIfiDD2w4P6qZf-WXK2XLAn8MXqxZhdteCHIN0I53Po9pXS8lUjFKANLnA=w300",
    "Name": "Angry Birds Rio",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "1730826",
    "AppSize": "48",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85085\/PlayStore\/angry-birds-rio"
  },
  {
    "ID": 85196,
    "imageUrl": "https:\/\/lh5.ggpht.com\/CXqjoN_u3sFyV_Z1M7E-4KmyI0tYe5FLHV5KosQC-0s5LsZuhm4omg-5nP6VBpIwilI=w300",
    "Name": "Angry Birds Space",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "1049597",
    "AppSize": "48",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85196\/PlayStore\/angry-birds-space"
  },
  {
    "ID": 85328,
    "imageUrl": "https:\/\/lh5.ggpht.com\/5lsYulxyO1ENBxp89y_vVLI6FwYX5BStQRCLUHKuFl67vWsFwIkSH2YCez7WFGi-eto=w300",
    "Name": "Angry Birds Seasons",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "1426544",
    "AppSize": "44",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85328\/PlayStore\/angry-birds-seasons"
  },
  {
    "ID": 85443,
    "imageUrl": "https:\/\/lh6.ggpht.com\/mFp9bta4gxoHiVhJ25Q8RjSJRcu7Yn19yIYGhgHuwDfCyUjhSez7G4nsEC-nscCF9TE=w300",
    "Name": "Angry Birds Friends",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "477116",
    "AppSize": "35",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85443\/PlayStore\/angry-birds-friends"
  },
  {
    "ID": 85460,
    "imageUrl": "https:\/\/lh6.ggpht.com\/JMKJB1_VXk8rH7Kzz_2BPKprT61oMp_Xp768Xbdm-OWa-PWtdsdq55I0DZPZYbNWjC0=w300",
    "Name": "Angry Birds Star Wars",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "875156",
    "AppSize": "46",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/85460\/PlayStore\/angry-birds-star-wars"
  },
  {
    "ID": 90472,
    "imageUrl": "https:\/\/lh6.ggpht.com\/wQMavK-tiAYOnlK4hXwX2fdDET3xWfQIl3sCOQegMszI5CKlWOgXwEot7vChcKSOIXo=w300",
    "Name": "Angry Birds Transformers",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "818959",
    "AppSize": "109",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/90472\/PlayStore\/angry-birds-transformers"
  },
  {
    "ID": 90495,
    "imageUrl": "https:\/\/lh5.ggpht.com\/kSBf57npbQNutgfzvXL7x6Nl95LAQeUTKkCRVWqquOJ6T4IppoKAlfuUgNI1vk6Bc_4=w300",
    "Name": "Angry Birds Stella",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "451535",
    "AppSize": "49",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/90495\/PlayStore\/angry-birds-stella"
  },
  {
    "ID": 90523,
    "imageUrl": "https:\/\/lh5.ggpht.com\/Ju6Su5337-hEXaKsZO4aZEH1H7M_Izu3FoKBSzoF93CbhICXYcISYruOW4ulGBeEIS4=w300",
    "Name": "Angry Birds Star Wars II Free",
    "Developer": "Rovio Entertainment Ltd.",
    "IsTopDeveloper": "False",
    "Category": "\/store\/apps\/category\/GAME_ARCADE",
    "Price": "0",
    "Reviewers": "898573",
    "AppSize": "49",
    "source": "PlayStore",
    "url": "http:\/\/www.androidappstore.com.cn\/EN\/displayproduct\/90523\/PlayStore\/angry-birds-star-wars-ii-free"
  }
]
}
"""

val feed = """
    {
        "categories" : [
            $news,
            $json
        ]
    }
    """