package co.tiagoaguiar.clone.googleplay.model

import java.lang.StringBuilder


const val news = """
 {
   "title":"New Games",
   "games":[
      {
         "AppSize":"Hothead Games Inc.",
         "id":"1110217724",
         "releaseDate":"2018-01-30",
         "Name":"Hero Hunters",
         "kind":"iosSoftware",
         "copyright":"© 2020 Hothead Games Inc.",
         "artistId":"410923092",
         "App":"https://apps.apple.com/br/developer/hothead-games-inc/id410923092",
         "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/93/9b/7a/939b7a1c-50ea-81bc-e3a7-ffe5ae07b673/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"6016",
               "Name":"Entretenimento",
               "url":"https://itunes.apple.com/br/genre/id6016"
            },
            {
               "genreId":"7001",
               "Name":"Ação",
               "url":"https://itunes.apple.com/br/genre/id7001"
            },
            {
               "genreId":"7014",
               "Name":"RPG",
               "url":"https://itunes.apple.com/br/genre/id7014"
            }
         ],
         "url":"https://apps.apple.com/br/app/hero-hunters/id1110217724"
      },
      {
         "AppSize":"Kenny Sun",
         "id":"1265660005",
         "releaseDate":"2018-02-01",
         "Name":"A Hollow Doorway",
         "kind":"iosSoftware",
         "copyright":"© Kenny Sun",
         "artistId":"916299994",
         "App":"https://apps.apple.com/br/developer/kenny-sun/id916299994",
         "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/2d/e2/6f/2de26f03-d69d-23b4-060a-c6874bccda8e/AppIcon-0-1x_U007emarketing-0-85-220-9.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7001",
               "Name":"Ação",
               "url":"https://itunes.apple.com/br/genre/id7001"
            },
            {
               "genreId":"7003",
               "Name":"Casual",
               "url":"https://itunes.apple.com/br/genre/id7003"
            }
         ],
         "url":"https://apps.apple.com/br/app/a-hollow-doorway/id1265660005"
      },
      {
         "AppSize":"Not My Jeans AB",
         "id":"1260955587",
         "releaseDate":"2018-02-01",
         "Name":"Run Gun Sports",
         "kind":"iosSoftware",
         "copyright":"© 2018 Not My Jeans AB",
         "artistId":"946531018",
         "App":"https://apps.apple.com/br/developer/not-my-jeans-ab/id946531018",
         "imageUrl":"https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/8c/9a/9a/8c9a9a4a-a6cd-d849-9346-a4a773295886/AppIcon-1x_U007emarketing-0-7-85-220.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7003",
               "Name":"Casual",
               "url":"https://itunes.apple.com/br/genre/id7003"
            },
            {
               "genreId":"7016",
               "Name":"Esportes",
               "url":"https://itunes.apple.com/br/genre/id7016"
            },
            {
               "genreId":"6004",
               "Name":"Esportes",
               "url":"https://itunes.apple.com/br/genre/id6004"
            }
         ],
         "url":"https://apps.apple.com/br/app/run-gun-sports/id1260955587"
      },
      {
         "AppSize":"Alike Studio",
         "id":"1320681231",
         "releaseDate":"2018-02-01",
         "Name":"Bring You Home",
         "kind":"iosSoftware",
         "copyright":"© 2017 Marc Terris Meler & Xavi Terris Meler",
         "artistId":"1075862244",
         "App":"https://apps.apple.com/br/developer/alike-studio/id1075862244",
         "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple118/v4/2e/bb/4e/2ebb4eb2-5b8a-2e06-d47e-f919fc0352d4/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-P3-0-0-0-85-220-0-0-0-3.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7012",
               "Name":"Quebra-cabeça",
               "url":"https://itunes.apple.com/br/genre/id7012"
            },
            {
               "genreId":"7002",
               "Name":"Aventura",
               "url":"https://itunes.apple.com/br/genre/id7002"
            }
         ],
         "url":"https://apps.apple.com/br/app/bring-you-home/id1320681231"
      },
      {
         "AppSize":"SQUARE ENIX",
         "id":"1282951846",
         "releaseDate":"2018-01-31",
         "Name":"DISSIDIA FINAL FANTASY OO",
         "kind":"iosSoftware",
         "copyright":"©2017,2018 KOEI TECMO GAMES/SQUARE ENIX CO., LTD. All Rights Reserved. CHARACTER DESIGN: TETSUYA NOMURA",
         "artistId":"300186801",
         "App":"https://apps.apple.com/br/developer/square-enix/id300186801",
         "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/7c/46/3c/7c463c60-05d6-6b11-b73b-4a1eea5a83eb/AppIcon-0-0-1x_U007emarketing-0-0-0-9-85-220.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7014",
               "Name":"RPG",
               "url":"https://itunes.apple.com/br/genre/id7014"
            }
         ],
         "url":"https://apps.apple.com/br/app/dissidia-final-fantasy-oo/id1282951846"
      },
      {
         "AppSize":"Turborilla",
         "id":"1037758394",
         "releaseDate":"2018-01-31",
         "Name":"Mad Skills BMX 2",
         "kind":"iosSoftware",
         "copyright":"© 2018 Turborilla AB",
         "artistId":"410229365",
         "App":"https://apps.apple.com/br/developer/turborilla/id410229365",
         "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/c9/83/3c/c9833c0e-7309-991e-a534-8db86ef3c26e/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7001",
               "Name":"Ação",
               "url":"https://itunes.apple.com/br/genre/id7001"
            },
            {
               "genreId":"7013",
               "Name":"Corridas",
               "url":"https://itunes.apple.com/br/genre/id7013"
            },
            {
               "genreId":"6004",
               "Name":"Esportes",
               "url":"https://itunes.apple.com/br/genre/id6004"
            }
         ],
         "url":"https://apps.apple.com/br/app/mad-skills-bmx-2/id1037758394"
      },
      {
         "AppSize":"Tree Men Games",
         "id":"1317692806",
         "releaseDate":"2018-02-01",
         "Name":"PAKO 2",
         "kind":"iosSoftware",
         "copyright":"© 2016-2017 Tree Men Games",
         "artistId":"875238560",
         "App":"https://apps.apple.com/br/developer/tree-men-games/id875238560",
         "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple128/v4/7c/44/7c/7c447c2a-b07d-0323-5476-be8f42f4b108/AppIcon-1x_U007emarketing-85-220-8.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7013",
               "Name":"Corridas",
               "url":"https://itunes.apple.com/br/genre/id7013"
            },
            {
               "genreId":"7003",
               "Name":"Casual",
               "url":"https://itunes.apple.com/br/genre/id7003"
            }
         ],
         "url":"https://apps.apple.com/br/app/pako-2/id1317692806"
      },
      {
         "AppSize":"Geewa",
         "id":"1230892664",
         "releaseDate":"2018-01-29",
         "Name":"Smashing Four",
         "kind":"iosSoftware",
         "copyright":"© 2017 Geewa",
         "artistId":"594449005",
         "App":"https://apps.apple.com/br/developer/geewa/id594449005",
         "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/cb/9f/95/cb9f955d-223b-0066-3b7f-dc1537946e6b/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7017",
               "Name":"Estratégia",
               "url":"https://itunes.apple.com/br/genre/id7017"
            }
         ],
         "url":"https://apps.apple.com/br/app/smashing-four/id1230892664"
      },
      {
         "AppSize":"Pixelocity Software LLC",
         "id":"1225500131",
         "releaseDate":"2018-02-01",
         "Name":"Disc Drivin' 2",
         "kind":"iosSoftware",
         "copyright":"© 2018-2020 Pixelocity Software LLC",
         "artistId":"402379683",
         "App":"https://apps.apple.com/br/developer/pixelocity-software-llc/id402379683",
         "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/b3/d0/82/b3d08220-77d3-c46a-642b-adc5da2b33e8/AppIcon-1x_U007emarketing-0-4-0-85-220.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7013",
               "Name":"Corridas",
               "url":"https://itunes.apple.com/br/genre/id7013"
            },
            {
               "genreId":"7004",
               "Name":"Jogos de tabuleiro",
               "url":"https://itunes.apple.com/br/genre/id7004"
            }
         ],
         "url":"https://apps.apple.com/br/app/disc-drivin-2/id1225500131"
      },
      {
         "AppSize":"Nevzat Goksan Guner",
         "id":"1327810800",
         "releaseDate":"2018-01-02",
         "Name":"Jogo Laser com Matemática",
         "kind":"iosSoftware",
         "copyright":"© Göksan Güner 2018",
         "artistId":"1443729702",
         "App":"https://apps.apple.com/br/developer/nevzat-goksan-guner/id1443729702",
         "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple118/v4/48/ef/d9/48efd9c7-50ed-4f10-5c16-0eff7c78cc4d/AppIcon-1x_U007emarketing-85-220-6.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7018",
               "Name":"Trívia",
               "url":"https://itunes.apple.com/br/genre/id7018"
            },
            {
               "genreId":"6017",
               "Name":"Educação",
               "url":"https://itunes.apple.com/br/genre/id6017"
            },
            {
               "genreId":"7009",
               "Name":"Família",
               "url":"https://itunes.apple.com/br/genre/id7009"
            }
         ],
         "url":"https://apps.apple.com/br/app/jogo-laser-com-matem%C3%A1tica/id1327810800"
      },
      {
         "AppSize":"YOUNG JAE SIM",
         "id":"1074318543",
         "releaseDate":"2017-10-02",
         "Name":"Cat World - The RPG of cats",
         "kind":"iosSoftware",
         "copyright":"© 2015-2019 BTNcafe Co.",
         "artistId":"654838916",
         "App":"https://apps.apple.com/br/developer/young-jae-sim/id654838916",
         "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple123/v4/58/05/76/58057668-4640-f034-8def-b6915a798b67/AppIcon-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"7001",
               "Name":"Ação",
               "url":"https://itunes.apple.com/br/genre/id7001"
            },
            {
               "genreId":"7014",
               "Name":"RPG",
               "url":"https://itunes.apple.com/br/genre/id7014"
            }
         ],
         "url":"https://apps.apple.com/br/app/cat-world-the-rpg-of-cats/id1074318543"
      },
      {
         "AppSize":"Marat Giliazov",
         "id":"1176727141",
         "releaseDate":"2018-01-15",
         "Name":"The Stair",
         "kind":"iosSoftware",
         "copyright":"© 2017, Marat Gilyazov",
         "artistId":"860231719",
         "App":"https://apps.apple.com/br/developer/marat-giliazov/id860231719",
         "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple62/v4/e4/88/10/e4881080-542c-b847-07fb-e6188c434365/mzl.dxvihkak.png/200x200bb.png",
         "genres":[
            {
               "genreId":"6014",
               "Name":"Jogos",
               "url":"https://itunes.apple.com/br/genre/id6014"
            },
            {
               "genreId":"6016",
               "Name":"Entretenimento",
               "url":"https://itunes.apple.com/br/genre/id6016"
            },
            {
               "genreId":"7003",
               "Name":"Casual",
               "url":"https://itunes.apple.com/br/genre/id7003"
            },
            {
               "genreId":"7001",
               "Name":"Ação",
               "url":"https://itunes.apple.com/br/genre/id7001"
            }
         ],
         "url":"https://apps.apple.com/br/app/the-stair/id1176727141"
      }
   ]
}
    """

const val birds = """
{
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

const val topGrossing = """{
    "title" : "Top Grossing",
    "games":[
         {
            "AppSize":"GARENA INTERNATIONAL I PRIVATE LIMITED",
            "id":"1300146617",
            "releaseDate":"2017-11-21",
            "Name":"Garena Free Fire: 3VOLUÇÃO",
            "kind":"iosSoftware",
            "copyright":"© Garena International",
            "artistId":"1335627134",
            "artistUrl":"https://apps.apple.com/br/developer/garena-international-i-private-limited/id1335627134",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/72/db/5b/72db5b43-2931-5ba8-923e-34e6d6969799/AppIcon-1596539950-0-0-1x_U007emarketing-0-0-0-7-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7001",
                  "Name":"Ação",
                  "url":"https://itunes.apple.com/br/genre/id7001"
               },
               {
                  "genreId":"7002",
                  "Name":"Aventura",
                  "url":"https://itunes.apple.com/br/genre/id7002"
               }
            ],
            "url":"https://apps.apple.com/br/app/garena-free-fire-3volu%C3%A7%C3%A3o/id1300146617"
         },
         {
            "AppSize":"Tencent Mobile International Limited",
            "id":"1330123889",
            "releaseDate":"2018-03-19",
            "Name":"PUBG MOBILE - NEW ERA",
            "kind":"iosSoftware",
            "copyright":"© Shenzhen Tencent Computer Systems Comany Limited",
            "artistId":"504515421",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/tencent-mobile-international-limited/id504515421",
            "imageUrl":"https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/45/e8/b0/45e8b0aa-39ac-4e72-c8b6-3360a68f217f/AppIcon-1x_U007emarketing-0-0-GLES2_U002c0-512MB-sRGB-0-0-0-85-220-0-0-0-8.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7001",
                  "Name":"Ação",
                  "url":"https://itunes.apple.com/br/genre/id7001"
               },
               {
                  "genreId":"7017",
                  "Name":"Estratégia",
                  "url":"https://itunes.apple.com/br/genre/id7017"
               }
            ],
            "url":"https://apps.apple.com/br/app/pubg-mobile-new-era/id1330123889"
         },
         {
            "AppSize":"GLOBO COM. E PART. S/A",
            "id":"536321738",
            "releaseDate":"2012-08-28",
            "Name":"Globoplay",
            "kind":"iosSoftware",
            "copyright":"© Globo Comunicação e Participações S.A.",
            "artistId":"402288145",
            "artistUrl":"https://apps.apple.com/br/developer/globo-com-e-part-s-a/id402288145",
            "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/cf/15/39/cf15391b-9582-314a-9a94-58c244deea79/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.jpeg/200x200bb.png",
            "genres":[
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"6009",
                  "Name":"Notícias",
                  "url":"https://itunes.apple.com/br/genre/id6009"
               }
            ],
            "url":"https://apps.apple.com/br/app/globoplay/id536321738"
         },
         {
            "AppSize":"Tinder Inc.",
            "id":"547702041",
            "releaseDate":"2012-08-03",
            "Name":"Tinder- conhecer pessoas novas",
            "kind":"iosSoftware",
            "copyright":"Copyright © 2013-2020 Tinder. All rights reserved.",
            "artistId":"725634363",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/tinder-inc/id725634363",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/0b/89/36/0b8936a1-2836-2654-6c29-3908d66a5b3c/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6012",
                  "Name":"Estilo de vida",
                  "url":"https://itunes.apple.com/br/genre/id6012"
               },
               {
                  "genreId":"6005",
                  "Name":"Redes sociais",
                  "url":"https://itunes.apple.com/br/genre/id6005"
               }
            ],
            "url":"https://apps.apple.com/br/app/tinder-conhecer-pessoas-novas/id547702041"
         },
         {
            "AppSize":"Google LLC",
            "id":"544007664",
            "releaseDate":"2012-09-11",
            "Name":"YouTube",
            "kind":"iosSoftware",
            "copyright":"© 2020 Google Inc.",
            "artistId":"281956209",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/google-llc/id281956209",
            "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple114/v4/26/47/6c/26476cfb-3ffa-4fbe-6409-715b1b82cf3b/logo_youtube_color-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6008",
                  "Name":"Foto e vídeo",
                  "url":"https://itunes.apple.com/br/genre/id6008"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               }
            ],
            "url":"https://apps.apple.com/br/app/youtube/id544007664"
         },
         {
            "AppSize":"Supercell",
            "id":"1229016807",
            "releaseDate":"2018-12-13",
            "Name":"Brawl Stars",
            "kind":"iosSoftware",
            "copyright":"© 2017 Supercell Oy",
            "artistId":"488106216",
            "artistUrl":"https://apps.apple.com/br/developer/supercell/id488106216",
            "imageUrl":"https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/78/b4/1f/78b41f39-b661-2758-d50b-e6155e1db92b/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7001",
                  "Name":"Ação",
                  "url":"https://itunes.apple.com/br/genre/id7001"
               },
               {
                  "genreId":"7003",
                  "Name":"Casual",
                  "url":"https://itunes.apple.com/br/genre/id7003"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               }
            ],
            "url":"https://apps.apple.com/br/app/brawl-stars/id1229016807"
         },
         {
            "AppSize":"Netflix, Inc.",
            "id":"363590051",
            "releaseDate":"2011-12-14",
            "Name":"Netflix",
            "kind":"iosSoftware",
            "copyright":"© 2019 Netflix, Inc.",
            "artistId":"363590054",
            "artistUrl":"https://apps.apple.com/br/developer/netflix-inc/id363590054",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/75/52/47/75524710-6c04-d84d-5035-3d06e75cd81f/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"6012",
                  "Name":"Estilo de vida",
                  "url":"https://itunes.apple.com/br/genre/id6012"
               }
            ],
            "url":"https://apps.apple.com/br/app/netflix/id363590051"
         },
         {
            "AppSize":"PEBMED INSTITUICAO DE PESQUISA MEDICA E SERVICOS TECNOLOGICOS DA AREA DA SAUDE S.A.",
            "id":"638521744",
            "releaseDate":"2013-04-28",
            "Name":"Whitebook: CID-10 e Medicina",
            "kind":"iosSoftware",
            "copyright":"© PEBMED",
            "artistId":"721359922",
            "artistUrl":"https://apps.apple.com/br/developer/pebmed-instituicao-pesquisa-medica-e-servicos-tecnologicos/id721359922",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/64/6e/b6/646eb650-5e3a-ea5f-b7ee-5a034f2d06dd/AppIcon-0-0-1x_U007emarketing-0-0-0-9-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6020",
                  "Name":"Medicina",
                  "url":"https://itunes.apple.com/br/genre/id6020"
               },
               {
                  "genreId":"6013",
                  "Name":"Saúde e fitness",
                  "url":"https://itunes.apple.com/br/genre/id6013"
               }
            ],
            "url":"https://apps.apple.com/br/app/whitebook-cid-10-e-medicina/id638521744"
         },
         {
            "AppSize":"Moon Active",
            "id":"406889139",
            "releaseDate":"2012-04-06",
            "Name":"Coin Master",
            "kind":"iosSoftware",
            "copyright":"© Moon Active",
            "artistId":"470556954",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/moon-active/id470556954",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/8c/c8/7b/8cc87b18-8404-17c5-cb66-760af89181fd/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7003",
                  "Name":"Casual",
                  "url":"https://itunes.apple.com/br/genre/id7003"
               },
               {
                  "genreId":"7002",
                  "Name":"Aventura",
                  "url":"https://itunes.apple.com/br/genre/id7002"
               }
            ],
            "url":"https://apps.apple.com/br/app/coin-master/id406889139"
         },
         {
            "AppSize":"Playrix",
            "id":"1105855019",
            "releaseDate":"2016-08-25",
            "Name":"Gardenscapes",
            "kind":"iosSoftware",
            "copyright":"© 2016 Playrix",
            "artistId":"1162116447",
            "artistUrl":"https://apps.apple.com/br/developer/playrix/id1162116447",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/7d/fb/ff/7dfbff3d-996c-4fd4-2946-e73d84889336/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"7012",
                  "Name":"Quebra-cabeça",
                  "url":"https://itunes.apple.com/br/genre/id7012"
               },
               {
                  "genreId":"7015",
                  "Name":"Simulação",
                  "url":"https://itunes.apple.com/br/genre/id7015"
               }
            ],
            "url":"https://apps.apple.com/br/app/gardenscapes/id1105855019"
         },
         {
            "AppSize":"Google LLC",
            "id":"1017492454",
            "releaseDate":"2018-09-26",
            "Name":"YouTube Music",
            "kind":"iosSoftware",
            "copyright":"© 2015 Google Inc.",
            "artistId":"281956209",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/google-llc/id281956209",
            "imageUrl":"https://is4-ssl.mzstatic.com/image/thumb/Purple124/v4/8d/a4/91/8da491a7-7df1-b78f-5ebe-7aa7c3f17f4c/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6011",
                  "Name":"Música",
                  "url":"https://itunes.apple.com/br/genre/id6011"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               }
            ],
            "url":"https://apps.apple.com/br/app/youtube-music/id1017492454"
         },
         {
            "AppSize":"King",
            "id":"553834731",
            "releaseDate":"2012-11-14",
            "Name":"Candy Crush Saga",
            "kind":"iosSoftware",
            "copyright":"© King.com Limited 2011-2020. All rights reserved.",
            "artistId":"526656015",
            "artistUrl":"https://apps.apple.com/br/developer/king/id526656015",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/4e/21/50/4e215052-29b6-150f-ef1a-b38f98355aee/AppIcon-1x_U007emarketing-0-7-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"7012",
                  "Name":"Quebra-cabeça",
                  "url":"https://itunes.apple.com/br/genre/id7012"
               },
               {
                  "genreId":"7003",
                  "Name":"Casual",
                  "url":"https://itunes.apple.com/br/genre/id7003"
               }
            ],
            "url":"https://apps.apple.com/br/app/candy-crush-saga/id553834731"
         },
         {
            "AppSize":"DEEZER SA",
            "id":"292738169",
            "releaseDate":"2008-10-31",
            "Name":"Deezer: Ouvir Música e Podcast",
            "kind":"iosSoftware",
            "copyright":"© 2007-2020 Deezer SA",
            "artistId":"292738172",
            "artistUrl":"https://apps.apple.com/br/developer/deezer-sa/id292738172",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/b4/25/c2/b425c215-5151-3759-75f1-91f2973cd64d/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6011",
                  "Name":"Música",
                  "url":"https://itunes.apple.com/br/genre/id6011"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               }
            ],
            "url":"https://apps.apple.com/br/app/deezer-ouvir-m%C3%BAsica-e-podcast/id292738169"
         },
         {
            "AppSize":"Roblox Corporation",
            "id":"431946152",
            "releaseDate":"2012-04-05",
            "Name":"ROBLOX",
            "kind":"iosSoftware",
            "copyright":"© 2020 Roblox Corporation",
            "artistId":"431946155",
            "artistUrl":"https://apps.apple.com/br/developer/roblox-corporation/id431946155",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/d8/64/25/d86425c0-c635-cdb5-6ba8-1b6ee51456c9/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7002",
                  "Name":"Aventura",
                  "url":"https://itunes.apple.com/br/genre/id7002"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"7001",
                  "Name":"Ação",
                  "url":"https://itunes.apple.com/br/genre/id7001"
               }
            ],
            "url":"https://apps.apple.com/br/app/roblox/id431946152"
         },
         {
            "AppSize":"LinkedIn Corporation",
            "id":"288429040",
            "releaseDate":"2019-02-03",
            "Name":"LinkedIn",
            "kind":"iosSoftware",
            "copyright":"© Copyright 2020 LinkedIn Corporation. All rights reserved.",
            "artistId":"288429043",
            "artistUrl":"https://apps.apple.com/br/developer/linkedin-corporation/id288429043",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/8d/bf/26/8dbf269d-2c3a-7fe9-0596-061ec2dc2aeb/AppIcon-0-0-1x_U007emarketing-0-0-0-6-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6000",
                  "Name":"Negócios",
                  "url":"https://itunes.apple.com/br/genre/id6000"
               }
            ],
            "url":"https://apps.apple.com/br/app/linkedin/id288429040"
         },
         {
            "AppSize":"Firenet",
            "id":"1156192844",
            "releaseDate":"2016-09-29",
            "Name":"Reports+ para Instagram",
            "kind":"iosSoftware",
            "copyright":"© Reports+ 2020",
            "artistId":"1232434339",
            "artistUrl":"https://apps.apple.com/br/developer/firenet/id1232434339",
            "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/57/84/ed/5784edb9-f64a-581b-10fa-88865bc3ad76/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6005",
                  "Name":"Redes sociais",
                  "url":"https://itunes.apple.com/br/genre/id6005"
               },
               {
                  "genreId":"6002",
                  "Name":"Utilidades",
                  "url":"https://itunes.apple.com/br/genre/id6002"
               }
            ],
            "url":"https://apps.apple.com/br/app/reports-para-instagram/id1156192844"
         },
         {
            "AppSize":"Canva",
            "id":"897446215",
            "releaseDate":"2014-10-15",
            "Name":"Canva: Editor de Fotos e Vídeo",
            "kind":"iosSoftware",
            "copyright":"© Canva",
            "artistId":"897446218",
            "artistUrl":"https://apps.apple.com/br/developer/canva/id897446218",
            "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple124/v4/77/df/48/77df4861-796e-aa10-c5d7-0dded6b94595/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6027",
                  "Name":"Desenhos e design",
                  "url":"https://itunes.apple.com/br/genre/id6027"
               },
               {
                  "genreId":"6007",
                  "Name":"Produtividade",
                  "url":"https://itunes.apple.com/br/genre/id6007"
               }
            ],
            "url":"https://apps.apple.com/br/app/canva-editor-de-fotos-e-v%C3%ADdeo/id897446215"
         },
         {
            "AppSize":"MY COM",
            "id":"1154402178",
            "releaseDate":"2017-10-30",
            "Name":"Hustle Castle: Jogo do Castelo",
            "kind":"iosSoftware",
            "copyright":"Copyright © 2013-2020 MY.COM",
            "artistId":"875810767",
            "artistUrl":"https://apps.apple.com/br/developer/my-com/id875810767",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple124/v4/9a/c3/b3/9ac3b3ca-5814-7aca-5746-4bca361ad115/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7014",
                  "Name":"RPG",
                  "url":"https://itunes.apple.com/br/genre/id7014"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"7015",
                  "Name":"Simulação",
                  "url":"https://itunes.apple.com/br/genre/id7015"
               }
            ],
            "url":"https://apps.apple.com/br/app/hustle-castle-jogo-do-castelo/id1154402178"
         },
         {
            "AppSize":"TikTok Inc.",
            "id":"835599320",
            "releaseDate":"2014-04-02",
            "Name":"TikTok",
            "kind":"iosSoftware",
            "copyright":"© TikTok Inc.",
            "artistId":"1039610913",
            "artistUrl":"https://apps.apple.com/br/developer/tiktok-inc/id1039610913",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/2c/cc/eb/2ccceb7c-25ce-700a-a2a7-98bda98c1dd5/AppIcon_TikTok-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"6008",
                  "Name":"Foto e vídeo",
                  "url":"https://itunes.apple.com/br/genre/id6008"
               }
            ],
            "url":"https://apps.apple.com/br/app/tiktok/id835599320"
         },
         {
            "AppSize":"INTSIG Information Co.,Ltd",
            "id":"388627783",
            "releaseDate":"2010-08-28",
            "Name":"CamScanner|Documento Scan",
            "kind":"iosSoftware",
            "copyright":"© INTSIG Information Co., Ltd",
            "artistId":"344077850",
            "artistUrl":"https://apps.apple.com/br/developer/intsig-information-co-ltd/id344077850",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple114/v4/2f/da/55/2fda5540-d932-c124-0aa8-9ae22ec17963/AppIconLite-0-0-1x_U007emarketing-0-0-0-5-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6007",
                  "Name":"Produtividade",
                  "url":"https://itunes.apple.com/br/genre/id6007"
               },
               {
                  "genreId":"6000",
                  "Name":"Negócios",
                  "url":"https://itunes.apple.com/br/genre/id6000"
               }
            ],
            "url":"https://apps.apple.com/br/app/camscanner-documento-scan/id388627783"
         },
         {
            "AppSize":"Activision Publishing, Inc.",
            "id":"1287282214",
            "releaseDate":"2019-09-30",
            "Name":"Call of Duty®: Mobile",
            "kind":"iosSoftware",
            "copyright":"© 2019 Activision Publishing, Inc.",
            "artistId":"285005466",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/activision-publishing-inc/id285005466",
            "imageUrl":"https://is1-ssl.mzstatic.com/image/thumb/Purple114/v4/3c/6f/8f/3c6f8f85-9b89-71eb-0549-fc6ea6586683/AppIcon-0-0-1x_U007emarketing-0-0-0-9-0-0-85-220.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6014",
                  "Name":"Jogos",
                  "url":"https://itunes.apple.com/br/genre/id6014"
               },
               {
                  "genreId":"7001",
                  "Name":"Ação",
                  "url":"https://itunes.apple.com/br/genre/id7001"
               }
            ],
            "url":"https://apps.apple.com/br/app/call-of-duty-mobile/id1287282214"
         },
         {
            "AppSize":"Lightricks Ltd.",
            "id":"1149994032",
            "releaseDate":"2016-11-24",
            "Name":"Facetune2: Editor de Selfies",
            "kind":"iosSoftware",
            "copyright":"© 2016 Lightricks Ltd.",
            "artistId":"606310584",
            "artistUrl":"https://apps.apple.com/br/developer/lightricks-ltd/id606310584",
            "imageUrl":"https://is2-ssl.mzstatic.com/image/thumb/Purple114/v4/d5/6d/4d/d56d4dbc-85e9-1a50-0c76-db035b3ac53d/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6008",
                  "Name":"Foto e vídeo",
                  "url":"https://itunes.apple.com/br/genre/id6008"
               },
               {
                  "genreId":"6012",
                  "Name":"Estilo de vida",
                  "url":"https://itunes.apple.com/br/genre/id6012"
               }
            ],
            "url":"https://apps.apple.com/br/app/facetune2-editor-de-selfies/id1149994032"
         },
         {
            "AppSize":"HBO Digital Latin America LLC",
            "id":"1124855250",
            "releaseDate":"2016-09-27",
            "Name":"HBO GO ®",
            "kind":"iosSoftware",
            "copyright":"©2020 HBO Ole Partners, todos os direitos reservados.  HBO® e HBO GO® são marcas registradas Home Box Office, Inc.",
            "artistId":"1229242073",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/hbo-digital-latin-america-llc/id1229242073",
            "imageUrl":"https://is4-ssl.mzstatic.com/image/thumb/Purple114/v4/74/3a/fd/743afd7e-c3c5-d368-f892-0d7654f20449/AppIcon-0-0-1x_U007emarketing-0-0-0-9-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               },
               {
                  "genreId":"6012",
                  "Name":"Estilo de vida",
                  "url":"https://itunes.apple.com/br/genre/id6012"
               }
            ],
            "url":"https://apps.apple.com/br/app/hbo-go/id1124855250"
         },
         {
            "AppSize":"PicsArt, Inc.",
            "id":"587366035",
            "releaseDate":"2013-01-02",
            "Name":"PicsArt Editor de Foto e Vídeo",
            "kind":"iosSoftware",
            "copyright":"© 2020 PicsArt, Inc.",
            "artistId":"587366038",
            "artistUrl":"https://apps.apple.com/br/developer/picsart-inc/id587366038",
            "imageUrl":"https://is3-ssl.mzstatic.com/image/thumb/Purple124/v4/d2/60/3b/d2603b91-4483-b758-a929-3d856ebcd826/AppIcon-0-0-1x_U007emarketing-0-0-0-7-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.jpeg/200x200bb.png",
            "genres":[
               {
                  "genreId":"6008",
                  "Name":"Foto e vídeo",
                  "url":"https://itunes.apple.com/br/genre/id6008"
               },
               {
                  "genreId":"6005",
                  "Name":"Redes sociais",
                  "url":"https://itunes.apple.com/br/genre/id6005"
               }
            ],
            "url":"https://apps.apple.com/br/app/picsart-editor-de-foto-e-v%C3%ADdeo/id587366035"
         },
         {
            "AppSize":"Circle Imperium B.V.",
            "id":"838136374",
            "releaseDate":"2014-04-11",
            "Name":"Inner Circle - App encontros",
            "kind":"iosSoftware",
            "copyright":"© Circle Imperium B.V.",
            "artistId":"914909806",
            "contentAdvisoryRating":"Explicit",
            "artistUrl":"https://apps.apple.com/br/developer/circle-imperium-b-v/id914909806",
            "imageUrl":"https://is5-ssl.mzstatic.com/image/thumb/Purple124/v4/48/cb/17/48cb17ff-a4c1-6498-8f98-30c2ce055a51/AppIcon-0-0-1x_U007emarketing-0-0-0-10-0-0-sRGB-0-0-0-GLES2_U002c0-512MB-85-220-0-0.png/200x200bb.png",
            "genres":[
               {
                  "genreId":"6012",
                  "Name":"Estilo de vida",
                  "url":"https://itunes.apple.com/br/genre/id6012"
               },
               {
                  "genreId":"6016",
                  "Name":"Entretenimento",
                  "url":"https://itunes.apple.com/br/genre/id6016"
               }
            ],
            "url":"https://apps.apple.com/br/app/inner-circle-app-encontros/id838136374"
         }
      ]
}"""

fun feed() = """
    {
        "categories" : [
            $topGrossing,
            $birds,
            $news,
            $birds
        ]
    }
    """